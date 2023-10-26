package task2;

public class Main {
    public static void main(String[] args) {
        // Создаем массив фруктов
        IFruit[] fruits = new IFruit[3];
        //Integer [] arr = new Integer[3];
        fruits[0] = new Apple();
        fruits[1] = new Banane();
        fruits[2]= new Orange();

        // Выводим цвет каждого фрукта
        for (IFruit fruit : fruits) {
            System.out.println("Fruit color: " + fruit.COLOR);
        }
    }
}
