package tugas1.week09.vincent.id.ac.umn;

public class Cash extends Payment {
    public Cash(Item item) {
        super(item);
    }

    @Override
    public int pay() {
        if (isPaidOff)
            return 0;
        isPaidOff = true;
        return this.item.getPrice();
    }

    public String getClassName() {
        return "CASH";
    }
}
