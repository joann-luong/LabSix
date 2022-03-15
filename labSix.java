import java.util.Scanner;


public class labSix {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double inputOne;
        double inputTwo;
        double result;
        int input;
        
        System.out.print("Do you want to add or subtract? Type 1 to add, or type 2 to subtract")
        input = scnr.nextInt();
        if (input == 1){
            System.out.print("\nEnter the first input: ");
            inputOne = scnr.nextDouble();
            System.out.print("\nEnter the second input: ");
            inputTwo = scnr.nextDouble();

            result = inputOne + inputTwo;
            System.out.print("\nThe answer is: " + result);
        }
        else if (input == 2){
            System.out.print("\nEnter the first input: ");
            inputOne = scnr.nextDouble();
            System.out.print("\nEnter the second input: ");
            inputTwo = scnr.nextDouble();

            result = inputOne - inputTwo;
            System.out.print("\nThe answer is: " + result);
        }

        //System.out.print("\nEnter the first input: ");
        //inputOne = scnr.nextDouble();
        //System.out.print("\nEnter the second input: ");
        //inputTwo = scnr.nextDouble();

        //result = inputOne + inputTwo;
        //System.out.print("\nThe answer is: " + result);
        //System.out.println(result);

    }
}
