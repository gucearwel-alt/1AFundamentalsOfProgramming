import java.util.Scanner;
public class Assignment4a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Citizenship code (C=Endor, N=Non-citizen): ");
        String citizenship = input.nextLine().toUpperCase();
        System.out.print("Recommendee code (R=Recommendee, N=Non-recommendee): ");
        String recommendee = input.nextLine().toUpperCase();
        String result;
        if (recommendee.equals("R")) {
            result = "ACCEPTED — Recommended by Jedi Master Obi Wan!";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            result = "ACCEPTED — Meets all requirements!";
        } else {
            result = "REJECTED — Does not meet the requirements.";
        }
        System.out.println("========================================");
        System.out.println("Result: " + result);
        System.out.println(" ");
        input.close();
    }
}
