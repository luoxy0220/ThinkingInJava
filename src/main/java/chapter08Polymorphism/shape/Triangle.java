package chapter08Polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/10/27 14:14
 * @Author: Sean Luo
 * @Description:
 */
public class Triangle extends Shape {

    public void draw() {
        print("Triangle.play()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
}
