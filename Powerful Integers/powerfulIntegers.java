import java.util.*;

public class powerfulInteger {

    public static List<Integer> powerfulIntegers(int x, int y, int bound) {

        Set<Integer> set = new HashSet<>();

        for (int a = 1; a <= bound; a *= x) {

            for (int b = 1; a + b <= bound; b *= y) {

                set.add(a + b);

                // Prevent infinite loop when y = 1
                if (y == 1) {
                    break;
                }
            }

            // Prevent infinite loop when x = 1
            if (x == 1) {
                break;
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        int bound = 10;

        List<Integer> result = powerfulIntegers(x, y, bound);

        System.out.println(result);
    }
}
```
