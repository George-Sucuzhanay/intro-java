import java.util.Scanner;
public class lesson6 {

    public static void main(String[] args) {
        
    // Switch statements are if else conditions relying  on integer valves
    // We do a case by case scenarios

        // System.out.println("Enter a number");
        // Scanner myScanner = new Scanner(System.in);
        // int usersNumber = Integer.parseInt(myScanner.nextLine());
    
        // switch(usersNumber) {
        //     case 1:
        //         System.out.println("You are a great friend :D");
        //         break;
        //     case 2:
        //         System.out.println("You are a bad friend :D");
        //         break;
        //     case 3:
        //         System.out.println("You are a friend :D");
        //         break;
        //     default:
        //         System.out.println("You have entered an invalid option");
        // }

        // System.out.println("Please choose the club you would like to sign up for: ");
        // System.out.println("G for Gaming");
        // System.out.println("A for Art");
        // System.out.println("R for Robotics");

        // String usersLetter = myScanner.nextLine();
        // System.out.println(usersLetter);

        // switch(usersLetter) {
        //     case "G":
        //         System.out.println("Thanks for joining the Gaming Club :D");
        //         break;
        //     case "A":
        //         System.out.println("Thanks for joining the Art Club :D");
        //         break;
        //     case "R":
        //         System.out.println("Thanks for joining the Robotics Club :D");
        //         break;
        //     default:
        //         System.out.println("You have entered an invalid option");

        // }

        /*
            While loops -> While a condition remains true, do the following
        */

        /*
        while (true) {
        System.out.println("my computeer is going to blow up"); 
        }
        */
        int value = 5;
        while (value >0) {
            System.out.println(value);
            value = value - 1;
        }
                
        System.out.println("WE ARE OUTSIDE THE LOOP");


        // validation -> making sure the user enters the right information
        Scanner myScanner = new Scanner (System.in);

        int age;
        System.out.println("Please enter an age under 100");
        age = Integer.parseInt(myScanner.nextLine());


        while(age >= 100) {
            System.out.println("Please enter an age under 100");
            age = Integer.parseInt(myScanner.nextLine());
        }

        System.out.println("Thank you for being honest!");
        
    }

}