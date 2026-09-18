public class neon {
    
    public static void main(String args[]){
        int n=9;
        int sq=n*n;
        int sum = 0;
        while(sq !=0){
            int digit= sq%10 ;
            sum += digit;
            sq=sq/10;
        }
        if(sum==n){
            System.out.println("yes number is neon");
        }else{
            System.out.println("NO number is neon");
        }

    }
}
