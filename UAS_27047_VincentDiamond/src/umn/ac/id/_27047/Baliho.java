package umn.ac.id._27047;

public class Baliho extends MediaPromosi {
    private int luas;
    private String letak;

    public Baliho() {}

    public Baliho(int luas, String letak) {
        this.luas = luas;
        this.letak = letak;
    }

    public Baliho(String nama, int luas, String letak) {
        super(nama, (luas * 3_000_000));
        this.luas = luas;
        this.letak = letak;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }
}
