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
        face.setMessage("Hello I am your pet!");
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

    public void game(String answer){
        int x = (int)(Math.random()*2); //0 - 2
        String rps = "";
        
        if(x == 0)
        rps = "rock";
        if(x == 1)
        rps = "paper";
        if(x == 2)
        rps = "scissors";


        if(answer.equalsIgnoreCase("rock")){
        face.setImage("joyful");
        face.setMessage("I won!");
        }

        if(answer.equalsIgnoreCase("rock")){
        face.setImage("annoyed");
        face.setMessage("Draw?!");
        }

        if(answer.equalsIgnoreCase("rock")){
        face.setImage("shcoled");
        face.setMessage("I lost?!");
        }

        
    }

    public void respond(String message){
        face.setMessage(message);
    }

    public void turnIntoAnimal(String animal){
        if(animal.equalsIgnoreCase("dog"))
        face.setImage("dog");

        if(animal.equalsIgnoreCase("cat"))
        face.setImage("cat");
    }
        
    public void gotInsulted(){
        face.setImage("enraged");
    }

    public void confused(){
        face.setMessage("I don't understand!");
        face.setImage("astonished");
    }


} // end Virtual Pet
