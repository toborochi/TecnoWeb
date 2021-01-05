package tecnoweb;

import dbconnection.DBConnection;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TecnoWeb {

    public static void main(String[] args) throws InterruptedException, IOException, SQLException {

        DBConnection con = DBConnection.getInstance();
        con.connect();
        
        String s = con.getTable("1");
        
        System.out.println(s);
        
        con.close();
    }
}
