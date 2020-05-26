package umn.ac.id._27047;

public class Aktor extends MediaPromosi {
    private int umur;
    private int tinggiBadan;
    private int beratBadan;
    private int fans;
    private String fanClub;

    public Aktor() {}

    public Aktor(int umur, int tinggiBadan, int beratBadan, int fans, String fanClub) {
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        this.fans = fans;
        this.fanClub = fanClub;
    }

    public Aktor(String nama, int umur, int tinggiBadan, int beratBadan, int fans, String fanClub) {
        super(nama, (fans * 2000));
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        this.fans = fans;
        this.fanClub = fanClub;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public int getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public String getFanClub() {
        return fanClub;
    }

    public void setFanClub(String fanClub) {
        this.fanClub = fanClub;
    }
}
