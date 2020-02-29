package week06.vincent.id.ac.umn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Handphone> handphones = new ArrayList<>();
    static ArrayList<Voucher> vouchers = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public static boolean hasIdHandphone(int id) {
        for (Handphone handphone : handphones) {
            if (handphone.getId() == id) return true;
        }
        return false;
    }

    public static boolean hasIdVoucher(int id) {
        for (Voucher voucher : vouchers) {
            if (voucher.getId() == id) return true;
        }
        return false;
    }

    public static boolean hasEnoughHandphones(int id, int stok) {
        for (Handphone handphone : handphones) {
            if (handphone.getId() == id && handphone.getStok() >= stok) return true;
        }
        return false;
    }

    public static boolean hasEnoughVouchers(int id, int stok) {
        for (Voucher voucher : vouchers) {
            if (voucher.getId() == id && voucher.getStok() >= stok) return true;
        }
        return false;
    }

    public static void menuUtama() {
        System.out.println("--------------Menu Toko Voucher & HP--------------");
        System.out.println("1. Pesan Barang");
        System.out.println("2. Lihat Pesanan");
        System.out.println("3. Barang Baru");
    }

    public static void printHandphoneList() {
        for (Handphone handphone : handphones) {
            System.out.println("ID\t: " + handphone.getId());
            System.out.println("Nama\t: " + handphone.getNama());
            System.out.println("Stock\t: " + handphone.getStok());
            System.out.println("Harga\t: " + (long) handphone.getHarga());
            System.out.println("------------------------------------");
        }
    }

    public static void printVoucherList() {
        for (Voucher voucher : vouchers) {
            System.out.println("ID\t: " + voucher.getId());
            System.out.println("Nama\t: " + voucher.getNama());
            System.out.println("Stock\t: " + voucher.getStok());
            System.out.println("Harga\t: " + voucher.getHargaJual());
            System.out.println("------------------------------------");
        }
    }

    public static void printOrders() {
        for (Order order : orders) {
            if (order.getHandphone() == null) {
                System.out.println("ID\t\t: H" + order.getId());
                System.out.println("Nama\t: " + order.getVoucher().getNama());
                System.out.println("Jumlah\t: " + order.getJumlah());
                System.out.println("Total\t: " + order.getVoucher().getHargaJual() * order.getJumlah());
            } else {
                System.out.println("ID\t\t: V" + order.getId());
                System.out.println("Nama\t: " + order.getHandphone().getNama());
                System.out.println("Jumlah\t: " + order.getJumlah());
                System.out.println("Total\t: " + order.getHandphone().getHarga() * order.getJumlah());
            }
            System.out.println("------------------------------------");
        }
    }

    public static void barangBaru() {
        String input, nama, warna;
        int stok;
        double harga, pajak;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voucher / Handphone (V/H): ");
        input = scanner.nextLine();
        System.out.print("Nama\t: ");
        nama = scanner.nextLine();
        System.out.print("Harga\t: ");
        harga = scanner.nextDouble();
        System.out.print("Stok\t: ");
        stok = scanner.nextInt();

        if (input.equals("V") || input.equals("v")) {
            System.out.print("PPN\t: ");
            pajak = scanner.nextDouble();
            vouchers.add(new Voucher((vouchers.size() + 1), nama, harga, stok, pajak));
            System.out.println("Voucher telah berhasil diinput!");
        } else if (input.equals("H") || input.equals("h")) {
            scanner.nextLine();
            System.out.print("Warna\t: ");
            warna = scanner.nextLine();
            handphones.add(new Handphone((handphones.size() + 1), nama, harga, stok, warna));
            System.out.println("Handphone telah berhasil diinput!");
        } else {
            System.out.println("Input tidak valid!");
        }
    }

    public static void main(String[] args) {
        int input, idBarang, stok, jumlahUang;
        double totalHarga = 0;
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            menuUtama();
            System.out.print("Pilihan: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Daftar Barang Toko Voucher & HP");
                    System.out.println("1. Handphone");
                    System.out.println("2. Voucher");
                    System.out.print("Pilihan: ");
                    input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            printHandphoneList();
                            System.out.println("Ketik 0 untuk batal");
                            System.out.print("Pesan Barang (ID) : ");
                            idBarang = scanner.nextInt();
                            if (!hasIdHandphone(idBarang)) continue;
                            System.out.print("Masukkan Jumlah: ");
                            stok = scanner.nextInt();
                            while (!hasEnoughHandphones(idBarang, stok)) {
                                System.out.print("Masukkan Jumlah: ");
                                stok = scanner.nextInt();
                            }

                            for (Handphone handphone : handphones) {
                                if (handphone.getId() == idBarang) {
                                    handphone.minusStock(stok);
                                    totalHarga = stok * handphone.getHarga();
                                    System.out.println(stok + " @ " + handphone.getNama() + " dengan total harga " + (long) totalHarga);
                                    orders.add(new Order(idBarang, handphone, stok));
                                }
                            }

                            System.out.print("Masukkan jumlah uang: ");
                            jumlahUang = scanner.nextInt();
                            if (jumlahUang >= totalHarga) {
                                System.out.println("Berhasil dipesan");
                            } else {
                                System.out.println("Jumlah uang tidak mencukupi");
                            }
                            break;
                        case 2:
                            printVoucherList();
                            System.out.println("Ketik 0 untuk batal");
                            System.out.print("Pesan Barang (ID) : ");
                            idBarang = scanner.nextInt();
                            if (!hasIdVoucher(idBarang)) continue;
                            System.out.print("Masukkan Jumlah: ");
                            stok = scanner.nextInt();
                            while (!hasEnoughVouchers(idBarang, stok)) {
                                System.out.print("Masukkan Jumlah: ");
                                stok = scanner.nextInt();
                            }

                            for (Voucher voucher : vouchers) {
                                if (voucher.getId() == idBarang) {
                                    voucher.minusStock(stok);
                                    totalHarga = stok * voucher.getHargaJual();
                                    System.out.println(stok + " @ " + voucher.getNama() + " dengan total harga " + (long) totalHarga);
                                    orders.add(new Order(idBarang, voucher, stok));
                                }
                            }

                            System.out.print("Masukkan jumlah uang: ");
                            jumlahUang = scanner.nextInt();
                            if (jumlahUang >= totalHarga) {
                                System.out.println("Berhasil dipesan");
                            } else {
                                System.out.println("Jumlah uang tidak mencukupi");
                            }
                            break;
                        default:
                            System.out.println("Input tidak valid!");
                            break;
                    }
                    break;
                case 2:
                    printOrders();
                    break;
                case 3:
                    barangBaru();
                    break;
            }
        }
    }
}
