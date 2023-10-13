import javax.swing.*;
import java.util.*;

public class Runner {
    public Runner(){

        VirtualPet p = new VirtualPet();

        // String ans = getAnswer("How are you?");

        // if(ans.equalsIgnoreCase("Good")){
        //     p.respond("Nice!");
        // }
        // if(ans.equalsIgnoreCase("Bad")){
        //     p.respond("sorry to hear that!");
        // }

        String ans1 = getAnswer("What do you want me to do?, Exercise, Feed or Sleep or Game!");

        if(ans1.equalsIgnoreCase("exercise"))
        p.exercise();
        
        if(ans1.equalsIgnoreCase("feed"))
        p.feed();

        if(ans1.equalsIgnoreCase("sleep"))
        p.sleep();

        if(ans1.equalsIgnoreCase("game")){
        
        String ans4 = getAnswer("Rock, Paper or Scissors?");
        p.game(ans4);

        }



        takeABeat(3000);
        String ans2 = getAnswer("What is your favorite animal?");
        
        p.respond("Whoa I can turn into a " + ans2);
        p.turnIntoAnimal(ans2);
        takeABeat(3000);
        p.defaultMode();

        String ans3 = getAnswer("What do you think about me?");
        
        if(ans3.equalsIgnoreCase("you suck"))
        p.gotInsulted();
        else
        p.confused();

        


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
