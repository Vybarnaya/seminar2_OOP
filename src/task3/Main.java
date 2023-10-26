package task3;

public class Main {
    public static void main(String[] args) {
        ICalculator calculator = new BasicCalculator();

        BasicCalculator calculator1  = new BasicCalculator();


        double resultAdd = calculator.add(5, 3);
        double resultSubtract = calculator.subtract(10, 4);
        double resultMultiply = calculator.multiply(6, 7);
        double resultDivide = calculator.divide(8, 2);

        double resultAverage = calculator.average(9, 3);
        double resultSquare = ICalculator.square(4);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
        System.out.println("Average: " + resultAverage);
        System.out.println("Square: " + resultSquare);
    }
}


