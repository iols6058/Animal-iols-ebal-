/**a
 * Created by iols6058 on 1/29/2018.
 */
public class Animal {
    String species;
    boolean living;
    boolean awake;
    boolean hungry;
    boolean vertebrate;
    boolean warmblooded;
    boolean furred;


    abstract eat(){
        return String;
    }
    abstract move(){
        return String;
    }
    abstract poop(){
        return String;
    }
    abstract breathe(){
        return String;
    }
}