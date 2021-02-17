/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ControladorJPA.ControladorPlanilla;
import Modelo.Planilla;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author PC
 */
public class Planilla_Resultados extends javax.swing.JFrame {

    /**
     * Creates new form Planilla_Resultados
     */
    ControladorPlanilla control = new ControladorPlanilla();
    public Planilla_Resultados() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administracion de torneos de una cancha sintetica");
        //modificamos la fuente de la etiquetas
        Font fuente = new Font("Agency FB", Font.PLAIN, 40);
        Font fuente1 = new Font("Agency FB", Font.PLAIN, 20);
        titulo.setForeground(Color.black);
        titulo.setFont(fuente);
        titulo2.setForeground(Color.black);
        titulo2.setFont(fuente);
        EtiquetaRegistro.setForeground(Color.black);
        EtiquetaRegistro.setFont(fuente1);
        lbEquipoA.setForeground(Color.black);
        lbEquipoA.setFont(fuente1);
        lbEquipoB.setForeground(Color.black);
        lbEquipoB.setFont(fuente1);
        lbObser.setForeground(Color.black);
        lbObser.setFont(fuente1);
        lbanotaciones.setForeground(Color.black);
        lbanotaciones.setFont(fuente1);
        lbJugadorPartidi.setForeground(Color.black);
        lbJugadorPartidi.setFont(fuente1);
        separador.setForeground(Color.black);
        separador.setFont(fuente1);
        
        Planilla plani = control.id_Planilla;
        Long id = plani.getId_plani();
        plani = control.obtenerPlanilla(id);
        //cargamos los datos
        EquipoA.setText(plani.getNombreEquipo());
        EquipoB.setText(plani.getNombreEquipo1());
        AnotacionA.setText(plani.getResultado());
        AnotacionB.setText(plani.getResultado1());
        jugadorPartido.setText(plani.getJugaPartido());
        lbObervaciones.setText(plani.getDescripcion());
        
        setResizable(false);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        EtiquetaRegistro = new javax.swing.JLabel();
        lbEquipoA = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        lbEquipoB = new javax.swing.JLabel();
        lbObervaciones = new javax.swing.JLabel();
        lbanotaciones = new javax.swing.JLabel();
        lbJugadorPartidi = new javax.swing.JLabel();
        lbObser = new javax.swing.JLabel();
        Direccion2 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        EquipoA = new javax.swing.JLabel();
        EquipoB = new javax.swing.JLabel();
        AnotacionA = new javax.swing.JLabel();
        AnotacionB = new javax.swing.JLabel();
        jugadorPartido = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setText("ADMINISTRACION DE TORNEOS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 350, 50));

        titulo2.setText("DON DIEGO ");
        getContentPane().add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 170, 50));

        EtiquetaRegistro.setText("Registro de Resultados ");
        getContentPane().add(EtiquetaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        lbEquipoA.setText("Equipo A : ");
        getContentPane().add(lbEquipoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        separador.setText("------------------------------------------------------------------");
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 270, -1));

        lbEquipoB.setText("Equipo B :");
        getContentPane().add(lbEquipoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        getContentPane().add(lbObervaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 70, 20));

        lbanotaciones.setText("Anotaciones ");
        getContentPane().add(lbanotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 80, -1));

        lbJugadorPartidi.setText("Jugador del encuentro");
        getContentPane().add(lbJugadorPartidi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 130, -1));

        lbObser.setText("Observaciones generales :");
        getContentPane().add(lbObser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 150, -1));

        Direccion2.setText("Local: Av Primero de mayo, Via la Costa");
        getContentPane().add(Direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        Atras.setText("Ver planillas");
        Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMouseClicked(evt);
            }
        });
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, -1));
        getContentPane().add(EquipoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));
        getContentPane().add(EquipoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));
        getContentPane().add(AnotacionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));
        getContentPane().add(AnotacionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));
        getContentPane().add(jugadorPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        //retroceder a la pagina principal
        dispose();
        Planillas plani = new Planillas();
        plani.setVisible(true);
    }//GEN-LAST:event_AtrasMouseClicked

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Planilla_Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planilla_Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planilla_Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planilla_Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planilla_Resultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnotacionA;
    private javax.swing.JLabel AnotacionB;
    private javax.swing.JButton Atras;
    private javax.swing.JLabel Direccion2;
    private javax.swing.JLabel EquipoA;
    private javax.swing.JLabel EquipoB;
    private javax.swing.JLabel EtiquetaRegistro;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jugadorPartido;
    private javax.swing.JLabel lbEquipoA;
    private javax.swing.JLabel lbEquipoB;
    private javax.swing.JLabel lbJugadorPartidi;
    private javax.swing.JLabel lbObervaciones;
    private javax.swing.JLabel lbObser;
    private javax.swing.JLabel lbanotaciones;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
