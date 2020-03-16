package quizuts.vincentdiamond.id.ac.umn;

public class Dosen extends Karyawan {
    protected int jumlahBimbingan;

    public Dosen(int jumlahBimbingan, String name, int pendapatanTetap) {
        super(name, pendapatanTetap);
        this.jumlahBimbingan = jumlahBimbingan;

    }

    @Override
    public int getPendapatanTetap() {
        return super.getPendapatanTetap() + (this.jumlahBimbingan * 10000);
    }
}
