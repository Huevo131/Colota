/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import static java.awt.Color.GRAY;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args){
    Interfaz IF = new Interfaz();
    IF.setVisible(true);
    IF.setResizable(false);
    IF.setLocationRelativeTo(null);
    IF.setBounds(0,0,500,500);
    IF.getContentPane().setBackground(GRAY);
    
    }
    
}
