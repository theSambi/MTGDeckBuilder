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
public interface DeckInterface {
    void lisaaKortti(int kortinId);
    void poistaKortti(int kortinId);
    void landFill(int korttiMaara);
    
}
