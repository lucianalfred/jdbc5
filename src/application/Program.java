package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;


public class Program {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st =  conn.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDay, BaseSalry, DepartmentId"
					+"VALUES"
					+"(?, ?, ?, ?, ?)"
					);
		}catch() {
			
		}
	}
}
