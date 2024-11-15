import static util.Print.print;

/**
 * @Date: 2024/9/7 12:03
 * @Author: Sean Luo
 * @Description: Overloading based on the order of the argument.
 */
public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }

    static void f(int i,String s) {
        print("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99,"Int first");
    }
}
