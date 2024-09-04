import java.util.ArrayList;
import java.util.Scanner;

public class IT24101157Lab6Q3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<Integer> numbers = new ArrayList<>();
        int number;

       
        System.out.println("Enter positive integers (terminate with -99):");

       
        while (true) {
            System.out.print("Enter number: ");
            number = scanner.nextInt();

            if (number == -99) {
                break;
            } else if (number < 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            } else {
                numbers.add(number);
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No valid numbers were entered.");
        } else {
            
            double sumOfSquares = 0.0;
            for (int num : numbers) {
                sumOfSquares += num * num;
            }

            int n = numbers.size();
            double rms = Math.sqrt(sumOfSquares / n);

            
            System.out.println("You entered the following numbers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println(); 

            System.out.println("Root Mean Square (RMS) of the numbers: " + rms);
        }
    }
}
