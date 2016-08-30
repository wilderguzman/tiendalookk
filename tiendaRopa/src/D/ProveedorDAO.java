
package D;

import conexion.cnMYSQL;
import mo.ProveedorTo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author D
 */
public class ProveedorDAO {

    public ResultSet buscar(String nombre) throws Exception {
        nombre = '%' + nombre + '%';
        Connection connection = cnMYSQL.getIntance().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM proveedor where compañia like ?");
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;

    }
       public ResultSet cargaRegistro() throws Exception {
        Connection connection = cnMYSQL.getIntance().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM proveedor ");
        ResultSet rs = ps.executeQuery();
        return rs;

    }

    public void insertar(ProveedorTo to) throws Exception {
        Connection connection = cnMYSQL.getIntance().getConnection();
        CallableStatement cs=connection.prepareCall("CALL Proveedor_insert(?,?,?,?)");
        cs.setString(1, to.getNombre());
        cs.setString(2, to.getTelefono());
        cs.setString(3, to.getE_mail());
        cs.setString(4, to.getDirecion());
        cs.execute();
    }

}
