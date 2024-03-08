import java.util.Scanner;

public class Banking_transaction {
    public static void main(String args[]) {
        int balance = 100000;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("    1. Check Balance");
            System.out.println("    2. Wihdraw Money");
            System.out.println("    3. Deposit Money");
            System.out.println("    4. exit");
            System.out.print("    Enter your choice : ");
            int ch = sc.nextInt();
            System.out.println("#################################\n");
            switch (ch) {
                case 1:
                    System.out.println("Your available balance is " + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    int amt = sc.nextInt();
                    if (balance > amt) {
                        balance = balance - amt;
                        System.out.println("Your Updated balance is " + balance);
                    } else {
                        System.out.println("Cannot with draw! LOW BALANCE try again...");
                        System.out.println("Your available balance is " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount to deposite");
                    int amt2 = sc.nextInt();
                    balance = balance + amt2;
                    System.out.println("Your Updated balance is " + balance);
                    break;
                case 4:
                    System.out.println("       ***Thank you***      ");
                    System.exit(0);

            }
            System.out.println("\n#################################\n");

        }

    }
}
