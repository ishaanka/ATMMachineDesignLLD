package ATM;

import ATMState.ATMState;
import ATMState.IdleState;

public class ATM {
    ATMState state;

    public ATM() {
        this.state = new IdleState();
    }

    public ATMState getState() {
        return state;
    }
    public void setState(ATMState state) {
        this.state = state;
    }
}
