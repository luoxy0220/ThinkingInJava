import static net.mindview.util.Print.print;

/**
 * @Date: 2023/11/1 9:58
 * @Author: Sean Luo
 * @Description: Inheritance, constructors and arguments.
 */
class Game {
    Game(int i) {
        print("Game Constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame Constructor");
    }
}

public class Chess extends BoardGame{
    Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
