package latihan.id.ac.umn;

public class PegawaiA extends Pegawai {
    int sks;

    public PegawaiA(int gaji, int sks) {
        super(gaji);
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getGajiPegawaiA() {
        return getGaji() + (250000 * sks);
    }
}
