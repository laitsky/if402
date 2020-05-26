package umn.ac.id._27047;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<MediaPromosi> mediaPromosis = new ArrayList<>();
    static ArrayList<Aktor> aktors = new ArrayList<>();
    static ArrayList<Celebgram> celebgrams = new ArrayList<>();
    static ArrayList<Majalah> majalahs = new ArrayList<>();
    static ArrayList<Baliho> balihos = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    private static void seedData() {
        aktors.add(new Aktor("Chris Evans", 30, 170, 60, 100_000, "Captain America Lovers"));
        aktors.add(new Aktor("Robert Downey Jr.", 31, 171, 61, 120_000, "Ironman Lovers"));
        aktors.add(new Aktor("Chris Hemsworth", 32, 172, 62, 140_000, "Thor Lovers"));
        celebgrams.add(new Celebgram("Awkarin", 25, 165, 45, 100_000, "Instagram", "Furnitur"));
        celebgrams.add(new Celebgram("Anya Geraldine", 26, 166, 46, 120_000, "Twitter", "Makanan"));
        celebgrams.add(new Celebgram("Devina Aurel", 27, 167, 47, 140_000, "Youtube", "Tanaman"));
        balihos.add(new Baliho("Baliho Jakarta Pusat", 6, "Jakarta Pusat"));
        balihos.add(new Baliho("Baliho Jakarta Barat", 8, "Jakarta Barat"));
        balihos.add(new Baliho("Baliho Jakarta Utara", 9, "Jakarta Utara"));
        majalahs.add(new Majalah("Home Decor", 15, "Halaman 2", "Furnitur"));
        majalahs.add(new Majalah("Sedap", 18, "Halaman 3", "Makanan"));
        majalahs.add(new Majalah("Otomotif", 21, "Halaman 4", "Tanaman"));
    }

    private static void menuUtama() {
        System.out.println("===============================");
        System.out.println("\tWemen Marketing Agent\t");
        System.out.println("===============================");
        System.out.println("1. Penambahan Media");
        System.out.println("2. Penyewaan Media");
        System.out.println("3. Check Employment / Rental");
        System.out.println("4. Credits");
        System.out.println("5. Exit");
        System.out.println("===============================");
        System.out.print("Pilih Menu (1-5): ");
    }

    private static void menuPenambahanMedia() {
        System.out.println("===============================");
        System.out.println("\tWemen Marketing Agent\t");
        System.out.println("===============================");
        System.out.println("1. Celebgram");
        System.out.println("2. Majalah");

        System.out.println("===============================");
        System.out.print("Pilih Media (1-2): ");
    }

    private static void showKategori() {
        System.out.println("===============================");
        System.out.println("1. Furnitur");
        System.out.println("2. Makanan");
        System.out.println("3. Tanaman");
        System.out.println("4. Otomotif");
        System.out.println("5. Musik");
        System.out.println("===============================");
        System.out.print("Pilih Kategori (1-5): ");
    }

    private static void printOrders() {
        int idx = 1;
        System.out.println("===============================");
        System.out.println("\tWemen Marketing Agent\t");
        System.out.println("===============================");
        for (Order o : orders) {
            System.out.println("No\t\t\t: " + (idx));
            System.out.println("Media\t\t: " + o.getMedia());
            System.out.println("Nama\t\t: " + o.getMediaPromosi().getNama());
            System.out.println("Tanggal\t\t: " + o.getTanggal());
            System.out.println("Durasi Kontrak: " + o.getJangkaWaktu());
            System.out.println("Harga\t\t: " + o.getMediaPromosi().getHarga());
        }
    }

    private static void showCredit() {
        System.out.println("===============================");
        System.out.println("\tWemen Marketing Agent\t");
        System.out.println("===============================");
        System.out.println("Name: Vincent Diamond");
        System.out.println("NIM: 00000027047");
        System.out.println("===============================");
    }

    public static void main(String[] args) {
        seedData();
        Scanner scanner = new Scanner(System.in);
        int menuInput;
        int kategori;
        int umur;
        int tinggiBadan;
        int beratBadan;
        int jmlFollowers;
        int luas;
        int jmlHariSewa;
        String bidang = null;
        String nama;
        String media;
        String ltkHlmPromosi;
        String tglMulai;

        while (true) {
            menuUtama();
            menuInput = scanner.nextInt();

            switch (menuInput) {
                case 1:
                    menuPenambahanMedia();
                    menuInput = scanner.nextInt();
                    showKategori();
                    kategori = scanner.nextInt();
                    switch (kategori) {
                        case 1:
                            bidang = "Furnitur";
                            break;
                        case 2:
                            bidang = "Makanan";
                            break;
                        case 3:
                            bidang = "Tanaman";
                            break;
                        case 4:
                            bidang = "Otomotif";
                            break;
                        case 5:
                            bidang = "Musik";
                            break;
                        default:
                            System.out.println("Input kamu salah!");
                            break;
                    }
                    switch (menuInput) {
                        case 1:
                            System.out.print("Masukkan nama: ");
                            scanner.nextLine();
                            nama = scanner.nextLine();
                            System.out.print("Masukkan umur: ");
                            umur = scanner.nextInt();
                            System.out.print("Masukkan tinggi badan: ");
                            tinggiBadan = scanner.nextInt();
                            System.out.print("Masukkan berat badan: ");
                            beratBadan = scanner.nextInt();
                            System.out.print("Masukkan jumlah followers: ");
                            jmlFollowers = scanner.nextInt();
                            System.out.print("Masukkan media sosial yang digunakan: ");
                            scanner.nextLine();
                            media = scanner.nextLine();

                            celebgrams.add(new Celebgram(nama, umur, tinggiBadan, beratBadan, jmlFollowers, media, bidang));
                            System.out.println("Media baru telah dimasukkan");
                            break;
                        case 2:
                            System.out.print("Masukkan nama: ");
                            scanner.nextLine();
                            nama = scanner.nextLine();
                            System.out.print("Masukkan luas: ");
                            luas = scanner.nextInt();
                            System.out.print("Masukkan letak halaman promosi: ");
                            scanner.nextLine();
                            ltkHlmPromosi = scanner.nextLine();

                            majalahs.add(new Majalah(nama, luas, ltkHlmPromosi, bidang));
                            System.out.println("Media baru telah dimasukkan");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("===============================");
                    System.out.println("\tWemen Marketing Agent\t");
                    int idx = 1;
                    int reqIdx;
                    int total = 0;
                    int nominalPembayaran;
                    int aktorIdx = aktors.size();
                    int celebIdx = aktorIdx + celebgrams.size();
                    int balihoIdx = celebIdx + balihos.size();
                    int majalahIdx = balihoIdx + majalahs.size();
                    showKategori();
                    kategori = scanner.nextInt();

                    switch (kategori) {
                        case 1:
                            bidang = "Furnitur";
                            break;
                        case 2:
                            bidang = "Makanan";
                            break;
                        case 3:
                            bidang = "Tanaman";
                            break;
                        case 4:
                            bidang = "Otomotif";
                            break;
                        case 5:
                            bidang = "Musik";
                            break;
                        default:
                            System.out.println("Input kamu salah!");
                            break;
                    }
                    System.out.print("Tanggal mulai (DDMMYYYY): ");
                    scanner.nextLine();
                    tglMulai = scanner.nextLine();
                    System.out.print("Banyak hari penyewaan: ");
                    jmlHariSewa = scanner.nextInt();

                    for (Aktor a : aktors) {
                        System.out.println("===============================");
                        System.out.println("No\t\t\t: " + idx);
                        System.out.println("Media\t\t: Aktor");
                        System.out.println("Nama\t\t: " + a.getNama());
                        System.out.println("Tinggi Badan: " + a.getTinggiBadan());
                        System.out.println("Berat Badan\t: " + a.getBeratBadan());
                        System.out.println("Jumlah Fans\t: " + a.getFans());
                        System.out.println("Nama Fansclub: " + a.getFanClub());
                        System.out.println("Harga\t\t: " + a.getHarga());
                        idx++;
                    }
                    for (Celebgram c : celebgrams) {
                        System.out.println("===============================");
                        System.out.println("No\t\t\t: " + idx);
                        System.out.println("Media\t\t: Celebgram");
                        System.out.println("Nama\t\t: " + c.getNama());
                        System.out.println("Tinggi Badan: " + c.getTinggiBadan());
                        System.out.println("Berat Badan\t: " + c.getBeratBadan());
                        System.out.println("Jumlah Fans\t: " + c.getFollowers());
                        System.out.println("Nama Fansclub: " + c.getAkunMedia());
                        System.out.println("Bidang\t\t: " + c.getBidang());
                        System.out.print("Harga\t\t: ");
                        if (c.getBidang().equals(bidang)) {
                            System.out.println(c.getHarga() + (50_000 * jmlHariSewa));
                        } else {
                            System.out.println(c.getHarga());
                        }
                        idx++;
                    }
                    for (Baliho b : balihos) {
                        System.out.println("===============================");
                        System.out.println("No\t\t\t: " + idx);
                        System.out.println("Media\t\t: Baliho");
                        System.out.println("Nama\t\t: " + b.getNama());
                        System.out.println("Luas\t\t: " + b.getLuas());
                        System.out.println("Letak\t\t: " + b.getLetak());
                        System.out.println("Harga\t\t: " + b.getHarga());
                        idx++;
                    }
                    for (Majalah m : majalahs) {
                        System.out.println("===============================");
                        System.out.println("No\t\t\t: " + idx);
                        System.out.println("Media\t\t: Majalah");
                        System.out.println("Nama\t\t: " + m.getNama());
                        System.out.println("Luas\t\t: " + m.getLuas());
                        System.out.println("Letak\t\t: " + m.getLetak());
                        System.out.println("Bidang\t\t: " + m.getBidang());
                        System.out.print("Harga\t\t: ");
                        if (m.getBidang().equals(bidang)) {
                            System.out.println(m.getHarga() + (50_000 * jmlHariSewa));
                        } else {
                            System.out.println(m.getHarga());
                        }
                        idx++;
                    }
                    System.out.print("Masukkan nomor media: ");
                    reqIdx = scanner.nextInt();
                    System.out.print("Masukkan uang untuk pembayaran: ");
                    nominalPembayaran = scanner.nextInt();

                    if (reqIdx <= aktorIdx) {
                        if (nominalPembayaran < aktors.get(reqIdx).getHarga() * jmlHariSewa) {
                            System.out.println("Uang tidak mencukupi");
                        } else {
                            orders.add(new Order(aktors.get(reqIdx - 1), bidang, tglMulai, "Aktor", jmlHariSewa, total));
                            System.out.println("Pemesanan anda sukses");
                        }
                    } else if (reqIdx <= celebIdx) {
                        reqIdx -= (aktorIdx + 1);
                        if (celebgrams.get(reqIdx).getBidang().equals(bidang)) {
                            total = 500_000 * jmlHariSewa;
                        }
                        if (nominalPembayaran < celebgrams.get(reqIdx).getHarga() * jmlHariSewa + total) {
                            System.out.println("Uang tidak mencukupi");
                        } else {
                            orders.add(new Order(celebgrams.get(reqIdx), bidang, tglMulai, "Celebgram", jmlHariSewa, total));
                            System.out.println("Pemesanan anda sukses");
                        }
                    } else if (reqIdx <= balihoIdx) {
                        reqIdx -= (celebIdx + 1);
                        if (nominalPembayaran < balihos.get(reqIdx).getHarga() * jmlHariSewa) {
                            System.out.println("Uang tidak mencukupi");
                        } else {
                            orders.add(new Order(balihos.get(reqIdx), bidang, tglMulai, "Baliho", jmlHariSewa, total));
                            System.out.println("Pemesanan anda sukses");
                        }
                    } else if (reqIdx <= majalahIdx) {
                        reqIdx -= (balihoIdx + 1);
                        if (majalahs.get(reqIdx).getBidang().equals(bidang)) {
                            total = 200_000 * jmlHariSewa;
                        }
                        if (nominalPembayaran < majalahs.get(reqIdx).getHarga() * jmlHariSewa + total) {
                            System.out.println("Uang tidak mencukupi");
                        } else {
                            orders.add(new Order(majalahs.get(reqIdx), bidang, tglMulai, "Majalah", jmlHariSewa, total));
                            System.out.println("Pemesanan anda sukses");
                        }
                    } else {
                        System.out.println("Nomor media tidak terdapat di dalam daftar media");
                    }
                    break;

                case 3:
                    if (orders.isEmpty()) {
                        System.out.println("Tidak ada pesanan!");
                        break;
                    }
                    printOrders();
                    System.out.println("===============================");
                    System.out.println("1. Batalkan order");
                    System.out.println("2. Kembali ke menu utama");
                    System.out.println("===============================");
                    System.out.print("Pilih menu (1-2): ");
                    menuInput = scanner.nextInt();
                    if (menuInput == 1) {
                        System.out.print("Masukkan nomor yang ingin dibatalkan: ");
                        reqIdx = scanner.nextInt();
                        reqIdx--;
                        if (orders.get(reqIdx).getTanggal().equals("03062020")) {
                            System.out.println("Pesanan ini tidak dapat dibatalkan");
                        } else {
                            orders.remove(reqIdx);
                            System.out.println("Pesanan anda berhasil dibatalkan");
                        }
                    } else if (menuInput == 2) {
                        break;
                    }
                    break;
                case 4:
                    showCredit();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Angka yang dimasukkan tidak valid!");
            }
        }
    }
}