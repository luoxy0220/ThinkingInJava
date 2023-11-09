package chapter12Exception;

/**
 * @Date: 2023/11/9 10:20
 * @Author: Sean Luo
 * @Description: Ignoring RuntimeException
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
