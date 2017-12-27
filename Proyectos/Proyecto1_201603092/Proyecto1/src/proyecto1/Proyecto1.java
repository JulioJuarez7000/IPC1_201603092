/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JFrame;

/**
 *
 * @author julio
 */
public class Proyecto1 {

    
    public static void main(String[] args) {
      Marco ventana=new Marco();
      ventana.setBounds(200, 0, 1000, 700);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setVisible(true);
    }
    
}
