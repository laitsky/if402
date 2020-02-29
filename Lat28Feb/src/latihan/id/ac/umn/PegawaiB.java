package latihan.id.ac.umn;

public class PegawaiB extends Pegawai {
    int kehadiran;

    public PegawaiB(int gaji, int kehadiran) {
        super(gaji);
        this.kehadiran = kehadiran;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public int getGajiPegawaiB() {
        return getGaji() + 50000 * kehadiran;
    }
}
