import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Assignment4b {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter height (cm): ");
        double height = Double.parseDouble(read.readLine());
        System.out.print("Enter age: ");
        int age = Integer.parseInt(read.readLine());
        System.out.print("Citizenship code (C=Endor, N=Non-citizen): ");
        String citizenship = read.readLine().toUpperCase();
        System.out.print("Recommendee code (R=Recommendee, N=Non-recommendee): ");
        String recommendee = read.readLine().toUpperCase();
        String result;
        if (recommendee.equals("R")) {
            result = "ACCEPTED — Recommended by Jedi Master Obi Wan!";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            result = "ACCEPTED — Meets all requirements!";
        } else {
            result = "REJECTED — Does not meet the requirements.";
        }
        System.out.println("\n");
        System.out.println("Result: " + result);
        System.out.println(" ");
    }
}
