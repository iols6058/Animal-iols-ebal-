/**
 * Created by iols6058 on 1/31/2018.
 */
class Mammal extends Animal {
    Mammal(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
    }
    @Override
    public String breathe(String method) {
        return method;
    }
    @Override
    public String eat(String method) {
        return method;
    }
    @Override
    public String move(String method) {
        return method;
    }
    @Override
    public String poop(String density) {
        return density;
    }
public void kangaroo() {
    Mammal kangaroo = new Mammal("kangaroo", true, true, true);
    kangaroo.setSpecies("kangaroo");
    kangaroo.setWarmblooded(true);
    kangaroo.setVertebrate(true);
    kangaroo.setFurred(true);
    kangaroo.setAwake(true);
    kangaroo.setHungry(true);
    kangaroo.setEggs(false);
    kangaroo.setMilk(true);
    kangaroo.breathe("Lungs");
    kangaroo.eat("Teeth");
    kangaroo.move("Hops");
    kangaroo.poop("Scat");
    }
    public void bear(){
        Mammal bear = new Mammal("Bear", true, true, true);
        bear.setSpecies("Bear");
        bear.setWarmblooded(true);
        bear.setVertebrate(true);
        bear.setFurred(true);
        bear.setAwake(true);
        bear.setHungry(true);
        bear.setEggs(false);
        bear.setMilk(true);
        bear.breathe("Lungs");
        bear.eat("Berries");
        bear.move("Walks on all fours");
        bear.poop("Small balls");
    }
}
