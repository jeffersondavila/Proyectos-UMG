/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finanzas.vista;

import Finanzas.dominio.PeriodoFiscal;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Finanzas.datos.PeriodoFiscalDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import javax.swing.JOptionPane;




/**
 *
 * @author OtakuGT
 */
public class Mantenimiento_PeriodoFiscal extends javax.swing.JInternalFrame {

        
     public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Inicio Periodo Fiscal");
        modelo.addColumn("Fin Periodo Fiscal");
        modelo.addColumn("Estado Periodo Fiscal");
        PeriodoFiscalDAO PerFisDAO = new PeriodoFiscalDAO();
        List<PeriodoFiscal> PerFis = PerFisDAO.select();
        Tabla.setModel(modelo);
        Object[] objeto = new Object[4];
        for (int i = 0; i < PerFis.size(); i++) {
            objeto[0] = PerFis.get(i).getIDPerFis();
            objeto[1] = PerFis.get(i).getInicioAñoPerFis();
            objeto[2] = PerFis.get(i).getFinAñoPerFis();
            objeto[3] = PerFis.get(i).getEstadoPerFis();

            modelo.addRow(objeto);
        }
    }
     
     public void limpiar() {
        txtID.setText("");
        InicioDC.setDate(null);
        FinDC.setDate(null);
        RBPF1.setSelected(false);
        RBPF0.setSelected(false);
        RBPrueba.setSelected(true);
    }
    //Codigo de aplicacion 
     int CodigoAplicacion = 1001;
     
     
    /**
     * Creates new form PeriodoFiscal
     */
    public Mantenimiento_PeriodoFiscal() {
        initComponents();
        llenadoDeTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        InicioDC = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        FinDC = new com.toedter.calendar.JDateChooser();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        RBPF1 = new javax.swing.JRadioButton();
        RBPF0 = new javax.swing.JRadioButton();
        RBPrueba = new javax.swing.JRadioButton();
        BtnModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Periodo Fiscal");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Periodo Fiscal"));
        jPanel1.setToolTipText("");

        jLabel1.setText("ID");

        jLabel2.setText("Inicio");

        jLabel3.setText("Fin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1))
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(InicioDC, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(FinDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(InicioDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(FinDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Periodo Fiscal"));

        buttonGroup1.add(RBPF1);
        RBPF1.setText("Activo");

        buttonGroup1.add(RBPF0);
        RBPF0.setText("Inactivo");

        buttonGroup1.add(RBPrueba);
        RBPrueba.setText("jRadioButton1");
        RBPrueba.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RBPF0)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RBPF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RBPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(RBPF1))
                    .addComponent(RBPrueba))
                .addGap(9, 9, 9)
                .addComponent(RBPF0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        jButton1.setText("?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnModificar)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnAgregar, BtnBuscar, BtnEliminar, BtnModificar});

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        PeriodoFiscal PFInsertar = new PeriodoFiscal();
        PeriodoFiscalDAO PFDAO = new PeriodoFiscalDAO();
        if (txtID.getText().length() != 0 && RBPF1.isSelected() || RBPF0.isSelected()) {
            {
                String Inicio = new SimpleDateFormat("dd/MM/yyyy").format(InicioDC.getDate());
                String Fin = new SimpleDateFormat("dd/MM/yyyy").format(FinDC.getDate());
                PFInsertar.setIDPerFis(Integer.parseInt(txtID.getText()));
                PFInsertar.setInicioAñoPerFis(Inicio);
                PFInsertar.setFinAñoPerFis(Fin);
                if (RBPF1.isSelected()) {
                    PFInsertar.setEstadoPerFis(1);
                }
                if (RBPF0.isSelected()) {
                    PFInsertar.setEstadoPerFis(0);
                }
                {
                    JOptionPane.showMessageDialog(null, "Periodo registrado Exitosamente");
                }
                limpiar();
                PFDAO.insert(PFInsertar);
                llenadoDeTablas();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            llenadoDeTablas();
        }
        llenadoDeTablas();
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        PeriodoFiscal PFMod = new PeriodoFiscal();
        PeriodoFiscalDAO PFDAO = new PeriodoFiscalDAO();
        String Inicio = new SimpleDateFormat("dd/MM/yyyy").format(InicioDC.getDate());
        String Fin = new SimpleDateFormat("dd/MM/yyyy").format(FinDC.getDate());
        
        PFMod.setInicioAñoPerFis(Inicio);
        PFMod.setFinAñoPerFis(Fin);

        if (RBPF1.isSelected()) {
            PFMod.setEstadoPerFis(1);
        }
        if (RBPF0.isSelected()) {
            PFMod.setEstadoPerFis(0);
        }
        PFMod.setIDPerFis(Integer.parseInt(txtID.getText()));
        
        PFDAO.update(PFMod);
        JOptionPane.showMessageDialog(null, "Modificación Exitosa");
        llenadoDeTablas();
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        PeriodoFiscal PFDel = new PeriodoFiscal();
        PeriodoFiscalDAO PFDAO = new PeriodoFiscalDAO();

        PFDel.setIDPerFis(Integer.parseInt(txtID.getText()));
        int salida = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Advertencia de eliminacion",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        System.out.println(salida);
        if (salida == 0) {
            PFDAO.delete(PFDel);
            JOptionPane.showMessageDialog(null, "Año Fiscal Eliminado.");
        }
        else {
            JOptionPane.showMessageDialog(null, "El registro no se ha eliminado");
        }
        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        PeriodoFiscal PFBuscar = new PeriodoFiscal();
        PeriodoFiscalDAO PFDAO = new PeriodoFiscalDAO();
        PFBuscar.setIDPerFis(Integer.parseInt(txtID.getText()));
        
        PFBuscar = PFDAO.query(PFBuscar);
        
        txtID.setText(String.valueOf(PFBuscar.getIDPerFis()));
        String inicio = String.valueOf(PFBuscar.getInicioAñoPerFis());
        SimpleDateFormat modelo = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date iniPF = modelo.parse(inicio);
            InicioDC.setDate(iniPF);
        } catch (ParseException e) {
            e.printStackTrace(System.out);
        }
        String fin = String.valueOf(PFBuscar.getFinAñoPerFis());
        try {
            Date finPF = modelo.parse(fin);
            FinDC.setDate(finPF);
        } catch (ParseException e) {
            e.printStackTrace(System.out);
        }

        if (PFBuscar.getEstadoPerFis() == 1) {
            RBPF1.setSelected(true);
        }
        if (PFBuscar.getEstadoPerFis() == 0) {
            RBPF0.setSelected(true);
        }

        {
            JOptionPane.showMessageDialog(null, "Registro encontrado");
        }
        llenadoDeTablas();
    }//GEN-LAST:event_BtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private com.toedter.calendar.JDateChooser FinDC;
    private com.toedter.calendar.JDateChooser InicioDC;
    private javax.swing.JRadioButton RBPF0;
    private javax.swing.JRadioButton RBPF1;
    private javax.swing.JRadioButton RBPrueba;
    private javax.swing.JTable Tabla;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
