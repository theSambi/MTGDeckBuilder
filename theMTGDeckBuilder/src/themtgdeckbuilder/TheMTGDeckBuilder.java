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
        IO io = new IO();

        DataHandler Data = new DataHandler();
        
        Data.listAllAvailableCards();
        
        while(true){
            System.out.println("MTG Kaladesh pakanrakennusohjelma");
            System.out.println("Valitse:");
            System.out.println("1. Pakat");
            System.out.println("2. Kortit");
            System.out.println("3. Lopeta");
            
            int valinta = io.annaInt();
            switch (valinta) {
                case 1:
                    Decks();
                    Data.listAllAvailableCards();
                    break;
                case 2:
                    Data.manageCards();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    
                    System.out.println("Anna luku väliltä 1-3.");
                    break;
            }
        }
    }
    private static void Cards(){
        
    } 
    private static void Decks(){
        
    }      
}
