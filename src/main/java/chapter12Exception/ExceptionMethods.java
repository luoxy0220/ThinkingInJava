package chapter12Exception;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/11/7 13:56
 * @Author: Sean Luo
 * @Description: Demonstrating the Exception Methods.
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            print("Caught Exception");
            print("getMessage():" + e.getMessage());
            print("getLocalizedMessage():" +
                    e.getLocalizedMessage());
            print("toString():" + e);
            print("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
