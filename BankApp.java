import java.util.ArrayList;
import java.util.List;

public class BankApp {
    public static void main(String[] args){
        List<Account> accounts = new ArrayList<>();

        String path = "C://file.csv";

        List<String[]> newAccounts = utils.CSV.read(path);
        for(String[] account : newAccounts){
            //prints all info for new accounts
            String name = account[0];
            String ssn = account[1];
            String accType = account[2];
            double initDeposit = Double.parseDouble(account[3]);
            System.out.println(name + " " +ssn + " " + accType + " " +initDeposit);
            if(accType.equals("Checking")){
                System.out.println("Open checking acc");
                accounts.add(new Checkings(name, ssn, initDeposit));
            }
            else if(accType.equals("Savings")){
                System.out.println("Open savings acc");
                accounts.add(new Savings(name, ssn, initDeposit));
            }
            else {
                System.out.println("Error reading the account");
            }

        }

    }
}
