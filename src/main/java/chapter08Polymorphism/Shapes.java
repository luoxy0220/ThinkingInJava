package chapter08Polymorphism;

import chapter08Polymorphism.shape.RandomShapeGenerator;
import chapter08Polymorphism.shape.Shape;

/**
 * @Date: 2023/10/27 14:20
 * @Author: Sean Luo
 * @Description: Polymorphism in Java
 */
public class Shapes {

    public static RandomShapeGenerator gen =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        // Make polymorphism method calls
        for (Shape shp : s) {
            shp.draw();
        }
    }
}
