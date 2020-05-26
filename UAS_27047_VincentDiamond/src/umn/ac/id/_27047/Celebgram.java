package umn.ac.id._27047;

public class Celebgram extends MediaPromosi {
    private int umur;
    private int tinggiBadan;
    private int beratBadan;
    private int followers;
    private String akunMedia;
    private String bidang;

    public Celebgram() {}

    public Celebgram(int umur, int tinggiBadan, int beratBadan, int followers, String akunMedia, String bidang) {
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        this.followers = followers;
        this.akunMedia = akunMedia;
        this.bidang = bidang;
    }

    public Celebgram(String nama, int umur, int tinggiBadan, int beratBadan, int followers, String akunMedia, String bidang) {
        super(nama, (followers * 1000));
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        this.followers = followers;
        this.akunMedia = akunMedia;
        this.bidang = bidang;
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

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getAkunMedia() {
        return akunMedia;
    }

    public void setAkunMedia(String akunMedia) {
        this.akunMedia = akunMedia;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}
