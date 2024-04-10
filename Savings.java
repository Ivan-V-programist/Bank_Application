public class Savings extends Account{

    //properties of this class
    int safetyDepositID;
    int SafetyDepositKey;

    //constructors
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        this.ssn = ssn;
    }

    //methods

    public int getSafetyDepositID() {
        return safetyDepositID;
    }

    public void setSafetyDepositID(int safetyDepositID) {
        this.safetyDepositID = safetyDepositID;
    }

    public int getSafetyDepositKey() {
        return SafetyDepositKey;
    }

    public void setSafetyDepositKey(int safetyDepositKey) {
        SafetyDepositKey = safetyDepositKey;
    }
}
