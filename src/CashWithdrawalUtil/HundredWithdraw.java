package CashWithdrawalUtil;

public class HundredWithdraw extends ICashWithdraw {

    public HundredWithdraw() {
        this.cashWithdrawNext = null;
    }

    @Override
    public void withdraw(int balance) {
        while(balance >= 100){
            balance -= 100;
            System.out.println("Dispensed 100/- note");
        }
        if(balance > 0){
            super.withdraw(balance);
        }
    }
}
