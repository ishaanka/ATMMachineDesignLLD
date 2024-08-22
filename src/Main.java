import ATM.ATM;
import ATMRoom.ATMRoom;
import BankAccount.BankAccount;
import Card.Card;
import CashWithdrawalUtil.FiveHundredWithdraw;
import CashWithdrawalUtil.HundredWithdraw;
import CashWithdrawalUtil.ICashWithdraw;
import CashWithdrawalUtil.TwoThousandWithdraw;
import User.User;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to ATM System !");

        BankAccount bankAccount = new BankAccount("ICICI BANK", "1234-9090-1234", 0);
        Card card = new Card("7878-7878-7878",784,9234);
        User user = new User("Ishaan","abdsc" ,card, bankAccount);

        ICashWithdraw cashWithdraw = new TwoThousandWithdraw(new FiveHundredWithdraw(new HundredWithdraw()));

        ATM atmMachine = new ATM();
        ATMRoom room = new ATMRoom(atmMachine);
        room.setUser(user);

        atmMachine.getState().insertCard(room);
        atmMachine.getState().authenticate(room, 9234);
        atmMachine.getState().selectOption(room, 3);
        atmMachine.getState().checkBalance(room);

        atmMachine.getState().insertCard(room);
        atmMachine.getState().authenticate(room, 9234);
        atmMachine.getState().selectOption(room, 2);
        atmMachine.getState().depositCash(room, 10000);

        atmMachine.getState().insertCard(room);
        atmMachine.getState().authenticate(room, 9234);
        atmMachine.getState().selectOption(room, 1);
        atmMachine.getState().withDrawCash(room, cashWithdraw, 3800);
    }
}