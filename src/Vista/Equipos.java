/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ControladorJPA.ControladorEquipo;
import ControladorJPA.ControladorTorneo;
import Modelo.Equipo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Equipos extends javax.swing.JFrame {

    /**
     * Creates new form acceso
     */
    DefaultTableModel modelo;
    ControladorEquipo control = new ControladorEquipo();
    ControladorTorneo cT = new ControladorTorneo();

    public Equipos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administracion de torneos de una cancha sintetica");
        /*administramos el color de la letra y el tipo de fuente*/
        Font fuente = new Font("Agency FB", Font.PLAIN, 40);
        Font fuente1 = new Font("Agency FB", Font.PLAIN, 20);
        titulo.setForeground(Color.black);
        titulo.setFont(fuente);
        titulo1.setForeground(Color.black);
        titulo1.setFont(fuente);
        EtiquetaRegistro.setForeground(Color.black);
        EtiquetaRegistro.setFont(fuente1);
        /*cambiamos el color de los botones*/
        buscarEquipo.setBackground(Color.lightGray);
        Atras.setBackground(Color.lightGray);
        Editar.setBackground(Color.lightGray);
        Ver.setBackground(Color.lightGray);
        nombreEquipo.setForeground(Color.black);
        nombreEquipo.setFont(fuente1);
        AliasEquipo.setForeground(Color.black);
        AliasEquipo.setFont(fuente1);
        entrenadorEquipo.setForeground(Color.black);
        entrenadorEquipo.setFont(fuente1);

        titulo4.setForeground(Color.black);
        titulo4.setFont(fuente);
        titulo2.setForeground(Color.black);
        titulo2.setFont(fuente);
        EtiquetaRegistro2.setForeground(Color.black);
        EtiquetaRegistro2.setFont(fuente1);
        etiRegistro2.setForeground(Color.black);
        etiRegistro2.setFont(fuente1);
        etiRegistro3.setForeground(Color.black);
        etiRegistro3.setFont(fuente1);
        nombreEquipo2.setForeground(Color.black);
        nombreEquipo2.setFont(fuente1);
        AliasEquipo2.setForeground(Color.black);
        AliasEquipo2.setFont(fuente1);
        entrenadorEquipo2.setForeground(Color.black);
        entrenadorEquipo2.setFont(fuente1);

        inicio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Equipo_Principal = new javax.swing.JFrame();
        titulo2 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        EtiquetaRegistro2 = new javax.swing.JLabel();
        nombreEquipo2 = new javax.swing.JLabel();
        AliasEquipo2 = new javax.swing.JLabel();
        entrenadorEquipo2 = new javax.swing.JLabel();
        ListadoJugadores = new javax.swing.JButton();
        etiRegistro2 = new javax.swing.JLabel();
        etiRegistro3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        registroJugador = new javax.swing.JButton();
        Atras2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Direccion2 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbAli = new javax.swing.JLabel();
        lbEntre = new javax.swing.JLabel();
        F17 = new javax.swing.JLabel();
        F18 = new javax.swing.JLabel();
        F19 = new javax.swing.JLabel();
        F20 = new javax.swing.JLabel();
        F21 = new javax.swing.JLabel();
        F22 = new javax.swing.JLabel();
        F23 = new javax.swing.JLabel();
        F24 = new javax.swing.JLabel();
        F25 = new javax.swing.JLabel();
        F26 = new javax.swing.JLabel();
        F27 = new javax.swing.JLabel();
        F28 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();
        Ver = new javax.swing.JButton();
        EtiquetaRegistro = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        Editar = new javax.swing.JButton();
        Direccion = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        buscarEquipo = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        nombreEquipo = new javax.swing.JLabel();
        AliasEquipo = new javax.swing.JLabel();
        entrenadorEquipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        RegistrarE = new javax.swing.JButton();
        labelEdita = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoAlias = new javax.swing.JTextField();
        textoEntre = new javax.swing.JTextField();
        F5 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F9 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        F10 = new javax.swing.JLabel();
        F11 = new javax.swing.JLabel();
        F14 = new javax.swing.JLabel();
        F15 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();

        Equipo_Principal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo2.setText("ADMINISTRACION DE TORNEOS");
        Equipo_Principal.getContentPane().add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 350, 50));

        titulo4.setText("DON DIEGO ");
        Equipo_Principal.getContentPane().add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, 50));

        EtiquetaRegistro2.setText("Informacion de equipo");
        Equipo_Principal.getContentPane().add(EtiquetaRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        nombreEquipo2.setText("Nombre:");
        Equipo_Principal.getContentPane().add(nombreEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        AliasEquipo2.setText("Alias:");
        Equipo_Principal.getContentPane().add(AliasEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        entrenadorEquipo2.setText("Entrenedor");
        Equipo_Principal.getContentPane().add(entrenadorEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        ListadoJugadores.setText("Listado de jugadores");
        Equipo_Principal.getContentPane().add(ListadoJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 140, -1));

        etiRegistro2.setText("¿Deseo registrar un nuevo jugador?");
        Equipo_Principal.getContentPane().add(etiRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        etiRegistro3.setText("Click Aqui!");
        Equipo_Principal.getContentPane().add(etiRegistro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        Equipo_Principal.getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 80, -1));

        registroJugador.setText("Registro Jugador");
        registroJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroJugadorActionPerformed(evt);
            }
        });
        Equipo_Principal.getContentPane().add(registroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 140, -1));

        Atras2.setText("Atras");
        Atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras2ActionPerformed(evt);
            }
        });
        Equipo_Principal.getContentPane().add(Atras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/balon2.gif"))); // NOI18N
        Equipo_Principal.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 220, 160));

        Direccion2.setText("Local: Av Primero de mayo, Via la Costa");
        Equipo_Principal.getContentPane().add(Direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));
        Equipo_Principal.getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 180, 20));
        Equipo_Principal.getContentPane().add(lbAli, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 180, 20));
        Equipo_Principal.getContentPane().add(lbEntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 180, 20));

        F17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 170));

        F18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 330));

        F19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 120, 330));

        F20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 70, 330));

        F21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 200, 170));

        F22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 120, 330));

        F23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 330));

        F24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 170));

        F25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 170));

        F26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, 170));

        F27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 120, 170));

        F28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Equipo_Principal.getContentPane().add(F28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 330));
        Equipo_Principal.getContentPane().add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 80, 20));

        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Entrenador", "Alias"
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
        tablaEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEquiposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaEquiposMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaEquiposMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEquipos);
        if (tablaEquipos.getColumnModel().getColumnCount() > 0) {
            tablaEquipos.getColumnModel().getColumn(0).setResizable(false);
            tablaEquipos.getColumnModel().getColumn(1).setResizable(false);
            tablaEquipos.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 350, 140));

        Ver.setText("Ver");
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });
        getContentPane().add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 90, -1));

        EtiquetaRegistro.setText("Registro de equipos ");
        getContentPane().add(EtiquetaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 240, 30));

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 100, 30));

        Direccion.setText("Local: Av Primero de mayo, Via la Costa");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        Atras.setText("Atras");
        Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMouseClicked(evt);
            }
        });
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        buscarEquipo.setText("Buscar");
        buscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(buscarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        titulo1.setText("DON DIEGO ");
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 170, 50));

        titulo.setText("ADMINISTRACION DE TORNEOS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 350, 50));

        nombreEquipo.setText("Nombre:");
        getContentPane().add(nombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        AliasEquipo.setText("Alias:");
        getContentPane().add(AliasEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        entrenadorEquipo.setText("Entrenedor");
        getContentPane().add(entrenadorEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/balon1.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 210, 170));

        Nuevo.setText("Nuevo registro");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 110, 30));

        RegistrarE.setText("Registrar");
        RegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 100, -1));

        labelEdita.setText("¿Quiere editar?");
        getContentPane().add(labelEdita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 240, 30));
        getContentPane().add(textoAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 240, 30));
        getContentPane().add(textoEntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 240, 30));

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 180, 310));

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 330));

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 330));

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 120, 310));

        F9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 310));

        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 310));

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 240, 330));

        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, 310));

        F10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 120, 330));

        F11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 70, 330));

        F14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 310));

        F15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 120, 330));

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void tablaEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquiposMouseClicked
        // TODO add your handling code here:
        Nuevo.setEnabled(false);
        textoNombre.setEnabled(false);
        textoAlias.setEnabled(false);
        textoEntre.setEnabled(false);
        cargarEquipo();
    }//GEN-LAST:event_tablaEquiposMouseClicked

    private void tablaEquiposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquiposMousePressed


    }//GEN-LAST:event_tablaEquiposMousePressed

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_VerMouseClicked

    private void tablaEquiposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquiposMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEquiposMouseEntered

    private void buscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEquipoActionPerformed
        //establecemos la forma que se maneja la busqueda 
        if (txtBuscar.getText().length() >= 1) {
            Equipo e = null;
            //Long numero = Long.parseLong(txtBuscar.getText());
            String nombre = txtBuscar.getText();
            e = control.obtenerEquipoEspecifico(nombre);
            if (e != null) {
                tablaModelo();
                cargatabla1(e);
            } else {
                JOptionPane.showMessageDialog(null, "No tenemos registro de ese equipo", null, JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene los campos para poder buscar", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarEquipoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //volvemos a rellenar la tabla
        txtBuscar.setText(null);
        inicio();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void RegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEActionPerformed
        Equipo equipoNuevo = null;
        //controlamos el ingreso de los datos
        if ((textoNombre.getText().length() >= 1) && (textoAlias.getText().length() >= 1) && (textoEntre.getText().length() >= 1)) {
            if (RegistrarE.getText().equalsIgnoreCase("Registrar")) {
                //comprobamos la cantidad de torneos que se van a registrar
                //para no exceder la cantidad establecida
                if (control.cantidadEquipos() < cT.numEquipos) {
                    //validamos que el registro del equipo sea unico
                    if (control.unicoEquipo(textoNombre.getText())) {
                        equipoNuevo = new Equipo();
                        equipoNuevo.setNombreEquipo(textoNombre.getText());
                        equipoNuevo.setAliasEquipo(textoAlias.getText());
                        equipoNuevo.setEntrenadorEquipo(textoEntre.getText());
                        equipoNuevo.setTorneo(cT.id_tor);

                        if (control.crearEquipo(equipoNuevo)) {
                            JOptionPane.showMessageDialog(rootPane, "Se guardo con exito");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Lo sentimos no se puedo guardar");
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Lo sentimos el equipo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos se llego al limite de equipos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                equipoNuevo = new Equipo();
                Long id = Long.parseLong(ID.getText());
                equipoNuevo = control.obtenerEquipo(id);
                equipoNuevo.setId_equi(id);
                equipoNuevo.setNombreEquipo(textoNombre.getText());
                equipoNuevo.setAliasEquipo(textoAlias.getText());
                equipoNuevo.setEntrenadorEquipo(textoEntre.getText());
                if (control.editarEquipo(equipoNuevo)) {
                    JOptionPane.showMessageDialog(rootPane, "Se edito con exito");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos no se puedo editar");
                }
            }
            inicio();

        } else {
            JOptionPane.showMessageDialog(null, "Rellene los campos para poder registrar", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RegistrarEActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // llamamos al metodo nuevo
        nuevoRegistro();
    }//GEN-LAST:event_NuevoActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // llamamos al metodo editar Registro
        editarRegistro();
    }//GEN-LAST:event_EditarActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed

        if (textoNombre.getText().length() >= 1) {
            dispose();
            Equipo_Principal.setVisible(true);
            Equipo_Principal.setLocationRelativeTo(null);
            Equipo_Principal.setTitle("Administracion de torneos de una cancha sintetica");
            Equipo_Principal.setBounds(300, 100, 800, 550);
            //añadimos fuentes a los etiquetas
            lbNombre.setText(textoNombre.getText());
            lbAli.setText(textoAlias.getText());
            lbEntre.setText(textoEntre.getText());
            lbID.setText(ID.getText());
            //PASAMOS EL OBJETO PADRE PARA PODER USARLO EN LOS HIJOS 
            Equipo e = control.obtenerEquipo(Long.parseLong(ID.getText()));
            control.id_Equi = e;

            lbNombre.setFont(new Font("Calibra", Font.PLAIN, 15));
            lbEntre.setFont(new Font("Calibra", Font.PLAIN, 15));
            lbAli.setFont(new Font("Calibra", Font.PLAIN, 15));

        } else {
            JOptionPane.showMessageDialog(rootPane, "Aun no seleccion nada para ver", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_VerActionPerformed

    private void registroJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroJugadorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Si funciona", null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_registroJugadorActionPerformed

    private void Atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras2ActionPerformed
        // TODO add your handling code here:
        Equipos equipos = new Equipos();
        Equipo_Principal.dispose();
        equipos.setVisible(true);
    }//GEN-LAST:event_Atras2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // cargamos los datos para la eliminacion
        Equipo equipo = new Equipo();
        //Long id = Long.parseLong(lbID.getText());
        //equipo = control.obtenerEquipo(id);
        //equipo.setId_equi(id);
        Long idE = control.id_Equi.getId_equi();
        int op = JOptionPane.showConfirmDialog(rootPane, "¿Deseoa eliminar el equipo?", "Eliminacion", 0);
        //se cambia las opciones de los botones
        if (op == 0) {        
            equipo = control.obtenerEquipo(idE);
            equipo.setTorneo(null);
            control.editarEquipo(equipo);
            JOptionPane.showMessageDialog(rootPane, "Se ha eliminado con exito");
            control.eliminarEquipo(idE);
            Equipo_Principal.dispose();
            Equipos equi = new Equipos();
            equi.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Eliminacion cancelada");
            registroJugador.setEnabled(true);
            ListadoJugadores.setEnabled(true);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        dispose();
        Torneos v_torneos = new Torneos();
        v_torneos.setVisible(true);
    }//GEN-LAST:event_AtrasMouseClicked

    public void inicio() {
        textoNombre.setEnabled(true);
        textoAlias.setEnabled(true);
        textoEntre.setEnabled(true);
        textoAlias.setText(null);
        textoEntre.setText(null);
        textoNombre.setText(null);
        RegistrarE.setEnabled(true);
        Editar.setEnabled(false);
        Nuevo.setEnabled(false);
        RegistrarE.setText("Registrar");
        tablaModelo();
        cargatabla();
    }

    public void nuevoRegistro() {
        textoNombre.setEnabled(true);
        textoAlias.setEnabled(true);
        textoEntre.setEnabled(true);
        textoNombre.setText(null);
        textoAlias.setText(null);
        textoEntre.setText(null);
        RegistrarE.setEnabled(true);
        Editar.setEnabled(false);
        Nuevo.setEnabled(false);
        RegistrarE.setText("Registrar");
    }

    public void editarRegistro() {
        RegistrarE.setText("Actualizar");
        Nuevo.setEnabled(false);
        RegistrarE.setEnabled(true);
        textoNombre.setEnabled(true);
        textoAlias.setEnabled(true);
        textoEntre.setEnabled(true);
    }

    public void cargarEquipo() {
        if (this.tablaEquipos.isEnabled()) {
            int selectedRow = this.tablaEquipos.getSelectedRow();
            String nombre = modelo.getValueAt(selectedRow, 0).toString();
            Equipo equipo = control.obtenerEquipoEspecifico(nombre);
            ID.setText(String.valueOf(equipo.getId_equi()));
            textoNombre.setText(equipo.getNombreEquipo());
            textoAlias.setText(equipo.getAliasEquipo());
            textoEntre.setText(equipo.getEntrenadorEquipo());
            Editar.setEnabled(true);
            Nuevo.setEnabled(true);
        }
    }

    public void tablaModelo() {
        //damos los parametros que se veran reflejados en la tabla     
        tablaEquipos.getColumnModel().getColumn(0).setPreferredWidth(40);
        tablaEquipos.getColumnModel().getColumn(0).setPreferredWidth(80);
        tablaEquipos.getColumnModel().getColumn(0).setPreferredWidth(80);
        modelo = (DefaultTableModel) tablaEquipos.getModel();
        modelo.setNumRows(0);
    }

    public void cargatabla() {
        //añadimos a traves de una lista los datos a la tabla
        List<Equipo> lista = control.listarEquipo();

        for (Equipo actlist : lista) {

            //controlamos que se cargen los equipos pertenecientes al tornoe
            //seleccionado previamente
            if (cT.id_tor.getId_tor() == actlist.getTorneo().getId_tor()) {
                String nombre = String.valueOf(actlist.getNombreEquipo());
                String a = String.valueOf(actlist.getEntrenadorEquipo());
                String ali = String.valueOf(actlist.getAliasEquipo());
                modelo.addRow(new Object[]{nombre, a, ali,});
            }

        }
    }

    public void cargatabla1(Equipo equipo) {

        String nombre = equipo.getNombreEquipo();
        String a = equipo.getEntrenadorEquipo();
        String ali = equipo.getAliasEquipo();
        modelo.addRow(new Object[]{nombre, a, ali,});

    }

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
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AliasEquipo;
    private javax.swing.JLabel AliasEquipo2;
    private javax.swing.JButton Atras;
    private javax.swing.JButton Atras2;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Direccion2;
    private javax.swing.JButton Editar;
    private javax.swing.JFrame Equipo_Principal;
    private javax.swing.JLabel EtiquetaRegistro;
    private javax.swing.JLabel EtiquetaRegistro2;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F10;
    private javax.swing.JLabel F11;
    private javax.swing.JLabel F14;
    private javax.swing.JLabel F15;
    private javax.swing.JLabel F17;
    private javax.swing.JLabel F18;
    private javax.swing.JLabel F19;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F20;
    private javax.swing.JLabel F21;
    private javax.swing.JLabel F22;
    private javax.swing.JLabel F23;
    private javax.swing.JLabel F24;
    private javax.swing.JLabel F25;
    private javax.swing.JLabel F26;
    private javax.swing.JLabel F27;
    private javax.swing.JLabel F28;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel F9;
    private javax.swing.JTextField ID;
    private javax.swing.JButton ListadoJugadores;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton RegistrarE;
    private javax.swing.JButton Ver;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton buscarEquipo;
    private javax.swing.JLabel entrenadorEquipo;
    private javax.swing.JLabel entrenadorEquipo2;
    private javax.swing.JLabel etiRegistro2;
    private javax.swing.JLabel etiRegistro3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEdita;
    private javax.swing.JLabel lbAli;
    private javax.swing.JLabel lbEntre;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel nombreEquipo;
    private javax.swing.JLabel nombreEquipo2;
    private javax.swing.JButton registroJugador;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTextField textoAlias;
    private javax.swing.JTextField textoEntre;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo4;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
