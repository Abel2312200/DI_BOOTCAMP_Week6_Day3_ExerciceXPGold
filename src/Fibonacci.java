import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // declaration global variables
        Scanner se = new Scanner(System.in);
        int n, faccNumber1 = 0,faccNumber2 = 1,faccNumber3;
        
        // retrieve number n
        System.out.print("Please enter the number : ");
        n = se.nextInt();
        System.out.println(faccNumber1); // display first number : 0
        if(n != 0){
            System.out.println(faccNumber2); //display first number : 1
            do{
                faccNumber3 = faccNumber1 + faccNumber2;
                if(faccNumber3 < n)
                    System.out.println(faccNumber3); // display number fibonacci current valid
                // update values
                faccNumber1 = faccNumber2;
                faccNumber2 = faccNumber3;
            }while (faccNumber3 < n );
        }
    }
}
