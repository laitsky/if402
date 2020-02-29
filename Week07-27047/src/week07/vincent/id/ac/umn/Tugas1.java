package week07.vincent.id.ac.umn;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Tugas1 {
    static ArrayList<Manager> managers = new ArrayList<>();
    static ArrayList<Tetap> tetaps = new ArrayList<>();
    static ArrayList<Magang> magangs = new ArrayList<>();

    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            menuUtama();
            System.out.print("Pilih: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    lihatKaryawan();
                    break;
                case 2:
                    tambahKaryawan();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public static void menuUtama() {
        System.out.println("-----Program Data Karyawan-----");
        System.out.println("1. Lihat Karyawan");
        System.out.println("2. Tambah Karyawan");
        System.out.println("3. Keluar");
    }

    public static void lihatManajer() {
        Locale locale = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println("-----Daftar Manajer-----");

        if (managers.isEmpty()) {
            System.out.println("Tidak ada");
            return;
        }

        for (Manager m : managers) {
            System.out.println("ID\t\t: " + m.getId());
            System.out.println("Nama\t: " + m.getNama());
            System.out.println("Gaji\t: " + numberFormat.format(m.getGaji()));
            System.out.println("----------------------------");
        }
    }

    public static void lihatPegawaiTetap() {
        Locale locale = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        System.out.println("-----Daftar Pegawai Tetap-----");

        if (tetaps.isEmpty()) {
            System.out.println("Tidak ada");
            return;
        }

        for (Tetap t : tetaps) {
            System.out.println("ID\t\t: " + t.getId());
            System.out.println("Nama\t: " + t.getNama());
            System.out.println("Gaji\t: " + numberFormat.format(t.getGaji()));
            System.out.println("----------------------------");
        }
    }

    public static void lihatPegawaiMagang() {
        Locale locale = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        System.out.println("-----Daftar Pegawai Magang-----");

        if (magangs.isEmpty()) {
            System.out.println("Tidak ada");
            return;
        }

        for (Magang m : magangs) {
            System.out.println("ID\t\t: " + m.getId());
            System.out.println("Nama\t: " + m.getNama());
            System.out.println("Gaji\t: " + numberFormat.format(m.getGaji()));
            System.out.println("----------------------------");
        }
    }

    public static void lihatKaryawan() {
        lihatManajer();
        lihatPegawaiTetap();
        lihatPegawaiMagang();
    }

    public static void tambahKaryawan() {
        int input;
        String nama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Tambah Karyawan-----");
        System.out.println("1. Manajer");
        System.out.println("2. Karyawan Tetap");
        System.out.println("3. Karyawan Magang");
        System.out.print("Pilih: ");
        input = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nama: ");
        nama = scanner.nextLine();

        switch (input) {
            case 1:
                managers.add(new Manager(("M" + Integer.toString(managers.size() + 1)), nama));
                System.out.println("Manajer baru telah ditambahkan");
                break;
            case 2:
                tetaps.add(new Tetap(("R" + Integer.toString(tetaps.size() + 1)), nama));
                System.out.println("Karyawan tetap baru telah ditambahkan");
                break;
            case 3:
                magangs.add(new Magang(("I" + Integer.toString(magangs.size() + 1)), nama));
                System.out.println("Karyawan magang baru telah ditambahkan");
                break;
            default:
                System.out.println("Input tidak valid!");
                break;
        }
    }

}