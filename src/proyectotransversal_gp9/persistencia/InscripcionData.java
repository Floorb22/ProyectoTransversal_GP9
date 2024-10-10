package proyectotransversal_gp9.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectotransversal_gp9.modelo.Conexion;
import proyectotransversal_gp9.modelo.Inscripcion;

/**
 *
 * @author analf
 */
public class InscripcionData {
   
    private Connection con= null;
   
    public InscripcionData(){
       
       
        this.con=Conexion.getConexion();
    }
   
    public void guardarInscripcion ( Inscripcion  insc){
       
 String sql = "INSERT TO inscripcion (idAlumno, idMateria, nota) VALUES ( ?, ? ,? )";

        try {
            java.sql.PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno() ) ;
            ps.setInt(2,insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys ();
            if (rs.next ()){
               insc.setIdInscripcion (rs.getInt(1));
               JOptionPane.showMessageDialog(null, "Inscripcion registrada");
               
            }
            ps.close ();
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "Error al acceder a la tabla");
        }
 
 
}
   
    public void actualizarNota(int idAlumno, int idMateria, double nota) throws SQLException{
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno ? and idMateria";
       
       
        try {
            java.sql.PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt (2, idAlumno);
            ps.setInt (3,idMateria);
           
            int filas = ps.executeUpdate();
            if (filas > 0){
               
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
           
       
        } catch (SQLException ex){
           
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
           
    }
   
   
    public void borrarInscripcionMateriaAlumno ( int idAlumno, int idMateria){
       
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ? ";
       
        try {
            java.sql.PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt ( 1, idAlumno);
            ps.setInt(2 , idMateria);
           
            int filas = ps.executeUpdate();
            if (filas > 0){
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }
              ps.close();    
        } catch (SQLException ex){
           
            JOptionPane.showMessageDialog(null, "Error al borrar inscripcion");
        }
    }
}