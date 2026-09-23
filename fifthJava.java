import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class fifthJava {
    public static void main (String [] args){

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {

            // Read an Integer
            System.out.print(" Enter your age: ");
            String ageInput = dataln.readLine();    // Read as String
            int age = Integer.parseInt(ageInput);   // Convert to int

            // Read a Double
            System.out.print(" Enter your exact height in meters: ");
            String heightInput = dataln.readLine();    // Read as String
            double height = Double.parseDouble(heightInput); // Convert to double
            System.out.println(" You are " + age + " years old and " + height + "m tall.");

        }catch (IOException e) {
            System.err.println(" Error reading input stream.");
        }catch (NumberFormatException e){
            //This happens if the user types "twenty" instead of "20"
            System.err.println(" Invalid number format! Please enter digits only. ");

        }

    }
}
