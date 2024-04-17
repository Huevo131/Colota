/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author USUARIO
 */
import static java.awt.Color.YELLOW;
import static java.awt.Color.RED;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public final class Interfaz extends JFrame {

    JLabel tex1, tex2, titulo;
    JButton aumentar, quitar;

    public Interfaz() {
        setTitle("MUÑECAS MATRIOSKA");
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        Componentes();

    }

    public void Componentes() {
        titulo = new JLabel("MUÑEAS MATRIOSKA");
        titulo.setBounds(180, 20, 200, 10);
        add(titulo);

        tex1 = new JLabel("AUMENTAR MUÑECA: ");
        tex1.setBounds(50, 50, 300, 100);

        tex2 = new JLabel("QUITAR MUÑECA: ");
        tex2.setBounds(50, 100, 300, 100);

        aumentar = new JButton("+");
        aumentar.setBounds(185, 85, 50, 20);
        aumentar.setBackground(RED);

        quitar = new JButton("-");
        quitar.setBounds(185, 135, 50, 20);
        quitar.setBackground(YELLOW);

        add(tex1);
        add(tex2);
        add(aumentar);
        add(quitar);

    }

}