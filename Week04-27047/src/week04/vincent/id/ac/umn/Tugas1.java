package week04.vincent.id.ac.umn;

import java.util.Scanner;

public class Tugas1 {
    static Barang[] barangs = new Barang[5];
    static Order[] orders = new Order[25];

    public static int orderIndex = 0;

    public static void seedBarangs() {
        barangs[0] = new Barang(1, "Pulpen Easy Gel 0.5mm", 120, 2000);
        barangs[1] = new Barang(2, "Penggaris 30cm", 30, 5000);
        barangs[2] = new Barang(3, "Tipe-x Roller", 30, 7000);
        barangs[3] = new Barang(4, "Pensil Mekanik", 50, 5000);
        barangs[4] = new Barang(5, "Buku Tulis", 100, 6000);
    }

    public static void seedOrders(int id, Barang barang, int jumlah) {
        orders[orderIndex] = new Order(id, barang, jumlah);
        orderIndex++;
    }

    public static void menuTugas1() {
        System.out.println("-----------Menu Toko Multiguna-----------");
        System.out.println("1.\t Pesan Barang");
        System.out.println("2.\t Lihat Pesanan");
    }

    public static void showBarangs() {
        System.out.println("Daftar Barang Toko Multiguna");
        for (Barang barang : barangs) {
            System.out.println("ID\t: " + barang.getId());
            System.out.println("Nama\t: " + barang.getNama());
            System.out.println("Stock\t: " + barang.getStock());
            System.out.println("Harga\t: " + barang.getHarga());
            System.out.println("------------------------------------");
        }
    }

    public static void printOrder() {
        System.out.println("Daftar Pesanan Toko Multiguna");
        for (int i = 0; i < orderIndex; i++) {
            System.out.println("ID\t\t: " + orders[i].getId());
            System.out.println("Nama\t: " + orders[i].getBarang().getNama());
            System.out.println("Jumlah\t: " + orders[i].getJumlah());
            System.out.println("Total:\t: " + (orders[i].getBarang().getHarga() * orders[i].getJumlah()));
            System.out.println("----------------------------------------------");
        }
    }

    public static boolean hasIdBarang(int id) {
        for (Barang barang : barangs) {
            if (barang.getId() == id)
                return true;
        }
        return false;
    }

    public static boolean hasEnoughStock(int stock, int id) {
        for (Barang barang : barangs) {
            if (barang.getId() == id && barang.getStock() >= stock)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        seedBarangs(); // mengassign value kepada barang
        Scanner scanner = new Scanner(System.in);
        int menuInput, id, inputStock, jumlahUang;
        int totalHarga = 0;

        for (; ; ) {
            menuTugas1();
            System.out.print("Pilihan : ");
            menuInput = scanner.nextInt();
            switch (menuInput) {
                case 1:
                    showBarangs();
                    System.out.println("Ketik 0 untuk batal");
                    System.out.print("Pesan Barang (ID) : ");
                    id = scanner.nextInt();
                    if (!hasIdBarang(id)) {
                        continue;
                    }
                    System.out.print("Masukkan Jumlah : ");
                    inputStock = scanner.nextInt();
                    while (!hasEnoughStock(inputStock, id)) {
                        System.out.print("Masukkan Jumlah : ");
                        inputStock = scanner.nextInt();
                    }

                    for (Barang barang : barangs) {
                        if (barang.getId() == id) {
                            barang.minusStock(inputStock);
                            totalHarga = inputStock * barang.getHarga();
                            System.out.println(inputStock + " @ " + barang.getNama() + " dengan total harga " + totalHarga);
                            seedOrders(orderIndex + 1, barang, inputStock);
                        }
                    }
                    System.out.print("Masukkan jumlah uang : ");
                    jumlahUang = scanner.nextInt();
                    if (jumlahUang >= totalHarga) {
                        System.out.println("Berhasil dipesan");
                    } else {
                        System.out.println("Jumlah uang tidak mencukupi");
                    }
                    break;
                case 2:
                    printOrder();
                    break;
            }
        }
    }
}
