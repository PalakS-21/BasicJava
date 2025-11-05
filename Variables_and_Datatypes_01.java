//import java.util.Scanner;

public class Variables_and_Datatypes_01{
    public static void main(String[] args) {


// int x;
// x = 8003;
// System.out.println(x); // o/p = 8003
// x = 21;                //value of x updateed to 21.
// System.out.println(x);   //o/p = 21
// System.out.println(x+1);  //21+1=22
// x = x + 10;             //21 + 10 = 31
// System.out.println(x);  // 31
// x = x-11;             // 31 - 11 = 20
// System.out.println(x); // 20
// x = x * 2;             // 20*2=40
// System.out.println(x); // 40
// x = x / 4;             //40 / 4 = 10
// System.out.println(x);  // 10 
// int y = 3, z = 4, q= 6; //multiple variables
// System.out.println(y); //3
// System.out.println(z); //4
// System.out.println(q); //6
// y = z;                // 3=4
// System.out.println(z); //4
//------------------------------------------------------------

//ARITHMETIC OPERATIONS.

// int x = 5;
// int y = 3;
// int z = 10;
// System.out.println(x+y);
// System.out.println(x-y);
// System.out.println(x*y);
// System.out.println(x/y);
//-------------------------------------------------------------------

//STRING CONCATENATION : JOINS STRING

// System.out.println("The Value of x is "+x);
// System.out.println("The Value of y is "+y);
// System.out.println("The value of x is "+x+ " and The value of y is " +y);
// System.out.println("palak"+x+y+z); //palak5310
// System.out.println(x+y+""+z); //5+3+" "+10 = 810 left to right reading
// System.out.println(x+y+z+"java"); //18java
//--------------------------------------------------------------------------

//DOUBLE DATA TYPE.

double x = 5;
double y = 2;

// double a =x/y; // in this x and y are already declared as double 
// System.out.println(a); //hence o/p will be 2.5

// double z = 5/2; //in this 5/2(both are int) which is is solved first which is 2 then it is stored in z of double data type 
// System.out.println(z); //hence o/p is 2.0

// double p =5.0/2; //5/2.0, 5.0/2.0 if one of the no. is in decimal form it will give 2.5
// System.out.println(p); //2.5

System.out.println(x+y); //5.0+2.0 = 7.0
System.out.println(x-y); //5.0-2.0 = 3.0
System.out.println(x*y); //5.0*2.0 = 10.0
System.out.println(x/y); //5.0/2.0 = 2.5

//CodeWithHarry

//Q1. WRITE A PROGRAM TO  SUM THREE NUM.

// int a = 10;
// int b = 20;
// int c = 30;
// int sum = a + b + c;
// System.out.println("sum : " +sum);
//__________________________________________________

//Q2.WRITE A PROGRAM TO CALCULATE CGPA USING MARKS OF THREE SUBJECT (OUT OF 100).

// float mark1 = 40;
// float mark2 = 78;
// float mark3 = 80;
// float cgpa = (mark1+mark2+mark3)/30;

// System.out.println("CGPA : " +cgpa);
//_____________________________________________________________________________

//Q3. WRITE A JAVA PROGRAM WHICH ASKS THE USER TO ENTER HIS/HER NAME AND GREETS THEM WITH HELLO<NAME>, HAVE A GOOD DAY.

// System.out.println("Your Name please....");
// Scanner sc = new Scanner(System.in);
// String name = sc.next();
// System.out.println("Hello " +name+ " have a good day");
//_________________________________________________________________________

//Q4. KILOMETERS TO MILES CONVERSION.

// Scanner scn = new Scanner(System.in);
// System.out.println("enter the distance in kilometers");
// double kilometers = scn.nextDouble();
// double conversion  = 0.621371;
// double miles = kilometers * conversion;
// System.out.println(+kilometers+ " kilometers = " +  miles + " miles");
//___________________________________________________________________________

//Q5. WAJP TO DETECT WHETHER A NUMBER ENTERED BY THE USER IS INTEGER OR NOT.

// System.out.println("Enter the number : ");
// Scanner scn = new Scanner(System.in);
// System.out.println(scn.hasNextInt());
    }
} 