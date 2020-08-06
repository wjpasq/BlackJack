/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author wjpas
 */
public class DataModel implements Serializable{
    private Stack<Card> deck;
    private ArrayList<Player> playersList;
    private Player dealer;
    private Integer playerIndex;
    private boolean gameplay;
    
    public DataModel(Stack<Card> deck, ArrayList<Player> playersList, Player dealer, Integer playerIndex, boolean gameplay)
    {
        this.deck = deck;
        this.playersList = playersList;
        this.dealer = dealer;
        this.playerIndex = playerIndex;
        this.gameplay = gameplay;
    }

    public Stack<Card> getDeck() {
        return deck;
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public Player getDealer() {
        return dealer;
    }

    public Integer getPlayerIndex() {
        return playerIndex;
    }

    public boolean isGameplay() {
        return gameplay;
    }
}
