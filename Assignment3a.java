import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter NSAT Score: ");
        int nsat = scan.nextInt();
        System.out.print("Enter Parents Monthly Salary: ");
        double salary = scan.nextDouble();
        System.out.print("Enter Entrance Exam Score: ");
        int entrance = scan.nextInt();
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
        System.out.println("\n");
        System.out.println("      SCHOLARSHIP APPLICATION");
        System.out.println(" ");
        System.out.printf("NSAT Score:          %d%n", nsat);
        System.out.printf("Parents' Salary:     ₱ %,.2f%n", salary);
        System.out.printf("Entrance Score:      %d%n", entrance);
        System.out.printf("Average:             %.2f%n", average);
        System.out.println(" ");
        System.out.println("RESULT: " + result);
        System.out.println(" ");
        scan.close();
    }
}

