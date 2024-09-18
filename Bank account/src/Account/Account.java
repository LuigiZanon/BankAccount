package Account;

public abstract class Account {

    private String name;
    private int account_number;
    private double limit;
    private double balance;
    private int password;
    private Date openingDate;

    public Account(String name, double balance, int account_number, Date openingDate){
        this.name = name;
        this.account_number = account_number;
        password = 0;

        this.openingDate = openingDate;

        limit = 1000;

        if(balance > 0.0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }
    }

    public void deposit(double deposit) {
        if(deposit > 0.0){
            balance += deposit;
        }
    }

    public abstract void Withdraw(double amount);

    public String get_name(){
        return name;
    }

    public double get_balance(){
        return balance;
    }

    public double get_limit(){
        return limit;
    }

    public int get_accountNumber(){
        return account_number;
    }

    public void Set_name(String name){
        this.name = name;
    }

    public void Set_accountnumber(int account_number){
        this.account_number = account_number;
    }

    public void Set_limit(double limit){
        this.limit = limit;
    }

    public void change_password(int old_password, int new_password){
        
        if(old_password == password){
            password = new_password;
            System.out.println("Password has been changed");
        }else{
            System.out.println("Wrong password");
        }
    }

    public boolean verify_password(int password){
        return password == this.password;
    }

    public String toString(){
        return String.format("%s, Hired: %s", name,openingDate);
    }
}
