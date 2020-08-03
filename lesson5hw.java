import java.util.Scanner;
public class lesson5hw {
    
    public static void AgeRange(String[] args) {

        // AgeRange();
        // EnemyAttack;
        questionAndAnswer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scan.nextLine());

        if (age >0 && age < 12) {
            System.out.println("being a kid is cool");
        }
        if (age >= 13 && age<= 17) {
            System.out.println("teens are hip!");
        }
        if (age >18) {
            System.out.println("damn, you’re old");
        }

    }
    public static void EnemyAttack() {
        char choice;
        System.out.println("Welcome to Dragon Slayer... You are a mighty warrior, andthere is a dragon standing before you.");
        System.out.println("Click A to attack with your mighty sword!");
        System.out.println("Click D to defend from its fire breath");
        System.out.println("Click R to run");

        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();

        char choice = scan.next() chartAt(0);
        if (choice == 'A' || choice == 'a') {
            System.out.println("HE DRAGON HAS BEEN SLAIN");
        }
        else if (choice == 'D' || choice == 'a') {
            System.out.println("Click D to defend from its fire breath");
        }
        else  if (ch)
    }
    public static void questionAndAnswer () {
        System.out.println(x);
    }
}