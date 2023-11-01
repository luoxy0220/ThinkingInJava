package chapter07Reusing;

/**
 * @Date: 2023/11/1 11:06
 * @Author: Sean Luo
 * @Description:
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.froward(100);
    }
}
