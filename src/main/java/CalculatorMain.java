public class CalculatorMain {
    public static void main(String[] args){
        Calculator.calculateTwoNumbers(5,12, "+");
        Calculator.calculateTwoNumbers(5,12, "-");
        Calculator.calculateTwoNumbers(5,12, "*");
        Calculator.calculateTwoNumbers(5,12, "/");

        CalculatorBonus.calculateSquarePerimeter(5);
        CalculatorBonus.calculateSquareArea(5);
        CalculatorBonus.calculateRectanglePerimeter(4,5);
        CalculatorBonus.calculateRectangleArea(5,-6);
        CalculatorBonus.calculateCirclePerimeter(5);
        CalculatorBonus.calculateCircleArea(-5);


    }
}
