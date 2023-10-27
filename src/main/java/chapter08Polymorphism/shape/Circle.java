package chapter08Polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/10/27 14:08
 * @Author: Sean Luo
 * @Description:
 */
public class Circle extends Shape {

    public void draw() {
        print("Circle.play()");
    }

    public void erase() {
        print("Circle.erase()");
    }
}
