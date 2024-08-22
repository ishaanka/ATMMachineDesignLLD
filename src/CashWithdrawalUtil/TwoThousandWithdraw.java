package CashWithdrawalUtil;

public class TwoThousandWithdraw extends ICashWithdraw {

    public TwoThousandWithdraw(ICashWithdraw obj) {
        this.cashWithdrawNext = obj;
    }

    @Override
    public void withdraw(int balance) {
        while(balance >= 2000){
            balance -= 2000;
            System.out.println("Dispensed 2000/- note");
        }
        if(balance > 0){
            super.withdraw(balance);
        }
    }
}
