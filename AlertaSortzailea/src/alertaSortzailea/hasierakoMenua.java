package alertaSortzailea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hasierakoMenua extends JFrame {
    public hasierakoMenua() {
        setTitle("Aukerak");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(2, 1));
        setLocationRelativeTo(null);

        JButton opcion1Button = new JButton("Erregistro berria sartu");
        opcion1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	formularioBerria();
            }
        });

        JButton opcion2Button = new JButton("Hurrengo alertak");
        opcion2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //abrirFormulario();
            }
        });


        add(opcion1Button);
        add(opcion2Button);

        setVisible(true);
    }

    private void formularioBerria() {
        // Abre el formulario aplikazioGUI
        new erregistroaSartu();
        // Cierra esta ventana previa
        dispose();
    }

    public static void main(String[] args) {
        // Se inicia mostrando la pantalla previa
        new hasierakoMenua();
    }
}
