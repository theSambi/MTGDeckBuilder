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
public class TheMTGDeckBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataHandler Data = new DataHandler();
        Data.getCard("Acrobatic Maneuver");
        Data.getCard("Aerial Responder");
        Data.getCard("Aetherstorm Roc");
        Data.getCard("Angel of Invention");
        
    }
    
}