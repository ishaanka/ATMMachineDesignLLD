package CashWithdrawalUtil;

public class ICashWithdraw {
    ICashWithdraw cashWithdrawNext;

    public void withdraw(int balance) {
        cashWithdrawNext.withdraw(balance);
    }
}
