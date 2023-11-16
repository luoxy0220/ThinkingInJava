import static util.Print.print;

/**
 * @Date: 2023/10/31 16:13
 * @Author: Sean Luo
 * @Description: Inheritance syntax & properties
 */
class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}

public class Detergent extends Cleanser {

    // Change a method
    public void scrub() {
        append(" Detergent.scrub()");
        // Call base-class version
        super.scrub();
    }

    // Add methods to the interface
    public void foam() {
        append(" foam()");
    }

    // Test the new class
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}
