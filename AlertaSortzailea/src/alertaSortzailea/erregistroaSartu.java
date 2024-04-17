package alertaSortzailea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class erregistroaSartu extends JFrame {
    private JTextField textizena, textdeskripzioa, txtnorentzako;
    private JSpinner fechaSpinner, horaSpinner;
    private JCheckBox aukeraCheckBox;

    public erregistroaSartu() {
        setTitle("Alerta Sortu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(7, 2));
        setLocationRelativeTo(null);

        // Componentes del formulario
        JLabel izenaLabel = new JLabel("Izena:");
        izenaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textizena = new JTextField();

        JLabel deskripziaLabel = new JLabel("Deskripzioa:");
        deskripziaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textdeskripzioa = new JTextField();

        JLabel norentzakoLabel = new JLabel("Norentzako:");
        norentzakoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        txtnorentzako = new JTextField();

        JLabel dataLabel = new JLabel("Data:");
        dataLabel.setHorizontalAlignment(SwingConstants.CENTER);
        fechaSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor fechaEditor = new JSpinner.DateEditor(fechaSpinner, "dd/MM/yyyy");
        fechaSpinner.setEditor(fechaEditor);

        JLabel orduaLabel = new JLabel("Ordua:");
        orduaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        horaSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor horaEditor = new JSpinner.DateEditor(horaSpinner, "HH:mm");
        horaSpinner.setEditor(horaEditor);

        // Se añade el JCheckBox
        JLabel errepikakorraLabel = new JLabel("Errepikakorra:");
        errepikakorraLabel.setHorizontalAlignment(SwingConstants.CENTER);
        aukeraCheckBox = new JCheckBox();
        aukeraCheckBox.setHorizontalAlignment(SwingConstants.CENTER);

        JButton enviarButton = new JButton("Bidali");
        enviarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	datuakJaso();
            }
        });

        // Añadir componentes al formulario
        add(izenaLabel);
        add(textizena);
        add(deskripziaLabel);
        add(textdeskripzioa);
        add(norentzakoLabel);
        add(txtnorentzako);
        add(dataLabel);
        add(fechaSpinner);
        add(orduaLabel);
        add(horaSpinner);
        add(errepikakorraLabel);
        add(aukeraCheckBox);
        add(new JLabel());
        add(enviarButton);
        setVisible(true);
    }

    private void datuakJaso() {
        String izena = textizena.getText();
        String deskribapena = textdeskripzioa.getText();
        String jasotzailea = txtnorentzako.getText();
        Date data = (Date) fechaSpinner.getValue();
        Date ordua = (Date) horaSpinner.getValue();
        boolean errepikakorra = aukeraCheckBox.isSelected();

        DatuBasea.datuakSartu(izena, deskribapena, jasotzailea, data, ordua, errepikakorra);
    }

}


