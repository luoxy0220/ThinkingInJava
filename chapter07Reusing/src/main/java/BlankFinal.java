/**
 * @Date: 2023/11/2 16:40
 * @Author: Sean Luo
 * @Description: "Blank" final fields
 */
class Poppet {
    private int i;

    Poppet(int i1) {
        i = i1;
    }
}

public class BlankFinal {
    private final int i = 0;  // Initialized final
    private final int j;  // Blank final
    private final Poppet p;  // Blank final reference

    // Blank finals MUST be initialized in the constructor
    public BlankFinal() {
        j = 1;  // Initialized blank final
        p = new Poppet(1);  // Initialized blank final reference
    }

    public BlankFinal(int x) {
        j = x;  // Initialized blank final
        p = new Poppet(x);  // Initialized blank final reference
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
