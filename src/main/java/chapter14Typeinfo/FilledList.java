package chapter14Typeinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 2023/10/20 15:00
 * @Author: Sean Luo
 * @Description:
 */

class CountedInteger {

    private static long counter;
    private final long id = counter++;

    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {

    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl =
                new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(15));
    }
}
