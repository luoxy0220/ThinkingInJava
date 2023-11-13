package chapter12Exception;

/**
 * @Date: 2023/11/13 16:40
 * @Author: Sean Luo
 * @Description:
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the "finally" block
            // will silence any thrown exception.
            return;
        }
    }
}
