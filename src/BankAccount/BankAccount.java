package BankAccount;

public class BankAccount {
    String BankName;
    String AccountNumber;
    double Balance;
    public BankAccount(String BankName, String AccountNumber, double Balance) {
        this.BankName = BankName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public String getBankName() {
        return BankName;
    }
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
}
