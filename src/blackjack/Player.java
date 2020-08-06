package blackjack;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
    private ArrayList<Card> hand = new ArrayList();
    private ArrayList<Card> secondHand = new ArrayList();
    private int money;
    private int bet;
    private int splitBet;
    private int total;
    private int softTotal;
    private int insurance;
    private boolean split;
    
    public Player() {
        money = 50000;
        bet = 500;
        splitBet = 0;
        total = 0;
        softTotal = 0;
        insurance = 0;
        split = false;
    }
    
    public void addCard(Card card) {
        hand.add(card);
    }
    
    public void secondHandAddCard(Card card) {
        secondHand.add(card);
    }
    
    public void clearHand() {
        hand.clear();
    }
    
    public void clearSecondHand() {
        secondHand.clear();
    }
    
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getBet() {
        return bet;
    }
    
    public int getInsurance() {
        return insurance;
    }
    
    public ArrayList<Card> getHand() {
        return hand;
    }
    
    public ArrayList<Card> getSecondHand() {
        return secondHand;
    }
    
    public void setBet(int bet) {
        this.bet = bet;
    }
    
    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }
    
    public int getTotal() {
        total = 0;
        for (Card card : hand) {
            total += card.getValue();  
        }
        return total;
    }
    
    public int getSecondHandTotal() {
        total = 0;
        for (Card card : secondHand) {
            total += card.getValue();  
        }
        return total;
    }
    
    public int getSoftTotal() {
        softTotal = 0;
        for (Card card : hand) {
            if (card.getName().contains("Ace"))
            {
                softTotal += 1;
            }
            else
                softTotal += card.getValue();
        }
        return softTotal;
    }
    
    public int getSecondHandSoftTotal() {
        softTotal = 0;
        for (Card card : secondHand) {
            if (card.getName().contains("Ace"))
            {
                softTotal += 1;
            }
            else
                softTotal += card.getValue();
        }
        return softTotal;
    }
    
    public boolean getSplit() {
        return split;
    }
    
    public void setSplit(boolean bool) {
        split = bool;
    }
    
}
