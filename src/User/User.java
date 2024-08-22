package User;

import BankAccount.BankAccount;
import Card.Card;

public class User {
    String name;
    String password;
    Card card;
    BankAccount bankAccount;

    public User(String name, String password, Card card, BankAccount bankAccount) {
        this.name = name;
        this.password = password;
        this.card = card;
        this.bankAccount = bankAccount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public BankAccount getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
