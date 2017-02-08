/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder;

import themtgdeckbuilder.Cards.PermanentCard;

/**
 *
 * @author sambi
 */
public class EnchantmentCard extends PermanentCard{

    public EnchantmentCard(String p_name, String p_type, Object[][] p_manaTypes, int p_id, int attack, int defense) {
        super(attack, defense, p_name, p_type, p_manaTypes, p_id);
    }

    public EnchantmentCard(int attack, int defense) {
        super(attack, defense);
    }
    
}
