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
public class PermanentCard extends Card{
    private int attack; // Käytetään negatiivisa lukuja määrittämään, jos kortilla ei ole tätä ominaisuutta
    private int defense; // Käytetään negatiivisa lukuja määrittämään, jos kortilla ei ole tätä ominaisuutta'
    
    public int getAttack(){
        return attack;
    }
    public int getDefense(){
        return defense;
    }

    // Setterit
    public void setAttack(int p_attack) {
        this.attack = p_attack;
    }

    public void setDefense(int p_defense) {
        this.defense = p_defense;
    }

    public PermanentCard(int attack, int defense, String p_name, String p_type, Object[][] p_manaTypes, int p_id) {
        super(p_name, p_type, p_manaTypes, p_id);
        this.attack = attack;
        this.defense = defense;
    }

    public PermanentCard(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }
    
}
