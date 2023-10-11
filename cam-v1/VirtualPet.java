/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    

    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    
    public void defaultMode(){
        face.setImage("normal");
    }

    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void dead(){
        face.setImage("dead");
    }

    public void respond(String message){
        face.setMessage(message);
    }

    public void turnIntoAnimal(String animal){
        if(animal.equalsIgnoreCase("dog"))
        face.setImage("dog");
        if(animal.equalsIgnoreCase("cat"))
        face.setImage("cat");
        else
        face.setMessage("I don't know that animal!");
    }

} // end Virtual Pet
