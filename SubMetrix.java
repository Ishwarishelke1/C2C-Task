import java.util.*;

class SubMetrix {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int answer = 0;

        // Fix the top row
        for (int top = 0; top < rows; top++) {

            int[] columnSum = new int[cols];

            // Fix the bottom row
            for (int bottom = top; bottom < rows; bottom++) {

                // Add current row to column sums
                for (int col = 0; col < cols; col++) {
                    columnSum[col] += matrix[bottom][col];
                }

                // Now find subarrays with sum = target
                HashMap<Integer, Integer> map = new HashMap<>();

                map.put(0, 1);

                int prefixSum = 0;

                for (int col = 0; col < cols; col++) {

                    prefixSum += columnSum[col];

                    int required = prefixSum - target;

                    answer += map.getOrDefault(required, 0);

                    map.put(
                        prefixSum,
                        map.getOrDefault(prefixSum, 0) + 1
                    );
                }
            }
        }

        return answer;
    }
}