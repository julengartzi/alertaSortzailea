package alertaSortzailea; // Asegúrate de tener el mismo paquete

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class erregistroaGestionatu extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;

    public erregistroaGestionatu() {
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public void updateTableModel(ResultSet resultSet) throws SQLException {
        // Clear existing rows
        tableModel.setRowCount(0);

        // Get metadata (columns) from the result set
        int columnCount = resultSet.getMetaData().getColumnCount();

        // Add columns to the table model
        for (int i = 1; i <= columnCount; i++) {
            tableModel.addColumn(resultSet.getMetaData().getColumnName(i));
        }

        // Add rows to the table model
        while (resultSet.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(row);
        }
    }
}


