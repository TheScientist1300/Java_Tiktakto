import java.util.Scanner;
/*
 * 
 *TODO:  
 * 
*/
public class Player {
   public  Scanner scanner; // creates a Scanner
    public static String name; // Creates a public String name

    public Player() {
        Player.name = getUserInput(3); // gets the name of the player
    }

    public Player(String name) {
        Player.name = name; // sets the name of the player
    }

    public String getUserInput(int c) { // makes the scanner standable aginst null answers and creates the Scanner
        prompt(c);
        scanner = new Scanner(System.in);
        if(scanner != null){
            return scanner.nextLine();
        }
        else{
            return "";
        }
    }



    public void prompt(int c){ // creates the narroators choises of senteses
        switch(c){
            case 1: System.out.println("Player " + name + ": Enter a row number: ");
                    break;
            case 2: System.out.println("Player " + name + ": Enter a column number: ");
                    break;
            case 3: System.out.println("Please Enter your name: ");
                    break;
            default: System.out.println("Eat a Banana and play again!");
                    break;


        }
            
        

    }

    public int PlayerIntreduction(int intreduction){ // creates the players choises of senteses in the intreduction
        switch(intreduction){ 
            case 1: System.out.println("You will see...");
                    break;
            case 2: System.out.println("Yes");
                    break;
            case 3: System.out.println("No, my friends dragged me into this");
                    break;        
            default: System.out.println("");
                    break;


        }
            return intreduction;
        

    }

    public int Beatfrase(int beat){ // creates the narroators choises of senteses in case of the player's defeat
        switch(beat){
            case 1: System.out.println("Maybe I didn't win that game but in the next one I will win for sure");
                    break;
            case 2: System.out.println("See you losing next time!");
                    break;
            case 3: System.out.println("Anyway I wont come here again!");
            //kicks him out of the game
                    break;        
            default: System.out.println("");
                    break;


        }
        return beat;

    }
    public int Winfrase(int win){ // creates the narroators choises of senteses in case of the player's victory
        switch(win){
            case 1:
            System.out.println("Ha! seems like I won");
            break;
            case 2:
            System.out.println("GG nice try");
           break;
            case 3:
            System.out.println("Maybe next time");
           break;
            default:
            System.out.println("");
            break;


        }   
        return win;     

    }
    
    public int Tiefrase(int tie){ // creates the narroators choises of senteses in case of a tie
        switch(tie){
            case 1: System.out.println("I have all of the time in the world");
                    break;
            case 2: System.out.println("GG well played");
                    break;
            case 3: System.out.println("I'm out of here! I'm going to watch Netflix");
                    break;        
            default: System.out.println("");
                    break;


        }
        return tie;

    }
}
