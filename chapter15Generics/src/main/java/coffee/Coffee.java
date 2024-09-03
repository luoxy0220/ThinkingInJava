package coffee;

/**
 * @Date: 2023/9/16 10:06
 * @Author: Sean Luo
 * @Description:
 */
public class Coffee {

    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
