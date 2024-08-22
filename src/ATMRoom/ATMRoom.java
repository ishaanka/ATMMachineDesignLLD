package ATMRoom;

import ATM.ATM;
import User.User;

public class ATMRoom {
    ATM machine;
    User user;

    public ATMRoom(ATM machine) {
        this.machine = machine;
    }
    public ATM getMachine() {
        return machine;
    }
    public void setMachine(ATM machine) {
        this.machine = machine;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
