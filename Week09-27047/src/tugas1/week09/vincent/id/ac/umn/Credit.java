package tugas1.week09.vincent.id.ac.umn;

public class Credit extends Payment {
    private int installment, maxInstallmentAmount;

    public Credit() {
    }

    public Credit(Item item, int maxInstallmentAmount) {
        super(item);
        this.maxInstallmentAmount = maxInstallmentAmount;
        this.installment = maxInstallmentAmount - 1;
    }

    @Override
    public int pay() {
        if (!isPaidOff) {
            return 0;
        }
        return this.item.getPrice() / maxInstallmentAmount;
    }

    @Override
    public int getRemainingAmount() {
        if (isPaidOff) return 0;
        return item.getPrice() * installment / maxInstallmentAmount;
    }

    @Override
    public String getClassName() {
        return "CREDIT";
    }

    public void payItem() {
        installment--;
        if (installment == 0) {
            isPaidOff = true;
        }
    }
}
