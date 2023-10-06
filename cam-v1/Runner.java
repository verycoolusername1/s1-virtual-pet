import javax.swing.*;

public class Runner {
    public Runner(){
        VirtualPet p = new VirtualPet();

        p.exercise();
        takeABeat(3000);
        p.feed();
        String ans = getAnswer("How are you?");
        System.out.println(ans);
        if(ans.equalsIgnoreCase("Good")){
            System.out.println();
        }

    }

    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a response",
                    "Your Title",
                    JOptionPane.PLAIN_MESSAGE
        );

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
