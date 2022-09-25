package design_tic_tac_toe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;
    private int dimensions;

    public Board(int dimensions) {
        this.dimensions = dimensions;
        cells = new ArrayList<>();
        for(int i=0;i<dimensions;i++) {
            List<Cell> columnCells = new ArrayList<>();
            for(int j=0;j<dimensions;j++) {
                columnCells.add(new Cell(i, j));
            }
            cells.add(columnCells);
        }
    }


    public Cell getCell(int row, int col) {
        // validate row and col boundary limit
        return cells.get(row).get(col);
    }

    public void printCurrentStateOfBoard() {
        for(int row =0;row < dimensions; row++) {
            for(int col =0;col < dimensions; col++) {
                System.out.print(cells.get(row).get(col).getSymbol().getVal());
                System.out.print("|");
            }
            System.out.println();
        }
    }


    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }
}
