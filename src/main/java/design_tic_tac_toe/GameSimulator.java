package design_tic_tac_toe;

import design_tic_tac_toe.controller.GameController;
import design_tic_tac_toe.exceptions.MultipleBotException;
import design_tic_tac_toe.model.*;
import design_tic_tac_toe.players.Bot;
import design_tic_tac_toe.players.HumanPlayer;
import design_tic_tac_toe.strategy.WinningStrategy;
import design_tic_tac_toe.strategy.game_winning.OrderOneWInningStrategy;

import java.util.List;

public class GameSimulator {

    public static void main(String[] args) throws MultipleBotException {
        int dimensions = 3;
        HumanPlayer humanPlayer = new HumanPlayer(new Symbol('X'));
        Player bot = new Bot(new Symbol('O'), DifficultyLevel.EASY);

        WinningStrategy strategy = new OrderOneWInningStrategy();

        GameController controller = new GameController();
        Game game = controller.createGame(dimensions, List.of(humanPlayer, bot), List.of(strategy));

        while(game.getGameState() == GameState.RUNNING) {
            controller.makeMove(game);
            controller.display(game);
        }

        System.out.println(controller.getState(game));
        if(controller.getState(game) == GameState.WON) {
            System.out.println("The winner " + controller.getWinner(game));
        }

    }
}
