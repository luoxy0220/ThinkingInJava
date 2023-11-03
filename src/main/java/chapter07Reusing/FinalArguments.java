package chapter07Reusing;

/**
 * @Date: 2023/11/3 10:52
 * @Author: Sean Luo
 * @Description: Use "final" with methods argument.
 */
class Gizmo {
    public void spin() {}
}
public class FinalArguments {
    void with(final Gizmo g) {
//        g = new Gizmo();  // Illegal -- g is final
    }

    void without(Gizmo g) {
        g = new Gizmo();  // OK -- g not final
        g.spin();
    }

//    void f(final int i) {
//        i++;
//    }  // Can't change

    // You can only read from a final primitive
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
