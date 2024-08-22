package ATMState;

import ATM.ATM;
import ATMRoom.ATMRoom;
import BankAccount.BankAccount;
import User.User;
import CashWithdrawalUtil.ICashWithdraw;

public class CashDepositState extends ATMState {
    public void insertCard(ATMRoom atmRoom) throws Exception {
        throw new Exception("Invalid state");
    }
    public void removeCard(ATMRoom atmRoom) throws Exception {
        System.out.println("Removing card");
        ATM machine = atmRoom.getMachine();
        machine.setState(new IdleState());
        atmRoom.setMachine(machine);
    }
    public void authenticate(ATMRoom atmRoom, int pinCurrent) throws Exception {
        throw new Exception("Invalid state");
    }
    public void exit(ATMRoom atmRoom) throws Exception {
        throw new Exception("Invalid state");
    }
    public void selectOption(ATMRoom atmRoom, int option) throws Exception {
        throw new Exception("Invalid state");
    }
    public void withDrawCash(ATMRoom atmRoom, ICashWithdraw cashWithdrawObj, int balance) throws Exception {
        throw new Exception("Invalid state");
    }
    public void checkBalance(ATMRoom atmRoom) throws Exception {
        throw new Exception("Invalid state");
    }
    public void depositCash(ATMRoom atmRoom, int cash) throws Exception {
        User user = atmRoom.getUser();
        BankAccount bankAccount = user.getBankAccount();
        bankAccount.setBalance(bankAccount.getBalance() + cash);
        user.setBankAccount(bankAccount);
        atmRoom.setUser(user);

        System.out.println("Successfully deposited cash");
        System.out.println("Bank account balance: " + bankAccount.getBalance());

        this.removeCard(atmRoom);
    }
}
