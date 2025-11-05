public class IncrementDecrement_02 {
    public static void main(String[] args) {


// int x = 4;
// System.out.println(x++); // it prints the value first and the increments it
// System.out.println(x);    //will print the updated x(4) value i.e x++(4+1) = 5 
//--------------------------------------------------------------------------------

// int y = 10;
// System.out.println(++y); //first increments the value then prints it
// System.out.println(y); //value of y incremented by 1, hence o/p will be 11.
//------------------------------------------------------------------------------

// int p = 21;
// System.out.println(p--); //first use then decrement
// System.out.println(p); //prints the decremented value
//-----------------------------------------------------------------------------

// int s = 8;
// System.out.println(--s); //first decrement then use o/p 7
// System.out.println(s); //prints the decremented  value i.e. o/p 7
//------------------------------------------------------------------------------

int i =6;
System.out.println(i++); //6
System.out.println(i);   //7=6+1

System.out.println(++i); //8
System.out.println(i); //8

System.out.println(i--); //8
System.out.println(i); //7=8-1

System.out.println(--i); //7-1=6
System.out.println(i);   //6
}
}
