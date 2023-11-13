package chapter12Exception;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/11/13 15:46
 * @Author: Sean Luo
 * @Description: Finally is always executed.
 */
class FourException extends Exception {}

public class AlwaysFinally {
    public static void main(String[] args) {
        print("Entering first try block");
        try {
            print("Entering second try block");
            try {
                throw new FourException();
            } finally {
                print("finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println(
                    "Caught FourException in 1st try block");
        } finally {
            System.out.println("finally in 1st try block");
        }
    }
}
