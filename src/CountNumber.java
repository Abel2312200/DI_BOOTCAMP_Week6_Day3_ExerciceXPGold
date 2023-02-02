import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        // declaration global variables
        Scanner se = new Scanner(System.in);
        int currentNumber, countPositive = 0, countNegative =0, countZero = 0;
        String isPlay = "O";

        // retrieve numbers
        do{
            System.out.print("Enter a new number :");
            currentNumber = se.nextInt();

            if(currentNumber > 0) // case : positive number
                countPositive++;

            else if(currentNumber < 0) // case : negative number
                countNegative++;

            else // case : number is equal to zero
                countZero++;

            // ask if the user want to continue
            System.out.println("Do you continue ?");
            isPlay = se.next().toUpperCase();

        }while (isPlay.equals("O"));

        //  display the result
        System.out.println(String.format("count positive : %d count negative : %d count zero : %d",countPositive,countNegative,countZero));
    }
}
