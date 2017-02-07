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
public class CreatureCard extends PermanentCard{
    private String CreatureType; // Käytetään negatiivisa lukuja määrittämään, jos kortilla ei ole tätä ominaisuutta

    // Getterit
    public String getCreatureType() {
        return CreatureType;
    }

    // Setterit
    public void setCreatureType(String CreatureType) {
        this.CreatureType = CreatureType;
    }

    //Konstruktorit
    public CreatureCard(String CreatureType, int attack, int defense, String p_name, String p_type, int p_attack, int p_defense, Object[][] p_manaTypes, int p_id) {
        super(attack, defense, p_name, p_type, p_attack, p_defense, p_manaTypes, p_id);
        this.CreatureType = CreatureType;
    }

    public CreatureCard(String CreatureType, int attack, int defense) {
        super(attack, defense);
        this.CreatureType = CreatureType;
    }
    
    
}
