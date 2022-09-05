import java.lang.invoke.StringConcatException;

public class Bot extends Player {
    public String Botcatchfrase(String name){
       String frase = null;
        switch(frase){
            case 1: return("Hello" + name + "I see you are a new player" + ", are you ready to play?");
                    break;
            case 2: return("Ha! It seems like you have nothing to do aginst me!");
                    break;
            case 3: return("What?! How did you do that?! I want a VAR test!");
                    break;
            case 4: return("I can do this all day");
                    break;
            case 5: return("Maybe next time");
                    break;
            case 6: return("Maybe you won this time but it won't be long till I get the next one!");
                    break;
            case 7: return("We will see...");   
                    break;     
            default: return("");
        }
            
    }
}
