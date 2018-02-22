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
    public void snake(){
        Reptile snake = new Reptile("Snake", true, true, true);
        snake.setSpecies("Snake");
        snake.setVertebrate(true);
        snake.setFurred(false);
        snake.setScales(true);
        snake.setEggs(true);
        snake.setMilk(true);
        snake.setWarmblooded(true);
        snake.breathe("Lungs");
        snake.eat("Rodents");
        snake.poop("PLACEHOLDER");
        snake.move("Slither");
        System.out.println("Species: " + snake.getSpecies());
        System.out.println("Vertebrate: " + snake.isVertebrate());
        System.out.println("Scales: " + snake.isScales());
        System.out.println("Milk: " + snake.isMilk());
    }
}
