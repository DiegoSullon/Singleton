/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Controller.Records;

/**
 *
 * @author Diego Sullon
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main menu = new Main(Records.getInstance());
        menu.setVisible(true);
    }
    
}
