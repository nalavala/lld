package design_tic_tac_toe.model;

import design_tic_tac_toe.exceptions.EmptyMovesUndoOperationException;
import design_tic_tac_toe.exceptions.MultipleBotException;
import design_tic_tac_toe.strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private List<WinningStrategy> winningStrategies;
    private int lastPlayerIndex = -1;
    private GameState gameState;
    private Player winner;

    private List<Move> moves = new ArrayList<>();

    private Game() {
        // to void directly creating object
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public int getLastPlayerIndex() {
        return lastPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public static Game.Builder getBuilder() {
        return new Game.Builder();
    }
    public static class Builder {
        private int  dimensions;
        private List<Player> players = new ArrayList<>();;
        private List<WinningStrategy> winningStrategies = new ArrayList<>();

        public Builder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public Builder addWinningStrategy(WinningStrategy strategy) {
            this.winningStrategies.add(strategy);
            return this;
        }

        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder addAllPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder addAllWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public Game build() throws MultipleBotException {

            if(checkIfMultipleBotException()) {
                throw new MultipleBotException();
            }
            // Check validations and edge cases
            Game game = new Game();
            game.players = this.players;
            game.winningStrategies = this.winningStrategies;
            game.board = new Board(dimensions);
            game.gameState = GameState.RUNNING;
            return game;
        }

        private boolean checkIfMultipleBotException() {
            int count = 0;
            for(Player player : players) {
                if(player.getPlayerType() == PlayerType.BOT) {
                    count++;
                }
            }
            return count > 1;
        }

    }

    public void makeMove() {
        this.lastPlayerIndex = (this.lastPlayerIndex + 1 ) % this.players.size();
        Move move = this.players.get(lastPlayerIndex).makeMove(board);

        move.getCell().setSymbol(this.players.get(lastPlayerIndex).getSymbol());
        // Add moves to list of moves
        this.moves.add(move);

        //Check if anyone won
        if(checkWin()) {
            this.gameState = GameState.WON;
            this.winner = players.get(lastPlayerIndex);
            return;
        }

        // Check if game is draw
        if(checkIfBoardFilled()) {
            this.gameState = GameState.DRAW;
        }
    }

    public boolean undo() throws EmptyMovesUndoOperationException {
        if(moves.isEmpty()) {
            throw new EmptyMovesUndoOperationException();
        }

        Move lastMove = this.moves.get(this.moves.size() - 1);
        Cell cell = lastMove.getCell();
        cell.clearCell();
        this.lastPlayerIndex = (this.lastPlayerIndex - 1 + this.players.size()) % this.players.size();
        this.moves.remove(lastMove);
        return true;
    }

    private boolean checkIfBoardFilled() {
        return this.moves.size() == board.getDimensions() * board.getDimensions();
    }

    private boolean checkWin() {
        for(WinningStrategy strategy : this.winningStrategies) {
            boolean isGameOver = strategy.checkWin(board, this.players.get(lastPlayerIndex));
            if(isGameOver) {
                return true;
            }
        }
        return false;
    }


    public void printBoard() {

        for(List<Cell> cells : board.getCells()) {
            for(Cell cell : cells) {
                if(cell.getSymbol() == null) {
                    System.out.print("|    |");
                } else {
                    System.out.print("|"+  cell.getSymbol().getVal() + "|");
                }
            }
            System.out.println();
        }
    }
}
