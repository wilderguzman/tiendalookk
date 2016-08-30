
package D;

import conexion.cnMYSQL;
import mo.EmpleadoTo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author D
 */
public class EmpleadoDAO {
    public void InsertarEmpleado(EmpleadoTo to) throws Exception{
        Connection connection= cnMYSQL.getIntance().getConnection();
        CallableStatement cs=connection.prepareCall("CALL Empleado_insertar(?,?,?,?)");
        cs.setString(1, to.getDNI());
        cs.setString(2, to.getNombres());
        cs.setString(3, to.getApellidos());
        cs.setString(4, to.getTelefono());
        cs.execute();
    }
       public void ModificarEmpleado(EmpleadoTo to) throws Exception{
        Connection connection= cnMYSQL.getIntance().getConnection();
        CallableStatement cs=connection.prepareCall("CALL  Empleado_update(?,?,?,?,?)");
        cs.setString(1, to.getCodEmpelado());
        cs.setString(2, to.getDNI());
        cs.setString(3, to.getNombres());
        cs.setString(4, to.getApellidos());
        cs.setString(5, to.getTelefono());
        cs.execute();
    }
          public void EliminarEmpleado(EmpleadoTo to) throws Exception{
        Connection connection= cnMYSQL.getIntance().getConnection();
        CallableStatement cs=connection.prepareCall("CALL Empleado_Eliminar(?)");
        cs.setString(1, to.getCodEmpelado());
        cs.execute();
    }
          public ResultSet buscarEmpleado(String nombre,String dni) throws Exception{
                  nombre='%'+nombre+'%';
                  dni='%'+dni+'%';
                  Connection connection= cnMYSQL.getIntance().getConnection();
                  PreparedStatement ps=connection.prepareStatement("SELECT * FROM vempleado  where nombres like ? or dni like ?");
                  ps.setString(1, dni);
                  ps.setString(2, nombre);                  
                  ResultSet rs =ps.executeQuery();
                  return rs;
          }
             public ResultSet cargaRegistros() throws Exception{
                  Connection connection= cnMYSQL.getIntance().getConnection();
                  PreparedStatement ps=connection.prepareStatement("SELECT * FROM vempleado ");
                  ResultSet rs =ps.executeQuery();
                  return rs;
          }
}
