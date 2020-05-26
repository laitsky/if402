package umn.ac.id._27047;

public class Majalah extends MediaPromosi {
    private int luas;
    private String letak;
    private String bidang;

    public Majalah() {}

    public Majalah(int luas, String letak, String bidang) {
        this.luas = luas;
        this.letak = letak;
        this.bidang = bidang;
    }

    public Majalah(String nama, int luas, String letak, String bidang) {
        super(nama, luas * 50_000);
        this.luas = luas;
        this.letak = letak;
        this.bidang = bidang;
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

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}
