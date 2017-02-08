/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder;

import java.util.Scanner;

/**
 *
 * @author sambi
 */
public class TheMTGDeckBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataHandler Data = new DataHandler();
        
        
        
        Data.getCard("Acrobatic Maneuver");
        Data.getCard("Aetherstorm Roc");
        
        Data.listAllAvailableCards();
        
        while(true){
            System.out.println("MTG Kaladesh pakanrakennusohjelma");
            System.out.println("Valitse:");
            System.out.println("1. Pakat");
            System.out.println("2. Kortit");
            System.out.println("3. Lopeta");
            
            int valinta = sc.nextInt();
            switch (valinta) {
                case 1:
                    Decks();
                    break;
                case 2:
                    Cards();
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
