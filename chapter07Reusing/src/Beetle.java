import static util.Print.print;

/**
 * @Date: 2023/11/3 13:36
 * @Author: Sean Luo
 * @Description: The full process of initialization
 */
class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static final int x1 =
            printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static final int x2 =
            printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
