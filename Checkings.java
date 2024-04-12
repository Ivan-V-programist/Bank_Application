public class Checkings extends Account {
    //properties of this class
    private int cardNum;
    private int pin;

    //constructors
    public Checkings(String name, String  ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        setRate();
        accNum = "2"+accNum;
        setDebitCard();
        this.balance = initDeposit;

    }

    //methods
    private void setDebitCard(){
        cardNum = (int)(Math.random()*Math.pow(10,12));
        pin = (int)(Math.random()*Math.pow(10,4));
    }

    public void setRate(){
        rate = baseRate() * .15;
    }





     public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Checking");
        System.out.println(
                "Features"+
                        "\nCard Number: "+
                        cardNum+
                        "\nPIN: "+
                        pin+
                        "\nRate: " + rate
        );

    }
}
