import javax.swing.*;
// import java.util.*;

public class Runner {
    public Runner(){

        VirtualPet p = new VirtualPet();

        String ans = getAnswer("How are you?");

        if(ans.equalsIgnoreCase("Good")){
            p.respond("Nice!");
        }
        if(ans.equalsIgnoreCase("Bad")){
            p.respond("sorry to hear that!");
        }

        String ans1 = getAnswer("What do you want me to do?, Exercise, Feed or Sleep or Game!");

        if(ans1.equalsIgnoreCase("exercise"))
        p.exercise();
        
        else if(ans1.equalsIgnoreCase("feed"))
        p.feed();

        else if(ans1.equalsIgnoreCase("sleep"))
        p.sleep();

        else if(ans1.equalsIgnoreCase("game")){
            
        String ans4 = getAnswer("Rock, Paper or Scissors?");
        p.game(ans4);
        takeABeat(3000);

        String ans5 = getAnswer("Rematch?");
        if(ans5.equalsIgnoreCase("yes")){
        String ans6 = getAnswer("Rock, Paper or Scissors?");
        p.game(ans6);
        }
        else
        p.confused();
        }

        else
        p.confused();

        takeABeat(3000);
        String ans2 = getAnswer("I know a few tricks! What is your favorite animal?");
        p.turnIntoAnimal(ans2);
        takeABeat(3000);
        p.defaultMode();

        String ans5 = getAnswer("I have another trick! Say abracadabra");
        p.explode(ans5);
        takeABeat(3000);
        p.defaultMode();

        p.reveal();
    }

    public String getAnswer(String q){
        String s = (String)

        JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a response",
                    JOptionPane.PLAIN_MESSAGE
                    
        );
        
        return s;

    }

    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){
        
        }
    }

    public static void main(String [] args ){
        new Runner();
    }
}
