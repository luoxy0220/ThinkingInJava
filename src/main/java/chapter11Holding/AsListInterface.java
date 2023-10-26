package chapter11Holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Date: 2023/10/26 11:22
 * @Author: Sean Luo
 * @Description: Array.asList() makes its best guess about type.
 */
class Snow {}

class Powder extends Snow {}

class Light extends Powder {}

class Heavy extends Powder {}

class Crusty extends Snow {}

class Slush extends Snow {}

public class AsListInterface {

    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder());
        // Won't compiler by JDK1.5
        List<Snow> snow2 = Arrays.asList(
                new Light(), new Heavy());
        // Collections.addAll() doesn't get confused
        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());
        // Give a hint using an
        // explicit type argument specification
        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy());
    }
}
