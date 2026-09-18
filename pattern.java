public class pattern {
    public static void main(String args[]){
        int row=4;
        int col=7;
        int start=(col/2)+1;
        int end=(col/2)+1;

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c","*");
                }else{
                    System.out.printf("%3c"," ");
                }
            }System.out.println();
            if(i<5){
                start--;
                end++;
            }else{
                start++;
                end--;
            }
        }
    }
        
}
