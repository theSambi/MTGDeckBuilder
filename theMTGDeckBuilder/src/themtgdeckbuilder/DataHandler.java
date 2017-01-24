/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder;

import java.util.Hashtable;

/**
 *
 * @author sambi
 */
public class DataHandler {
    private Card[] Cards = new Card[6];
  
    private Hashtable<String, Integer> Data = new Hashtable<String, Integer>();
    
    public DataHandler() {
        Cards[0] = new Card();
        Cards[1] = new Card("Acrobatic Maneuver", "Instant", -1, -1, new Object[][] {{"white",1},{"generic",2}}, 1);
        Cards[2] = new Card("Aerial Responder", "Creature — Dwarf Soldier", 2, 3, new Object[][] {{"white",2},{"generic",1}}, 2);
        Cards[3] = new Card("Aetherstorm Roc", "Creature — Bird", 3, 3, new Object[][] {{"white",2},{"generic",2}}, 3);
        Cards[4] = new Card("Angel of Invention", "Creature — Angel", 2, 1, new Object[][] {{"white",2},{"generic",3}}, 4);
        Cards[5] = new Card("Authority of the Consuls", "Enchantment", -1, -1, new Object[][] {{"white",1}}, 5);
        
        for(int i = 1; i < Cards.length; i++){
            String name = Cards[i].getName();
            Integer put = Data.put(name, i);
        }
        
    }
    public void getCard(String p_find){
        Integer n = Data.get(p_find);
        if (n != null){
            String mana = "";
            Object[][] temp = Cards[n].getManaTypes();
            for(int i = 0; i < temp.length; i++){
                // System.out.println("Mana type:" + temp[i][0] + " " + temp[i][1]);
                mana = temp[i][0] + " " + temp[i][1];
            }
            System.out.println();
            System.out.println("Name: " + Cards[n].getName());
            System.out.println("Mana: " + mana);
            System.out.println("Type:" + Cards[n].getType());
            System.out.println("A/D" + Cards[n].getAttack() + "/" + Cards[n].getDefense());
            System.out.println("Card number: " + Cards[n].getId() + "/" + Cards[n].getStaticNumberOfCards());
        } else {
            System.out.println("Ei löytynyt kyseistä korttia. Sori.");
        }
    }
}
