        
import java.util.Random;
public class Bot extends Player {
        Random r = new Random();

public static int bottext(int c1){ // Shows the chat choises the bot makes with the players choises.
        switch(c1){
            case 1: System.out.println("Hello I see you are a new player, are you ready to play?");
                    break;
            case 2: System.out.println("Ha! It seems like you have nothing to do aginst me!");
                    break;
            case 3: System.out.println("What?! How did you do that?! I want a VAR test!");
                    break;
            case 4: System.out.println("I can do this all day");
                    break;
            case 5: System.out.println("Maybe next time");
                    break;
            case 6: System.out.println("Maybe you won this time but it won't be long till I get the next one!");
                    break;
            case 7: System.out.println("We will see...");
                    break;       
            default:  System.out.println("");
                    break;
        }
        return c1;    // returnes the choise of the bot        
    }
    
public Bot(String name) {
name = "Bot";        
}    



public int auto(int i){ // creates the narroators choises of senteses
        switch(i){
            case 1: System.out.println("The bot chooses a row number...");
            
                    break;
            case 2: System.out.println("The bot chooses a collum number...");
                    break;
            default: System.out.println("The bot can't eat a banana.");
                    break;


        }
        return i;


    }   
    public boolean botplay(int row, int collum) {


    }

public static void setrow(Random r, int size) {
int row = r.nextInt(size);
       

}

public void setcol(Random r, int size) {
int collum = r.nextInt(size);
}

public static int setturn(int i) {
    return 0;
}

}

