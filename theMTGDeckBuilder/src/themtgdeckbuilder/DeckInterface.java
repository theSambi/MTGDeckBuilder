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
public interface DeckInterface {
    void lisaaKortti();
    void poistaKortti(int kortinId);
    void landFill(int korttiMaara);
    
}
