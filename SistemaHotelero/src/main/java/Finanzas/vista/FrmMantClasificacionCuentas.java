/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finanzas.vista;

import Finanzas.dominio.ClasificacionCuenta;
import java.io.File;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import seguridad.datos.BitacoraDao;
import seguridad.dominio.Bitacora;
import seguridad.vista.GenerarPermisos;
import seguridad.vista.Login;
import seguridad.vista.Mantenimiento_Perfil;

/**
 *
 * @author Diego Vásquez
 */
public class FrmMantClasificacionCuentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMantClasificacionCuentas
     */
    public FrmMantClasificacionCuentas() {
        initComponents();
        cargarTabla();
        habilitarAcciones();
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
        JTxtCodigo = new javax.swing.JTextField();
        JTxtClasificacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BtnIng = new javax.swing.JButton();
        BtnMod = new javax.swing.JButton();
        BtnElim = new javax.swing.JButton();
        BtnBus = new javax.swing.JButton();
        JBtnAyuda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTxtDescripcion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableClasificacion = new javax.swing.JTable();

        setClosable(true);
        setTitle("Mantenimiento de Clasificación de Cuentas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Clasificación de Cuenta"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Código de Clasificación:");

        jLabel2.setText("Clasificación de Cuenta:");

        jLabel3.setText("Descripción de la Cuenta:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnIng.setText("Ingresar");
        BtnIng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        BtnMod.setText("Modificar");
        BtnMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        BtnElim.setText("Eliminar");
        BtnElim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        BtnBus.setText("Buscar");
        BtnBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusActionPerformed(evt);
            }
        });

        JBtnAyuda.setText("?");
        JBtnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIng)
                    .addComponent(BtnElim)
                    .addComponent(BtnMod)
                    .addComponent(BtnBus)
                    .addComponent(JBtnAyuda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTxtDescripcion.setColumns(20);
        JTxtDescripcion.setRows(5);
        jScrollPane2.setViewportView(JTxtDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTxtClasificacion)
                            .addComponent(JTxtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTableClasificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Clasificación", "Clasificación de Cuenta", "Descripción de la Cuenta"
            }
        ));
        JTableClasificacion.setToolTipText("");
        jScrollPane1.setViewportView(JTableClasificacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void habilitarAcciones() {

        var codigoAplicacion = 1000;
        var usuario = Login.usuarioFianzas;

        BtnIng.setEnabled(false);
        BtnMod.setEnabled(false);
        BtnElim.setEnabled(false);
        BtnBus.setEnabled(false);

        GenerarPermisos permisos = new GenerarPermisos();

        String[] permisosApp = new String[5];

        for (int i = 0; i < 5; i++) {
            permisosApp[i] = permisos.getAccionesAplicacion(codigoAplicacion, usuario)[i];
        }

        if (permisosApp[0].equals("1")) {
            BtnIng.setEnabled(true);
        }
        if (permisosApp[1].equals("1")) {
            BtnBus.setEnabled(true);
        }
        if (permisosApp[2].equals("1")) {
            BtnMod.setEnabled(true);
        }
        if (permisosApp[3].equals("1")) {
            BtnElim.setEnabled(true);
        }
    }

    private void cargarTabla() {

        ClasificacionCuenta objClasificarCuenta = new ClasificacionCuenta();

        objClasificarCuenta.getTablaRegistros();

        int contI = 0;
        contI = objClasificarCuenta.getTablaRegistros().length;

        String[][] matrixData = new String[contI][3];

        for (int i = 0; i < contI; i++) {
            for (int j = 0; j < 3; j++) {
                matrixData[i][j] = objClasificarCuenta.getTablaRegistros()[i][j];
            }
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) JTableClasificacion.getModel();
        modeloTabla.setRowCount(contI);
        modeloTabla.setColumnCount(3);

        for (int i = 0; i < contI; i++) {
            for (int j = 0; j < 3; j++) {
                JTableClasificacion.setValueAt(matrixData[i][j], i, j);;
            }
        }
    }

    BitacoraDao BitacoraDAO = new BitacoraDao();
    Bitacora AInsertar = new Bitacora();

    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed
        ClasificacionCuenta objClasificarCuenta = new ClasificacionCuenta();

        var codigoClasificacion = JTxtCodigo.getText();
        var clasificacionCuenta = JTxtClasificacion.getText();
        var descripcionCuenta = JTxtDescripcion.getText();

        objClasificarCuenta.setCodigoClasificacion(codigoClasificacion);
        objClasificarCuenta.setClasificacionCuenta(clasificacionCuenta);
        objClasificarCuenta.setDescripcionClasificacion(descripcionCuenta);

        objClasificarCuenta.Insertar(objClasificarCuenta);
        
        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Insertar");
        AInsertar.setCodigoAplicacion("1000");
        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cargarTabla();
        JTxtCodigo.setText("");
        JTxtClasificacion.setText("");
        JTxtDescripcion.setText("");
        JTxtCodigo.requestFocus();

    }//GEN-LAST:event_BtnIngActionPerformed

    private void BtnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusActionPerformed
        ClasificacionCuenta objClasificarCuenta = new ClasificacionCuenta();

        var codigoClasificacion = JTxtCodigo.getText();

        objClasificarCuenta.setCodigoClasificacion(codigoClasificacion);

        objClasificarCuenta.Buscar(objClasificarCuenta);

        JTxtCodigo.setText(objClasificarCuenta.Buscar(objClasificarCuenta)[0]);
        JTxtClasificacion.setText(objClasificarCuenta.Buscar(objClasificarCuenta)[1]);
        JTxtDescripcion.setText(objClasificarCuenta.Buscar(objClasificarCuenta)[2]);
        
        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Búsqueda");
        AInsertar.setCodigoAplicacion("1000");
        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cargarTabla();


    }//GEN-LAST:event_BtnBusActionPerformed

    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
        ClasificacionCuenta objClasificarCuenta = new ClasificacionCuenta();

        var codigoClasificacion = JTxtCodigo.getText();
        var clasificacionCuenta = JTxtClasificacion.getText();
        var descripcionCuenta = JTxtDescripcion.getText();

        objClasificarCuenta.setCodigoClasificacion(codigoClasificacion);
        objClasificarCuenta.setClasificacionCuenta(clasificacionCuenta);
        objClasificarCuenta.setDescripcionClasificacion(descripcionCuenta);

        objClasificarCuenta.Actualizar(objClasificarCuenta);
        
        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Actualizar");
        AInsertar.setCodigoAplicacion("1000");
        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cargarTabla();
    }//GEN-LAST:event_BtnModActionPerformed

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed
        ClasificacionCuenta objClasificarCuenta = new ClasificacionCuenta();

        var codigoClasificacion = JTxtCodigo.getText();

        objClasificarCuenta.setCodigoClasificacion(codigoClasificacion);

        objClasificarCuenta.Eliminar(objClasificarCuenta);
        
        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Eliminar");
        AInsertar.setCodigoAplicacion("1000");
        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cargarTabla();
    }//GEN-LAST:event_BtnElimActionPerformed

    private void JBtnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnAyudaActionPerformed
        try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\AyudaClasificacion")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Finanzas\\ayudas\\AyudaClasificacion.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_JBtnAyudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBus;
    private javax.swing.JButton BtnElim;
    private javax.swing.JButton BtnIng;
    private javax.swing.JButton BtnMod;
    private javax.swing.JButton JBtnAyuda;
    private javax.swing.JTable JTableClasificacion;
    private javax.swing.JTextField JTxtClasificacion;
    private javax.swing.JTextField JTxtCodigo;
    private javax.swing.JTextArea JTxtDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
