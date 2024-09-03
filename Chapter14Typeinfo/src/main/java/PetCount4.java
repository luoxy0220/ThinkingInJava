import pets.Pet;
import pets.Pets;
import util.Print;
import util.TypeCounter;

/**
 * @Date: 2023/10/23 14:16
 * @Author: Sean Luo
 * @Description:
 */
public class PetCount4 {

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            Print.printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        Print.print();
        Print.print(counter);
    }
}
