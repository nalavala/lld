package design_tic_tac_toe.model;

public abstract class Player {

    private Symbol symbol;
    private PlayerType playerType;
    private String name;

    public Player(Symbol symbol, PlayerType playerType) {
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public abstract Move makeMove(Board board);

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
