import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Assignmentt2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Input
        System.out.print("Enter hourly pay rate: ");
        double rate = Double.parseDouble(br.readLine());
        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(br.readLine());
        // Calculate Gross Pay
        double grossPay = rate * hours;
        // Determine Tax Rate
        double taxRate;
        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }
        // Calculate Tax & Net
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;
        // Output
        System.out.println("\n");

        System.out.println("PAYROLL SUMMARY");
        System.out.println(" ");
        System.out.printf("hourly pay rate:$ %,10.2f%n", rate);
        System.out.printf("hours worked:$ %,10.2f%n", hours);
        System.out.printf("GROSS PAY:$ 10.2f%n", grossPay);
        System.out.printf("Withholding Tax(%d%%): $ %,10.2f%n",(int) (taxRate*100),withholdingTax);
        System.out.printf("NET PAY:$ %,10.2f%n",netPay);
        System.out.println(" ");

         br.close();



    }
}

