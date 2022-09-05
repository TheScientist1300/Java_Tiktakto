import java.util.Scanner;
/*
 * 
 *TODO:  
 * 
*/
public class Player {
    Scanner scanner;
    public String name;

    public Player() {
        this.name = getUserInput(3);
    }

    public Player(String name) {
        this.name = name;
    }

    public String getUserInput(int c) {
        prompt(c);
        scanner = new Scanner(System.in);
        if(scanner != null){
            return scanner.nextLine();
        }
        else{
            return "";
        }
    }



    public void prompt(int c){
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

    public void PlayerIntreduction(int intreduction){
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
            
        

    }

    public void Beatfrase(int beat){
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
        

    }
    public int Winfrase(int win){
        switch(win){
            case 1:
           String filthy = "Ha! seems like I won";
            case 2:
           String respect = "GG nice try";
            case 3:
           String between =  "Maybe next time";
            default:
            String nocomment = "";


        }   
        return win;     

    }
    
    public void Tiefrase(int tie){
        switch(tie){
            case 1: System.out.println("I have all of the time in the world");
                    break;
            case 2: System.out.println("GG well played");
                    break;
            case 3: System.out.println("I'm out of here! I'm going to Netflix");
                    break;        
            default: System.out.println("");
                    break;


        }
        

    }
}
