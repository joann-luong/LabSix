import java.util.Scanner;


public class labSix {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double inputOne;
        double inputTwo;
        double result;

        System.out.print("Enter the first input: ");
        inputOne = scnr.nextDouble();
        System.out.print("\nEnter the second input: ");
        inputTwo = scnr.nextDouble();

        result = inputOne + inputTwo;
        System.out.print("\nThe answer is: " + result);
        //System.out.println(result);

    }
}
