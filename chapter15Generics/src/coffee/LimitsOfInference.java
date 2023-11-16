package coffee;


import pets.Person;
import pets.Pet;
import util.New;

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
