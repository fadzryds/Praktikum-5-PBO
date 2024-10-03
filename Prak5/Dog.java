public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4); // Anjing mempunyai 4 kaki
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
        System.out.println("Anjing Sedang Bermain Tangkap Stik kayu.");
    }

    @Override
    public void eat() {
        System.out.println("Anjing Sedang Makan Daging.");
    }
}
