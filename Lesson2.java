public class Lesson2 {
    public static void main(String[] args) {
        
        // Data Types -> Box that can only hold one type of data
        String name = "Tanim";
        int favoriteNumber = 25;

        // All Data Types
        String words;
        char character;
        int wholeNumbers;
        double decimals;
        boolean trueOrFalse;

        // initialization -> process odf creating a variable and giving a value as well
        char firstLetter = 'A';

        // declaration
        String email;
        String password;

        // assignment
        email = "georgesucuzhanay100@gmail.com";

        // exampled of data types
        double randomNumber;
        System.out.println("George, what is your favorite random number with a decimal?");
        randomNumber = 5.6;
        System.out.println(randomNumber);

        // keywords -> reserved word that Java uses, that we cannot
        // data types (int, double, string, string, char, boolean, class)
        
        // variable names can be words, numbers, underscores, dollar signs
        String Word123_$ = "random";

        // first letter of a variable, has to be a letter
        // String 123_Word_$ = "random";  this is not work

        // camel case --> lowerase for first word, uppercase for the first words of all the other words in the name
        boolean isTrue;  

        // String are words and sentences, wheras char is a single letter
        String secondName = "Syed";
        char anotherfirstLetter = 'S';
        char secondLetter = 'y';
        char thirdLetter = 'e';
        char lastLetter = 'd';

        // examples of data types
        //String
        String firstWord = "apple";
        String secondWord = "the weather is good today";
        String thirdWord = "J";
        String fourthWord = "123";

        // int
        int firstNumber = 10;
        int secondNumber = -10;
        // int thirdNumber = 10.10;
        

        // doubles
        double firstDouble = 10.10;
        double secondDouble = 10;

        // char
        char firstCharacter = 'S';
        char secondCharacter = '2';

        System.out.println(firstNumber + fourthWord);  // 10123
        System.out.println(firstNumber + secondCharacter); // 12, 102, 60 (first Number was 10, secondCHaracter was 2)

        // ascii characters a-z A-Z as numbers, numbers also have other number locations

        // creating some variables

        double thirdDouble = 25.6;
        int fourthNumber = 14;
        String fifthWord = "Kobe Byrant";
        char thirdCharacter = 'O';

        // true or false
        boolean isValid = true;
        boolean isNotValid = false;
        boolean idActualUser = true;

        
        // arithemetic for intergers
        int georgeAge = 16;
        int abdurAge = 17;

        // +, - , *, /
        int sumOfAges = georgeAge + abdurAge;
        int differenceOfAges = georgeAge - abdurAge;
        int productOfAges = georgeAge * abdurAge;
        int quotientOfAges = georgeAge / abdurAge;

        System.out.println(sumOfAges);
        System.out.println(differenceOfAges);
        System.out.println(productOfAges);
        System.out.println(quotientOfAges);

        double value = 16;
        double secondValue = 17;
        System.out.println(value / secondValue);
        
    }
}