public class Calculator {
    public static void calculateTwoNumbers(double number1, double number2, String symbol){
        if (symbol.equalsIgnoreCase("+")) {
        System.out.println(number1 + " " + symbol + " " + number2 + " = " + (number1 +  number2) );
        }
        if (symbol.equalsIgnoreCase("-")) {
            System.out.println(number1 + " " + symbol + " " + number2 + " = " + (number1  - number2) );
        }
        if (symbol.equalsIgnoreCase("*")) {
            System.out.println(number1 + " " + symbol + " " +  number2 + " = " + (number1 * number2) );
        }
        if (symbol.equalsIgnoreCase("/")) {
            System.out.println(number1 + " " + symbol + " "  + number2 + " = " + (number1  / number2) );
        }
    }
    }
