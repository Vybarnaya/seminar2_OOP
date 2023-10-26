package task3;

public interface ICalculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);

    // Default метод для вычисления среднего значения двух чисел
    default double average(double a, double b) {
        return (a + b) / 2;
    }
    // Статический метод для вычисления квадрата числа
    static double square(double a) {
        return a * a;
    }
}