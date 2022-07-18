package ch2.extend_example.java;

public abstract class JavaAnimal {
    protected final String species;
    protected final int legs;

    public JavaAnimal(String species, int legs) {
        this.species = species;
        this.legs = legs;
    }

    abstract void move();

    public String getSpecies() {
        return species;
    }

    public int getLegs() {
        return legs;
    }
}
