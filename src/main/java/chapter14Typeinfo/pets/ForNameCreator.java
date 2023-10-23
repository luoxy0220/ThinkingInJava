package chapter14Typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 2023/10/23 10:57
 * @Author: Sean Luo
 * @Description:
 */
public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<>();

    // Types that you want to be randomly created
    private static String[] typeNames = {
            "chapter14Typeinfo.pets.Mutt",
            "chapter14Typeinfo.pets.Pug",
            "chapter14Typeinfo.pets.EgyptianMau",
            "chapter14Typeinfo.pets.Manx",
            "chapter14Typeinfo.pets.Cymric",
            "chapter14Typeinfo.pets.Rat",
            "chapter14Typeinfo.pets.Mouse",
            "chapter14Typeinfo.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static { loader(); }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
