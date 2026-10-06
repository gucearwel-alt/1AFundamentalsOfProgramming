import java.util.Scanner;
public class Assignment2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Input
        System.out.print("Enter hourly pay rate: ");
        double rate = scan.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = scan.nextDouble();
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
        System.out.printf("Hourly Rate:        ₱ %,10.2f%n", rate);
        System.out.printf("Hours Worked:       %,10.2f hrs%n", hours);
        System.out.printf("GROSS PAY:          ₱ %,10.2f%n", grossPay);
        System.out.printf("Withholding Tax (%d%%):   ₱ %,10.2f%n", (int)(taxRate*100), withholdingTax);
        System.out.println(" ");
        System.out.printf("NET PAY:            ₱ %,10.2f%n", netPay);
        System.out.println(" ");
        scan.close();
    }
}


