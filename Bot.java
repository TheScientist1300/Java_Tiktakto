

public class Bot extends Player {

public static String bottext(String c1){

        switch(c1){
            case "A": System.out.println("Hello I see you are a new player, are you ready to play?");
                    break;
            case "B": System.out.println("Ha! It seems like you have nothing to do aginst me!");
                    break;
            case "C": System.out.println("What?! How did you do that?! I want a VAR test!");
                    break;
            case "D": System.out.println("I can do this all day");
                    break;
            case "E": System.out.println("Maybe next time");
                    break;
            case "F": System.out.println("Maybe you won this time but it won't be long till I get the next one!");
                    break;
            case "G": System.out.println("We will see...");
                    break;       
            default:  System.out.println("");
                    break;
        }
        return c1;            
    }
    

        }
