package Core;

public class Animal {
    //inner class
    public class Dog{
        private String name;
        public void hello(){
            System.out.println("Hello, I'm dog");
        }
    }
    //inner static class
    public static class Cat{
        private String name;
        public void hello(){
            System.out.println("Hello, I'm cat");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Dog dog = animal.new Dog();
        dog.hello();

        Animal.Cat cat = new Animal.Cat();
        cat.hello();

    }
}
