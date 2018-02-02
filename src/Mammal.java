/**
 * Created by iols6058 on 1/31/2018.
 */
class Mammal extends Animal {
    public Mammal(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
    }
    @Override
    public String breathe() {
        return "Lungs";
    }
    @Override
    public String eat() {
        return "Grass";
    }
    @Override
    public String move() {
        return "Hops";
    }
    @Override
    public String poop() {
        return "Solid";
    }
public void kangaroo() {
    Mammal kangaroo = new Mammal();
    kangaroo.setSpecies("kangaroo");
    kangaroo.setWarmblooded(true);
    kangaroo.setVertebrate(true);
    kangaroo.setFurred(true);
    kangaroo.setAwake(true);
    kangaroo.setHungry(true);
    kangaroo.setEggs(false);
    kangaroo.setMilk(true);
    kangaroo.breathe();
    kangaroo.eat();
    kangaroo.move();
    kangaroo.poop();

    }
}
