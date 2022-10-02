package design_snake_and_ladder.model;

public abstract class BoardEntity {

    private BoardEntityType type;
    private int from;
    private int to;

    public BoardEntity(BoardEntityType type, int from, int to) {
        this.type = type;
        this.from = from;
        this.to = to;
    }

}
