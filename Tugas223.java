import java.util.Scanner;

public class Tugas223 {
    public static void main(String[] args) {
        //Deklarasi & input nilai n
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt(); // n sebagai baris dan kolom
        int seluruhAngka = 0;

        //Jika input kurang dari 3, program berhenti
        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        //Perulangan persegi angka
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", j*i); //Perkalian persegi angka
                seluruhAngka += j*i; //Menjumlahkan seluruh angka pada persegi
            }
            System.out.println();
             
        }
            //Output jumlah seluruh angka 
            System.out.println("Jumlah seluruh angka: " + seluruhAngka);
            input.close();
    }
}
