package pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Date: 2023/10/23 10:10
 * @Author: Sean Luo
 * @Description: Creates random sequences of Pets
 */
public abstract class PetCreator {

    private Random rand = new Random(47);

    // The List of the different types of Pet to create
    public abstract List<Class<? extends Pet>> types();

    /**
     * Create one random Pet
     * @return one random Pet
     */
    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
