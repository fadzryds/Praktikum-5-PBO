public abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("Hewan Dengan " + legs + " Kaki Sedang Berjalan.");
    }
}
