import pets.Pet;
import pets.Pets;
import util.TypeCounter;

import static util.Print.print;
import static util.Print.printnb;

/**
 * @Date: 2023/10/23 14:16
 * @Author: Sean Luo
 * @Description:
 */
public class PetCount4 {

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
