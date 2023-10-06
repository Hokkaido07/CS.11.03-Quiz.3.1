

public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int numberGrade){
        if(numberGrade >=90){
            return 'A';
        }
        else if (numberGrade >= 80){
            return 'B';
        }
        else if (numberGrade >= 70){
            return 'C';
        }
        else if (numberGrade >= 60){
            return 'D';
        }
        else if (numberGrade >= 50){
            return 'E';
        }
        else{
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int integerNumber){
        if(integerNumber%3 == 0 && integerNumber%5 == 0){
            return "fizzbuzz";
        }
        if(integerNumber%3 == 0){
            return "fizz";
        }
        if(integerNumber%5 == 0){
            return "buzz";
        }
        else{
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String inputString){
        if(inputString.length()<2){
            return inputString;
        }
        else{
            return inputString.substring(0,2) +  inputString + inputString.substring(0,2);
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        return a + b == c || b + c == a || a + c == b;
    }

    // Question 5 - endUp
    public static String endUp(String theInputString){
        if(theInputString.length() <= 3){
            return theInputString.toUpperCase();
        }
        else{
            String substringToCapitalize = theInputString.substring(theInputString.length() - 3);
            String capitalizedSubstring = substringToCapitalize.toUpperCase();
            return theInputString.substring(0, theInputString.length() - 3) + capitalizedSubstring;
        }
    }

}
