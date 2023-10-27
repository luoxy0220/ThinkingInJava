package chapter08Polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @Date: 2023/10/27 14:11
 * @Author: Sean Luo
 * @Description:
 */
public class Square extends Shape {

    public void draw() {
        print("Square.play()");
    }

    public void erase() {
        print("Square.erase()");
    }
}
