/*

*/

package com.mycompany.singleton;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class Consulta {
    
    public ResultSet consulta(String consulta) throws SQLException, Exception{
        Statement statement ;
        ConexionDB conexion = ConexionDB.getInstance();
        statement = conexion.conn.createStatement();
        ResultSet res = statement.executeQuery(consulta);
        if (res == null)
        {
            throw new SQLException();
        }else
        {        
        return res;
        }
    }
    
}
