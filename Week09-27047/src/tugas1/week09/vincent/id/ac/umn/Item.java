package tugas1.week09.vincent.id.ac.umn;

public class Item {
    private String name, type;
    private int price, oriPrice;

    public Item() {
    }

    public Item(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.oriPrice = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getOriPrice() {
        return oriPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void payItem(int payment) {
        this.price -= payment;
    }
}
