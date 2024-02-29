package Polymorphism;

public class Dog extends Animal{
    // переопределили метод  eat() из Animal

    /* позднее связівание.
      Animal animal = new Dog();
    Если в потоке есть реализация метода .. то он будет візван
    если нет то візван будет метод родителя
    *  */
    @Override
    public void eat() {
        System.out.println("Dog is eating..");

//        super.eat();  // обращение к родителю
    }

    public void bark(){
        System.out.println("Dog is barking ..");
    }

}
