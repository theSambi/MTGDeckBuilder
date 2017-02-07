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
    
}
