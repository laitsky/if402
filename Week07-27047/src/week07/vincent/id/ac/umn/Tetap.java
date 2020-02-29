package week07.vincent.id.ac.umn;

public class Tetap extends Karyawan {
    public Tetap() {}
    public Tetap(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    @Override
    public int getGaji() {
        return 3000000;
    }
}
