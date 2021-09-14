import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int finalNumber = 0;
        while (true) {
            System.out.println("Please enter an integer. Type '-1' to exit.");
            userInput = scanner.nextInt(); // Get user input here.
            List<Integer> numberList = new ArrayList<>();
            while (userInput > 0) {
                numberList.add( userInput % 10 ); // The remainder of any number divided by 10 is the last digit.
                userInput = userInput / 10; // Divide number by 10, removing the last digit. The result has to be an integer, so the result is rounded.
            }
            // At this point numberList has each digit of userInput as a separate element in the list.
            for (Integer integer : numberList) {
                finalNumber += integer; // Add all numbers into one last int.
            }
            if (userInput == -1) { // Exit program if the user types "-1".
                System.out.println("Exiting program...");
                break;
            }
            else {
                System.out.println("The sum of the digits of the integer is: " + finalNumber);
                finalNumber = 0; // Reset number for the next round.
            }
        }
    }
}