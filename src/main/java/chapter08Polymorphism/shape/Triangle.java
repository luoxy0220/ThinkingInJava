package chapter08Polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/10/25 20:53
 * @Author: Sean Luo
 * @Description:
 */
public class Triangle extends Shape {

    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
}
