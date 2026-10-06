import javax.swing.JOptionPane;
public class Assignmenttt2 {
    public static void main(String[] args) {
        // Input
        String rateStr = JOptionPane.showInputDialog("Enter hourly pay rate:");
        double rate = Double.parseDouble(rateStr);
        String hoursStr = JOptionPane.showInputDialog("Enter hours worked:");
        double hours = Double.parseDouble(hoursStr);
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
        // Build Output Message
        String result = "\n" +
                        "PAYROLL SUMMARY\n" + "\n" +
                        "Hourly Rate:₱ " + String.format("%,10.2f", rate) + "\n" +
                        "Hours Worked: " + String.format("%,10.2f", hours) + " hrs\n" +
                        "GROSS PAY: ₱ " + String.format("%,10.2f", grossPay) + "\n" +
                        "Withholding Tax (" + (int)(taxRate*100) + "%):   ₱ " + String.format("%,10.2f", withholdingTax) + "\n" + "\n" +
                        "NET PAY: ₱ " + String.format("%,10.2f", netPay) + "\n" + "  ";
        // Show Result
        JOptionPane.showMessageDialog(null, result, "Payroll Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}


