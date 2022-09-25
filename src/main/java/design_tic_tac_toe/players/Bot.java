package design_tic_tac_toe.players;

import design_tic_tac_toe.factory.MakeMoveStrategyFactory;
import design_tic_tac_toe.model.*;
import design_tic_tac_toe.strategy.MakeMoveStrategy;

public class Bot extends Player {
    private DifficultyLevel difficultyLevel;

    private MakeMoveStrategy makeMoveStrategy;


    public Bot(Symbol symbol, DifficultyLevel difficultyLevel) {
        super(symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
        this.makeMoveStrategy = new MakeMoveStrategyFactory().getStrategyForDifficultyLevel(difficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Bot making a move");
        Move move = this.makeMoveStrategy.makeMove(board, this);
        return move;
    }
}
