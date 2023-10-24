package chapter08Polymorphism.music;

/**
 * @Date: 2023/10/24 20:56
 * @Author: Sean Luo
 * @Description: Wind objects are instruments
 * because they have the same interface
 */
public class Wind extends Instrument {

    // Redefine interface method
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
