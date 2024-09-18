package Account;

public class Conta_especial extends Account{
    public Conta_especial(String name, double balance, int account_number, Date openingDate){
        super(name, balance, account_number, openingDate);
    }

    @Override
    public void Withdraw(double amount){
        if(amount > limit){
            System.out.println("Limit insuficiente");
        }else{
            
        }
    }
}
