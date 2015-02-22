

package com.mycompany.singleton;

import java.sql.SQLException;
import org.testng.annotations.Test;

/**
 *
 * @author Daniel
 * 
 */
public class ConexionDBTest {
    
    public ConexionDBTest() {
    }
    @Test
    public void conexionBase()throws Exception{
        ConexionDB conexion = ConexionDB.getInstance();
       
    }
    @Test
    public void ConsultaBD() throws SQLException, Exception{
        Consulta consulta =new Consulta();
        consulta.consulta("SELECT now();");
        
    }
    
}
