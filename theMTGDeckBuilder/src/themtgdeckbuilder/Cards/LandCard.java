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
public class LandCard extends PermanentCard{

    private static String CardType = "Land";

    public LandCard(int attack, int defense, String p_name, String p_type, Object[][] p_manaTypes, int p_id) {
        super(attack, defense, p_name, p_type, p_manaTypes, p_id);
    }

    public LandCard(int attack, int defense) {
        super(attack, defense);
    }
    
 

}
