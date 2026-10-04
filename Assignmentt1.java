import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Assignmentt1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a year: ");
        String yearInput = br.readLine();
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
        System.out.println(" ");
        if (isLeap) {
            System.out.println(year + " is a LEAP YEAR ");
        } else {
            System.out.println(year + " is NOT a leap year ");
        }
        br.close();
    }
}

