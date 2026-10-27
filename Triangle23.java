import java.util.Scanner;

public class Triangle23 {
    public static void main(String[] args) {
        //Input nilai n
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1; // Inisiasi 

        //Segitiga siku-siku*
        while (i <= n) {

        int j = 0;
            while (j < i) {
            System.out.print("*");
            j++;
            }
            System.out.println();
        i++;
        }
        
        //Segitiga siku-siku* terbalik
        i = 1;
        while (n >= i) {
            int j = 0;
            while (j < n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        n--;
        }
    sc.close();
    }
}
