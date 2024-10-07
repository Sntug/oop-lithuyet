abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean walk();

    public abstract boolean swim();
}

class Pig extends Animal {
    public Pig() {
        super("Lon");
    }

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean swim() {
        return false;
    }
}

class Duck extends Animal {

    public Duck() {
        super("Vit");
    }

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }
}

class Fish extends Animal {

    public Fish() {
        super("Ca");
    }

    @Override
    public boolean walk() {
        return false;
    }

    @Override
    public boolean swim() {
        return true;
    }
}
