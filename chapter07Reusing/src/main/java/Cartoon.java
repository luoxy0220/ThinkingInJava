import static util.Print.print;

/**
 * @Date: 2023/10/31 17:08
 * @Author: Sean Luo
 * @Description: Constructor calls during inheritance
 */
class Art {
    Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon X = new Cartoon();
    }
}
