public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4); // Kucing mempunyai 4 kaki / legs
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void play() {
        System.out.println("Kucing Sedang bermain Bola Kecil.");
    }

    @Override
    public void eat() {
        System.out.println("Kucing Sedang Makan Ikan.");
    }
}
