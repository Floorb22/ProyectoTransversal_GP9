package proyectotransversal_gp9.persistencia;

import java.sql.Connection;
import java.sql.Statement;
import proyectotransversal_gp9.modelo.alumno;
import proyectotransversal_gp9.modelo.conexion;


/**
 *
 * @author ACER
 */
public class alumnoData {
    private Connection con = null;
    
    public alumnoData () {
        con = conexion.getConexion();
    }
    
    public void guardarAlumno (alumno alumno){
        String sql = "Insert into alumno (dni, apellido, nombre, fechaNac, estado)" + "VALUES (?,?,? ,? ,?)";
    }
    

}
   
    
 