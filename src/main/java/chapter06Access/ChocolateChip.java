package chapter06Access;

import chapter06Access.dessert.Cookie;

/**
 * @Date: 2023/10/30 14:10
 * @Author: Sean Luo
 * @Description: Can't use package-access member from another package
 */
public class ChocolateChip extends Cookie {

    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
//        bite();  // Can't access bite
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
