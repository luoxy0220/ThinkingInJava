package chapter15Generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Date: 2023/9/14 23:03
 * @Author: Sean Luo
 * @Description:
 */
public class RandomList<T> {

    private final ArrayList<T> storage = new ArrayList<>();
    private final Random random = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : "The quick brown fox jumped over the lazy brown dog".split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select() + " ");
        }
    }
}
