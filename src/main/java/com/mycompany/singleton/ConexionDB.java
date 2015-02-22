package com.mycompany.singleton;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class ConexionDB 
{
    public Connection conn;
    public static ConexionDB db; 
    public ConexionDB() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        String url= "jdbc:postgresql://localhost:5432/";
        String driver = "org.postgresql.Driver";
        String nombre = "username";
        String clave = "password";
        
        Class.forName(driver).newInstance();
        this.conn = (Connection)DriverManager.getConnection(url,nombre,clave);
        
        
        
    }
   /** retorna una instancia de la conexion a la base de datos.
    */ 
   public synchronized static void crearInstancia()throws Exception 
   {
        if (db == null) {
            db = new ConexionDB();
            
        }
    }

    /** retorna una instancia de la conexion a la base de datos. 
     * Si no esta creada la crea, y si esta creada la retorna
     * @return  conexion 
     */
    public static ConexionDB getInstance() throws Exception {
        if (db == null){
            crearInstancia();   
        }
        return db;
        
    }
}
