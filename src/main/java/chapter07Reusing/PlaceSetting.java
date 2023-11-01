package chapter07Reusing;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/11/1 11:24
 * @Author: Sean Luo
 * @Description: Combining composition & inheritance
 */
class Plate {
    Plate(int i) {
        print("Plate Constructor");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        print("DinnerPlate Constructor");
    }
}

class Utensil {
    Utensil(int i) {
        print("Utensil Constructor");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        print("Spoon Constructor");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        print("Fork Constructor");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        print("Knife Constructor");
    }
}

// A cultural way of doing something
class Custom {
    Custom(int i) {
        print("Custom Constructor");
    }
}

public class PlaceSetting {
}
