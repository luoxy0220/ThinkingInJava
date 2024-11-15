import static util.Print.print;

/**
 * @Date: 2024/9/7 10:08
 * @Author: Sean Luo
 * @Description: Demonstration of both constructor
 * and ordinary method overloading.
 */
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor
        new Tree();
    }
}

class Tree {
    int height;

    Tree() {
        print("Planting a seeding");
        height = 0;
    }

    Tree(int initHeight) {
        height = initHeight;
        print("Crating new Tree that is " +
                height + " feet tall");
    }

    void info() {
        print("Tree is " + height + " feet tall");
    }

    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}
