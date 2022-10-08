package design_snake_and_ladder.model;

import design_snake_and_ladder.factory.EntityGeneratorStrategy;
import design_snake_and_ladder.strategy.BoardEntitiesGeneratorStrategy;
import design_snake_and_ladder.strategy.ButtonStartStrategy;
import design_snake_and_ladder.strategy.PlayerMoveStrategy;
import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.*;

public class Game {

    private Board board;
    private Dice dice;
    private List<Player> players;
    private int maxButtonPerPlayer;
    private List<Player> playerRankings;
    private int lastPersonPlayedIndex = -1;
    private PlayerMoveStrategy playerMoveStrategy;
    private ButtonStartStrategy buttonStartStrategy;


    public static Builder getBuilder() {
        return new Builder();
    }
    static class Builder {
        private Dice dice;
        private List<Player> players;
        private int maxButtonPerPlayer;
        private PlayerMoveStrategy playerMoveStrategy;
        private ButtonStartStrategy buttonStartStrategy;

        private int boardSize;

        private int noOfEachExternalEntities;


        public Builder setDice(Dice dice) {
            this.dice = dice;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setMaxButtonPerPlayer(int maxButtonPerPlayer) {
            this.maxButtonPerPlayer = maxButtonPerPlayer;
            return this;
        }

        public Builder setPlayerMoveStrategy(PlayerMoveStrategy playerMoveStrategy) {
            this.playerMoveStrategy = playerMoveStrategy;
            return this;
        }

        public Builder setButtonStartStrategy(ButtonStartStrategy buttonStartStrategy) {
            this.buttonStartStrategy = buttonStartStrategy;
            return this;
        }

        public Builder setNoOfEachExternalEntities(int noOfEachExternalEntities) {
            this.noOfEachExternalEntities = noOfEachExternalEntities;
            return this;
        }

        public Builder setBoardSize(int boardSize) {
            this.boardSize = boardSize;
            return this;
        }

        public Game build() {
            Game game = new Game();
            List<BoardEntity> entities = generateEntities(boardSize, noOfEachExternalEntities);
            game.board = new Board(boardSize, entities);
            game.buttonStartStrategy = this.buttonStartStrategy;
            game.dice = this.dice;

            for(Player player : players) {
                List<Button> buttons = new ArrayList<>();
                for(int i=1;i<maxButtonPerPlayer;i++) {
                    buttons.add(new Button(ButtonStatus.LOCKED));
                }
                player.setPlayerStatus(PlayerStatus.IN_GAME);
                player.setButtons(buttons);
            }
            game.players = this.players;
            game.lastPersonPlayedIndex = -1;
            game.playerRankings = new ArrayList<>();
            game.playerMoveStrategy = this.playerMoveStrategy;
            return game;
        }

        private List<BoardEntity> generateEntities(int size, int noEntityForEachType) {
            Set<Integer> usedCellsNo = new HashSet<>();
            usedCellsNo.add(size);
            RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
            EntityGeneratorStrategy entityGenerator = new EntityGeneratorStrategy();
            List<BoardEntity> entities = new ArrayList<>();
            for(BoardEntityType type : BoardEntityType.values()) {
                BoardEntitiesGeneratorStrategy strategy = entityGenerator.getEntityStrategy(type);
                for(int i=0;i<noEntityForEachType;i++) {
                    entities.add(strategy.generate(size,usedCellsNo));
                }
            }

            return entities;

        }
    }




    public void makeMove() {} {
        int currPlayerIndex = (lastPersonPlayedIndex + 1) % players.size();
        Player player = players.get(currPlayerIndex);
        int pos = 0;

    }


    public void display() {
        board.display();
        for(Player  player: players) {
            player.toString();
            System.out.println();
        }
    }



}
