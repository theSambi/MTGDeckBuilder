/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder.Cards;

/**
 *
 * @author sambi
 */
public class CreatureCard extends PermanentCard{
    
    private static String CardType = "Creature";
    
    private String CreatureType; // Käytetään negatiivisa lukuja määrittämään, jos kortilla ei ole tätä ominaisuutta

    public static String getCardType() {
        return CardType;
    }

    public String getCreatureType() {
        return CreatureType;
    }

    public static void setCardType(String CardType) {
        CreatureCard.CardType = CardType;
    }

    public void setCreatureType(String CreatureType) {
        this.CreatureType = CreatureType;
    }

    public CreatureCard(String p_name, String p_type, Object[][] p_manaTypes, int p_id, int attack, int defense, String CreatureType ) {
        super(attack, defense, p_name, p_type, p_manaTypes, p_id);
        this.CreatureType = CreatureType;
    }

    public CreatureCard(String CreatureType, int attack, int defense) {
        super(attack, defense);
        this.CreatureType = CreatureType;
    }
    
}
