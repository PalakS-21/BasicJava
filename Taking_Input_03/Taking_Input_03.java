
import java.util.Scanner;
public class Taking_Input_03 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // int input;
        // input= sc.nextInt();
        // System.out.print("input : " +input);
        //------------------------------------------------------------------------------
        
        //SUM OF TWO NUMBERS TAKING USER INPUT.

        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter the 1st number : ");

        // int a = scn.nextInt();
        // System.out.println("Enter the 2nd number : ");

        // int b= scn.nextInt();
        // int sum = a+b;
        // System.out.println("The Sum is : " +sum);
        //----------------------------------------------------------------------------------

        //FIND THE REMAINDER TAKING USER INPUT.

        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER DIVIDEND : ");

        int p = scn.nextInt();
        System.out.println("ENTER DIVISOR : ");

        int q = scn.nextInt();
        // int r = p/q;
        // int s = p-(q*r);
        // System.out.println("REMAINDER WHEN " +p+ " IS DIVIDED BY " +q+ " IS " +s);
        
        int m = p%q;
        System.out.println("REMAINDER WHEN " +p+ " IS DIVIDED BY " +q+ " IS " +m);
    }
}
