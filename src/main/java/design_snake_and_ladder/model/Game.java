package design_snake_and_ladder.model;

import design_snake_and_ladder.strategy.ButtonStartStrategy;
import design_snake_and_ladder.strategy.PlayerMoveStrategy;

import java.util.List;

public class Game {

    private Board board;
    private Dice dice;
    private List<Player> players;
    private int maxButtonPerPlayer;
    private List<Player> playerRankings;
    private int lastPersonPlayedIndex = -1;
    private PlayerMoveStrategy playerMoveStrategy;
    private ButtonStartStrategy buttonStartStrategy;
}
