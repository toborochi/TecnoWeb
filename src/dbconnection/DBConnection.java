package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private final static String USER = "agenda";
    private final static String PASSWORD = "agendaagenda";
    private final static String HOST = "mail.tecnoweb.org.bo";
    private final static String PORT = "5432";
    private final static String DB = "db_agenda";

    private Connection conn;
    private Statement statement;

    private static final String URL = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DB;

    private static DBConnection obj;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (obj == null) {
            synchronized (DBConnection.class) {
                if (obj == null) {
                    obj = new DBConnection();//instance will be created at request time  
                }
            }
        }
        return obj;
    }

    public Connection getConnection() {
        return conn;
    }

    public void close() {

        try {
            conn.close();
            System.out.println("CLOSING CONNECTION!");

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR CLOSING CONNECTION!");
        }
    }

    public String getTable(String pattern) throws SQLException{
        String tabla = "per_cod \tper_nom \t per_appm \t per_prof \t per_telf \t per_cel \t per_email \t per_dir \t per_flug \t per_pass";
        statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM persona where "
                + "per_cod like '%" + pattern + "%'\n"
                + "or per_nom like '%" + pattern + "%'\n"
                + "or per_appm like '%" + pattern + "%'\n"
                + "or per_prof like '%" + pattern + "%'\n"
                + "or per_telf	like '%" + pattern + "%'\n"
                + "or per_cel like '%" + pattern + "%'\n"
                + "or per_email like '%" + pattern + "%'\n"   
                + "or per_dir like '%" + pattern + "%'\n"  
                + "or per_flug like '%" + pattern + "%'\n"  
                + "or per_pass like '%" + pattern + "%'"  
                + ";");
        
        while (resultSet.next()) {
            String per_cod = resultSet.getString("per_cod");
            String per_nom = resultSet.getString("per_nom");
            String per_appm = resultSet.getString("per_appm");
            String per_prof = resultSet.getString("per_prof");
            String per_telf = resultSet.getString("per_telf");
            String per_cel = resultSet.getString("per_cel");
            String per_email = resultSet.getString("per_email");
            String per_dir = resultSet.getString("per_dir");
            String per_flug = resultSet.getString("per_flug");
            String per_pass = resultSet.getString("per_pass");
            tabla = tabla + "\n" + 
                    per_cod + "\t" + 
                    per_nom + "\t" + 
                    per_appm + "\t" +
                    per_prof + "\t" +
                    per_telf + "\t" +
                    per_cel + "\t" +
                    per_email + "\t" +
                    per_dir + "\t" +
                    per_flug + "\t" + 
                    per_pass + "\t";
        }
        statement.close();
        resultSet.close();
        return tabla;
    }
    
    public void connect() {

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("CONNECTED!");
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("ERROR ON CONNECTING!");
        }
    }

}
