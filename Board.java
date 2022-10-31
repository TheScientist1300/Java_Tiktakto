
import java.util.Scanner;
public class Board{
    Scanner s = new Scanner(System.in);
            int rowinput = s.nextInt();
            int colinput = s.nextInt();
    private int[][] board;
    public Board(){
        // create a new board
        this.board = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.board[i][j] = 0;
            }
        }
    }

    public boolean isavalable(int x, int y, int value){
        if (this.board[x][y] == 0) {
        return true;
         }
         else {
            return false;
         }
    }

    public void setCoordinate(int x, int y, int value){
        if (isavalable(x, y, value)) {
            this.board[x][y] = value;
        }
        else {
            Scanner s = new Scanner(System.in);
            String rowinput = s.nextLine();
            String colinput = s.nextLine();   
        }
  }

    


    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sb.append("[");
                switch(this.board[i][j]){
                    case 0: sb.append(" ");
                            break;
                    case 1: sb.append("X");
                            break;
                    case 2: sb.append("O");
                            break;
                }


                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}