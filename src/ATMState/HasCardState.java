package ATMState;

import ATM.ATM;
import ATMRoom.ATMRoom;
import CashWithdrawalUtil.ICashWithdraw;
import User.User;
import Card.Card;

public class HasCardState extends ATMState {
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
        System.out.println("Authenticating.. Enter pin");
        User user = atmRoom.getUser();
        Card card = user.getCard();
        if(card.getPin() == pinCurrent) {
            System.out.println("PIN OK");
            ATM machine = atmRoom.getMachine();
            machine.setState(new SelectionState());
            atmRoom.setMachine(machine);
        }
        else {
            System.out.println("PIN NOT OK");
            removeCard(atmRoom);
        }
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
