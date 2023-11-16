/**
 * @Date: 2023/11/2 14:05
 * @Author: Sean Luo
 * @Description: Inheritance & upcasting
 */
class Instrument {
    public void play() {}

    static void tune(Instrument i) {
        i.play();
    }
}

// Wind objects are instruments
// because they have the same interface
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
