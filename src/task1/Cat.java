package task1;

public class Cat implements AnimalHouse {
    @Override
    public void eat() {
        System.out.println("Кот ест рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит на окне");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");

    }

    public void info() {
        System.out.println("Это кошка");
    }

    @Override
    public void playGame() {
        System.out.println("Играет с мячиком");
    }

    @Override
    public void createName(String name) {
        System.out.println("Имя кота " + name);

    }

    @Override
    public void care() {
        System.out.println("Причесать кота");

    }
}