package blackjack;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;


public class Card implements Serializable{
    private static TreeMap<String, Integer> valueMap = new TreeMap();
    private static TreeMap<String, File> imageMap = new TreeMap();
    private String name;
    private int value;
    
    public Card() {
        if (valueMap.isEmpty()) {
            loadData();
        }
        name = "";
        value = 0;
    }
    
    public Card (String name) {
        if (valueMap.isEmpty()) {
            loadData();
        }
        this.name = name;
        value = valueMap.get(name);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public TreeMap<String, Integer> getValueMap() {
        return valueMap;
    }

    public TreeMap<String, File> getImageMap() {
        return imageMap;
    }
    
    public ArrayList newDecks(int num) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 52 * num; i++) {
            list.add(valueMap.keySet().toArray()[i % 52]);
        }
        Collections.shuffle(list);
        return list;
    }
    
    public void loadData() {
        for (int i = 1; i <= 13; i++) {
            String suit = "of Spades";
            String name = "";
            int value = 0;
            switch (i) {
                case 1:
                    name = "Ace " + suit;
                    value = 11;
                    break;
                case 11:
                    name = "Jack " + suit;
                    value = 10;
                    break;
                case 12:
                    name = "Queen " + suit;
                    value = 10;
                    break;
                case 13:
                    name = "King " + suit;
                    value = 10;
                    break;
                default:
                    value = i;
                    name = "" + i + " " + suit;
                    break;
            }
            
            valueMap.put(name, value);
            
        }
        
        for (int i = 1; i <= 13; i++) {
            String suit = "of Diamonds";
            String name = "";
            int value = 0;
            switch (i) {
                case 1:
                    name = "Ace " + suit;
                    value = 11;
                    break;
                case 11:
                    name = "Jack " + suit;
                    value = 10;
                    break;
                case 12:
                    name = "Queen " + suit;
                    value = 10;
                    break;
                case 13:
                    name = "King " + suit;
                    value = 10;
                    break;
                default:
                    value = i;
                    name = "" + i + " " + suit;
                    break;
            }
            
            valueMap.put(name, value);
        }
        
        for (int i = 1; i <= 13; i++) {
            String suit = "of Clubs";
            String name = "";
            int value = 0;
            switch (i) {
                case 1:
                    name = "Ace " + suit;
                    value = 11;
                    break;
                case 11:
                    name = "Jack " + suit;
                    value = 10;
                    break;
                case 12:
                    name = "Queen " + suit;
                    value = 10;
                    break;
                case 13:
                    name = "King " + suit;
                    value = 10;
                    break;
                default:
                    value = i;
                    name = "" + i + " " + suit;
                    break;
            }
            
            valueMap.put(name, value);
        }
        
        for (int i = 1; i <= 13; i++) {
            String suit = "of Hearts";
            String name = "";
            int value = 0;
            switch (i) {
                case 1:
                    name = "Ace " + suit;
                    value = 11;
                    break;
                case 11:
                    name = "Jack " + suit;
                    value = 10;
                    break;
                case 12:
                    name = "Queen " + suit;
                    value = 10;
                    break;
                case 13:
                    name = "King " + suit;
                    value = 10;
                    break;
                default:
                    value = i;
                    name = "" + i + " " + suit;
                    break;
            }
            
            valueMap.put(name, value);
        }
        
        File folder = new File("Images");
        
        File[] files = folder.listFiles();
        
        //System.out.println(folder.getAbsolutePath());
        for (File file : files) {
            if (file.isFile()) {
                imageMap.put(file.getName().substring(0, file.getName().indexOf(".")), file);
            }
        }
        
    }
    
    public String toString() {
        return name;
    }
    
}
