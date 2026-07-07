import java.util.Arrays;

public class MoveZeros {
    public static void moveZero(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] agrs){
        int nums[]={0,1,0,3,12};
        moveZero(nums);
        System.out.print(Arrays.toString(nums));

    }
}
