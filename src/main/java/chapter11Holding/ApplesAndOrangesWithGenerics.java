package chapter11Holding;

import java.util.ArrayList;

/**
 * @Date: 2023/10/26 10:32
 * @Author: Sean Luo
 * @Description:
 */
public class ApplesAndOrangesWithGenerics {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // Compiler-time error
        // apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        // Use foreach
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
