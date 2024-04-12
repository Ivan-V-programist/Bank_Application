public class Savings extends Account{

    //properties of this class
    private int safetyDepositID;
    private int safetyDepositKey;

    //constructors
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        setRate();
        accNum = "1"+accNum;
    }

    //methods

    public int getSafetyDepositID() {
        return safetyDepositID;
    }

    public void setSafetyDepositID(int safetyDepositID) {
        this.safetyDepositID = safetyDepositID;
    }

    public int getSafetyDepositKey() {
        return safetyDepositKey;
    }

    public void setSafetyDepositKey(int safetyDepositKey) {
        safetyDepositKey = safetyDepositKey;
    }

    public void showInfo(){
        System.out.println("Account type: Savings");
        super.showInfo();
        System.out.println(
                "Features"+
                "\nSafety Deposit Box ID: "+
                safetyDepositID+
                "\nSafety Deposit Key: "+
                safetyDepositKey+
                "\nRate: " + rate
        );

    }

    public void setRate(){
        rate = baseRate() - .25;
    }

    private void setSafetyBox(){
        safetyDepositID =(int) (Math.random() * Math.pow(10,3));
        safetyDepositKey = (int) (Math.random() * Math.pow(10,4));
    }
}
