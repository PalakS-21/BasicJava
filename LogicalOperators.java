public class LogicalOperators {
    public static void main(String[] args){
        boolean a = true;
        boolean b = true; 

        //AND(&&) Operator -> returns true only if all conditions are true.
        if(a && b){
            System.out.println("yesssss");
        }
        else{
            System.out.println("fnoooooo");
        }

    //OR(||) Operator -> returns true if one condition is true
    if(a||b){
        System.out.println("yess");
    }
    else{
        System.out.println("nooo");
    }

    //NOT OPerator (!) -> inverter, inverts the value
    System.out.println("for logical NOT : ");
    System.out.print("Not(A) is ");
    System.out.println(!a);
    System.out.print("Not(B) is ");
    System.out.println(!b);
}
}