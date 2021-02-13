/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ControladorJPA.ControladorEquipo;
import ControladorJPA.ControladorPlanilla;
import ControladorJPA.ControladorTorneo;
import Modelo.Equipo;
import Modelo.Planilla;
import Modelo.Torneo;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Registro_Planilla extends javax.swing.JFrame {

    /**
     * Creates new form acceso
     */
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    DefaultTableModel modelo3;
    ControladorEquipo control = new ControladorEquipo();
    ControladorTorneo control2 = new ControladorTorneo();
    ControladorPlanilla controlP = new ControladorPlanilla();

    public Registro_Planilla() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administracion de torneos de una cancha sintetica");
        /*administramos el color de la letra y el tipo de fuente*/
        Font fuente = new Font("Agency FB", Font.PLAIN, 40);
        Font fuente1 = new Font("Agency FB", Font.PLAIN, 20);
        Font fuente2 = new Font("Agency FB", Font.PLAIN, 25);
        titulo.setForeground(Color.black);
        titulo.setFont(fuente);
        titulo1.setForeground(Color.black);
        titulo1.setFont(fuente);
        EtiquetaPlanilla.setForeground(Color.black);
        EtiquetaPlanilla.setFont(fuente2);
        nombreEquipoA.setForeground(Color.black);
        nombreEquipoA.setFont(fuente1);
        NombreEquipoB.setForeground(Color.black);
        NombreEquipoB.setFont(fuente1);
        arbitro.setForeground(Color.black);
        arbitro.setFont(fuente1);
        torneo.setForeground(Color.black);
        torneo.setFont(fuente1);
        lugar.setForeground(Color.black);
        lugar.setFont(fuente1);
        fecha.setForeground(Color.black);
        fecha.setFont(fuente1);


        /*cambiamos el color de los botones*/
        Atras.setBackground(Color.lightGray);
        RegistrarP.setBackground(Color.lightGray);

        textoEquipo1.setText(" ");
        textoEquipo2.setText(" ");
        textoArbitro.setText(" ");
        textonTorneo.setText(" ");

    }

    public void inicio() {
        tablaModelo();
        cargatabla();
    }

    public void inicio2() {
        tablaModeloAr();
        //cargatablaAr();
    }
    
    /*private LocalDate fecha(){
        String dia = slectitem1.gettext();
        String mes= slectite2.gettext();
        String anio = slectitem3.gettext();
        int mes = Integer.parseInt(dia);
        int mes = Integer.parseInt(dia);
        int mes = Integer.parseInt(dia);
      
      
      LocalDate a = LocalDate.of(mes, dia, anio);
              return  a;
    }
*/
    public void tablaModelo() {
        //damos los parametros que se veran reflejados en la tabla
        tablaEquipos.getColumnModel().getColumn(0).setPreferredWidth(40);
        tablaEquipos.getColumnModel().getColumn(0).setPreferredWidth(40);
        tablaEquipos.getColumnModel().getColumn(0).setPreferredWidth(80);
        tablaEquipos.getColumnModel().getColumn(0).setPreferredWidth(80);
        modelo = (DefaultTableModel) tablaEquipos.getModel();
        modelo.setNumRows(0);
    }

    public void tablaModeloAr() {
        //damos los parametros que se veran reflejados en la tabla
        if (textoArbitro.getText().equals(" ")) {
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(80);

            modelo2 = (DefaultTableModel) tablaArbitros.getModel();
            modelo2.setNumRows(0);
            //cargatablaAr();
        } else if (textonTorneo.getText().equals(" ")) {
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(80);

            modelo3 = (DefaultTableModel) tablaArbitros.getModel();
            modelo3.setNumRows(0);

            cargatablaTorneo();
        }

    }

    public void cargatabla() {
        //añadimos a traves de una lista los datos a la tabla
        List<Equipo> lista = control.listarEquipo();

        for (Equipo actlist : lista) {

            String nombre = String.valueOf(actlist.getNombreEquipo());
            String a = String.valueOf(actlist.getEntrnadorEquipo());
            String ali = String.valueOf(actlist.getAliasEquipo());
            modelo.addRow(new Object[]{actlist.getId_equi(), nombre, a, ali,});
        }
    }

    public void cargatablaTorneo() {
        //añadimos a traves de una lista los datos a la tabla
        List<Torneo> lista = control2.listarTorneo();

        for (Torneo actlist : lista) {

            String nombre = String.valueOf(actlist.getNombreTorneo());
            String a = String.valueOf(actlist.getModalidad());

            modelo.addRow(new Object[]{actlist.getId_tor(), nombre, a,});
        }
    }

    public void cargatablaAr() {
        //añadimos a traves de una lista los datos a la tabla
        /*List<Arbitro> lista = control.listarEquipo();

         for (Equipo actlist : lista) {

         String nombre = String.valueOf(actlist.getNombreEquipo());
         String a = String.valueOf(actlist.getEntrnadorEquipo());
         String ali = String.valueOf(actlist.getAliasEquipo());
         modelo.addRow(new Object[]{actlist.getId_equi(), nombre, a, ali,});
         }*/
    }

    public void cargatabla2() {
        //añadimos a traves de una lista los datos a la tabla
        List<Equipo> lista = control.listarEquipo();

        for (Equipo actlist : lista) {
            String nombre = String.valueOf(actlist.getNombreEquipo());
            if (!textoEquipo1.getText().equalsIgnoreCase(nombre)) {
                String a = String.valueOf(actlist.getEntrnadorEquipo());
                String ali = String.valueOf(actlist.getAliasEquipo());
                modelo.addRow(new Object[]{actlist.getId_equi(), nombre, a, ali,});
            }

        }
    }

    public void cargarEquipo() {
        if (this.tablaEquipos.isEnabled()) {
            int selectedRow = this.tablaEquipos.getSelectedRow();
            Long id = Long.parseLong(modelo.getValueAt(selectedRow, 0).toString());
            Equipo equipo = control.obtenerEquipo(id);
            ID.setText(String.valueOf(equipo.getId_equi()));

            if (textoEquipo1.getText().equals(" ")) {
                textoEquipo1.setText(equipo.getNombreEquipo());
            } else {
                textoEquipo2.setText(equipo.getNombreEquipo());
            }

        }
    }

    public void cargarArbitro() {

        //AQUI DEBEMOS CAMBIAR EL OBJETO
        if (this.tablaArbitros.isEnabled()) {
            int selectedRow = this.tablaArbitros.getSelectedRow();
            Long id = Long.parseLong(modelo2.getValueAt(selectedRow, 0).toString());
            Equipo equipo = control.obtenerEquipo(id);
            idArbitro.setText(String.valueOf(equipo.getId_equi()));

            textoArbitro.setText(equipo.getNombreEquipo());

        }
    }

    public void cargarTorneo() {

        //AQUI DEBEMOS CAMBIAR EL OBJETO
        if (this.tablaArbitros.isEnabled()) {
            int selectedRow = this.tablaArbitros.getSelectedRow();
            Long id = Long.parseLong(modelo3.getValueAt(selectedRow, 0).toString());
            Torneo torne = control2.obtenerTorneo(id);
            idTorneo.setText(String.valueOf(torne.getId_tor()));

            textonTorneo.setText(torne.getNombreTorneo());

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        añoC = new javax.swing.JComboBox();
        mesC = new javax.swing.JComboBox();
        diaC = new javax.swing.JComboBox();
        fecha = new javax.swing.JLabel();
        lugar = new javax.swing.JLabel();
        torneo = new javax.swing.JLabel();
        textoLugar = new javax.swing.JTextField();
        textonTorneo = new javax.swing.JTextField();
        textoEquipo1 = new javax.swing.JTextField();
        textoEquipo2 = new javax.swing.JTextField();
        textoArbitro = new javax.swing.JTextField();
        arbitro = new javax.swing.JLabel();
        NombreEquipoB = new javax.swing.JLabel();
        nombreEquipoA = new javax.swing.JLabel();
        EtiquetaPlanilla = new javax.swing.JLabel();
        RegistrarP = new javax.swing.JButton();
        Direccion = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();
        PanelEquipos = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();
        Atras = new javax.swing.JButton();
        panelArbitros = new javax.swing.JScrollPane();
        tablaArbitros = new javax.swing.JTable();
        titulo1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        F12 = new javax.swing.JLabel();
        F11 = new javax.swing.JLabel();
        F10 = new javax.swing.JLabel();
        F9 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        idArbitro = new javax.swing.JLabel();
        idTorneo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        añoC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        añoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoCActionPerformed(evt);
            }
        });
        getContentPane().add(añoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        mesC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesCActionPerformed(evt);
            }
        });
        getContentPane().add(mesC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        diaC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        diaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaCActionPerformed(evt);
            }
        });
        getContentPane().add(diaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        fecha.setText("Fecha ");
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        lugar.setText("Lugar :");
        getContentPane().add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        torneo.setText("Torneo :");
        getContentPane().add(torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));
        getContentPane().add(textoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 210, 30));

        textonTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textonTorneoMouseClicked(evt);
            }
        });
        getContentPane().add(textonTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 210, 30));

        textoEquipo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoEquipo1MouseClicked(evt);
            }
        });
        getContentPane().add(textoEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 210, 30));

        textoEquipo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoEquipo2MouseClicked(evt);
            }
        });
        textoEquipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEquipo2ActionPerformed(evt);
            }
        });
        getContentPane().add(textoEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 210, 30));

        textoArbitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoArbitroMouseClicked(evt);
            }
        });
        getContentPane().add(textoArbitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 210, 30));

        arbitro.setText("Arbitro :");
        getContentPane().add(arbitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        NombreEquipoB.setText("Equipo B: ");
        getContentPane().add(NombreEquipoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        nombreEquipoA.setText("Equipo A: ");
        getContentPane().add(nombreEquipoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        EtiquetaPlanilla.setText("Registro de planillas ");
        getContentPane().add(EtiquetaPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        RegistrarP.setText("Guardar");
        RegistrarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarPMouseClicked(evt);
            }
        });
        RegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        Direccion.setText("Local: Av Primero de mayo, Via la Costa");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/balon.gif"))); // NOI18N
        getContentPane().add(lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 230, 260));

        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre ", "Entrenador", "Alias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEquiposMouseClicked(evt);
            }
        });
        PanelEquipos.setViewportView(tablaEquipos);

        getContentPane().add(PanelEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 220, 240));

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        tablaArbitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArbitros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArbitrosMouseClicked(evt);
            }
        });
        panelArbitros.setViewportView(tablaArbitros);
        if (tablaArbitros.getColumnModel().getColumnCount() > 0) {
            tablaArbitros.getColumnModel().getColumn(0).setResizable(false);
            tablaArbitros.getColumnModel().getColumn(1).setResizable(false);
            tablaArbitros.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(panelArbitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, 230));

        titulo1.setText("DON DIEGO ");
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 170, 50));

        titulo.setText("ADMINISTRACION DE TORNEOS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 350, 50));

        F12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 40, -1));

        F11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, 250));

        F10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 120, 330));

        F9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 240));

        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 240));

        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 120, 250));

        F6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 60, 240));

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 300, 240));

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 330));

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 330));

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 120, 330));

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 320, 330));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        idArbitro.setText("jLabel1");
        getContentPane().add(idArbitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));
        getContentPane().add(idTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaCActionPerformed

    private void mesCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesCActionPerformed

    private void añoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoCActionPerformed

    private void textoEquipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEquipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEquipo2ActionPerformed

    private void textoEquipo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoEquipo1MouseClicked
        // permitimos mostrar una tabla donde se permite selecionar el equipo
        //que se presentara en el formato de la planilla
        
        
        if (textoEquipo1.getText().equals(" ")) {
            //escondemos la otra tabla
            panelArbitros.setVisible(false);
            lbImagen.setVisible(false);
            inicio();
            tablaEquipos.setEnabled(true);
            tablaEquipos.setVisible(true);
        }


    }//GEN-LAST:event_textoEquipo1MouseClicked

    private void tablaEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquiposMouseClicked
        cargarEquipo();
        tablaEquipos.setVisible(false);
        lbImagen.setVisible(true);
    }//GEN-LAST:event_tablaEquiposMouseClicked

    private void textoEquipo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoEquipo2MouseClicked
        
        if (textoEquipo2.getText().equals(" ")) {
            //escondemos la otra tabla
            panelArbitros.setVisible(false);
            lbImagen.setVisible(false);
            tablaModelo();
            cargatabla2();
            tablaEquipos.setEnabled(true);
            tablaEquipos.setVisible(true);
        }

    }//GEN-LAST:event_textoEquipo2MouseClicked

    private void textoArbitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoArbitroMouseClicked
        //escondemos la tabla de arbitros
        
        /*lbImagen.setVisible(false);
         PanelEquipos.setVisible(false);
         tablaModeloAr();
         cargatablaAr();
         tablaArbitros.setEnabled(true);
         tablaArbitros.setVisible(true);*/
    }//GEN-LAST:event_textoArbitroMouseClicked

    private void tablaArbitrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArbitrosMouseClicked

        if (textoArbitro.getText().equals(" ")) {
            // cargarArbitro();
            tablaArbitros.setVisible(false);
            lbImagen.setVisible(true);
        } else if (textonTorneo.getText().equals(" ")) {
            cargarTorneo();
            tablaArbitros.setVisible(false);
            lbImagen.setVisible(true);
        }
    }//GEN-LAST:event_tablaArbitrosMouseClicked

    private void RegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPActionPerformed
        
    }//GEN-LAST:event_RegistrarPActionPerformed

    private void textonTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textonTorneoMouseClicked
        if (textonTorneo.getText().equals(" ")) {
            //escondemos la tabla de arbitros
            PanelEquipos.setVisible(false);
            lbImagen.setVisible(false);
            tablaModeloAr();
            cargatablaTorneo();
            tablaEquipos.setEnabled(false);
            tablaEquipos.setVisible(false);
            tablaArbitros.setEnabled(false);
            tablaArbitros.setVisible(true);
        }
    }//GEN-LAST:event_textonTorneoMouseClicked

    private void RegistrarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarPMouseClicked
        Planilla planila = null;
        if ((textoEquipo1.getText().length() >= 1) && (textoEquipo2.getText().length() >= 1)
                && (textoArbitro.getText().length() >= 1) && (textonTorneo.getText().length() >= 1) && (textoLugar.getText().length() >= 1)) {
            planila = new Planilla();
            /*obtenemos la id del torneo al que pertenece*/
            Long idT = Long.parseLong(idTorneo.getText());
            Torneo tor = new Torneo();
            tor = control2.obtenerTorneo(idT);
            
            planila.setNombreEquipo(textoEquipo1.getText());
            planila.setNombreEquipo1(textoEquipo2.getText());
            planila.setNombreArbitro(textoArbitro.getText());
            planila.setLugar(textoLugar.getText());
            planila.setTorneo(tor);
            //planila.setFecha(fecha());

            if (controlP.crearPlanilla(planila)) {
                JOptionPane.showMessageDialog(rootPane, "Se guardo con exito nuestra planilla");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos no se puedo guardar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene los campos para poder registrar", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RegistrarPMouseClicked

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
       //nos redirigiremos a donde pertence
       Planillas vPlani = new Planillas();
       dispose();
       vPlani.setVisible(true);
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
            java.util.logging.Logger.getLogger(Registro_Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Planilla().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel EtiquetaPlanilla;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F10;
    private javax.swing.JLabel F11;
    private javax.swing.JLabel F12;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel F9;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel NombreEquipoB;
    private javax.swing.JScrollPane PanelEquipos;
    private javax.swing.JButton RegistrarP;
    private javax.swing.JLabel arbitro;
    private javax.swing.JComboBox añoC;
    private javax.swing.JComboBox diaC;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel idArbitro;
    private javax.swing.JLabel idTorneo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lugar;
    private javax.swing.JComboBox mesC;
    private javax.swing.JLabel nombreEquipoA;
    private javax.swing.JScrollPane panelArbitros;
    private javax.swing.JTable tablaArbitros;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTextField textoArbitro;
    private javax.swing.JTextField textoEquipo1;
    private javax.swing.JTextField textoEquipo2;
    private javax.swing.JTextField textoLugar;
    private javax.swing.JTextField textonTorneo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel torneo;
    // End of variables declaration//GEN-END:variables
}
