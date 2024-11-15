/**
 * @Date: 2024/9/4 22:39
 * @Author: Sean Luo
 * @Description: Demonstration of a simple constructor.
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock {
    Rock() { // This is constructor.
        System.out.println("Rock ");
    }
}
