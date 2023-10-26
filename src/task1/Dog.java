package task1;

public class Dog implements IAnimal {
    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит на подстилке");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}