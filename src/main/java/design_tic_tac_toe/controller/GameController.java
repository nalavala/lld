package design_tic_tac_toe.controller;

import design_tic_tac_toe.exceptions.EmptyMovesUndoOperationException;
import design_tic_tac_toe.exceptions.MultipleBotException;
import design_tic_tac_toe.model.Game;
import design_tic_tac_toe.model.GameState;
import design_tic_tac_toe.model.Player;
import design_tic_tac_toe.strategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int dimensions, List<Player> players, List<WinningStrategy> winningStrategies) throws MultipleBotException {
        return Game.getBuilder()
                .setDimensions(dimensions)
                .addAllPlayers(players)
                .addAllWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public void undo(Game game) throws EmptyMovesUndoOperationException {
        game.undo();
    }


    public Player getWinner(Game game) {
        return game.getWinner();
    }


    public void display(Game game) {
        game.printBoard();
    }

    public GameState getState(Game game) {
        return game.getGameState();
    }


}
