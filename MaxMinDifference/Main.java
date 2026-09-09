public class Main {

    static int maxMinDifference(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 3};

        System.out.println("Difference = "
                + maxMinDifference(arr));
    }
}