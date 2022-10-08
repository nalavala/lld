package design_snake_and_ladder.model;

public class Button {

    private int pos;
    private ButtonStatus status;

    public Button(ButtonStatus status) {
        this.status = status;
    }

    public int getPos() {
        return pos;
    }

    public ButtonStatus getStatus() {
        return status;
    }
}
