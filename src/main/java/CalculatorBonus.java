public class CalculatorBonus {

    public static void calculateSquareArea(double side) {
        if (cantBeNegative(side, "square", "side")) return;
        System.out.println("Square area formula S = a * a : \n" + side + " * " + side + " = " + (side * side));
    }
    public static void calculateSquarePerimeter(double side) {
        if (cantBeNegative(side, "square", "side")) return;
        System.out.println("Square perimeter formula P = 4 * a : \n" + " 4  * " + side + " = " + (4 * side));

    }
    public static void calculateRectanglePerimeter(double side1, double side2) {
        if (cantBeNegative(side1, "rectangle", "side")) return;
        if (cantBeNegative(side2, "rectangle", "side")) return;

        System.out.println("Rectangle perimeter formula P = (a + b) * 2" + "\n(" + side1 + " + " + side2 + ") = " +
                ((side1 + side2) * 2));
    }
    public static void calculateRectangleArea(double side1, double side2) {
        if (cantBeNegative(side1, "rectangle", "side")) return;
        if (cantBeNegative(side2, "rectangle", "side")) return;
        System.out.println("Rectangle area formula S = a * b" + "\n" + side1 + " * " + side2 + " = " +
                (side1 * side2));
    }
    public static void calculateCirclePerimeter(double radius) {
        if (cantBeNegative(radius, "circle", "radius")) return;
        System.out.println("Circle perimeter formula P = 2 * π * r" + "\n 2 * 3.14 * " + radius + " = " + (2 * 3.14 * radius));
    }
    public static void calculateCircleArea(double radius) {
        if (cantBeNegative(radius, "circle", "radius")) return;
        System.out.println("Circle area formula S = π * r * r" + "\n 3.14 * " + radius + " * " + radius + " = " + (3.14 * radius * radius));
    }

    private static boolean cantBeNegative(double side, String figureName, String dimension) {
        if (side < 0) {
            System.out.println("The " + dimension + " of a " + figureName + " can’t be negative");
            return true;
        }
        return false;
    }
}
