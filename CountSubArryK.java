import java.util.*;

class CountSubArryK {
    public int countSubarrays(int[] nums, int k) {

        int n = nums.length;

        // Find position of k
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                pos = i;
                break;
            }
        }

        // Store frequency of balances on the left
        HashMap<Integer, Integer> map = new HashMap<>();

        int balance = 0;

        map.put(0, 1);

        // Process left side of k
        for (int i = pos - 1; i >= 0; i--) {

            if (nums[i] < k) {
                balance--;
            } else {
                balance++;
            }

            map.put(balance, map.getOrDefault(balance, 0) + 1);
        }

        int answer = 0;
        balance = 0;

        // Start from k and move to the right
        for (int i = pos; i < n; i++) {

            if (nums[i] > k) {
                balance++;
            } else if (nums[i] < k) {
                balance--;
            }

            // Required total balance = 0 or 1
            answer += map.getOrDefault(-balance, 0);
            answer += map.getOrDefault(1 - balance, 0);
        }

        return answer;
    }
}