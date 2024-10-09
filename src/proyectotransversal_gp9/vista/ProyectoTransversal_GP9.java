package proyectotransversal_gp9.vista;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import proyectotransversal_gp9.modelo.Alumno;
import proyectotransversal_gp9.modelo.Conexion;
import proyectotransversal_gp9.modelo.Materia;
import proyectotransversal_gp9.persistencia.AlumnoData;
import proyectotransversal_gp9.persistencia.MateriaData;

/**
 *
 * @author ACER
 */
public class ProyectoTransversal_GP9 {

    public static void main(String[] args) {
        
        Connection con= Conexion.getConexion();
      // Alumno alumno1 = new Alumno(12345618, "Badiali", "Florencia", LocalDate.of(2000, Month.MARCH, 15), true);
        //Alumno alumno2 = new Alumno( 12345619, "Cordoba", "Mercedes", LocalDate.of(1998, Month.MARCH, 1), true);
       //Alumno alumno3=new Alumno(23562452,"Herrera","Agustin",LocalDate.of(1996, Month.APRIL, 14),true);
       Alumno alumno4=new Alumno(4,25467383,"Fernandez","Ana",LocalDate.of(1996, Month.AUGUST, 10),true);
        AlumnoData a = new AlumnoData();
        Materia mat1 = new Materia("Matematica", 3, true);
        MateriaData mD = new MateriaData();
        
        /*a.guardarAlumno(alumno1);
        a.guardarAlumno(alumno2);
        a.guardarAlumno(alumno3);
        a.guardarAlumno(alumno4);
        System.out.println( a.buscarAlumno(4));*/
        //System.out.println(a.buscarAlumnoPorDni(12345618));
        //System.out.println(a.listarAlumno());
       //a.modificarAlumno(alumno4);
       //a.eliminarAlumno(4);
        mD.guardarMateria(mat1);
    }
    
}
