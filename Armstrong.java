public class Armstrong {
    public static void main(String args[]){
        int n1=145;
        int n2=153;
        for(int num=n1; num<=n2; num++){
            int sum=0;
            int digit=0;
            int x=num;
            //calculate the length of number
            while(x!=0){
                digit++;//di=3
                x/=10;

            }
            x=num;
            while(x!=0){
                int digits=x%10;//di=3
                sum+=(int)Math.pow(digits,digit);// 3^3=9
                x/=10;  //x=15

            }
            if(sum==num){
                System.out.println(num+" "+"yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
