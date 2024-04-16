package alertaSortzailea;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class aplikazioGUI extends JFrame {
	public aplikazioGUI() {

		// Lehio konfiguratu
		setTitle("Mi Ventana"); // Titulua
		setSize(400, 300); // Lehioaren tamaina
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // aplikazioa itxi lehioa ixterakoan

	}

	public static void main(String[] args) {
		// Crea una instancia de la ventana
		aplikazioGUI lehioa = new aplikazioGUI();
		// Hacer visible la ventana
		lehioa.setVisible(true);
	}

}
