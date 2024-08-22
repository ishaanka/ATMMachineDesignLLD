package ATMState;

import ATMRoom.ATMRoom;
import CashWithdrawalUtil.ICashWithdraw;

public abstract class ATMState {
    public abstract void insertCard(ATMRoom atmRoom) throws Exception;
    public abstract void removeCard(ATMRoom atmRoom) throws Exception;
    public abstract void authenticate(ATMRoom atmRoom, int pinCurrent) throws Exception;
    public abstract void exit(ATMRoom atmRoom) throws Exception;
    public abstract void selectOption(ATMRoom atmRoom, int option) throws Exception;
    public abstract void withDrawCash(ATMRoom atmRoom, ICashWithdraw cashWithdrawObj, int balance) throws Exception;
    public abstract void checkBalance(ATMRoom atmRoom) throws Exception;
    public abstract void depositCash(ATMRoom atmRoom, int cash) throws Exception;
}
