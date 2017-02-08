/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder.Deck;

/**
 *
 * @author sambi
 */
class Deck implements DeckInterface{
    private String name;
    private int numberOfCards;
    
    private int[] DeckOfCards = new int[1]; // Itse korttipakka. Korttien tiedot kirjataan vain numeroina ja tätä käytetään 

    @Override
    public void lisaaKortti(int kortinId) {
        
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
