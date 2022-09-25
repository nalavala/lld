package design_tic_tac_toe.players;

import design_tic_tac_toe.model.*;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private String email;

    public HumanPlayer(Symbol symbol) {
        super(symbol, PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter row Number");
        int row = scan.nextInt();
        System.out.println("Enter Column Number");
        int column = scan.nextInt();

        Cell cell = board.getCell(row-1, column-1);
        cell.setSymbol(this.getSymbol());
        Move move = new Move();
        move.setCell(cell);
        move.setPlayer(this);
        return move;
    }
}
