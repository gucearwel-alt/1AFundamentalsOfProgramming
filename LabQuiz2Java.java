import java.util.Scanner;
public class QUIZZ2 {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        String show;
        String name;
        String kilo;
        int age;

        int pork = 1;
        double soy = 0.5;
        double vinegar = 0.33;

        System.out.print("Welcome to Adobo Cooking Show");
        show = inputDevice.nextLine();
        System.out.print("Please enter your name ");
        name = inputDevice.nextLine();
        System.out.print("How many kilo of pork will you cook? ");
        kilo = inputDevice.nextLine();

        double sratio = 1 * 0.5;
        double vratio = 1 * 0.33;

        System.out.println("The ratio of soy sauce " + sratio + "kg");
        System.out.print("The ratio of soy sauce " + vratio + "kg");


    }
}
