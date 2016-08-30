
package D;

import conexion.cnMYSQL;
import mo.CategoriaTo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author D
 */
public class CategoriaDAO {
    public void Insertar(CategoriaTo to) throws Exception{
        Connection connection=cnMYSQL.getIntance().getConnection();
        CallableStatement cs=connection.prepareCall("CALL Categoria_Insertar(?)");
        cs.setString(1, to.getNombre());
        cs.execute();
    }
    public ResultSet cargaCategoria()throws Exception{
        Connection connection=cnMYSQL.getIntance().getConnection();
        PreparedStatement ps=connection.prepareStatement("SELECT * FROM categoria ");
        ResultSet rs=ps.executeQuery();
        return rs;
        
    }
}
