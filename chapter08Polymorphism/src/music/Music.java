package music;

/**
 * @Date: 2023/10/24 20:59
 * @Author: Sean Luo
 * @Description: Inheritance & upcasting
 */
public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        // Upcasting
        tune(flute);
    }
}
