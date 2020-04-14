package tugas1.week09.vincent.id.ac.umn;

public class Credit extends Payment {
    private int installment, maxInstallmentAmount;

    public Credit() {
    }

    public Credit(Item item, int installment) {
        super(item);
        this.installment = installment;
    }

    @Override
    public int pay() {
        if (!isPaidOff) {
            isPaidOff = true;
        }
        return this.item.getPrice() / maxInstallmentAmount;
    }

    @Override
    public int getRemainingAmount() {
        if (isPaidOff) return 0;
        return item.getPrice();
    }

    @Override
    public String getClassName() {
        return "CREDIT";
    }
}
