/**
 * Created by iols6058 on 1/31/2018.
 */
class Mammal extends Animal {
    Mammal(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
        this.setAwake(true);
        this.setEggs(false);
        this.setFurred(true);
        this.setHungry(true);
        this.setLiving(true);
        this.setMilk(true);
        this.setScales(false);

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


}
class Bear extends Mammal {
    Bear(String species, boolean living, boolean awake, boolean hungy) {
        super("Bear", true, true, true);
        this.breathe("lungs");
        this.move("walks on four legs");
        this.poop("round scat");
        this.eat("berries, meat");
    }

}
class Kangaroo extends Mammal {
    Kangaroo(String species, boolean living, boolean awake, boolean hungry) {
        super("Kangaroo", true, true, true);
        this.breathe("lungs");
        this.move("hops on two legs");
        this.poop("scat");
        this.eat("plants");
    }



}