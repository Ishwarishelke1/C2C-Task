public class p2 {
    public static void main(String args[]){
       
        int start=1;
        int end=9;

        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c","*");
                }else{
                    System.out.printf("%3c"," ");
                }
            }System.out.println();
            if(i<5){
                start++;
                end--;
            }else{
                start--;
                end++;
            }
        }
    }
}
