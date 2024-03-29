/**
 * @Date: 2023/10/31 14:21
 * @Author: Sean Luo
 * @Description: Composition for code reuse.
 */
class WaterSource {

    private final String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}
public class SprinklerSystem {

    private String valve1, valve2, valve3, valve4;

    private final WaterSource source = new WaterSource();

    private int i;
    private float f;

    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
