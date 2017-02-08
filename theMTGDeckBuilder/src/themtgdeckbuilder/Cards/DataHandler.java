/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder.Cards;


// Nämä tarvitaan, jos haluaa käyttää SAXParseria XML-tiedoston lukemiseen
/*import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.util.*;
import java.io.*;
*/
import java.util.Hashtable;
import themtgdeckbuilder.EnchantmentCard;

/**
 *
 * @author sambi
 */
public class DataHandler {
    private Card[] Cards = new Card[6];
  
    private Hashtable<String, Integer> Data = new Hashtable<String, Integer>();
    
    public static String newline = System.getProperty("line.separator");
    
    public DataHandler() {
        Cards[0] = new Card();
        Cards[1] = new Card("Acrobatic Maneuver", "Instant", new Object[][] {{"white",1},{"generic",2}}, 1);
        Cards[2] = new CreatureCard("Aerial Responder", "Creature — Dwarf Soldier", new Object[][] {{"white",2},{"generic",1}}, 2, 2, 3, "Dwarf Soldier");
        Cards[3] = new CreatureCard("Aetherstorm Roc", "Creature — Bird", new Object[][] {{"white",2},{"generic",2}}, 3, 3, 3, "Bird");
        Cards[4] = new CreatureCard("Angel of Invention", "Creature — Angel", new Object[][] {{"white",2},{"generic",3}}, 4, 2, 1, "Angel");
        Cards[5] = new EnchantmentCard("Authority of the Consuls", "Enchantment", new Object[][] {{"white",1}}, 5,-1,-1);
        
        for(int i = 1; i < Cards.length; i++){
            String name = Cards[i].getName();
            Integer put = Data.put(name, i);
        }
        
    }
    public void getCard(String p_find){
        Integer n = Data.get(p_find);
        if (n != null){
            String mana = "";
            String attAndDef = null;
            Object[][] temp = Cards[n].getManaTypes();
            for(int i = 0; i < temp.length; i++){
                // System.out.println("Mana type:" + temp[i][0] + " " + temp[i][1]);
                mana += newline + temp[i][1] + " " + temp[i][0];
            }
            System.out.println();
            System.out.println("Name: " + Cards[n].getName());
            System.out.println("Mana: " + mana);
            System.out.println("Type:" + Cards[n].getSuperType());
            /*if (Cards[n].getAttack() != null){
                attAndDef = "";
                attAndDef += Cards[n].getAttack();  
                if (Cards[n].getDefense() >= 0){
                    attAndDef += "/" + Cards[n].getDefense(); 
                }
            }*/
            if(attAndDef != null){
                System.out.println("A/D: " + attAndDef);
            }
            System.out.println("Card number: " + Cards[n].getId() + "/" + Cards[n].getStaticNumberOfCards());
        } else {
            System.out.println("Ei löytynyt kyseistä korttia. Sori.");
        }
    }
    public void listAllAvailableCards(){
        int length;
        length = Data.size();
        System.out.println(length);
        System.out.println("All available cards:");
        for (int i = 1; i <= length; i++){
            Integer tempCard = Data.get(i);
            System.out.println(i + " " + Cards[i].getName());
        }
    }
}
