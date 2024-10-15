package proyectotransversal_gp9.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyectotransversal_gp9.modelo.*;
import proyectotransversal_gp9.persistencia.*;
/**
 *
 * @author ACER
 */
public class FormularioInscripcionView extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
    
    public FormularioInscripcionView() {
        initComponents();
        
        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>)aData.listarAlumno();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        
        cargaAlumnos();
        armarCabeceraTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_alumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rb_materiasinscriptas = new javax.swing.JRadioButton();
        rb_materiasnoinscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_materias = new javax.swing.JTable();
        b_inscribir = new javax.swing.JButton();
        b_anular = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Inscripcion");
        jLabel1.setToolTipText("frf");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione un alumno:");

        cb_alumno.setBackground(new java.awt.Color(204, 204, 204));
        cb_alumno.setForeground(new java.awt.Color(0, 0, 0));
        cb_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_alumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Materias");

        rb_materiasinscriptas.setBackground(new java.awt.Color(0, 153, 51));
        rb_materiasinscriptas.setForeground(new java.awt.Color(0, 0, 0));
        rb_materiasinscriptas.setText("Materias Inscriptas");
        rb_materiasinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_materiasinscriptasActionPerformed(evt);
            }
        });

        rb_materiasnoinscriptas.setBackground(new java.awt.Color(0, 153, 51));
        rb_materiasnoinscriptas.setForeground(new java.awt.Color(0, 0, 0));
        rb_materiasnoinscriptas.setText("Materias no inscriptas");

        t_materias.setBackground(new java.awt.Color(204, 204, 204));
        t_materias.setForeground(new java.awt.Color(0, 0, 0));
        t_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t_materias.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(t_materias);

        b_inscribir.setBackground(new java.awt.Color(204, 204, 204));
        b_inscribir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_inscribir.setForeground(new java.awt.Color(0, 0, 0));
        b_inscribir.setText("Inscribir");
        b_inscribir.setEnabled(false);
        b_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_inscribirActionPerformed(evt);
            }
        });

        b_anular.setBackground(new java.awt.Color(204, 204, 204));
        b_anular.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_anular.setForeground(new java.awt.Color(0, 0, 0));
        b_anular.setText("Anular Inscripcion");
        b_anular.setEnabled(false);
        b_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_anularActionPerformed(evt);
            }
        });

        b_salir.setBackground(new java.awt.Color(204, 204, 204));
        b_salir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_salir.setForeground(new java.awt.Color(0, 0, 0));
        b_salir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(rb_materiasinscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb_materiasnoinscriptas)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(b_inscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_anular)
                .addGap(99, 99, 99)
                .addComponent(b_salir)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_materiasinscriptas)
                    .addComponent(rb_materiasnoinscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_inscribir)
                    .addComponent(b_anular)
                    .addComponent(b_salir))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_materiasinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_materiasinscriptasActionPerformed
        borrarFilaTabla();
        rb_materiasnoinscriptas.setSelected(false);
        cargaDatosInscriptas();
        b_anular.setEnabled(true);
        b_inscribir.setEnabled(false);
        
    }//GEN-LAST:event_rb_materiasinscriptasActionPerformed

    private void cb_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_alumnoActionPerformed
        borrarFilaTabla();
        rb_materiasinscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        b_anular.setEnabled(false);
        b_inscribir.setEnabled(true);
    }//GEN-LAST:event_cb_alumnoActionPerformed

    private void b_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_inscribirActionPerformed
        int filaSeleccionada = t_materias.getSelectedRow();
        if(filaSeleccionada != -1){
            Alumno a = (Alumno)cb_alumno.getSelectedItem();
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String)modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer)modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio, true);
            
            Inscripcion i= new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_b_inscribirActionPerformed

    private void b_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_anularActionPerformed
        int filaSeleccionada = t_materias.getSelectedRow();
        if(filaSeleccionada != 1){
            Alumno a = (Alumno)cb_alumno.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
        
    }//GEN-LAST:event_b_anularActionPerformed

    
    
    private void cargaAlumnos(){
        for(Alumno item: listaA){
            cb_alumno.addItem(item);
        }
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        t_materias.setModel(modelo);
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargaDatosNoInscriptas(){
        //borrarFilasTabla();
        Alumno selec = (Alumno) cb_alumno.getSelectedItem();
        listaM = (ArrayList) inscData.ObtenerMateriasNoCursadas(selec.getIdAlumno());
        for (Materia m: listaM){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
    
    private void cargaDatosInscriptas(){
        //borrarFilasTabla();
        Alumno selec = (Alumno) cb_alumno.getSelectedItem();
        List <Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m: lista){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_anular;
    private javax.swing.JButton b_inscribir;
    private javax.swing.JButton b_salir;
    private javax.swing.JComboBox<Alumno> cb_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_materiasinscriptas;
    private javax.swing.JRadioButton rb_materiasnoinscriptas;
    private javax.swing.JTable t_materias;
    // End of variables declaration//GEN-END:variables
}
