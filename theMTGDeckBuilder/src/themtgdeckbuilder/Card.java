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
    private int attack; // Käytetään negatiivisa lukuja määrittämään, jos kortilla ei ole tätä ominaisuutta
    private int defense; // Käytetään negatiivisa lukuja määrittämään, jos kortilla ei ole tätä ominaisuutta
    private String type; // Land yms.'
    private Object[][] manaTypes; // jos manatyypin määrä on negatiivinen, se tarkoittaa, että kyseessä on ns. "X" määräinen mana.
    private int id; // Kortin virallinen numero. Kts. kortin vasen alanurkka.

    
    // Getterit
    public int getStaticNumberOfCards() {
        return numberOfCards;
    }
    public String getName() {
        return name;
    }
    public int getAttack(){
        return attack;
    }
    public int getDefense(){
        return defense;
    }
    public Object[][] getManaTypes(){
        return manaTypes;
    }
    public String getType() {
        return type;
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

    public void setAttack(int p_attack) {
        this.attack = p_attack;
    }

    public void setDefense(int p_defense) {
        this.defense = p_defense;
    }

    public void setType(String p_type) {
        this.type = p_type;
    }

    public void setManaTypes(Object[][] p_manaTypes) {
        this.manaTypes = p_manaTypes;
    }

    public void setId(int p_id) {
            this.id = p_id; // Tämän pitäisi olla väliltä 1-[numberOfCards]
    }
    
    // Konstruktori
    public Card(String p_name, String p_type, int p_attack, int p_defense, Object[][] p_manaTypes, int p_id) {
        this.name = p_name;
        this.type = p_type;
        this.attack = p_attack;
        this.defense = p_defense;
        this.manaTypes = p_manaTypes;
        this.id = p_id;
    }
    public Card(){
        
    }
    
}