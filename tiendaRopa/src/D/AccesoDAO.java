
package D;

import conexion.cnMYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author D
 */
public class AccesoDAO {
    public ResultSet cargaAcceso()throws Exception{
        Connection connection=cnMYSQL.getIntance().getConnection();
        PreparedStatement ps=connection.prepareStatement("SELECT * FROM acceso ");
        ResultSet rs=ps.executeQuery();
        return rs;
    }
    
}
