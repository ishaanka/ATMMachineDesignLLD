package ATMState;

import ATMRoom.ATMRoom;
import CashWithdrawalUtil.ICashWithdraw;
import ATM.ATM;

public class IdleState extends ATMState {
    public void insertCard(ATMRoom atmRoom) throws Exception {
        System.out.println("Inserting card");
        ATM machine = atmRoom.getMachine();
        machine.setState(new HasCardState());
        atmRoom.setMachine(machine);
    }
    public void removeCard(ATMRoom atmRoom) throws Exception {
        throw new Exception("Invalid state");
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
        throw new Exception("Invalid state");
    }
}
