
/**
 * Created by ebal8006 on 2/8/2018.
 */

public class Main {
    static void readout(Animal animal) {
        System.out.println("\nStatus-- " + animal.getSpecies());
        System.out.println("awake: " + animal.isAwake());
        System.out.println("eggs: " + animal.isEggs());
        System.out.println("furred: " + animal.isFurred());
        System.out.println("hungry: " + animal.isHungry());
        System.out.println("living: " + animal.isLiving());
        System.out.println("milk: " + animal.isMilk());
        System.out.println("scalse: " + animal.isScales());
    }
    public static void main(String[] args) {
        Animal kanga = new Kangaroo(null, false, false, false); // new instance of Kangaroo named kanga
        Animal lilBear = new Bear(null, false, false, false); // parameters are "empty" so orig. constructors are used.
        Animal liz = new Lizard(null, false, false, false);
        Animal noodle = new Snake(null, false, false, false);

        readout(kanga);
        readout(lilBear);
        readout(liz);
        readout(noodle);

    }
}
