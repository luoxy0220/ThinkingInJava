package shape;

import static util.Print.print;

/**
 * @Date: 2023/10/25 20:52
 * @Author: Sean Luo
 * @Description:
 */
public class Square extends Shape {

    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }
}
