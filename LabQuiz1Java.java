import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LabQuiz1 {
    public static void main (String [] args){

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.print(" Enter your Birth Year: ");
            String birthYearInput = dataln.readLine();    // Read as String
            int birthYear = Integer.parseInt(birthYearInput);
            System.out.println(" You were born last " + birthYear + ".");

            int age = 2026 - birthYear; // here we minus the birth year and year 2026
            System.out.println(" You are now " + age + " yrs old.");

        }catch (IOException e) {
            System.err.println(" Error reading input stream.");
        }catch (NumberFormatException e){
            //This happens if the user types "twenty" instead of "20"
            System.err.println(" Invalid number format! Please enter digits only. ");

        }

    }
}



