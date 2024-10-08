import pets.LiteralPetCreator;
import pets.Pet;
import pets.Pets;
import util.MapData;
import util.Print;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Date: 2023/10/23 13:44
 * @Author: Sean Luo
 * @Description: Use isInstance()
 */
public class PetCount3 {

    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            // Class.isInstance() eliminates instanceofs
            for (Map.Entry<Class<? extends Pet>, Integer> pair
                    : entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair
                    : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            Print.printnb(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        Print.print();
        Print.print(petCount);
    }
}
