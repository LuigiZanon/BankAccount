import Account.Account;
import Account.Conta_especial;
import java.util.ArrayList;
import java.util.Scanner;


public class App {

    public static void menu_inicial(){
        System.out.println("O que deseja fazer:");
        System.out.println("[1]-Criar conta");
        System.out.println("[2]-Entrar na conta");
        System.out.println("[3]-Listar todas as contas");
        System.out.println("[4]-Sair");
    }

    public static void menu_contas(){
        System.out.println("Qual tipo de conta?");
        System.out.println("[1]-Conta simples");
        System.out.println("[2]-Conta especial");
        System.out.println("[3]-Conta poupança");
    }

    public static void print_menu() {
        System.out.println("Choose one option:");
        System.out.println("[1]- Deposit");
        System.out.println("[2]- Withdraw");
        System.out.println("[3]- Change limit");
        System.out.println("[4]- Change name");
        System.out.println("[5]- List all accounts");
        System.out.println("[6]- Change password");
        System.out.println("[7]- Exit");

    }

    public static Account cria_conta(){
        return null;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ArrayList<Account> accounts = new ArrayList<>();

        Account acc = new Conta_especial(null, 0, 0, null);

        int op =0;
        do { 

            menu_inicial();
            op = input.nextInt();
            
            switch (op) {
                case 1:
                    menu_contas();
                        op = input.nextInt();

                    switch (op) {
                        case 1:
                            
                            break;

                        case 2:

                            break;

                        case 3:

                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;

                case 2:

                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 0);
    }
}
