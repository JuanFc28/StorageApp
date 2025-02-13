package storageapp;
import java.sql.*;

/**
 *
 * @author juan_
 */
public class DBConnection {
    static String url = "jdbc:mysql://localhost:3306/Store"; //Direccion de la base de datos
    static String user = "root"; //nombre de usuario
    static String pass = "Password"; //contraseña del usuario
    //Metodo para generar la conexion
    public static Connection conectar(){
        Connection con = null;
        try{
            con = DriverManager.getConnection(url, user,pass);
            System.out.println("Conexion exitosa");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
