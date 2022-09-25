package design_tic_tac_toe.factory;

import design_tic_tac_toe.model.DifficultyLevel;
import design_tic_tac_toe.strategy.MakeMoveStrategy;
import design_tic_tac_toe.strategy.bot_palying.RandomMoveStrategy;

public class MakeMoveStrategyFactory {

    public MakeMoveStrategy getStrategyForDifficultyLevel(DifficultyLevel level) {
        switch (level) {
            case EASY:
            case MEDIUM:
            case HARD:
                return new RandomMoveStrategy();
            default:
                throw  new IllegalArgumentException("Invalid difficulty level or No strategy configured");
        }
    }
}
