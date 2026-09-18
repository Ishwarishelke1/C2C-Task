public class Automorphic {
    public static void main(String args[]){
        int n=25;
        int temp=n;
        int sq=n*n; 
        int divisor=1;
        while(temp!=0){
            divisor=divisor*10;// 1)di=10 2)di=10*10=100
            temp=temp/10;
        }
        if(sq%divisor==n){
            System.out.println("yes no. is automorphic");
        }else{
            System.out.println("no ");
        }
    }
}
