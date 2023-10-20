package chapter15Generics.coffee;

import static net.mindview.util.New;

/**
 * @Date: 2023/10/19 22:52
 * @Author: Sean Luo
 * @Description:
 */
public class LimitsOfInference {

    static  void f(Map<Person, List<? extends Pet>> petPeople) {}

    public static void main(String[] args) {
        f(New.map());
    }
}
