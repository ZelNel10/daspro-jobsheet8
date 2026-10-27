import java.util.Scanner;

public class NilaiKelompok23 {
    public static void main(String[] args) {
        //Input jumlah kelompok & penilai
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = sc.nextInt();

        
        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) { //Jumlah kelompok & penilai lebih dari 0
        System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            //Deklarasi variabel
            int nomorKelompok = 1; 
            double rataTertinggi = -1; 
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) { //Perulangan jumlah kelompok & pemberian nomor kelompok
            System.out.println("Kelompok " + nomorKelompok);
            double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) { //Perulangan jumlah penilai
                    int nilai;
                    do {
                    System.out.print(" Nilai dari Penilai " + j + ": "); //Input nilai dari penilai
                    nilai = sc.nextInt();

                    if (nilai < 0 || nilai > 100) { //Nilai invalid jika kurang dari 0 atau lebih dari 100
                    System.out.println(" Nilai harus 0-100. Ulangi input!");
                    }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai; //Mengubah value totalNilai dengan value nilai
                }
                    double rataNilai = totalNilai / jumlahPenilai; //Menghitung rata-rata nilai 
                    System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);

                    if (rataNilai > rataTertinggi) { //Penentuan kelompok terbaik dengan rata-rata tertingginya
                        rataTertinggi = rataNilai;
                        kelompokTerbaik = nomorKelompok;
                    }

                nomorKelompok++;
            }

            //Output akhir
            System.out.println("==============================");
            System.out.println("Kelompok terbaik : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
    sc.close();
    }
}
