/**
 * Created by ebal8006 on 1/31/2018.
 */
class Reptile extends Animal {
    public Reptile(String species, boolean living, boolean awake, boolean hungry){
        super(species, living, awake, hungry);
    }
    @Override
    public String breathe(){
        return "Lungs";
    }
    public String eat(){
        return "Mainly other animals";
    }
    public String poop(){
        return "Yeah";
    }
    public String move(){
        return "Crawls";
    }
    public void lizard(){
        Reptile lizard = new Reptile();
        lizard.setSpecies("Lizard");
        lizard.setVertebrate(true);
        lizard.setFurred(false);
        lizard.setScales(true);
        lizard.setEggs(true);
        lizard.setMilk(false);
        lizard.setWarmblooded(true);
        lizard.breathe();
        lizard.eat();
        lizard.poop();
        lizard.move();
    }
}
