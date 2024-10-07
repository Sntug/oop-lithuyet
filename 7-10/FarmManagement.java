import java.util.ArrayList;
import java.util.List;

public class FarmManagement {
    private List<Animal> animals;

    public void Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void canSwim() {
        for (Animal animal : animals) {
            if (animal.swim()) {
                System.out.println(animal + "\t");
            }
        }
    }

    public void canWalk() {
        for (Animal animal : animals) {
            if (animal.walk()) {
                System.out.println(animal + "\t");
            }
        }
    }

    public void canSwimWalk() {
        for (Animal animal : animals) {
            if (animal.swim() && animal.walk()) {
                System.out.println(animal + "\t");
            }
        }
    }
}
