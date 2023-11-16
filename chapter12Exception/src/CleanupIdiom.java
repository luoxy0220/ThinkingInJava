/**
 * @Date: 2023/11/15 16:09
 * @Author: Sean Luo
 * @Description: Each disposable object must be followed by a try-finally
 */
public class CleanupIdiom {
    public static void main(String[] args) {
        // Section 1:
        NeedCleanup nc1 = new NeedCleanup();
        try {
            // ...
        } finally {
            nc1.dispose();
        }

        // Section 2:
        // If construction cannot fail you can group objects
        NeedCleanup nc2 = new NeedCleanup();
        NeedCleanup nc3 = new NeedCleanup();
        try {
            // ...
        } finally {
            nc3.dispose();  // Reverse order of construction
            nc2.dispose();
        }

        // Section 3:
        // If construction can fail you must guard each one
        try {
            NeedCleanup2 nc4 = new NeedCleanup2();
            try {
                NeedCleanup2 nc5 = new NeedCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {  // nc5 constructor
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {  // nc4 constructor
            System.out.println(e);
        }
    }
}

class NeedCleanup {  // Construction can't fail
    private static long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedCleanup " + id + " disposed");
    }
}

class NeedCleanup2 extends NeedCleanup {
    // Construction can fail
    public NeedCleanup2() throws ConstructionException {}
}

class ConstructionException extends Exception {}


