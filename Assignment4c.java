import javax.swing.JOptionPane;
public class Assignment4c{
    public static void main(String[] args) {
        String heightStr = JOptionPane.showInputDialog("Enter height (cm):");
        double height = Double.parseDouble(heightStr);
        String ageStr = JOptionPane.showInputDialog("Enter age:");
        int age = Integer.parseInt(ageStr);
        String citizenship = JOptionPane.showInputDialog(
                "Citizenship code:\nC = Citizen of Endor\nN = Non-citizen"
        ).toUpperCase();
        String recommendee = JOptionPane.showInputDialog(
                "Recommendee code:\nR = Recommendee of Obi Wan\nN = Non-recommendee"
        ).toUpperCase();
        String result;
        if (recommendee.equals("R")) {
            result = " ACCEPTED\nRecommended by Jedi Master Obi Wan!";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            result = " ACCEPTED\nMeets all requirements!";
        } else {
            result = " REJECTED\nDoes not meet the requirements.";
        }
        JOptionPane.showMessageDialog(null,
                "\n" +
                        result +
                        "\n",
                "Application Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

