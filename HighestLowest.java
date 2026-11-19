import java.io.BufferedReader;
‎import java.io.InputStreamReader;
‎import java.io.IOException;
‎
‎public class HighestLowest {
‎    public static void main(String[] args) throws IOException {
‎
‎        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
‎
‎        int num, highest, lowest;
‎
‎        System.out.print("Enter number 1: ");
‎        num = Integer.parseInt(read.readLine());
‎
‎        highest = num;
‎        lowest = num;
‎
‎        for (int i = 2; i <= 10; i++) {
‎            System.out.print("Enter number " + i + ": ");
‎            num = Integer.parseInt(read.readLine());
‎
‎            if (num > highest) {
‎                highest = num;
‎            }
‎
‎            if (num < lowest) {
‎                lowest = num;
‎            }
‎        }
‎
‎        System.out.println("\nHighest Number: " + highest);
‎        System.out.println("Lowest Number: " + lowest);
‎    }
‎}
‎
