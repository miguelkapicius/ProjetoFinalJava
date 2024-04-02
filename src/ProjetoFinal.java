import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";
        String type = "";
        double balance = 0;
        double change = 0;




        while (true) {
            System.out.println("*************************");
            System.out.println("Name: " + name);
            System.out.println("Account Type: " + type);
            System.out.println("Balance: $" + balance);
            System.out.println("*************************");

            System.out.println("Options:");
            System.out.println("""
                1- Check Balance
                2- Receive Value
                3- Transfer Value
                4- Exit
                
                Choose your option:
                 """);

            int option = input.nextInt();

            if (option == 1) {
                System.out.println("Current Balance: $" + balance);
            } else if (option == 2) {
                System.out.println("Amount to receive:");
                change = input.nextDouble();
                balance += change;
                System.out.println("Balance updated: $" + balance);
            } else if (option == 3) {
                System.out.println("Amount to transfer:");
                change = input.nextDouble();
                balance -= change;
                System.out.println("Balance updated: $" + balance);
            } else if (option == 4) {
                System.out.println("Shut down...");
                break;
            } else {
                System.out.println("Choose a valid option!");
            }
        }
    }
}
