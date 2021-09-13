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
            userInput = scanner.nextInt();
            int tempNumber = userInput;
            List<Integer> numberList = new ArrayList<>();
            while (tempNumber > 0) {
                numberList.add( tempNumber % 10 );
                tempNumber = tempNumber / 10;
            }
            for (Integer integer : numberList) {
                finalNumber += integer;
            }
            if (userInput == -1) {
                System.out.println("Exiting program...");
                break;
            }
            else {
                System.out.println("The sum of the digits of the integer is: " + finalNumber);
                finalNumber = 0;
            }
        }
    }
}