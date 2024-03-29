import java.io.FileNotFoundException;
import java.io.IOException;

import static util.Print.print;

/**
 * @Date: 2023/11/15 17:22
 * @Author: Sean Luo
 * @Description: "Turn off" Checked exceptions.
 */
public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        // You can call throwRuntimeException() without a try
        // block, and let RunTimeExceptions leave the method.
        wce.throwRunTimeException(3);
        // Or you can choose to catch exception.
        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3) {
                    wce.throwRunTimeException(i);
                } else {
                    throw new SomeOtherException();
                }
            } catch (SomeOtherException e) {
                print("SomeOtherException " + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    print("FileNotFoundException: " + e);
                } catch (IOException e) {
                    print("IOException: " + e);
                } catch (Throwable e) {
                    print("Throwable: " + e);
                }
            }
        }
    }
}

class WrapCheckedException {
    void throwRunTimeException(int type) {
        try {
            switch (type) {
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("Where am I?");
                default: return;
            }
        } catch (Exception e) {  // Adapt to unchecked;
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {}
