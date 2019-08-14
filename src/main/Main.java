package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JButton btnPress;
    private JPanel panel1;

    public Main() {//Clase abstacta New ActionListener
        // implementar lambda expression para corregir lo que sugiere Sonar Lind
        btnPress.addActionListener(e -> {
            //@Override sobre escribe las acciones(cambio de comportamiento se eventos)
            // se implementa un metodo que esta en una interfaz o una clase abstracta

                String name = JOptionPane.showInputDialog(null, "Write your name");
                JOptionPane.showMessageDialog(null, "Hello" + name);

        });
    }

    public static void main(String[] args){
        //se pone obligatoriamente
        JFrame jFrame = new JFrame("Main");
        jFrame.setContentPane(new Main().panel1);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);


    }
}
