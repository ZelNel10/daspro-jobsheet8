import java.util.Scanner;

public class Tugas123 {
    public static void main(String[] args) {
        //Deklarasi & input nilai n
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        int jumlahCetak = 0;

        //Jika input kurang dari 1, program berhenti
        if (n < 1) {
            System.out.println("Nilai n harus lebih dari 0!");
            return;
        }

        //Perulangan segitiga angka
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                jumlahCetak++; //Menambah jumlah angka yang tercetak setiap perulangan

            } 
            System.out.println();
            
        }
        //Output jumlah angka yang tercetak
        System.out.println("Total angka tercetak: " + jumlahCetak);
        input.close();
    }
}
