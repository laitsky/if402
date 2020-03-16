package quizuts.vincentdiamond.id.ac.umn;
import java.util.Scanner;

public class Praktikum1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, keterangan, predikat, indeks;
        int nilai;
        keterangan = "";
        indeks = "";
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan nilai: ");
        nilai = scanner.nextInt();

        if (nilai > 100) {
            keterangan = "Terjadi Kesalahan";
            indeks = "";
        }
        else if (nilai >= 90) {
            keterangan = "Istimewa";
            indeks = "A";
        }
        else if (nilai >= 80) {
            keterangan = "Amat Baik";
            indeks = "A-";
        }
        else if (nilai >= 70) {
            keterangan = "Baik";
            indeks = "B";
        }
        else if (nilai >= 60) {
            keterangan = "Cukup";
            indeks = "C";
        }
        else if (nilai >= 50) {
            keterangan = "Kurang";
            indeks = "D";
        }
        else if (nilai < 50) {
            keterangan = "Sangat Kurang";
            indeks = "E";
        }

        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai\t\t: " + nilai);
        System.out.println("Keterangan\t\t: " + keterangan);
        System.out.println("Indeks\t\t: " + indeks);
        if(nilai >= 60) {
            predikat = "LULUS";
        } else {
            predikat = "TIDAK LULUS";
        }
        System.out.println("Predikat\t\t: " + predikat);
    }
}
