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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author agust
 */
public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();

    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";

        try {
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
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al guardar la materia");

        }

    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre=?, año=?, estado=? WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());

            int x = ps.executeUpdate();

            if (x == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada con exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la materia");
        }

    }

    public Materia buscarMateria(int id) {
        Materia materia = new Materia();
        String sql = "SELECT * FROM materia WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia.setIdMateria(id);
                materia.setAnioMateria(rs.getInt("año"));
                materia.setNombre(rs.getString("nombre"));
                materia.setActivo(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la materia");
            }

            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al buscar materia");
        }

        return materia;
    }

    public List<Materia> listarMateria() {

        String sql = "SELECT * FROM materia WHERE estado= 1";
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al mostrar la lista");

        }

        return materias;
    }

    public void borrarMateria(int id) {

        String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int borrado = ps.executeUpdate();
            ps.close();
            
            if (borrado >=1 ) {
                JOptionPane.showMessageDialog(null, "Ciudad borrada exitosamente");
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar la ciudad");

        }

    }
}
