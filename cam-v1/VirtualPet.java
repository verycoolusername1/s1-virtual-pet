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
        int x = (int)(Math.random()*3); //0 - 2
        int result = 0;
        face.setMessage("You did " + answer + "...");

        if(x == 0){//rock
            face.setImage("rock");
            face.setMessage("I did rock!");
            if(answer.equalsIgnoreCase("rock"))
            result = 0;
            else if(answer.equalsIgnoreCase("paper"))
            result = -1;
            else if(answer.equalsIgnoreCase("scissors"))
            result = 1;
            
        }

        if(x == 1){//paper
            face.setImage("paper");
            face.setMessage("I did paper!");
            if(answer.equalsIgnoreCase("rock"))
            result = 1;
            else if(answer.equalsIgnoreCase("paper"))
            result = 0;
            else if(answer.equalsIgnoreCase("scissors"))
            result = -1;

        }

        if(x == 2){//scissors
            face.setImage("scissors");
            face.setMessage("I did scissors!");
            if(answer.equalsIgnoreCase("rock"))
            result = -1;
            else if(answer.equalsIgnoreCase("paper"))
            result = 1;
            else if(answer.equalsIgnoreCase("scissors"))
            result = 0;

        }

        if(result == 1){
            takeABeat(3000);
            face.setImage("joyful");
            face.setMessage("I won!");
        }

        if(result == 0){
            takeABeat(3000);
            face.setImage("annoyed");
            face.setMessage("Draw?!");
        }

        if(result == -1){
            takeABeat(3000);
            face.setImage("shocked");
            face.setMessage("I lost?!");
        }
    }

    public void respond(String message){
        face.setMessage(message);
    }

    public void turnIntoAnimal(String animal){
        if(animal.equalsIgnoreCase("dog"))
        face.setImage("dog");

        else if(animal.equalsIgnoreCase("cat"))
        face.setImage("cat");

        else if(animal.equalsIgnoreCase("bird"))
        face.setImage("bird");

        else if(animal.equalsIgnoreCase("fish"))
        face.setImage("fish");

        else{
        face.setMessage("I don't know that animal!");
        face.setImage("confused");
        }
    }

    public void explode(String answer){
        if(answer.equalsIgnoreCase("abracadabra"))
        face.setImage("ex");
    }
        
    public void gotInsulted(){
        face.setImage("enraged");
    }

    public void confused(){
        face.setMessage("I don't understand!");
        face.setImage("astonished");
    }

    public void reveal(){
        face.setMessage("I have a secret...");
        takeABeat(3000);
        face.setMessage("I am actually a magician!");
        face.setImage("magic");
        takeABeat(3000);
        face.setMessage("Now for my final trick...");
        takeABeat(3000);
        face.setImage("disappear");
    }

    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){
        
        }
    }


} // end Virtual Pet
