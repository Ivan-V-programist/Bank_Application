public class Checkings extends Account {
    //properties of this class
    int cardNum;
    int pin;

    //constructors
    public Checkings(String name, String  ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        this.ssn = ssn;
        this.balance = initDeposit;
    }

    //methods


    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
