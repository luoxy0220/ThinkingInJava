/**
 * @Date: 2023/11/6 10:16
 * @Author: Sean Luo
 * @Description: Create your own exceptions
 */
class SimpleException extends Exception {}

public class InheritingException {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingException sed = new InheritingException();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}
