package chapter14Typeinfo;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/10/20 9:39
 * @Author: Sean Luo
 * @Description:
 */

class Candy {
    static { print("Loading Candy");}
}

class Gum {
    static { print("Loading Gum");}
}

class Cookie {
    static { print("Loading Cookie");}
}

public class SweepShop {
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {
            Class.forName("chapter14Typeinfo.Gum");
        } catch (ClassNotFoundException e) {
            print("Couldn't find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");
    }
}
