package JAVA_Basics;

public class L15_Polymorphism {

    public static void main(String[] args) {

        Animal bengie = new Animal();
        bengie.makeSound();

        bengie = new Dog();
        bengie.makeSound();

        bengie = new Cat();
        bengie.makeSound();

    }

}

class Animal {
    public void makeSound() {
        System.out.println("Baahh");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Wuff");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}