/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.vista;
import javax.swing.JOptionPane;
import seguridad.dominio.Modulos;
import seguridad.datos.ModulosDAO;

/**
/**
 *
 * @author Herbert Leonel Dominguez Chavez 15/02/2021
 */
public class Mantenimiento_Modulos extends javax.swing.JInternalFrame {
        int codigobloqueado, bloqueoactualizar=0;
    /**
     * Creates new form Mantenimiento_Modulos
     */
    public Mantenimiento_Modulos() {
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

        txt_Codigo_Modulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre_Modulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Descripcion_Modulo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txt_Estado_Modulo = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setEnabled(false);
        setVisible(true);

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("DESCRIPCIÓN:");

        txt_Descripcion_Modulo.setColumns(20);
        txt_Descripcion_Modulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Descripcion_Modulo.setRows(5);
        txt_Descripcion_Modulo.setAutoscrolls(false);
        jScrollPane2.setViewportView(txt_Descripcion_Modulo);

        jLabel4.setText("ESTADO:");

        txt_Estado_Modulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "1", "0" }));

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("CODIGO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Nombre_Modulo, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(txt_Codigo_Modulo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Estado_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(jLabel1)
                    .addComponent(txt_Codigo_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nombre_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_actualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Estado_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
int valor;
int valorbuscado=Integer.parseInt(txt_Codigo_Modulo.getText());
String validarCodigo, validarNombre, validarDescripcion, validarEstado;

        if (Integer.parseInt(txt_Codigo_Modulo.getText())>=0) {
            if (Integer.parseInt(txt_Codigo_Modulo.getText())>0) {
        ModulosDAO moduloDAO = new ModulosDAO();
        Modulos moduloConsultar = new Modulos();
        moduloConsultar.setCodigo_modulo(valorbuscado);
        moduloConsultar=moduloDAO.query(moduloConsultar);
        
        validarCodigo=String.valueOf(moduloConsultar.getCodigo_modulo());
        validarNombre=moduloConsultar.getNombre_modulo();
        validarDescripcion=moduloConsultar.getDescripcion_modulo();
        validarEstado=moduloConsultar.getEstado_modulo();
        
                if (validarNombre!=null||validarDescripcion!=null||validarEstado!=null||validarCodigo!=null) {
                    txt_Nombre_Modulo.setText(moduloConsultar.getNombre_modulo());
                    txt_Descripcion_Modulo.setText(moduloConsultar.getDescripcion_modulo()); 
                    valor=Integer.parseInt(moduloConsultar.getEstado_modulo());
                     bloqueoactualizar=1;
                if (valor==0) {
                valor=2;
                txt_Estado_Modulo.setSelectedIndex(valor);
                              }   else{
                    txt_Estado_Modulo.setSelectedIndex(valor);
                                      }  
            }else{
                    JOptionPane.showMessageDialog(null, "Modulo no encontrado");
                 }
            }else{
                JOptionPane.showMessageDialog(null, "Codigo no puede ser 0");//Si no lo encuentra envia un mensaje de error
                 }
            }else{
            JOptionPane.showMessageDialog(null, "Modulo no puede ser menor o igual a 0");//Si no lo encuentra envia un mensaje de error
                 }  
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if (txt_Estado_Modulo.getSelectedItem().toString()!="Seleccionar..."||txt_Codigo_Modulo.getText().length()!=0
            ||txt_Nombre_Modulo.getText().length()!=0||txt_Descripcion_Modulo.getText().length()!=0){
            ModulosDAO modulosDAO = new ModulosDAO();
            Modulos moduloInsertar = new Modulos();
            moduloInsertar.setCodigo_modulo(Integer.parseInt(txt_Codigo_Modulo.getText()));
            moduloInsertar.setNombre_modulo(txt_Nombre_Modulo.getText());
            moduloInsertar.setDescripcion_modulo(txt_Descripcion_Modulo.getText());
            moduloInsertar.setEstado_modulo(txt_Estado_Modulo.getSelectedItem().toString());
            modulosDAO.insert(moduloInsertar);
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if (bloqueoactualizar==1) {
        if (txt_Estado_Modulo.getSelectedItem().toString()!="Seleccionar..."||txt_Codigo_Modulo.getText().length()!=0
            ||txt_Nombre_Modulo.getText().length()!=0||txt_Descripcion_Modulo.getText().length()!=0){
         ModulosDAO modulosDAO = new ModulosDAO();
        Modulos moduloActualizar = new Modulos();
        moduloActualizar.setCodigo_modulo(Integer.parseInt(txt_Codigo_Modulo.getText()));
        moduloActualizar.setNombre_modulo(txt_Nombre_Modulo.getText());
        moduloActualizar.setDescripcion_modulo(txt_Descripcion_Modulo.getText());
        moduloActualizar.setEstado_modulo(txt_Estado_Modulo.getSelectedItem().toString());
        modulosDAO.update(moduloActualizar);   
        bloqueoactualizar=0;
            }
        }else 
        {
            JOptionPane.showMessageDialog(null, "Debe de buscar el codigo antes de actualizar");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        ModulosDAO modulosDAO = new ModulosDAO();
        Modulos moduloEliminar = new Modulos();
        moduloEliminar.setCodigo_modulo(Integer.parseInt(txt_Codigo_Modulo.getText()));
        modulosDAO.delete(moduloEliminar);
    }//GEN-LAST:event_btn_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_agregar;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txt_Codigo_Modulo;
    public javax.swing.JTextArea txt_Descripcion_Modulo;
    public javax.swing.JComboBox<String> txt_Estado_Modulo;
    public javax.swing.JTextField txt_Nombre_Modulo;
    // End of variables declaration//GEN-END:variables

    public int getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
