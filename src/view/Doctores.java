
package view;

import dao.PrevisionDAO;
import dao.TipoUsuarioDAO;
import dto.ExportarDTO;
import dto.PrevisionDTO;
import dto.TipoUsuarioDTO;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import java.text.MessageFormat;
import java.io.IOException;
import java.sql.Connection;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Doctores extends javax.swing.JFrame {

    ExportarDTO obj;

    public Doctores() {
        initComponents();
        previsionDAO = new PrevisionDAO();
        setLocationRelativeTo(null);
        
//        if (userDAO.listarUsuarios().isEmpty()) {
//
//            String[] botones = {"Aceptar", "Cancelar"};
//
//            int eleccion = JOptionPane.showOptionDialog(this, "Lista Vacia, ¿Quieres Agregar Una Autamaticamente?", "CONFIRMAR LISTA AUTOMATICA", 0, 0, null, botones, this);
//
//            if (eleccion == JOptionPane.YES_OPTION) {
//
//                userDAO.agregarListaDeUsuarios();
//
//                JOptionPane.showMessageDialog(this, "¡Lista Agregada Automaticamente!");
//
//            }
//        }
        
        mostrarCombobox();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        cmbPrevision = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorDoctores = new javax.swing.JTable();
        BtnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DOCTORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 6, -1, -1));

        jLabel2.setText("NOMBRE: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 52, -1, -1));

        jLabel3.setText("APELLIDO: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 80, -1, -1));

        jLabel4.setText("CARGO: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 108, -1, -1));

        jLabel5.setText("DIECCION:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 136, -1, -1));

        jLabel6.setText("HORAS TRABAJADAS: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 164, -1, -1));

        jLabel7.setText("HORAS EXTRAS: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 192, -1, -1));

        jLabel8.setText("SUELDO BASE: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 220, -1, -1));

        jLabel9.setText("PREVICION:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 49, 490, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 77, 490, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 490, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 133, 490, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 430, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 189, 460, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 217, 470, -1));

        cmbPrevision.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPrevision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbPrevision.setSelectedIndex(-1);
        getContentPane().add(cmbPrevision, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, -1));

        visorDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(visorDoctores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 580, 160));

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modificar.png"))); // NOI18N
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exel.png"))); // NOI18N
        btnExportar.setText("EXPORTAR EXCEL");
        btnExportar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exel.png"))); // NOI18N
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        BtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imprimir.png"))); // NOI18N
        BtnImprimir.setText("IMPRIMIR");
        BtnImprimir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imprimir.png"))); // NOI18N
        BtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/volver.png"))); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/volver.png"))); // NOI18N
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 507, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       /*
        int fila = jTableDoctores.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");        // TODO add your handling code here:
        */
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try {
            obj = new ExportarDTO();
            obj.exportarExcel(visorDoctores);
        } catch (IOException ex) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

    private void BtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirActionPerformed
      /*
        String reporte = JOptionPane.showInputDialog(null, "que reporte es");
        try {
            MessageFormat headFormat = new MessageFormat("Reporte de" + reporte);
            MessafeFormat footerFormat = new MessageFormat("reporte Registro de Deuda");
            jTableRegistro.print(JTable.PrintMode.Fit_WIDTH, headFormat, footerFormat);
        } catch (PrinterExprecion ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
        */
    }//GEN-LAST:event_BtnImprimirActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
       /*
        PreparedStatement ps = null;
        try {
            Conexion objCon = new Conexion();        // TODO add your handling code here:
        */
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctores().setVisible(true);
              
                
            }
            
           
        });
    }
    
    private void mostrarCombobox() {

        PrevisionDAO previsionDAO = new PrevisionDAO();
        ArrayList<PrevisionDTO> previsiones = previsionDAO.readAll();

        cmbPrevision.removeAllItems();
        
        cmbPrevision.addItem("SELECCIONE PREVISION");

        for (PrevisionDTO p : previsiones) {

            cmbPrevision.addItem(p.getTipo().toUpperCase());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbPrevision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable visorDoctores;
    // End of variables declaration//GEN-END:variables
    private PrevisionDAO previsionDAO;
}
