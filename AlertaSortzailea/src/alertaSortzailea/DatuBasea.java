package alertaSortzailea;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatuBasea {

    public static void datuakSartu(String izena, String deskribapena, String jasotzailea, Date data, Date ordua, boolean errepikakorra) {
        try {
            Connection connection = Konexioa.getConnection();
            Statement stmt = connection.createStatement();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");

            String dataStr = dateFormat.format(data);
            String orduaStr = horaFormat.format(ordua);

            int errepikakorraInt = errepikakorra ? 1 : 0;

            String sql_insert = "INSERT INTO mezua(izena, deskribapena, jasotzailea, data, ordua, errepikakorra) "
                    + "VALUES('" + izena + "', '" + deskribapena + "', '" + jasotzailea
                    + "', '" + dataStr + "', '" + orduaStr + "', '" + errepikakorraInt + "')";

            stmt.executeUpdate(sql_insert);
            System.out.println("Datuak sartu dira DBan");

            stmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

