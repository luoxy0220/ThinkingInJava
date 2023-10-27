package chapter08Polymorphism.shape;

import java.util.Random;

/**
 * @Date: 2023/10/25 20:54
 * @Author: Sean Luo
 * @Description: A "factory" that randomly creates shapes.
 */
public class RandomShapeGenerator {

    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
