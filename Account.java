public abstract class Account implements Rate{
    String name;
    String ssn;
    double balance;
    static int index=10000;

    String accNum;
    Double rate;


    public Account(String name,  String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        this.balance = initDeposit;
        index++;
        this.accNum = setAccNum();
    }
//set acc num
    private String setAccNum (){
        String last2SSN = ssn.substring(ssn.length()-2);
        int uniqID = index;
        int randomNum = (int) (Math.random() * Math.pow(10,3));
        return last2SSN + uniqID + randomNum;
    }

    public abstract void setRate();

    public void showInfo(){
        System.out.println(
                "Name: "+ this.name +
                "\nAccount Number: " + this.accNum +
                "\nBalance: " + this.balance
        );
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("deposited: "+amount);
        printBalance();
    }
    public void withdraw(double amount){
        balance-=amount;
        System.out.println("withdrawn: "+amount);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your Balance: "+balance);
    }

    public void compoundInterest(){
        double  interest = balance * rate/100;
        balance+=interest;
        printBalance();
    }

    public void transfer(String where, double amount){
        balance-=amount;
        System.out.println("Transferred to "+where);
        printBalance();
    }
}
