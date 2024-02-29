package Polymorphism;


//https://www.youtube.com/watch?v=c8eGIPF-o3Q&t=33s
 /* полиморфизм  кота меньше, многоразовій, віполнился public static void test(Animal animal)
 *  на корректно наразніх обектах */

public class Test {

    public static void main(String[] args) {

//        Animal animal2 = new Animal();
//        animal2.eat();
//        Dog dog = new Dog();
//
//        animal.eat();
//        dog.eat();

//        Animal animal = new Dog();
//        animal.eat();  // отработал переопределенный eat() из Dog();
////        animal.bark(); //  no such method
//        Dog dog = new Dog();
//        dog.eat();
//        dog.bark();

        Animal animal =new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        //
        test(animal);
        test(dog);
        dog.bark();
        test(cat);

    }

    public static void test(Animal animal){
        animal.eat();
    }

}
