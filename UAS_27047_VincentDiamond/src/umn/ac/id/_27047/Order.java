package umn.ac.id._27047;

public class Order {
    private MediaPromosi mediaPromosi;
    private String bidang;
    private String tanggal;
    private String media;
    private int jangkaWaktu;
    private int total;

    public Order() {
    }

    public Order(MediaPromosi mediaPromosi, String bidang, String tanggal, String media, int jangkaWaktu, int total) {
        this.mediaPromosi = mediaPromosi;
        this.bidang = bidang;
        this.tanggal = tanggal;
        this.media = media;
        this.jangkaWaktu = jangkaWaktu;
        this.total = total;
    }

    public MediaPromosi getMediaPromosi() {
        return mediaPromosi;
    }

    public void setMediaPromosi(MediaPromosi mediaPromosi) {
        this.mediaPromosi = mediaPromosi;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public int getJangkaWaktu() {
        return jangkaWaktu;
    }

    public void setJangkaWaktu(int jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
