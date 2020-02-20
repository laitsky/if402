package week04.vincent.id.ac.umn;

public class Order {
    private int id, jumlah;
    private Barang barang;
    public static int total;

    public Order(int id, Barang barang, int jumlah) {
        this.id = id;
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }
    public int getJumlah() {
        return jumlah;
    }
    public Barang getBarang() {
        return barang;
    }
}
