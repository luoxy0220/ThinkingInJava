/**
 * @Date: 2023/11/1 11:11
 * @Author: Sean Luo
 * @Description:
 */
public class SpaceShipDelegation {
    private String name;

    private SpaceShipControls controls =
            new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    // Delegated methods
    public void back(int velocity) {
        controls.back(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void forward(int velocity) {
        controls.froward(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void turboBoost(int velocity) {
        controls.turboBoost(velocity);
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector =
                new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
