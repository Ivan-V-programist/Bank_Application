public abstract class Account implements Rate{
    String name;
    String ssn;
    double balance;

    String accNum;
    Double rate;


    public Account(String name,  String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        this.balance = initDeposit;
    }
}
