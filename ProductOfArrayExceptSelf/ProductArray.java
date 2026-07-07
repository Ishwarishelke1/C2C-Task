import java.util.Arrays;
public class ProductArray {
    public static int[] productExceptself(int[] nums){
        int n=nums.length;
        int ans[]=new int[n];

        //prefix
        ans[0]=1;
        for(int i=1; i<n; i++){
            ans[i]=ans[i-1]*nums[i-1];

        }

        int suffix=1;
        for(int j=n-1; j>=0; j--){
            ans[j]=ans[j]*suffix;
            suffix=suffix*nums[j];
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        int res[]=productExceptself(nums);
        System.out.println(Arrays.toString(res));
    }
}
