package PackageConexion;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;

public class Conex {
	private static Connection conexion;

	public Connection getConexcion() {
		System.out.print("Conexion0 ");
		try {
			System.out.print("Conexion1 ");
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			System.out.print("Conexion2 ");
			conexion=java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JavaIntermedio","sa","QWEasd123!");
			System.out.print("Conexion3 ");
		} catch (Exception e) {
			// TODO: handle exception
			conexion=null;
		}
		
		
		return conexion;
	}
	
	public static void main(String[] args) {
		Conex cn=new Conex();
		cn.getConexcion();
	}
	
}
