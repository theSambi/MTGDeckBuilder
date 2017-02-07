/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder;

/**
 *
 * @author sambi
 */
public class Card {
    private static int numberOfCards = 264;
    
    private String name; // Kortin nimi esim: "Aether Hub"
    private Object[][] manaTypes; // jos manatyypin määrä on negatiivinen, se tarkoittaa, että kyseessä on ns. "X" määräinen mana.
    private int id; // Kortin virallinen numero. Kts. kortin vasen alanurkka.
    private String SuperType; // Basic, Elite, Legendary, Ongoing, Snow, World
    
    // Getterit
    public int getStaticNumberOfCards() {
        return numberOfCards;
    }
    public String getName() {
        return name;
    }
    public Object[][] getManaTypes(){
        return manaTypes;
    }
    public String getSuperType() {
        return SuperType;
    }
    public int getId() {
        return id;
    }
    // Setterit
    public static void setNumberOfCards(int p_numberOfCards) {
        Card.numberOfCards = p_numberOfCards;
    }

    public void setName(String p_name) {
        this.name = p_name;
    }

    public void setType(String p_type) {
        this.SuperType = p_type;
    }

    public void setManaTypes(Object[][] p_manaTypes) {
        this.manaTypes = p_manaTypes;
    }

    public void setId(int p_id) {
            this.id = p_id; // Tämän pitäisi olla väliltä 1-[numberOfCards]
    }
    
    // Konstruktori
    public Card(String p_name, String p_type, Object[][] p_manaTypes, int p_id) {
        this.name = p_name;
        this.SuperType = p_type;
        this.manaTypes = p_manaTypes;
        this.id = p_id;
    }
    public Card(){
        
    }
    
}