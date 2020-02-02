package week02.vincent.id.ac.umn;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        input = scanner.nextInt();
        if (tesPrima(input)) {
            System.out.println("Angka " + input + " adalah angka prima");
        } else {
            System.out.println("Angka " + input + " adalah bukan angka prima");
        }
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
