package chapter06Access;

import chapter06Access.cookie2.Cookie;

/**
 * @Date: 2023/10/30 14:23
 * @Author: Sean Luo
 * @Description:
 */
public class ChocolateChip2 extends Cookie {

    public ChocolateChip2() {
        System.out.println("ChocolateChip2 constructor");
    }

    public void chomp() {
        bite();  // Protected method
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
