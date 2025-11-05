public class Operator_Precedence_03 {
    public static void main(String[] args) {
    //     int i = 2*3/4 + 7/4 +8 - 2 + 5/8;
    //     //6/4 = 1
    //    // 7/4 = 1
    //    //8 - 2 = 6
    //    //5/8 = 0
    //    //1+1+6+0=8
    //     System.out.println(i);

    // int i = 2, j = 3, k, l;
    // double a ,b;
    // k = i/j * j; //(2/3)*3 = 0*0 = 0
    // l = j/i * i; //(3/2)*2 = 1*2 = 2
    // a  = i/j * j; // (2/3)*3 = 0*3 = 0.0 , since a is double
    // b = j/i * i; //(3/2)*2 = 1*2 = 2.0 , since b is double
    // System.out.println(k+" " +l+ " " +a+ " " +b);
    
//CALCULATE 7/4*9/2

float a = 7/4.0f * 9/2.0f;
// 1. 7/4 =  1.75
// 2. 1.75*9 = 15.75
// 3. 15.75/2 = 7.875
System.out.println("Answer = "+a);

}
}
