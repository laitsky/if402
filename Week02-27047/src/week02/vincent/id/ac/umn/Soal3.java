package week02.vincent.id.ac.umn;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int batasBawah, batasAtas;
        int jumlahBilPrima = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai terkecil: ");
        batasBawah = scanner.nextInt();
        System.out.print("Masukkan nilai terbesar: ");
        batasAtas = scanner.nextInt();

        for (int i = batasBawah; i <= batasAtas; i++) {
            if (tesPrima(i)) {
                jumlahBilPrima += i;
            }
        }
        System.out.println("Jumlah dari semua nilai prima dari " + batasBawah + " sampai " +
                batasAtas + " adalah " + jumlahBilPrima);
    }

    public static boolean tesPrima(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
