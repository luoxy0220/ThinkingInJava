package coffee;

import util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @Date: 2023/9/16 10:21
 * @Author: Sean Luo
 * @Description:
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {

    private final Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private static final Random random = new Random(47);

    public CoffeeGenerator() {}

    // For iteration
    private int size = 0;

    public CoffeeGenerator(int sz) {
        this.size = sz;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {  // Not implemented
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
