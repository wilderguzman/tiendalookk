
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author D
 */
public class cnMYSQL {
      Connection connection= null;
    static cnMYSQL instance=null;

    public cnMYSQL() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
    }
    public static cnMYSQL getIntance() throws Exception{
        if(instance==null){
            instance=new cnMYSQL();
        }
        return instance;
    }
    @Override
    public void finalize()throws Exception{
        if(connection.isClosed()){
            connection=null;
            connection.isClosed();
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
}
