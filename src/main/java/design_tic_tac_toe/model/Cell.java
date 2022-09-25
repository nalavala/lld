package design_tic_tac_toe.model;

public class Cell {

    private int row;
    private int column;
    private Symbol symbol;


    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.symbol = null;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public boolean isEmpty() {
        return symbol == null;
    }

    public void clearCell() {
        this.symbol = null;
    }
}
