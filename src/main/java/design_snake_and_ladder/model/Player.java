package design_snake_and_ladder.model;

import java.util.List;

public class Player {

    private String name;
    private List<Button> buttons;
    private Color color;
    private PlayerStatus playerStatus;


    public Player(String name, List<Button> buttons, Color color) {
        this.name = name;
        this. buttons = buttons;
        this.color = color;
        this.playerStatus = PlayerStatus.IN_GAME;
    }

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public PlayerStatus getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(PlayerStatus playerStatus) {
        this.playerStatus = playerStatus;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i=1;i<buttons.size();i++) {
            if(buttons.get(i).getStatus() == ButtonStatus.LOCKED) {
                builder.append("button " + i + " locked");
            } else if(buttons.get(i).getStatus() == ButtonStatus.COMPLETED) {
                builder.append("button " + i + " Completed");
            } else {
                builder.append("button " + i + " at " + buttons.get(i-1).getPos());
            }

            builder.append("/n");

        }
        return buttons.toString();
    }
}
