import java.util.Scanner;

public class Logarithm {
    public static void main(String[] args) {
        // declaration global variables
        Scanner se = new Scanner(System.in);
        int n;
        double sumLog = 1;

        // retrieve number
        System.out.print("Please enter the number : ");
        n = se.nextInt();

        // compute the log 2
        for (int i = 2; i < n ; i++) {
            if (i%2 == 0 )
                sumLog -= (double) 1/i;
            else
                sumLog += (double) 1/i;
        }

        // display the result
        System.out.println(sumLog);
    }
}
