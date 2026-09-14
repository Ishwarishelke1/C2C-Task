import java.util.*;

public class PowerSet {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int n = nums.length;

        int total = 1 << n;  // 2^n

        for (int mask = 0; mask < total; mask++) {

            System.out.print("[ ");

            for (int j = 0; j < n; j++) {

                if ((mask & (1 << j)) != 0) {
                    System.out.print(nums[j] + " ");
                }
            }

            System.out.println("]");
        }
    }
}