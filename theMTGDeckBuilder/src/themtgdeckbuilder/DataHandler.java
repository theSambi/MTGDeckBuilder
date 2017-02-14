/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder;


// Nämä tarvitaan, jos haluaa käyttää SAXParseria XML-tiedoston lukemiseen
/*import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.util.*;
import java.io.*;
*/
import java.util.Arrays;
import java.util.Hashtable;
import themtgdeckbuilder.Cards.Card;
import themtgdeckbuilder.Cards.CreatureCard;
import themtgdeckbuilder.Cards.EnchantmentCard;

/**
 *
 * @author sambi
 */
public class DataHandler {
    private Card[] Cards = new Card[6];
  
    IO io = new IO();
    
    private Hashtable<String, Integer> Data = new Hashtable<>();
    
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
                System.out.println("Power/Toughness: " + attAndDef);
            }
            System.out.println("Card number: " + Cards[n].getId() + "/" + Cards[n].getStaticNumberOfCards());
        } else {
            System.out.println("Ei löytynyt kyseistä korttia. Sori.");
        }
    }
    
    public void manageCards(){
        boolean getBack = true;
        while(getBack){
            System.out.println("Valitse:");
            System.out.println("1. Lisää kortti");
            System.out.println("2. Poista kortti");
            System.out.println("3. Takaisin");
            
            int valinta = io.annaInt();
            switch (valinta) {
                case 1:
                    System.out.println("Valitse korttityyppi" + newline + "1. Creature" + newline + "2. Enchantment" + newline + "3. Artifact" + newline + "4. Land" + newline + "5. Instant"+ newline + "6. Sorcery");
                    int korttiTyyppi = io.annaInt();
                    if (korttiTyyppi > 0 && korttiTyyppi <= 6){
                        addCard(korttiTyyppi);
                        break;
                    } else {
                         System.out.println("Valitse luku väliltä 1-6.");
                    }
                case 2:
                    System.out.println("HELLO 2"); 
                    break;
                case 3:
                    System.out.println("HELLO 3");
                    getBack = false;
                    break;
                default:
                    
                    System.out.println("Anna luku väliltä 1-3.");
                    break;
            }
        }
    }
    
    // Kortin lisäys "tietokantaan". Kysytään tarpeellisia tietoja riippuen kortin tyypistä.
    public void addCard(int p_tyyppi){
        // initialisoidaan luvut
        int korttiPower, korttiToughness, korttiNro;
        korttiPower = korttiToughness = korttiNro = 0;
        
        String korttiTyyppi, nimi;
        korttiTyyppi = nimi = "";
        
        Cards = Arrays.copyOf(Cards,Cards.length+1);
        System.out.println("Creature-kortti");
        System.out.println("Nimi?");
        nimi = io.annaString();
        System.out.println("Mana(t)?");

        System.out.println("Korttinumero?");
        korttiNro = io.annaInt();
        
        if (p_tyyppi == 1 || p_tyyppi == 3){
            System.out.println("Power?");
            korttiPower = io.annaInt();

            System.out.println("Toughness?");
            korttiToughness = io.annaInt();
        }
        if (p_tyyppi == 1){
            System.out.println("Creature tyyppi?");
            korttiTyyppi = io.annaString();
        }
        if(p_tyyppi == 1){
            Cards[Cards.length-1] = new CreatureCard(nimi, "Creature Cards", new Object [][]{{"Generic",1},{"Mountain",2}}, korttiNro, korttiPower, korttiToughness, korttiTyyppi);
        }
        Data.put(nimi, korttiNro);
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
