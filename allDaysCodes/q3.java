
import java.util.Scanner;

public class q3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the temperature");
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("You have fever");
        
        }
        else{
              System.out.println("You do not have have fever");
        }
    }
}
