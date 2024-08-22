package ATMState;

import ATM.ATM;
import ATMRoom.ATMRoom;
import CashWithdrawalUtil.ICashWithdraw;

public class SelectionState extends ATMState {
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
        ATM machine = atmRoom.getMachine();
        switch (option) {
            case 1:
                machine.setState(new CashWithdrawState());
                atmRoom.setMachine(machine);
                break;

            case 2:
                machine.setState(new CashDepositState());
                atmRoom.setMachine(machine);
                break;

            case 3:
                machine.setState(new CheckBalanceState());
                atmRoom.setMachine(machine);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
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
