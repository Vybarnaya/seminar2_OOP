package task4;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры собаки и кошки
        Animal dog = new Dog("Шарик");
        Animal cat = new Cat("Мурка");

        // Вызываем метод makeSound для каждого животного
        dog.makeSound();
        cat.makeSound();
    }
}