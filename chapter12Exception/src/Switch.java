import static util.Print.print;

/**
 * @Date: 2023/11/13 15:33
 * @Author: Sean Luo
 * @Description:
 */
public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        print(this);
    }

    public void off() {
        state = false;
        print(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
}
