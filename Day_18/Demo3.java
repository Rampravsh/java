public interface Demo3 {
    public static void main(String[] args) {
        Animal a =new Dog();
        a.makeSound();
        a.sleep();
    }
}


abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }

    
}