/**
 * Created by iols6058 on 1/31/2018.
 */
public class Mammal extends Animal {
    void kangaroo() {
        setSpecies("Kangaroo");
        setLiving(true);
        setMilk(true);
        setHungry(true);
        setEggs(false);
        setAwake(true);
        setFurred(true);
        setScales(false);
        setVertebrate(true);
        setWarmblooded(true);

        String eat = eat();
        String legs = move();
        String scat  = poop();
        String lungs = breath();
    }
    }




}