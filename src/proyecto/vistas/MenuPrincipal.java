/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.vistas;
import proyecto.Modelo;
import proyecto.Controlador;
import proyecto.vistas.AcercaDe;

/**
 *
 * @author PC_16
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    Controlador contr;
    Modelo model;
    public MenuPrincipal() {
        initComponents();
        model = new Modelo();
        contr = new Controlador(this,model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuBoton = new javax.swing.JMenu();
        btnCrearVector = new javax.swing.JMenuItem();
        btnIngresarDatos = new javax.swing.JMenuItem();
        btnMostrarMayor = new javax.swing.JMenuItem();
        btnMostrarListado = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnInstructivo = new javax.swing.JMenuItem();
        btnAcercaDe = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuBoton.setText("Opciones");

        btnCrearVector.setText("Crear Vector");
        MenuBoton.add(btnCrearVector);

        btnIngresarDatos.setText("Ingresar datos");
        btnIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDatosActionPerformed(evt);
            }
        });
        MenuBoton.add(btnIngresarDatos);

        btnMostrarMayor.setText("Mostrar Mayor");
        MenuBoton.add(btnMostrarMayor);

        btnMostrarListado.setText("Mostrar listado");
        btnMostrarListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListadoActionPerformed(evt);
            }
        });
        MenuBoton.add(btnMostrarListado);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        MenuBoton.add(btnSalir);

        jMenuBar1.add(MenuBoton);

        jMenu2.setText("Ayuda");

        btnInstructivo.setText("Instructivo");
        btnInstructivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructivoActionPerformed(evt);
            }
        });
        jMenu2.add(btnInstructivo);

        btnAcercaDe.setText("Acerca de:");
        jMenu2.add(btnAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInstructivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstructivoActionPerformed

    private void btnIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarDatosActionPerformed

    private void btnMostrarListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarListadoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuBoton;
    public javax.swing.JMenuItem btnAcercaDe;
    public javax.swing.JMenuItem btnCrearVector;
    public javax.swing.JMenuItem btnIngresarDatos;
    public javax.swing.JMenuItem btnInstructivo;
    public javax.swing.JMenuItem btnMostrarListado;
    public javax.swing.JMenuItem btnMostrarMayor;
    public javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
