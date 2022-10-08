package design_snake_and_ladder.model;

import java.util.List;

public class Board {

    private int size;
    private List<BoardEntity> entities;

    public Board(int size, List<BoardEntity> entities) {
        this.size = size;
        this.entities = entities;
    }

    public int getSize() {
        return size;
    }

    public List<BoardEntity> getEntities() {
        return entities;
    }


    public void display() {
        for(BoardEntity entity : entities) {
            System.out.println(entity);
        }
    }

}
