public class Game extends Player {
    public Game(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    public Board board;
    public Player player;
    public Bot bot;
    public static void main(String[] args) {
        
        boolean flag = true;
        Board board = new Board(); // create a new board

        
        Player player = new Player(); // create a new player with mark "X"
        Bot bot = new Bot("Bot"); // create a new player with mark "O"
        int counter = 0;
        int symbol;
        while (flag){
            System.out.println(board); // print the board
            // set turn
            symbol = 1;
            if(counter % 2 != 0)
                symbol = 1;
            else {
                symbol = 2;
            }    

            counter++;


                


            // get user input
            String row = player.getUserInput(1); // get row from user
            String col = player.getUserInput(2); // get col from user

            int rowInt = Integer.parseInt(row); // convert row to int
            int colInt = Integer.parseInt(col); // convert col to int
            board.setCoordinate(rowInt, colInt, symbol); // set the coordinate to the board

            int botrow = bot.auto(1);
            int botcol = bot.auto(2);
            int bcolnum = Bot.setturn(2);
            int brow = Bot.setturn(2);
            board.setCoordinate(bcolnum, brow, symbol);

            int intreduction1 = player.PlayerIntreduction(1);
            int intreduction2 = player.PlayerIntreduction(2);
            int intreduction3 = player.PlayerIntreduction(3);

            int Beatfrase1 = player.Beatfrase(1);
            int Beatfrase2 = player.Beatfrase(2);
            int Beatfrase3 = player.Beatfrase(3);

            int Winfrase1 = player.Winfrase(1);
            int Winfrase2 = player.Winfrase(2);
            int Winfrase3 = player.Winfrase(3);

            int bottext1 = Bot.bottext(1);
            int bottext2 = Bot.bottext(2);
            int bottext3 = Bot.bottext(3);
            int bottext4 = Bot.bottext(4);
            int bottext5 = Bot.bottext(5);
            int bottext6 = Bot.bottext(6);
        }
        
        board.setCoordinate(1, 1, 1);
        System.out.println(board);

    }
}
