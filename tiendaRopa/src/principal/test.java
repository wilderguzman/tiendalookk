
package principal;

import conexion.cnMYSQL;
import java.sql.Connection;
/**
 *
 * @author D
 */

public class test {
    
    public static void main(String[] args) {
        try {
        Connection connection=cnMYSQL.getIntance().getConnection();
            System.out.println("Conecto");
            new Principal().setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
