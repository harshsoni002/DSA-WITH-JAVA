public class lefthalfTrinamgle {
    public static void half_rotated_triangle(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                //spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                //stars
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        half_rotated_triangle(7);
    }
}
