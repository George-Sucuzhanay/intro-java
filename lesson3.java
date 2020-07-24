import java.util.Scanner;

public class lesson3 {
    
    public static void main(String[] args) {
        // data types -> int, double, char, String
        
        // arithmetic operations
    
        /*
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        System.out.println(number1 + number2);
        int sum = number1 +  number2;
        System.out.println(sum);
    
        // % modulus
        int remainder = number2 % number1;
        System.out.println(remainder);

        // comparitive operators >, <, >=, <=, ==, !=
        boolean isGreator = number2 > number1;
        boolean isWrongComparision = number3 < number1;

        System.out.println(isGreator);
        System.out.println(isWrongComparision);

        boolean isGreatorThanOrEqualTo = number2 >= number1;
        System.out.println(isGreatorThanOrEqualTo);

        String word1 = "Hello";
        String word2 = "hello";
        boolean areWordsEqual = word1 != word2;
        System.out.println(areWordsEqual);

        boolean areWordsEqualTheSequel = word1.equals(word2);
        System.out.println(areWordsEqualTheSequel);

        // logical operators && || 

        // True if a person name is "Booby" and their age is above 15
        String name = "Bobby";
        int age = 15;

        boolean isBobbyAndOver15 = name.equals("Bobby") && age > 15;
        System.out.println(isBobbyAndOver15);

        // True if a persons name is "Bobby" or their age is above 20
        boolean isBobbyAndOver20 = name.equals("Bobby") || age > 20;

        System.out.println(isBobbyAndOver20);

        // AND -> both sides need to be true
        // OR -> one of the two sides needs to be true

        // User input
        String email;
        String password;
        
        System.out.println("Please enter your email below!");
        
        // Needed for user input
        Scanner scan = new Scanner(System.in);
        email = scan.nextLine();

        System.out.println("Thank you! Your email is " + email);

        System.out.println("Please enter your password below!");
        password = scan.nextLine();

        System.out.println("Thank you! Your password is " + password);

        System.out.println("Please enter your age");
        age = Integer.parseInt(scan.nextLine());

        System.out.println("Your age is " + age);

        // multi line comments
        
        /* 
            This
            is
            a
            multi
            line
            comment
        */
        Scanner scan = new Scanner(System.in);
        // job interview
        System.out.println("Name 5 of your best qualities");
        String quality1;
        String quality2;
        String quality3;
        String quality4;
        String quality5;

        quality1 = scan.nextLine(); // determined
        quality2 = scan.nextLine(); // organized
        quality3 = scan.nextLine(); // fast learner
        quality4 = scan.nextLine(); // motivated
        quality5 = scan.nextLine();

        System.out.println("I AM", quality1 + , " ", quality2 +, " ", quality3 +, " ", quality4 +, " ", quality5);

        
    }  

}