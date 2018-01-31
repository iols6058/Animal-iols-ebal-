/**
 * Created by ebal8006 on 1/31/2018.
 */

/**
 * A parent class for an Animal hierarchy
 */
public abstract class Animal
{
    private String species;
    private boolean living;
    private boolean awake;
    private boolean hungry;
    private boolean vertebrate;
    private boolean warmblooded;
    private boolean furred;
    private boolean milk;
    private boolean scales;
    private boolean eggs;

    public Animal(String species, boolean living, boolean awake, boolean hungry) {
        this.species = species;
        this.living = living;
        this.awake = awake;
        this.hungry = hungry;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    public boolean isAwake() {
        return awake;
    }

    public void setAwake(boolean awake) {
        this.awake = awake;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isVertebrate() {
        return vertebrate;
    }

    public void setVertebrate(boolean vertebrate) {
        this.vertebrate = vertebrate;
    }

    public boolean isWarmblooded() {
        return warmblooded;
    }

    public void setWarmblooded(boolean warmblooded) {
        this.warmblooded = warmblooded;
    }

    public boolean isFurred() {
        return furred;
    }

    public void setFurred(boolean furred){
        this.furred = furred;
    }

    public boolean isMilk(){
        return milk;
    }

    public void setMilk(boolean milk){
        this.milk = milk;
    }

    public boolean isScales(){
        return scales;
    }

    public void setScales(boolean scales){
        this.scales = scales;
    }

    public boolean isEggs(){
        return eggs;
    }

    public void setEggs(boolean eggs){
        this.eggs = eggs;
    }

    /**
     * How/What the animal eats
     * @return what the animal eats
     */
    public abstract String eat();

    /**
     * How the animla moves
     * @return how the animal moves
     */
    public abstract String move();

    /**
     * How the animal poops
     * @return how the animal poops
     */
    public abstract String poop();

    /**
     * How the animal breathes
     * @return how the animal breahes
     */
    public abstract String breath();
}
