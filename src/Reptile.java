/**
 * Created by ebal8006 on 1/31/2018.
 */
class Reptile extends Animal {
    public Reptile(String species, boolean living, boolean awake, boolean hungry){
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
    public void lizard(){
        Reptile lizard = new Reptile("lizard", true, true, true);
        lizard.setSpecies("Lizard");
        lizard.setVertebrate(true);
        lizard.setFurred(false);
        lizard.setScales(true);
        lizard.setEggs(true);
        lizard.setMilk(false);
        lizard.setWarmblooded(true);
        lizard.breathe("Lungs");
        lizard.eat("Insects");
        lizard.poop("WHY");
        lizard.move("4 Legs Crawl");
        System.out.println("Species: " + lizard.getSpecies());
        System.out.println("Vertebrate: " + lizard.isVertebrate());
        System.out.println("Scales: " + lizard.isScales());
        System.out.println("Milk: " + lizard.isMilk());
        System.out.println("Eggs: " + lizard.isEggs());
        System.out.println("Warm blooded: " + lizard.isWarmblooded());
        System.out.println("Furred: " + lizard.isFurred());
    }
}
