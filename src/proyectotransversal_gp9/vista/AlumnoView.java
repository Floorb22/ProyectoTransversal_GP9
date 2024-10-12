package proyectotransversal_gp9.vista;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import proyectotransversal_gp9.modelo.Alumno;
import proyectotransversal_gp9.persistencia.AlumnoData;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Chris
 */
public class AlumnoView extends javax.swing.JInternalFrame {

    private AlumnoData alu=new AlumnoData();
    private boolean activo=false;
    
    
    public AlumnoView() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jTEstado = new javax.swing.JRadioButton();
        jTApellido = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFecha = new com.toedter.calendar.JDateChooser();
        jBModificar1 = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 177, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Alumno");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 100, 25));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));
        jPanel1.add(jTDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 150, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 20));
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 150, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 87, -1));

        jBGuardar.setText("Crear");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 87, -1));

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jTEstado.setText("Activo");
        jTEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jTEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        jPanel1.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 150, -1));

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 87, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo15/vistas/alumno1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 140, 150));
        jPanel1.add(jTFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jBModificar1.setText("Modificar");
        jBModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 87, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        int dni=Integer.parseInt(jTDocumento.getText());
        int id=alu.buscarAlumnoPorDni(dni).getIdAlumno();
       
        alu.eliminarAlumno(id);
        limpiarFormulario();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        //Guardo en una variable lo que ingresa el usuario por texfield
        Alumno a=new Alumno();
        
        int dni = Integer.parseInt(jTDocumento.getText());
        String apellido = jTApellido.getText();
        String nombre = jTNombre.getText();
        LocalDate f =jTFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        a.setDni(dni);
        a.setApellido(apellido);
        a.setNombre(nombre);
        a.setFechaNac(f);
        a.setEstado(activo);
        
        alu.guardarAlumno(a);
        limpiarFormulario();   
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTFechaPropertyChange
        // TODO add your handling code here:
        if (jTFecha.getDate() != null) {

            LocalDate f= jTFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-YYYY");
           
        
        }
        
    }//GEN-LAST:event_jTFechaPropertyChange

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:

        jTDocumento.setEditable(false);
        jTEstado.setEnabled(false);
        try {
            int dni = Integer.parseInt(jTDocumento.getText());
            Alumno a = alu.buscarAlumnoPorDni(dni);
            jTApellido.setText(a.getApellido());
            jTNombre.setText(a.getNombre());
            jTFecha.setDate(Date.valueOf(a.getFechaNac()));
            jTEstado.setSelected(a.isEstado());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "no existe alumno");
        }


    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEstadoActionPerformed
        // TODO add your handling code here:
        activo=true;
    }//GEN-LAST:event_jTEstadoActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModificar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JRadioButton jTEstado;
    private com.toedter.calendar.JDateChooser jTFecha;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiarFormulario() {

        jTDocumento.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jTFecha.setDate(null);
        jTEstado.setSelected(false);
        jTDocumento.setEditable(true);
        jTEstado.setEnabled(true);
    }
}
