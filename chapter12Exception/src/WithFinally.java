/**
 * @Date: 2023/11/13 15:43
 * @Author: Sean Luo
 * @Description:
 */
public class WithFinally {
    private static final Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
