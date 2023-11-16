/**
 * @Date: 2023/10/30 14:03
 * @Author: Sean Luo
 * @Description: Demonstrates "private" keyword.
 */
class Sundae {

    private Sundae() {}

    static Sundae makeASundae() {
        return new Sundae();
    }
}
public class IceCream {

    public static void main(String[] args) {
//        Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}
