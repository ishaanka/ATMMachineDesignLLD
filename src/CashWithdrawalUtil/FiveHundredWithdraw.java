package CashWithdrawalUtil;

public class FiveHundredWithdraw extends ICashWithdraw{

    public FiveHundredWithdraw(ICashWithdraw obj) {
        this.cashWithdrawNext = obj;
    }

    @Override
    public void withdraw(int balance) {
        while(balance >= 500){
            balance -= 500;
            System.out.println("Dispensed 500/- note");
        }
        if(balance > 0){
            super.withdraw(balance);
        }
    }
}
