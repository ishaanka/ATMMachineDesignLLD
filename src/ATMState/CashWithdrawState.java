package ATMState;

import ATM.ATM;
import ATMRoom.ATMRoom;
import CashWithdrawalUtil.ICashWithdraw;

public class CashWithdrawState extends ATMState {

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
        double balance1 = atmRoom.getUser().getBankAccount().getBalance();
        if(balance1 < balance) {
            System.out.println("Insufficient balance !!");
        }

        if(balance%100 !=0) {
            System.out.println("Invalid amount entered !!");
        }
        else {
            cashWithdrawObj.withdraw(balance);
        }
        removeCard(atmRoom);
    }
    public void checkBalance(ATMRoom atmRoom) throws Exception {
        throw new Exception("Invalid state");
    }
    public void depositCash(ATMRoom atmRoom, int cash) throws Exception {
        throw new Exception("Invalid state");
    }
}
