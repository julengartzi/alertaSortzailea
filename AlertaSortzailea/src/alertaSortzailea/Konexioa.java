package alertaSortzailea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konexioa {
	
    static final String DB_URL = "jdbc:mysql://localhost:3307/alertasortzailea";
    static final String USER = "root";
    static final String PASS = "";
    
    /**
     * Datu basearekin konexioa egiteko ahalbidetzen du
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

}
