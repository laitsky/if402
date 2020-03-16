package quizuts.vincentdiamond.id.ac.umn;

public class StaffAkademik extends Karyawan {

    public StaffAkademik(String name, int pendapatanTetap) {
        super(name, pendapatanTetap);
    }

    public int getPendapatanTetap(int flatBonus) {
        return super.getPendapatanTetap() + flatBonus;
    }
}
