public class Board{
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

    public boolean setCoordinate(int x, int y, int value){
    if(!(this.board[x][y] == 0)) {
        this.board[x][y] = value;
    return true;
    }
    else {
        return false;
 
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