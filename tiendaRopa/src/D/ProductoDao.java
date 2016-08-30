
package D;

import conexion.cnMYSQL;
import mo.ProductoTo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author D
 */
public class ProductoDao {
    public void insertraProducto(ProductoTo to) throws Exception{
          Connection connection=cnMYSQL.getIntance().getConnection();
          CallableStatement cs=connection.prepareCall("CALL Producto_insert(?,?,?,?,?,?,?)");
          cs.setString(1, to.getCodCategoria());
          cs.setString(2, to.getCodProveedor());
          cs.setString(3, to.getMarca());
          cs.setDouble(4, to.getPrecioCompra());
          cs.setDouble(5, to.getPrecioVenta());
          cs.setString(6, to.getMedida());
          cs.setInt(7, to.getCantidad());
          cs.execute();
    }
    public void ModificarProducto(ProductoTo to) throws Exception{
          Connection connection=cnMYSQL.getIntance().getConnection();
          CallableStatement cs=connection.prepareCall("CALL Producto_update(?,?,?,?,?,?,?,?)");
          cs.setString(1, to.getCodProducto());
          cs.setString(2, to.getCodCategoria());
          cs.setString(3, to.getCodProveedor());
          cs.setString(4, to.getMarca());
          cs.setDouble(5, to.getPrecioCompra());
          cs.setDouble(6, to.getPrecioVenta());
          cs.setString(7, to.getMedida());
          cs.setInt(8, to.getCantidad());
          cs.execute();
    }
        public void EliminarProducto(ProductoTo to) throws Exception{
          Connection connection=cnMYSQL.getIntance().getConnection();
          CallableStatement cs=connection.prepareCall("CALL Producto_Eliminar(?)");
          cs.setString(1, to.getCodProducto());
          cs.execute();
    }
        public ResultSet buscaRegistro(String nombre) throws  Exception{
             nombre='%'+nombre+'%';
             Connection connection=cnMYSQL.getIntance().getConnection();
             PreparedStatement ps=connection.prepareStatement("SELECT * FROM vproducto  where nombre like  ?");
             ps.setString(1, nombre);
             ResultSet rs=ps.executeQuery();
             return rs;             
        }
         public ResultSet cargaRegistro() throws  Exception{
             Connection connection=cnMYSQL.getIntance().getConnection();
             PreparedStatement ps=connection.prepareStatement("SELECT * FROM vproducto ");
             ResultSet rs=ps.executeQuery();
             return rs;             
        }
}
