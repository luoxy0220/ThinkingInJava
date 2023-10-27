package chapter08Polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/10/25 20:49
 * @Author: Sean Luo
 * @Description:
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }
}
