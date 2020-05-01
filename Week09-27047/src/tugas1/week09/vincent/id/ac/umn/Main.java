package tugas1.week09.vincent.id.ac.umn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Item> listOfItems = new ArrayList<Item>();
    static ArrayList<Payment> listOfPayments = new ArrayList<Payment>();
    static Scanner s = new Scanner(System.in);

    public static void seedData() {
        listOfItems.add(new Item("Kulkas", "Electronic", 4800000));
        listOfItems.add(new Item("TV", "Electronic", 1280000));
        listOfItems.add(new Item("Laptop", "Computer", 6000000));
        listOfItems.add(new Item("PC", "Computer", 12000000));
    }

    public static void printItem(Item item) {
        System.out.println("Nama\t: " + item.getName());
        System.out.println("Tipe\t: " + item.getType());
        System.out.println("Harga\t: " + item.getPrice());
    }

    public static void main(String[] args) {
        int opt = 0, id = 0, tipePembayaran = 0, jumlahBayar = 0;
        String kodeBayar;
        seedData();
        do {
            System.out.println("----Program Toko Elektronik----");
            System.out.println("1. Pesan Barang");
            System.out.println("2. Lihat Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            opt = s.nextInt();

            if (opt == 1) {
                System.out.println("----Daftar Barang----");
                for (int i = 0; i < listOfItems.size(); i++) {
                    System.out.println("No\t\t: " + (i + 1));
                    printItem(listOfItems.get(i));
                    System.out.println("-------------------------------");
                }

                System.out.print("Pilih: ");
                id = s.nextInt();
                id--;
                printItem(listOfItems.get(id));

                System.out.println("----Tipe Pembayaran----");
                System.out.println("1. Cash");
                System.out.println("2. Credit");
                System.out.print("Pilih: ");
                tipePembayaran = s.nextInt();
                s.nextLine();

                switch (tipePembayaran) {
                    case 1:
                        System.out.print("Bayar (Y/N): ");
                        kodeBayar = s.nextLine();
                        if (kodeBayar.equals("Y") || kodeBayar.equals("y")) {
                            System.out.println("Harga Pembayaran: " + listOfItems.get(id).getPrice());
                            System.out.print("Bayar: ");
                            jumlahBayar = s.nextInt();
                            if (jumlahBayar >= listOfItems.get(id).getPrice()) {
                                System.out.println("Transaksi telah dibayar lunas!");
                                listOfPayments.add(new Cash(listOfItems.get(id)));
                            }
                        } else if (kodeBayar.equals("N") || kodeBayar.equals("n")) {
                            listOfPayments.add(new Cash(listOfItems.get(id)));
                            System.out.println("Transaksi telah disimpan");
                        }
                        break;
                    case 2:
                        int lamaCicilan, bayaran;
                        boolean correctInput = true;
                        do {
                            System.out.print("Lama Cicilan (3/6/9/12): ");
                            lamaCicilan = s.nextInt();
                            if (lamaCicilan == 3 || lamaCicilan == 6 ||
                                    lamaCicilan == 9 || lamaCicilan == 12) {
                                s.nextLine();
                                break;
                            }
                        } while (correctInput);
                        listOfPayments.add(new Credit(listOfItems.get(id), lamaCicilan));
                        System.out.println("Harga Pembayaran: " + listOfItems.get(id).getPrice());
                        System.out.print("Bayar: ");
                        bayaran = s.nextInt();
                        if (bayaran >= listOfPayments.get(listOfPayments.size() - 1).pay()) {
                            System.out.println("Transaksi telah dibayar");
                        }
                        break;
                    default:
                        return;
                }
            }
            /* BATAS AKHIR MENU NOMOR 1 */
            else if (opt == 2) {
                for (int i = 0; i < listOfPayments.size(); i++) {
                    System.out.println("No\t\t\t: " + i + 1);
                    System.out.println("Nama\t\t: " + listOfPayments.get(i).getItemName());
                    System.out.println("Tipe\t\t: " + listOfPayments.get(i).getItem().getType());
                    System.out.println("Status\t\t: " + listOfPayments.get(i).getStatus());
                    System.out.println("Sisa Pembayaran: " + listOfPayments.get(i).getRemainingAmount());
                    System.out.println("---------------");
                }
                System.out.print("Pilih no. transaksi: ");
                int hutang = s.nextInt();
                hutang--;
                s.nextLine();
                System.out.println("No\t\t\t: " + (hutang + 1));
                System.out.println("Nama\t\t: " + listOfPayments.get(hutang).getItemName());
                System.out.println("Tipe\t\t: " + listOfPayments.get(hutang).getItem().getType());
                System.out.println("Status\t\t: " + listOfPayments.get(hutang).getStatus());
                System.out.println("Sisa Pembayaran: " + listOfPayments.get(hutang).getRemainingAmount());
                System.out.println("Harga Pembayaran: " + listOfPayments.get(hutang).pay());

                if (listOfPayments.get(hutang).getRemainingAmount() > 0) {
                    System.out.print("Bayar: ");
                    int bayar = s.nextInt();
                    if (bayar >= listOfPayments.get(hutang).pay() && listOfPayments.get(hutang).getRemainingAmount()
                            == listOfPayments.get(hutang).pay()) {
                        System.out.println("Transaksi anda telah dibayar lunas. Terima kasih!");
                        listOfPayments.get(hutang).payItem();
                    } else {
                        System.out.println("Transaksi anda telah dibayar");
                        listOfPayments.get(hutang).payItem();
                    }
                }
            }
            /* BATAS AKHIR MENU NOMOR 2 */
            else {
                System.out.println("Salah input");
            }
        } while (opt != 0);
    }
}
