/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ControladorJPA.ControladorEquipo;
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
            Long id = Long.parseLong(modelo.getValueAt(selectedRow, 0).toString());
            Equipo equipo = control.obtenerEquipo(id);
            ID.setText(String.valueOf(equipo.getId_equi()));
            textoNombre.setText(equipo.getNombreEquipo());
            textoAlias.setText(equipo.getAliasEquipo());
            textoEntre.setText(equipo.getEntrnadorEquipo());
            Editar.setEnabled(true);
            Nuevo.setEnabled(true);
        }
    }

    public void tablaModelo() {
        //damos los parametros que se veran reflejados en la tabla
        tablaEquipos.getColumnModel().getColumn(0).setPreferredWidth(40);
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

            String nombre = String.valueOf(actlist.getNombreEquipo());
            String a = String.valueOf(actlist.getEntrnadorEquipo());
            String ali = String.valueOf(actlist.getAliasEquipo());
            modelo.addRow(new Object[]{actlist.getId_equi(), nombre, a, ali,});
        }
    }

    public void cargatabla1(Equipo equipo) {

        String nombre = equipo.getNombreEquipo();
        String a = equipo.getEntrnadorEquipo();
        String ali = equipo.getAliasEquipo();
        modelo.addRow(new Object[]{equipo.getId_equi(), nombre, a, ali,});

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Forma1 = new javax.swing.JFrame();
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
        F12 = new javax.swing.JLabel();
        F13 = new javax.swing.JLabel();
        F14 = new javax.swing.JLabel();
        F15 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();

        Forma1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo2.setText("ADMINISTRACION DE TORNEOS");
        Forma1.getContentPane().add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 350, 50));

        titulo4.setText("DON DIEGO ");
        Forma1.getContentPane().add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, 50));

        EtiquetaRegistro2.setText("Registro de equipos ");
        Forma1.getContentPane().add(EtiquetaRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        nombreEquipo2.setText("Nombre:");
        Forma1.getContentPane().add(nombreEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        AliasEquipo2.setText("Alias:");
        Forma1.getContentPane().add(AliasEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        entrenadorEquipo2.setText("Entrenedor");
        Forma1.getContentPane().add(entrenadorEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        ListadoJugadores.setText("Listado de jugadores");
        Forma1.getContentPane().add(ListadoJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 140, -1));

        etiRegistro2.setText("¿Deseo registrar un nuevo jugador?");
        Forma1.getContentPane().add(etiRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        etiRegistro3.setText("Click Aqui!");
        Forma1.getContentPane().add(etiRegistro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        Forma1.getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 80, -1));

        registroJugador.setText("Registro Jugador");
        registroJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroJugadorActionPerformed(evt);
            }
        });
        Forma1.getContentPane().add(registroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 140, -1));

        Atras2.setText("Atras");
        Atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras2ActionPerformed(evt);
            }
        });
        Forma1.getContentPane().add(Atras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/balon2.gif"))); // NOI18N
        Forma1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 220, 160));

        Direccion2.setText("Local: Av Primero de mayo, Via la Costa");
        Forma1.getContentPane().add(Direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));
        Forma1.getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 180, 20));
        Forma1.getContentPane().add(lbAli, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 180, 20));
        Forma1.getContentPane().add(lbEntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 180, 20));

        F17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 170));

        F18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 330));

        F19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 120, 330));

        F20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 70, 330));

        F21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 200, 170));

        F22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 120, 330));

        F23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 330));

        F24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 170));

        F25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 170));

        F26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, 170));

        F27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 120, 170));

        F28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        Forma1.getContentPane().add(F28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 330));
        Forma1.getContentPane().add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 80, 20));

        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Entrenador", "Alias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 350, 240));

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
        getContentPane().add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 90, -1));

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
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 100, 30));

        Direccion.setText("Local: Av Primero de mayo, Via la Costa");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        Atras.setText("Atras");
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

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
        getContentPane().add(nombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        AliasEquipo.setText("Alias:");
        getContentPane().add(AliasEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        entrenadorEquipo.setText("Entrenedor");
        getContentPane().add(entrenadorEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/balon1.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 210, 170));

        Nuevo.setText("Nuevo registro");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 140, 40));

        RegistrarE.setText("Registrar");
        RegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 100, -1));

        labelEdita.setText("¿Quiere editar?");
        getContentPane().add(labelEdita, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 220, 30));
        getContentPane().add(textoAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 220, 30));
        getContentPane().add(textoEntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 220, 30));

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 170, 210));

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 330));

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 330));

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 120, 210));

        F9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 210));

        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 210));

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 230, 330));

        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, 210));

        F10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 120, 330));

        F11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 70, 330));

        F12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 120, 330));

        F13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 120, 210));

        F14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 210));

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
            Long numero = Long.parseLong(txtBuscar.getText());
            e = control.obtenerEquipo(numero);
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
                equipoNuevo = new Equipo();
                equipoNuevo.setNombreEquipo(textoNombre.getText());
                equipoNuevo.setAliasEquipo(textoAlias.getText());
                equipoNuevo.setEntrnadorEquipo(textoEntre.getText());
                if (control.crearEquipo(equipoNuevo)) {
                    JOptionPane.showMessageDialog(rootPane, "Se guardo con exito");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos no se puedo guardar");
                }

            } else {

                equipoNuevo = new Equipo();
                Long id = Long.parseLong(ID.getText());
                equipoNuevo = control.obtenerEquipo(id);
                equipoNuevo.setId_equi(id);
                equipoNuevo.setNombreEquipo(textoNombre.getText());
                equipoNuevo.setAliasEquipo(textoAlias.getText());
                equipoNuevo.setEntrnadorEquipo(textoEntre.getText());
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
            Forma1.setVisible(true);
            Forma1.setLocationRelativeTo(null);
            Forma1.setTitle("Administracion de torneos de una cancha sintetica");
            Forma1.setBounds(300, 100, 800, 550);
            //añadimos fuentes a los etiquetas
            lbNombre.setText(textoNombre.getText());
            lbAli.setText(textoAlias.getText());
            lbEntre.setText(textoEntre.getText());
            lbID.setText(ID.getText());

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
        Forma1.dispose();
        equipos.setVisible(true);
    }//GEN-LAST:event_Atras2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // cargamos los datos para la eliminacion
        Equipo equipo = null;
        Long id = Long.parseLong(lbID.getText());
        equipo = control.obtenerEquipo(id);
        equipo.setId_equi(id);
        int op = JOptionPane.showConfirmDialog(rootPane, "¿Deseoa eliminar el equipo?", "Eliminacion", 0);
        //se cambia las opciones de los botones
        if (op == 0) {
            JOptionPane.showMessageDialog(rootPane, "Se ha eliminado con exito");
            equipo = control.obtenerEquipo(id);
            equipo.setId_equi(id);
            control.eliminarEquipo(id);
            Forma1.dispose();
            Equipos equi = new Equipos();
            equi.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Eliminacion cancelada");
            registroJugador.setEnabled(true);
            ListadoJugadores.setEnabled(true);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

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
    private javax.swing.JLabel EtiquetaRegistro;
    private javax.swing.JLabel EtiquetaRegistro2;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F10;
    private javax.swing.JLabel F11;
    private javax.swing.JLabel F12;
    private javax.swing.JLabel F13;
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
    private javax.swing.JFrame Forma1;
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
