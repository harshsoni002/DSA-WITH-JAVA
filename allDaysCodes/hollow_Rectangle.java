public class hollow_Rectangle{
 public static void PrintPattern(int TR , int TC){
    for(int i=1;i<=TR;i++){
        for(int j=1;j<=TC;j++){
            if(i==1||j==1||i==TR||j==TC){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
 }
 public static void main(String[] args) {
     PrintPattern(6,9);
 }
}