package mod_1_4_abstract_class;

public abstract class ATMOperationPatt {
    protected abstract void bankAcceptance();
    protected abstract void balanceCheck();
    protected abstract void cashOutCommision();

    public void run() {
        this.bankAcceptance();
        this.balanceCheck();
        this.cashOutCommision();
    }
}
