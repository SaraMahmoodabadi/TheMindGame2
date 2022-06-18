package server.logic.model;

import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;

public class PlayerInfo {

    public String Name;

    public String Token;
    public List<Integer> hand;
    private Player player;
    public PlayerInfo(String name, String token,Player player) {
        this.hand = new ArrayList<>();
        this.Name = name;
        this.Token = token;
        this.player = player;
    }

    public void GiveCard(int cardNumber) {
        this.hand.add(cardNumber);
        this.player.GiveCard(cardNumber);
    }

}
