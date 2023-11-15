package chapter12Exception;

/**
 * @Date: 2023/11/15 16:45
 * @Author: Sean Luo
 * @Description: Catch exception hierarchies
 */
public class Human {
    public static void main(String[] args) {
        // Catch the exact type
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        // Caught the base type
        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
}

class Annoyance extends Exception {}

class Sneeze extends Annoyance {}
