import java.io.BufferedReader;
‎import java.io.InputStreamReader;
‎import java.io.IOException;
‎
‎public class AccountSavings {
‎    public static void main(String[] args) throws IOException {
‎
‎        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
‎
‎        double balance = 20000.00;
‎        double amount;
‎
‎        do {
‎            System.out.print("Enter amount (0 to stop): ");
‎            amount = Double.parseDouble(read.readLine());
‎
‎            if (amount > 0) {
‎                balance += amount;
‎            }
‎            else if (amount < 0) {
‎
‎                if (balance >= Math.abs(amount)) {
‎                    balance += amount;
‎                }
‎                else {
‎                    System.out.println("INSUFFICIENT FUNDS!");
‎                }
‎            }
‎
‎            if (amount != 0) {
‎                System.out.printf("Outstanding Balance: P%.2f%n", balance);
‎            }
‎
‎        } while (amount != 0);
‎
‎        System.out.printf("\nFinal Balance: P%.2f%n", balance);
‎    }
‎}
‎
