
package view;

public class MenuPrincipal extends javax.swing.JFrame {

  
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnPacientes = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnInfraestructura = new javax.swing.JButton();
        btnRecaudacion = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnFarmacia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("BIENVENIDOS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Pacientes");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 80, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Registro");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 60, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("doctores");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 80, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Infraestructura");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 90, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Recaudacion");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 70, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("Empleados");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 80, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Farmacia");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 70, 20));

        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pacientes.png"))); // NOI18N
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 80));

        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/registro.png"))); // NOI18N
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 50, 50));

        btnDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/doctor.png"))); // NOI18N
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 80, 70));

        btnInfraestructura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infraestructura.png"))); // NOI18N
        btnInfraestructura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfraestructuraActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfraestructura, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 60, 70));

        btnRecaudacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/recaudacion.png"))); // NOI18N
        btnRecaudacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecaudacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecaudacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 60, 70));

        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/empleados.png"))); // NOI18N
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, 70));

        btnFarmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/farmacia.png"))); // NOI18N
        btnFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmaciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFarmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 80, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        this.dispose();
        new Registro().show();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        this.dispose();
        new Paciente().show();
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
       this.dispose();
        new Doctores().show();
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnInfraestructuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfraestructuraActionPerformed
        this.dispose();
        new Infraestructura().show();
    }//GEN-LAST:event_btnInfraestructuraActionPerformed

    private void btnRecaudacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecaudacionActionPerformed
        this.dispose();
        new Recaudacion().show();
    }//GEN-LAST:event_btnRecaudacionActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        this.dispose();
        new Empleado().show();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmaciaActionPerformed
        this.dispose();
        new Farmacia().show();
    }//GEN-LAST:event_btnFarmaciaActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnFarmacia;
    private javax.swing.JButton btnInfraestructura;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnRecaudacion;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
