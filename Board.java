
import java.util.Scanner;
public class Board{

  public int size;                 
    private int[][] board;
    public Board(int size){
        this.size = size;
        // create a new board
        this.board = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
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

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
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