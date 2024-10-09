/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotransversal_gp9.persistencia;
import proyectotransversal_gp9.modelo.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author agust
 */
public class MateriaData {
    private Connection con = null;
    
    public MateriaData () {
        con = Conexion.getConexion();
        
    }
    
    
    
    public void guardarMateria(Materia materia){
    
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
        
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, materia.getNombre());
        ps.setInt(2, materia.getAnioMateria());
        ps.setBoolean(3, materia.isActivo());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Materia guardada correctamente");
                
            }
        ps.close();
        }catch(SQLException ex){
        
           JOptionPane.showMessageDialog(null, "Error al guardar la materia");
        
        }
    
    
    
    }
    
    
    
}
