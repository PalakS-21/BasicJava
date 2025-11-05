import java.util.*; 

public class SwitchCase_02 {
    public static void main(String[] args) {
        // int age;
        // System.out.println("Enter your age : ");
        // Scanner scn = new Scanner(System.in);
        // age = scn.nextInt();

        // switch (age){
        //     case 18:
        //       System.out.println("you are 18!!!");
        //       break; //break brings out of the specific loop
        //     case 20:
        //       System.out.println("you are 20!!!!");
        //       break;
        //     default:
        //     System.out.println("Have a Good Day !!");

        // }
        // System.out.println("out of switch case....");

//switch can work with strings and char as well.

// char var = 'p';
// switch (var){
//             case 'o':
//               System.out.println("it's char o !!");
//               break; //break brings out of the specific loop
//             case 'p':
//               System.out.println("its char p!");
//               break;
//             default:
//             System.out.println("Invalid character type");

//         }
// System.out.println("out of switch loop...");

String name = "Palak";
switch ((name)) {
    case "ahna":
        System.out.println("case ahna");
        break;
    case "aaryaa":
        System.out.println("case aaryaa");
        break;
    case "Palak":
        System.out.println("case Palak");
        break;
    default:
        System.out.println("Invalid Name!!!");
        break;
}
System.out.println("out of switch loop...");
    }
}
