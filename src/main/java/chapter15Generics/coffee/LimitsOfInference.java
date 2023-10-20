package chapter15Generics.coffee;

import chapter14Typeinfo.pets.Person;
import net.mindview.util.New;
import chapter14Typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

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
