/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadejemplo.accesoADatos.AlumnoData;
import universidadejemplo.entidades.Alumno;

/**
 *
 * @author borch
 */
public class GestionAlumno extends javax.swing.JInternalFrame {

   //  private Alumno alum = new Alumno();
   
    /**
     * Creates new form cargarAlumno
     */
    public GestionAlumno() {
        initComponents();
        this.setSize(360, 380);
        this.setTitle("Sistema de gestión ALUMNOS");
             
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRBestado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTFDni = new javax.swing.JTextField();
        jTFapellido = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jBbuscarAlum = new javax.swing.JButton();
        jBguardarAlum = new javax.swing.JButton();
        jBeliminarAlum = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLidAlumno = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(360, 380));

        jLabel1.setText("Documento:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Estado:");

        jLabel5.setText("Fecha de nacimiento:");

        jBbuscarAlum.setText("Buscar");
        jBbuscarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarAlumActionPerformed(evt);
            }
        });

        jBguardarAlum.setText("Guardar");
        jBguardarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarAlumActionPerformed(evt);
            }
        });

        jBeliminarAlum.setText("Eliminar");
        jBeliminarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarAlumActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Gestión de Alumnos");

        jLidAlumno.setText("ID Alumno : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(71, 71, 71)
                                .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jBbuscarAlum))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLidAlumno)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(jRBestado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(88, 88, 88)
                                .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(88, 88, 88)
                                .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jBeliminarAlum)
                        .addGap(105, 105, 105)
                        .addComponent(jBguardarAlum)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jBbuscarAlum)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLidAlumno)
                    .addComponent(jLabel4)
                    .addComponent(jRBestado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBeliminarAlum)
                    .addComponent(jBguardarAlum))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarAlumActionPerformed
        // TODO add your handling code here:
        int dni;
        String doc =jTFDni.getText();
        
      // Verifica si el campo de texto está vacío  
        if(doc.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Por favor ingrese un DNI valido");
        return;
        }
        try{
      // valor del campo de texto a un entero
            dni=Integer.parseInt(doc);
            if(doc.length()!=8){
                JOptionPane.showMessageDialog(null,"El dni debe tener ocho digitos");
                return;
            }
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El dni debe ser un numero entero");
            return;
        }
     // Debe devolver los datos en los TextField para poder 
     // eliminarlos, ver los datos.
         Alumno estudiante = new AlumnoData().buscarAlumnoPorDni(dni);
         if (estudiante!=null){
          jTFapellido.setText(estudiante.getApellido());
          jTFnombre.setText(estudiante.getNombre());
         
         //devuelve fecha en el Chooser, FALTA PROBAR!!
          LocalDate fechaNacimiento=estudiante.getFechaNacimiento();
          java.util.Date fechaUtil=java.sql.Date.valueOf(fechaNacimiento);
          
          jDateChooser1.setDate(fechaUtil);
        
      // Configurar estado en rbutton    
          jRBestado.setSelected(estudiante.isEstado());
          
      // Configurar ID en el campo Jlabel  
          jLidAlumno.setText("ID Alumno "+ estudiante.getIdAlumno());
     
     // Habilitar el botón "Eliminar" una vez que se encuentra un alumno
          jBeliminarAlum.setEnabled(true);     
        }else{
            JOptionPane.showMessageDialog(null,"No se encontro al alumno");
        }
    }//GEN-LAST:event_jBbuscarAlumActionPerformed

    private void jBguardarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarAlumActionPerformed
        // TODO add your handling code here:
    //Obtengo los datos del formulario:
       int dni = Integer.parseInt(jTFDni.getText());
       String apellido = jTFapellido.getText();
       String nombre = jTFnombre.getText();
       LocalDate fechaNacimiento = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       boolean estado = jRBestado.isSelected();
    
       //obj alumno
       Alumno alumno = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
       //Invoco al metodo para guardar el alumno en la BD. 
       AlumnoData alum = new AlumnoData();
       alum.guardarAlumno(alumno);
       
       // Limpio los campos de texto:
       jTFDni.setText("");
       jTFapellido.setText("");
       jTFnombre.setText("");
       jDateChooser1.setDate(null);
       jRBestado.setSelected(false);
        
        
        
    }//GEN-LAST:event_jBguardarAlumActionPerformed

    
    private void jBeliminarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarAlumActionPerformed
        // TODO add your handling code here:
      String idAlumnoText = jLidAlumno.getText().replace("ID Alumno", "").trim();
      
      if (idAlumnoText.isEmpty()){
              JOptionPane.showMessageDialog(null, "El ID del alumno no es válido.");
        return; 
      }
      
      int idAlumno = Integer.parseInt(idAlumnoText);
      
      AlumnoData alumnoData = new AlumnoData();
      alumnoData.eliminarAlumno(idAlumno);
     
         jTFDni.setText("");
         jTFapellido.setText("");
         jTFnombre.setText("");
         jDateChooser1.setDate(null);
         jRBestado.setSelected(false);
         
      //Desactiva el boton eliminar. 
         jBeliminarAlum.setEnabled(false);
    
    }//GEN-LAST:event_jBeliminarAlumActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarAlum;
    private javax.swing.JButton jBeliminarAlum;
    private javax.swing.JButton jBguardarAlum;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLidAlumno;
    private javax.swing.JRadioButton jRBestado;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFnombre;
    // End of variables declaration//GEN-END:variables
}
