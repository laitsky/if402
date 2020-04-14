package Model;

public class Barang {
    private int id, stok;
    private double harga;
    private String nama;

    public Barang(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void minusStock(int jml) {
        this.stok -= jml;
    }
}
