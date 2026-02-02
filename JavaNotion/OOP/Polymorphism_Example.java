package JavaNotion.OOP;

interface Animal{
    void speak();
}

class Dog implements Animal{
    @Override
    public void speak(){
        System.out.println("Bark");
    }
}

class Cat implements Animal{
    @Override
    public void speak(){
        System.out.println("Meow");
    }
}

public class Polymorphism_Example {
    public static void main (String[] args){
        Animal animal = new Dog();
        animal.speak();

        animal = new Cat();
        animal.speak();
    }
}