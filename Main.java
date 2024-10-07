public class Main {
    public static void main(String[] args) {
        FarmManagement farm = new FarmManagement();

        farm.addAnimal(new Pig());
        farm.addAnimal(new Duck());
        farm.addAnimal(new Fish());

        farm.canSwim();
        farm.canWalk();
        farm.canSwimWalk();
    }
}
