package proyectotransversal_gp9.vista;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import proyectotransversal_gp9.modelo.Alumno;
import proyectotransversal_gp9.modelo.Conexion;
import proyectotransversal_gp9.persistencia.AlumnoData;

/**
 *
 * @author ACER
 */
public class ProyectoTransversal_GP9 {

    public static void main(String[] args) {
        
        Connection con= Conexion.getConexion();
        Alumno alumno1 = new Alumno(12345618, "Badiali", "Florencia", LocalDate.of(2000, Month.MARCH, 15), true);
        Alumno alumno2 = new Alumno( 12345619, "Cordoba", "Mercedes", LocalDate.of(1998, Month.MARCH, 1), true);
        AlumnoData a = new AlumnoData();
        
        a.guardarAlumno(alumno1);
        a.guardarAlumno(alumno2);
        a.listarAlumno();
    }
    
}
