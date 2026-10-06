import javax.swing.JOptionPane;
public class Assignmenttt3 {
    public static void main(String[] args) {
        
        int nsat = Integer.parseInt(
                JOptionPane.showInputDialog("Enter NSAT Score:")
        );
        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter Parents' Monthly Salary:")
        );
        int entrance = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Entrance Exam Score:")
        );
        double average = (nsat + entrance) / 2.0;
        
        String result;
        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "REJECTED";
        }
        else if (salary <= 3500 && average >= 91) {
            result = "ACCEPTED";
        }
        else {
            result = "FOR FURTHER STUDY";

        }
        String output = "\n" + "SCHOLARSHIP APPLICATION\n" + "\n" + "NSAT Score: " + nsat + "\n" + "Parents' Salary: ₱ " + String.format("%,.2f", salary) + "\n" + "Entrance Score:      " + entrance + "\n" + "Average:             " + String.format("%.2f", average) + "\n" + "-------------------------------------\n" + "RESULT: " + result + "\n" + "═════════════════════════════════════";
        JOptionPane.showMessageDialog(null, output, "Scholarship Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

