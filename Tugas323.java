import java.util.Scanner;

public class Tugas323 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahToko;

        //Input jumlah kelompok & penilai
        do{
        System.out.print("Masukkan jumlah toko : ");
        jumlahToko = input.nextInt();
         
        if (jumlahToko < 1) { //Jumlah toko kurang dari 0
        System.out.println("Jumlah toko harus lebih dari 0!");
        } 
     } while (jumlahToko < 1);
        
            //Deklarasi variabel
            int totalSemuaBarang = 0; 
            double barangTerbanyak = -1; 
            int tokoTerbanyak = 0;
        
        for (int t = 1; t <= jumlahToko; t++) {
            System.out.println("Nomor toko " + t);

            int jumlahPelanggan;

            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = input.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int barangToko = 0;

            for (int p = 1; p <= jumlahPelanggan; p++) {
                int jumlahBarang;
                do {
                    System.out.print("Masukkan jumlah barang yang dibeli pelanggan ke-" + p + ": ");
                    jumlahBarang = input.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);
                barangToko += jumlahBarang;
            }

            System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan + ", total barang: " + barangToko);
            totalSemuaBarang += barangToko;

            if (barangToko > barangTerbanyak) {
                barangTerbanyak = barangToko;
                tokoTerbanyak = t;
            }

        }
        
            System.out.println("\n==============================");
            System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        input.close();
    }
}
