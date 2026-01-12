package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbIntegretyException;
public class Program {
    
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        
        
        try {
            
        	conn = DB.getConnection();
        	st  = conn.prepareStatement(
        			"DELETE FROM department "
        			+" WHERE "
        			+"Id = ?"
        			);
        	st.setInt(1, 2);
        	
        	
        	
        	int rowsAffected = st.executeUpdate();
        	
        	System.out.println("Done! Rows Affected: "+ rowsAffected);
        	
        } catch (SQLException e) {
            throw new DbIntegretyException(e.getMessage());
        } 
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
