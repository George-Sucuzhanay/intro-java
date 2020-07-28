import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        if(true) {
            System.out.println("This will always be printed.");
        }
        if(false) {
            System.out.println("This will never be printed.");
        }
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scan.nextLine());
        /*
        if(age > 100) {
            System.out.println("You're never too old to code.");
        }
        if(age < 5) {
            System.out.println("You're never too young to code.");
        }
        */
        /*
            If your age is greater than 0 AND less than 13, you're a kid
            If your age is greater than 12 AND less than 18, you're a teen
            If your age is greater than 18 AND less than 101, you're an adult
        */
        if(age > 0 && age < 13) {
            System.out.println("You're a kid.");
        }
        if(age > 12 && age < 18) {
            System.out.println("You're a teen.");
        }
        // if you're a kid, print out how many years it will take until you're a teen.
        // 1. if you're a kid
        // 2. How many years until you're a teen
        // concatenate or concat: combine
        if(age > 0 && age < 13) {
            System.out.println(13 - age + " more years until you're a teen.");
        }
        /*
            If your age is greater than 0 AND less than 13, you're a kid
            If your age is greater than 12 AND less than 18, you're a teen
            If your age is greater than 18 AND less than 101, you're an adult
        */
        // if the user is a kid or an adult, tell the user that they are not a teen
        // 1. if user is a kid 
        // OR
        // 2. if user is an adult
        // 3. tell the user their age status
        if((age > 0 && age < 13) || (age > 18 && age < 101) ) {
            System.out.println("You are not a teen.");
        } 
        // SIMPLIFYING CODE
        // age = 12
                        //true       true
        boolean isKid = (age > 0 && age < 13);
        //System.out.println(isKid);
        boolean isTeen = (age > 12 && age < 18);
        boolean isAdult = (age >= 18 && age < 101);
        // If, else if, else
        if(isKid) {
            System.out.println("You're a great kid.");
        } 
        else if(isTeen) {
            System.out.println("You're a cool teen!");
        }
        else if(isAdult) {
            System.out.println("You're a smart adult.");
        }
        else {
            System.out.println("You're immortal?!");
        }
        System.out.println("What's your name?");
        String name = scan.nextLine();
        // age = 24
        if( name.equals("Idrees") && age == 24) {
            System.out.println("This will only print for Idrees.");
        }
        else {
            System.out.println("You're not Idrees!");
        }
        /*
        Guided Practice
        Lets make a game
        The user is a player in a game based in the world of monsters and dragons, and they make inputs with their keyboard.
        Clicking:
            N - Takes them north -> they see a dragon
            S - Takes them south -> they see a forest
            W - Takes them west -> they see the sea
            E - Takes them east -> they see a mountain
        We'll expand on this game over time, but for now, get them used to thinking in terms of decisions
        */
        System.out.println("*******************************************");
        System.out.println("*      Welcome to The Heroes Journey      *");
        System.out.println("*******************************************\n");
        System.out.println("You awake from your sleep in the middle of nowhere...");
        System.out.println("Where do you go? -> N,S,W,E");
        // What data type can hold the user's direction choice?
        char direction = scan.next().charAt(0);
        if (direction == 'N') {
            System.out.println("You see a dragon");
        } else if (direction == 'S') {
            System.out.println("You see a magical forest");
        } else if (direction == 'W') {
            System.out.println("You see the raging sea");
        } else if (direction == 'E') {
            System.out.println("You see a mountain that goes beyond the clouds");
        } else {
            System.out.println("You entered an incorrect option");
        }
    }
}