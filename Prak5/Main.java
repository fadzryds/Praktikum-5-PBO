public class Main {
    public static void main(String[] args) {
        // Test Spider
        Spider spider = new Spider();
        spider.walk();
        spider.eat();

        // Test Dog
        Dog dog = new Dog();
        dog.setName("Jordi");
        System.out.println("Nama Anjing Saya: " + dog.getName());
        dog.walk();
        dog.eat();
        dog.play();

        // Test Cat
        Cat cat = new Cat("Pipu");
        System.out.println("Nama Kucing Saya: " + cat.getName());
        cat.walk();
        cat.eat();
        cat.play();
    }
}
