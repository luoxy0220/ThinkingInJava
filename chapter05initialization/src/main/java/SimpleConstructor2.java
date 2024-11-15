/**
 * @Date: 2024/9/5 19:31
 * @Author: Sean Luo
 * @Description: Constructors can have arguments.
 */
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock2(i);
        }
    }
}

class Rock2 {
    Rock2(int i) {
        System.out.println("Rock " + i + " ");
    }
}
