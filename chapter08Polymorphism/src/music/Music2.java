package music;

import static util.Print.print;

/**
 * @Date: 2023/10/27 13:52
 * @Author: Sean Luo
 * @Description: Overloading instead of upcasting
 */

class Stringed extends Instrument {

    public void play(Note n) {
        print("String.play() " + n);
    }
}

class Brass extends Instrument {

    public void play(Note n) {
        print("Brass.play() " + n);
    }
}

public class Music2 {

    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);  // No upcasting
        tune(violin);
        tune(frenchHorn);
    }
}
