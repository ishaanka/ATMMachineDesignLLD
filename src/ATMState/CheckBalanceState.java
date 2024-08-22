package ATMState;

import ATM.ATM;
import ATMRoom.ATMRoom;
import BankAccount.BankAccount;
import CashWithdrawalUtil.ICashWithdraw;
import User.User;

public class CheckBalanceState extends ATMState {
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
        User user = atmRoom.getUser();
        BankAccount bankAccount = user.getBankAccount();

        System.out.println("Fetching Bank account balance... Bank account balance: " + bankAccount.getBalance());
        this.removeCard(atmRoom);
    }
    public void depositCash(ATMRoom atmRoom, int cash) throws Exception {
        throw new Exception("Invalid state");
    }
}
