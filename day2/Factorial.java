

public class Factorial {
    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
       return fact;
    }
    public static int bincoff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
    int result =n_fact/(r_fact*nmr_fact);
      
        return result;


    }
    public static void main(String[] args) {
    
        System.out.println(factorial(5));
       System.out.println( bincoff(8, 4));
        }
}
