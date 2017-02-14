/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder;

import java.util.Arrays;

/**
 *
 * @author sambi
 */
public class Deck implements DeckInterface{
    private String name;
    private int numberOfCards;
    private IO io = new IO();
    private int[] DeckOfCards = new int[1]; // Itse korttipakka. Korttien tiedot kirjataan vain kortin NUMERONA (korttiNro)
    
    
    public void lisaaKortti() {
        
        System.out.println("Anna kortin numero (1-264):");
        int kortinID = io.annaInt();
        DeckOfCards = Arrays.copyOf(DeckOfCards,DeckOfCards.length+1);
        DeckOfCards[numberOfCards] = kortinID;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void poistaKortti(int kortinId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void landFill(int korttiMaara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
