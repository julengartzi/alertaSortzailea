package alertaSortzailea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class hasierakoMenua extends JFrame {
    public hasierakoMenua() {
        setTitle("Aukerak");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350); // Aumenté un poco el tamaño para el título y la imagen
        setLayout(new BorderLayout()); // Usamos BorderLayout para organizar los componentes

        // Texto del título
        JLabel lbltitulua = new JLabel("Alerta sortzailea", SwingConstants.CENTER);
        lbltitulua.setFont(new Font("Arial", Font.BOLD, 24)); // Tamaño de fuente grande y negrita

        // Cargamos la imagen desde un archivo
        ImageIcon imagen = new ImageIcon("irudiak/email.png");
        JLabel lblIrudia = new JLabel(imagen);
        lblIrudia.setHorizontalAlignment(SwingConstants.CENTER); // Centrar la imagen horizontalmente

        JButton botoa1 = new JButton("Erregistro berria sartu");
        botoa1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formularioBerria();
            }
        });

        JButton botoia2 = new JButton("Alertak gestionatu");
        botoia2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	alertakGestionatu();
            }
        });
        
        JButton botoia3 = new JButton("Hurrengo alertak");
        botoia3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //abrirFormulario();
            }
        });

        // Creamos un panel para colocar los botones
        JPanel botoiPanela = new JPanel();
        botoiPanela.setLayout(new GridLayout(3, 1));
        botoiPanela.add(botoa1);
        botoiPanela.add(botoia2);
        botoiPanela.add(botoia3);

        // Panel para colocar el título y la imagen
        JPanel goikoPanela = new JPanel(new BorderLayout());
        goikoPanela.add(lbltitulua, BorderLayout.NORTH);
        goikoPanela.add(lblIrudia, BorderLayout.CENTER);

        // Agregamos el panel del título arriba, la imagen en el centro y los botones abajo
        add(goikoPanela, BorderLayout.CENTER);
        add(botoiPanela, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void formularioBerria() {
        new erregistroaSartu();
        // Cierra esta ventana previa
        //dispose();
    }
    
    private void alertakGestionatu() {
        erregistroaGestionatu tabla = new erregistroaGestionatu(); // Create an instance of erregistroaGestionatu

        // Fetch data from the database
        try {
            String query = "SELECT * FROM mezua"; // Replace "mezua" with your table name
            ResultSet resultSet = DatuBasea.executeQuery(query); // Execute the query using DatuBasea
            tabla.updateTableModel(resultSet); // Update the table model with data from the ResultSet

            // Close the ResultSet (handled by the updateTableModel method), no need to close the connection here
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        dispose(); // Close the current window after updating the table
    }

    

    public static void main(String[] args) {
        // Se inicia mostrando la pantalla previa
        new hasierakoMenua();
    }
}




