import java.util.Scanner;

public abstract class BoardTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Player.prompt(4);
        int size = s.nextInt();            
        Board b = new Board(size);
     b.setCoordinate(1, 2, 1);
     b.setCoordinate(1, 2, 2);
     System.out.println(b);
    }
}
