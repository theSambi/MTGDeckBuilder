/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themtgdeckbuilder;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sambi
 */
public class IO {
    Scanner sc = new Scanner(System.in);
    
    public int annaInt(){
        int luku;
        while(true){
            try {
                luku = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
            }
        }
        sc.nextLine();
        return luku;
    }
    public String annaString(){
        String teksti = sc.nextLine();
        return teksti;
    }
}
