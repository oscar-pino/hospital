package view;

import dto.UsuarioDTO;
import dao.Conexion;
import dao.TipoUsuarioDAO;
import dao.UsuarioDAO;
import dto.ExportarDTO;
import dto.TipoUsuarioDTO;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Registro extends javax.swing.JFrame {

    public Registro() {

        initComponents();
        userDAO = new UsuarioDAO();
        tipoDAO = new TipoUsuarioDAO();
        contrasena1 = "";
        contrasena2 = "";
        iniciando = true;
        
        setLocationRelativeTo(null);        

        if (userDAO.listarUsuarios().isEmpty()) {

            String[] botones = {"Aceptar", "Cancelar"};

            int eleccion = JOptionPane.showOptionDialog(this, "Lista Vacia, ¿Quieres Agregar Una Autamaticamente?", "CONFIRMAR LISTA AUTOMATICA", 0, 0, null, botones, this);

            if (eleccion == JOptionPane.YES_OPTION) {

                userDAO.agregarListaDeUsuarios();

                JOptionPane.showMessageDialog(this, "¡Lista Agregada Automaticamente!");

            }
        }

        mostrarGrilla();
        cambiarEstadoBotones(false);
        mostrarCombobox();
        rolSeleccionado = 0;
        usuarioSeleccionado = 0;

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtRun = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        txtContrasenaConf = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorUsuarios = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("FORMULARIO DE REGISTRO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 6, -1, 64));

        jLabel1.setText("NOMBRE: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 79, -1, -1));

        jLabel2.setText("APELLIDO: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 107, -1, -1));

        jLabel3.setText("RUN: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 135, -1, -1));

        jLabel4.setText("TELEFONO: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 163, -1, -1));

        jLabel5.setText("CORREO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 191, -1, -1));

        jLabel6.setText("DIRECCION:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 216, -1, -1));

        jLabel7.setText("USUARIO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 247, -1, -1));

        jLabel8.setText("CONTRASEÑA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 275, -1, -1));

        jLabel9.setText("CONFIRMAR CONTRASEÑA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 303, -1, -1));

        txtNombre.setName(""); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 76, 439, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 104, 439, -1));
        getContentPane().add(txtRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 132, 439, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 160, 439, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 188, 439, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 216, 439, -1));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 244, 439, -1));

        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyReleased(evt);
            }
        });
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 440, -1));

        txtContrasenaConf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaConfFocusLost(evt);
            }
        });
        txtContrasenaConf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaConfKeyReleased(evt);
            }
        });
        getContentPane().add(txtContrasenaConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 370, -1));

        visorUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        visorUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visorUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(visorUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 780, 130));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modificar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exel.png"))); // NOI18N
        btnExportar.setText("EXPORTAR EXCEL");
        btnExportar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exel.png"))); // NOI18N
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 170, -1));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imprimir.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imprimir.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        jLabel12.setText("TIPO USUARIO:");
        jLabel12.setPreferredSize(new java.awt.Dimension(110, 16));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        cmbRol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbRol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRolItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 180, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/volver.png"))); // NOI18N
        btnVolver.setLabel("VOLVER");
        btnVolver.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/volver.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        
        ExportarDTO exportar;
        
        try{
            this.show(false);
            exportar = new ExportarDTO();
            exportar.exportarExcel(visorUsuarios);
            JOptionPane.showInternalMessageDialog(null, "¡Exportacion Exitosa!");
            this.show(true);
    }catch (IOException ex) {
        JOptionPane.showInternalMessageDialog(this, "¡Error Al Exportar!\n"+ex.getMessage());
    }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
              
        this.show(false); 
        
        String reporte = JOptionPane.showInputDialog("Ingrese Titulo Para Reporte Generado");       
        
        try {
            
            //mensaje de encabezado
            MessageFormat headerFormat = new MessageFormat("Reporte de: " + reporte);
            //mensaje de pie de pagina
            MessageFormat footerFormat = new MessageFormat("Reporte de asignaturas");
            //imprimir
            visorUsuarios.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
            
            JOptionPane.showMessageDialog(this, "¡Se Ha Imprimido, Satisfactoriamente!");
            
            this.show(true); 
            
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(this, "¡Error Al Imprimir!\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        llenarEntidadUsuario();

        if (!userDAO.existeUsername(user.getUsername())) {

            if (!camposVacios()) {

                if (userDAO.crearUsuario(user) != null) {
                    JOptionPane.showMessageDialog(this, "¡Registro Guardado Exitosamente!");

                    vaciarCampos();
                    mostrarGrilla();

                } else {
                    JOptionPane.showMessageDialog(this, "¡Registro No Se Ha Insertado!");
                }

            } else {
                JOptionPane.showMessageDialog(this, "¡Debe Completar Todos Los Campos!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "El Username Ingresado, Ya Existe En Nuestro Sistema, Pruebe Con Uno Distinto!");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        llenarEntidadUsuario();
        user.setIdUsuario(usuarioSeleccionado);
        UsuarioDTO capturado = userDAO.listarUsuarioPorID(usuarioSeleccionado);
        ArrayList<UsuarioDTO> usuarios = userDAO.listarUsuarios();
        ArrayList<String> nombres = quitarUsername(capturado.getUsername());       

            if (!camposVacios()) {

                if (!userDAO.existeUsername(user.getUsername())) {

                    JOptionPane.showMessageDialog(this, "¡No Puede Cambiar Un Username, Por Uno Que Ya Existe En El Sistema!");

                } else {

                    if (userDAO.actualizarUsuario(user) != null) {

                        JOptionPane.showMessageDialog(this, "¡Usuario Con ID: " + usuarioSeleccionado + ", Actualizado Correctamente");
                        vaciarCampos();
                        mostrarGrilla();

                    } else {
                        JOptionPane.showMessageDialog(this, "¡Usuario Con ID: " + usuarioSeleccionado + ", No Ha Sido Modificado");
                    }
                }

            } else {

                JOptionPane.showMessageDialog(this, "¡Debe Completar Todos Los Campos!");
            }
    }//GEN-LAST:event_btnModificarActionPerformed


    private void visorUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visorUsuariosMouseClicked

        int fila = visorUsuarios.rowAtPoint(evt.getPoint());

        usuarioSeleccionado = Integer.parseInt(String.valueOf(visorUsuarios.getValueAt(fila, 0)));

        if (usuarioSeleccionado != 0) {
            mostrarUsuario(usuarioSeleccionado);
            btnEliminar.setEnabled(true);
            btnModificar.setEnabled(true);
            btnGuardar.setEnabled(true);
        }

    }//GEN-LAST:event_visorUsuariosMouseClicked

    private void txtContrasenaConfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaConfKeyReleased

        if (contrasenasIguales() & rolSeleccionado != 0)
            cambiarEstadoBotones(true);
        else
            cambiarEstadoBotones(false);
    }//GEN-LAST:event_txtContrasenaConfKeyReleased

    private void txtContrasenaConfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaConfFocusLost

        if (!String.valueOf(txtContrasena.getPassword()).isEmpty() & !String.valueOf(txtContrasenaConf.getPassword()).isEmpty() & !contrasenasIguales()) {
            JOptionPane.showMessageDialog(this, "Asegurese De Que Coincidan Ambas Contraseñas");
        }
    }//GEN-LAST:event_txtContrasenaConfFocusLost

    private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyReleased

        if (contrasenasIguales() & rolSeleccionado != 0) {
            cambiarEstadoBotones(true);
        } else {
            cambiarEstadoBotones(false);
        }

    }//GEN-LAST:event_txtContrasenaKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (usuarioSeleccionado != 0) {

            if (userDAO.listarUsuarioPorID(usuarioSeleccionado) == null) {
                JOptionPane.showMessageDialog(this, "Usuario Con ID: " + usuarioSeleccionado + ", No Existe En El Sistema!");
            } else {

                if (userDAO.eliminarUsuario(usuarioSeleccionado) == Integer.MIN_VALUE) {
                    JOptionPane.showMessageDialog(this, "Usuario Con ID: " + usuarioSeleccionado + "No Se Ha Eliminado!");
                } else {
                    JOptionPane.showMessageDialog(this, "¡Usuario Con ID: " + usuarioSeleccionado + ", Eliminado Correctamente");
                    vaciarCampos();
                    mostrarGrilla();
                }
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salir();
    }//GEN-LAST:event_formWindowClosing

    private void cmbRolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRolItemStateChanged
        
        if (evt.getStateChange() == ItemEvent.SELECTED & !iniciando) {

            if (cmbRol.getSelectedIndex() != 0 & contrasenasIguales() & !camposVacios()) {

                rolSeleccionado = cmbRol.getSelectedIndex();
                cambiarEstadoBotones(true);
            } else if (cmbRol.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "¡Elija Una Opcion Valida!");
                cambiarEstadoBotones(false);
            }
        }

        iniciando = false;
    }//GEN-LAST:event_cmbRolItemStateChanged

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        username = txtUsername.getText();
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

        existeUsername = userDAO.existeUsername(txtUsername.getText());
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       principal = new MenuPrincipal();
       this.dispose();
       principal.show();
    }//GEN-LAST:event_btnVolverActionPerformed
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    private void mostrarGrilla() {

        DefaultTableModel model;
        ArrayList<UsuarioDTO> usuarios;
        String[] datos;

        model = new DefaultTableModel();
        usuarios = userDAO.listarUsuarios();

        if (usuarios != null) {
            datos = new String[8];

            model.addColumn("id");
            model.addColumn("username");
            model.addColumn("run");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("direccion");
            model.addColumn("telefono");
            model.addColumn("correo");
            visorUsuarios.setModel(model);

            for (UsuarioDTO u : usuarios) {

                datos[0] = String.valueOf(u.getIdUsuario());
                datos[1] = u.getUsername();
                datos[2] = u.getRun();
                datos[3] = u.getNombre();
                datos[4] = u.getApellido();
                datos[5] = u.getDireccion();
                datos[6] = u.getTelefono();
                datos[7] = u.getCorreo();

                model.addRow(datos);
            }
        }

    }

    private void mostrarCombobox() {

        TipoUsuarioDAO tipoDAO = new TipoUsuarioDAO();
        ArrayList<TipoUsuarioDTO> tipos = tipoDAO.listarTipos();

        cmbRol.removeAllItems();
        
        cmbRol.addItem("SELECCIONE ROL");

        for (TipoUsuarioDTO tu : tipos) {

            cmbRol.addItem(tu.getRol().toUpperCase());
        }
    }

    public void mostrarUsuario(int idUsuario) {

        UsuarioDTO rec = userDAO.listarUsuarioPorID(usuarioSeleccionado);

        txtNombre.setText(rec.getNombre());
        txtApellido.setText(rec.getApellido());
        txtRun.setText(rec.getRun());
        txtTelefono.setText(rec.getTelefono());
        txtCorreo.setText(rec.getCorreo());
        txtDireccion.setText(rec.getDireccion());
        txtUsername.setText(rec.getUsername());
        txtContrasena.setText(rec.getContrasena());
        txtContrasenaConf.setText(rec.getConfContrasena());
        cmbRol.setSelectedIndex(rec.getTipoUsuario().getIdTipoUsuario());
    }

    private void vaciarCampos() {

        txtUsername.setText("");
        txtRun.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtContrasena.setText("");
        txtContrasenaConf.setText("");
        contrasena1 = "";
        contrasena2 = "";
        
    }

    private boolean camposVacios() {

        return txtUsername.getText().isEmpty() | txtRun.getText().isEmpty() | txtNombre.getText().isEmpty()
                | txtApellido.getText().isEmpty() | txtDireccion.getText().isEmpty() | String.valueOf(txtContrasena.getPassword()).isEmpty()
                | String.valueOf(txtContrasenaConf.getPassword()).isEmpty() | cmbRol.getSelectedIndex() == 0;
    }

    private void cambiarEstadoBotones(boolean encendido) {

        if (!encendido) {

            btnGuardar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
        } else {
            btnGuardar.setEnabled(true);
        }
    }

    private boolean contrasenasIguales() {

        contrasena1 = String.valueOf(txtContrasena.getPassword());
        contrasena2 = String.valueOf(txtContrasenaConf.getPassword());

        return contrasena1.equals(contrasena2);
    }

    private void llenarEntidadUsuario() {

        user = new UsuarioDTO();
        user.setUsername(txtUsername.getText());
        user.setRun(txtRun.getText());
        user.setNombre(txtNombre.getText());
        user.setApellido(txtApellido.getText());
        user.setDireccion(txtDireccion.getText());
        user.setTelefono(txtTelefono.getText());
        user.setCorreo(txtCorreo.getText());
        user.setContrasena(String.valueOf(txtContrasena.getPassword()));
        user.setConfContrasena(String.valueOf(txtContrasenaConf.getPassword()));
        user.setTipoUsuario(new TipoUsuarioDTO(rolSeleccionado));
    }

    private ArrayList<String> quitarUsername(String quitarUsername) {

        ArrayList<String> nombres = userDAO.listarUsernames();
        nombres.remove(quitarUsername);

        return nombres;

    }

    private void salir() {

        String[] botones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea Cerrar La Aplicacion?", "CONFIRMAR CIERRE", 0, 0, null, botones, this);

        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {

            JOptionPane.showMessageDialog(this, "¡Ha Decidido Cancelar Cierre De Aplicacion!");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JPasswordField txtContrasenaConf;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRun;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTable visorUsuarios;
    // End of variables declaration//GEN-END:variables
    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private UsuarioDTO user;
    private int rolSeleccionado;
    private int usuarioSeleccionado;
    private String contrasena1;
    private String contrasena2;
    private UsuarioDAO userDAO;
    private String username;
    private boolean existeUsername;
    private TipoUsuarioDAO tipoDAO;
    private boolean iniciando;
    private MenuPrincipal principal;
}
