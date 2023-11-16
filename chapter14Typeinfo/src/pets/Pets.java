package pets;

import java.util.ArrayList;

/**
 * @Date: 2023/10/23 13:30
 * @Author: Sean Luo
 * @Description: Facade to produce a default PetCreator.
 */
public class Pets {

    public static final PetCreator creator =
            new LiteralPetCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
