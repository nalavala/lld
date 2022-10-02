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


}
