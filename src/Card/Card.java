package Card;

public class Card {
    String cardNumber;
    int cvvNumber;
    int pin;

    public Card(String cardNumber, int cvvNumber, int pin) {
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getCvvNumber() {
        return cvvNumber;
    }
    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
}
