import javax.swing.JOptionPane;
public class Assignmenttt1{
    public static void main(String[] args) {
        String yearInput = JOptionPane.showInputDialog("Enter a year:");
        int year = Integer.parseInt(yearInput);
        // Leap Year Logic
        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        // Output Result
        String message;
        if (isLeap) {
            message = year + " is a LEAP YEAR ";
        } else {
            message = year + " is NOT a leap year ";
        }
        JOptionPane.showMessageDialog(null, message, "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
