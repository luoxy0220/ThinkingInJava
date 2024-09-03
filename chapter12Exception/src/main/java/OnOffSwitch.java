/**
 * @Date: 2023/11/13 15:38
 * @Author: Sean Luo
 * @Description: Why use finally?
 */
public class OnOffSwitch {
    private static final Switch sw = new Switch();

    public static void f()
            throws OnOffException1,OnOffException2 {}

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions
            f();
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
