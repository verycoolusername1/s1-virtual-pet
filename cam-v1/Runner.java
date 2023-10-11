import javax.swing.*;
import java.util.*;

public class Runner {
    public Runner(){

        VirtualPet p = new VirtualPet();

        // p.exercise();
        // takeABeat(1000);
        // p.feed();

        String ans = getAnswer("How are you?");

        if(ans.equalsIgnoreCase("Good")){
            p.respond("Nice!");
        }
        if(ans.equalsIgnoreCase("Bad")){
            p.respond("sorry to hear that!");
        }

        String ans1 = getAnswer("What is your favorite animal?");
        
        p.respond("Whoa I can turn into a " + ans1);
        p.turnIntoAnimal(ans1);
        takeABeat(1000);
        p.defaultMode();
        p.respond("Isnt that cool!");
        
        String ans2 = getAnswer("What would you like to do with me?");

        if(ans2.equals("die"))
        p.dead();
        else
        p.respond("Cool!");

    }

    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
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
