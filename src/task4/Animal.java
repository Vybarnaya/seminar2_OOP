package task4;

// Абстрактный класс Animal
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод makeSound, который должен быть реализован в подклассах
    public abstract void makeSound();
}

// Подкласс Dog, который наследует от Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Реализация абстрактного метода makeSound для собаки
    @Override
    public void makeSound() {
        System.out.println(getName() + " лает: Гав-гав!");
    }
}

// Подкласс Cat, который наследует от Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Реализация абстрактного метода makeSound для кошки
    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает: Мяу-мяу!");
    }
}
