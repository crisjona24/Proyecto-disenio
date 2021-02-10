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
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Planillas extends javax.swing.JFrame {

    /**
     * Creates new form acceso
     */
    DefaultTableModel modeloVer;
    ControladorPlanilla controlP = new ControladorPlanilla();
    
    /* Controladores para manejar el uso de tablas de una entidad definidad 
    para la modificacion
    */
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    DefaultTableModel modelo3;
    ControladorEquipo control = new ControladorEquipo();
    ControladorTorneo control2 = new ControladorTorneo();
    
    /*variables de respaldo*/
    String nom = " ";
    String nom1 = " ";
    String lug = " ";
    String ar = " ";
    String fe = " ";

    public Planillas() {
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
        RegistrarE.setBackground(Color.lightGray);
        Ver.setBackground(Color.lightGray);
        
        //estado de boton
        btCancelarM.setVisible(false);
        panelEquipos.setVisible(false);
        panelArbitros.setVisible(false);
        
        inicioP();
    }

    public void inicioP() {
        tablaModeloP();
        cargatablaP();
    }

    public void tablaModeloP() {
        //damos los parametros que se veran reflejados en la tabla
        tablaPlanillas.getColumnModel().getColumn(0).setPreferredWidth(40);
        tablaPlanillas.getColumnModel().getColumn(0).setPreferredWidth(40);
        tablaPlanillas.getColumnModel().getColumn(0).setPreferredWidth(80);
        tablaPlanillas.getColumnModel().getColumn(0).setPreferredWidth(80);
      //  tablaPlanillas.getColumnModel().getColumn(0).setPreferredWidth(80);

        modeloVer = (DefaultTableModel) tablaPlanillas.getModel();
        modeloVer.setNumRows(0);
    }

    public void cargatablaP() {
        //añadimos a traves de una lista los datos a la tabla
        List<Planilla> lista = controlP.listarPlanilla();

        for (Planilla actlist : lista) {

            String nombre = String.valueOf(actlist.getNombreEquipo());
            String nombre1 = String.valueOf(actlist.getNombreEquipo1());
            String lugar = String.valueOf(actlist.getLugar());
           // String fecha = String.valueOf(actlist.getFecha());
            modeloVer.addRow(new Object[]{actlist.getId_plani(), nombre, nombre1, lugar,});
        }
    }

    public void cargaTablaPlanilla(Planilla plani) {
        String nombre = plani.getNombreEquipo();
        String nombre1 = plani.getNombreEquipo1();
        //String fecha = String.valueOf(plani.getFecha());
        String lugar = plani.getLugar();
        modeloVer.addRow(new Object[]{plani.getId_plani(), nombre, nombre1, lugar,});
    }

    public void cargarPlanilla() {
        if (this.tablaPlanillas.isEnabled()) {
            int selectedRow = this.tablaPlanillas.getSelectedRow();
            Long id = Long.parseLong(modeloVer.getValueAt(selectedRow, 0).toString());
            Planilla plani = controlP.obtenerPlanilla(id);
            //obteniendo la id para futuas operaciones
            idPlanilla.setText(String.valueOf(plani.getId_plani())); 
          
        }
    }
    
    
    //  METODOS DE LA VENTANA ADICIONAL
    
    
    
    public void editarRegistro(){
        ModificarP.setText("Guardar");
        //todas las cajas de texto pasan a convertirse en editables
        textoequipo1.setEnabled(true);
        textoequipo2.setEnabled(true);
        textoLugar.setEnabled(true);
        textoArbitro.setEnabled(true);
        //modificamos estado de los botones
        verResultados.setEnabled(false);
        registroResultados.setEnabled(false);
        btCancelarM.setVisible(true);
        
    }
    
    
    //METODOS PARA LA MODIFICACION DE DATOS 
   
    public void inicio() {
        tablaModelo();
        cargatabla();
    }

    public void inicio2() {
        tablaModeloAr();
        //cargatablaAr();
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

    public void tablaModeloAr() {
        //damos los parametros que se veran reflejados en la tabla
        if (textoArbitro.getText().equals(" ")) {
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaArbitros.getColumnModel().getColumn(0).setPreferredWidth(80);

            modelo2 = (DefaultTableModel) tablaArbitros.getModel();
            modelo2.setNumRows(0);
            //cargatablaAr();
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
            if (!textoequipo1.getText().equalsIgnoreCase(nombre)) {
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
            //ID.setText(String.valueOf(equipo.getId_equi()));

            if (textoequipo1.getText().equals(" ")) {
                textoequipo1.setText(equipo.getNombreEquipo());
            } else {
                textoequipo2.setText(equipo.getNombreEquipo());
            }

        }
    }

    public void cargarArbitro() {

        //AQUI DEBEMOS CAMBIAR EL OBJETO
        if (this.tablaArbitros.isEnabled()) {
            int selectedRow = this.tablaArbitros.getSelectedRow();
            Long id = Long.parseLong(modelo2.getValueAt(selectedRow, 0).toString());
            Equipo equipo = control.obtenerEquipo(id);
            //idArbitro.setText(String.valueOf(equipo.getId_equi()));

            textoArbitro.setText(equipo.getNombreEquipo());

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

        PlanillaPrincipal = new javax.swing.JFrame();
        panelArbitros = new javax.swing.JScrollPane();
        tablaArbitros = new javax.swing.JTable();
        panelEquipos = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();
        titulo3 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        etiRegistro1 = new javax.swing.JLabel();
        EtiquetaRegistro1 = new javax.swing.JLabel();
        nombreEquipo3 = new javax.swing.JLabel();
        nombreEquipo4 = new javax.swing.JLabel();
        etiRegistro = new javax.swing.JLabel();
        textoequipo1 = new javax.swing.JTextField();
        textoequipo2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Direccion1 = new javax.swing.JLabel();
        textoArbitro = new javax.swing.JTextField();
        textoLugar = new javax.swing.JTextField();
        textoFecha = new javax.swing.JTextField();
        ModificarP = new javax.swing.JButton();
        eliminarP1 = new javax.swing.JButton();
        registroResultados = new javax.swing.JButton();
        verResultados = new javax.swing.JButton();
        Atras1 = new javax.swing.JButton();
        btCancelarM = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        lugar = new javax.swing.JLabel();
        arbitro = new javax.swing.JLabel();
        F12 = new javax.swing.JLabel();
        F13 = new javax.swing.JLabel();
        F14 = new javax.swing.JLabel();
        F15 = new javax.swing.JLabel();
        F16 = new javax.swing.JLabel();
        F17 = new javax.swing.JLabel();
        F11 = new javax.swing.JLabel();
        F18 = new javax.swing.JLabel();
        F19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlanillas = new javax.swing.JTable();
        EtiquetaRegistro = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        Ver = new javax.swing.JButton();
        textoBuscar = new javax.swing.JTextField();
        RegistrarE = new javax.swing.JButton();
        Direccion = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        buscarEquipo = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F9 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        idPlanilla = new javax.swing.JLabel();

        PlanillaPrincipal.getContentPane().setLayout(null);

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
                false, false, false
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

        PlanillaPrincipal.getContentPane().add(panelArbitros);
        panelArbitros.setBounds(400, 140, 280, 220);

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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        });
        panelEquipos.setViewportView(tablaEquipos);
        if (tablaEquipos.getColumnModel().getColumnCount() > 0) {
            tablaEquipos.getColumnModel().getColumn(0).setResizable(false);
            tablaEquipos.getColumnModel().getColumn(1).setResizable(false);
            tablaEquipos.getColumnModel().getColumn(2).setResizable(false);
            tablaEquipos.getColumnModel().getColumn(3).setResizable(false);
        }

        PlanillaPrincipal.getContentPane().add(panelEquipos);
        panelEquipos.setBounds(390, 370, 300, 210);

        titulo3.setText("DON DIEGO ");
        PlanillaPrincipal.getContentPane().add(titulo3);
        titulo3.setBounds(250, 80, 60, 14);

        titulo2.setText("ADMINISTRACION DE TORNEOS");
        PlanillaPrincipal.getContentPane().add(titulo2);
        titulo2.setBounds(120, 40, 156, 14);

        etiRegistro1.setText("Click Aqui!");
        PlanillaPrincipal.getContentPane().add(etiRegistro1);
        etiRegistro1.setBounds(270, 570, 49, 14);

        EtiquetaRegistro1.setText("Registro de planillas ");
        PlanillaPrincipal.getContentPane().add(EtiquetaRegistro1);
        EtiquetaRegistro1.setBounds(30, 140, 98, 14);

        nombreEquipo3.setText("EQUIPO A :");
        PlanillaPrincipal.getContentPane().add(nombreEquipo3);
        nombreEquipo3.setBounds(60, 190, 56, 14);

        nombreEquipo4.setText("EQUIPO B :");
        PlanillaPrincipal.getContentPane().add(nombreEquipo4);
        nombreEquipo4.setBounds(410, 190, 55, 14);

        etiRegistro.setText("Para registrar resultados");
        PlanillaPrincipal.getContentPane().add(etiRegistro);
        etiRegistro.setBounds(210, 550, 119, 14);

        textoequipo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoequipo1MouseClicked(evt);
            }
        });
        PlanillaPrincipal.getContentPane().add(textoequipo1);
        textoequipo1.setBounds(30, 240, 110, 20);

        textoequipo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoequipo2MouseClicked(evt);
            }
        });
        textoequipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoequipo2ActionPerformed(evt);
            }
        });
        PlanillaPrincipal.getContentPane().add(textoequipo2);
        textoequipo2.setBounds(400, 240, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/balon1.gif"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 140, 220, 160);

        Direccion1.setText("Local: Av Primero de mayo, Via la Costa");
        PlanillaPrincipal.getContentPane().add(Direccion1);
        Direccion1.setBounds(20, 610, 190, 14);

        textoArbitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoArbitroMouseClicked(evt);
            }
        });
        PlanillaPrincipal.getContentPane().add(textoArbitro);
        textoArbitro.setBounds(200, 340, 180, 20);
        PlanillaPrincipal.getContentPane().add(textoLugar);
        textoLugar.setBounds(200, 380, 180, 20);
        PlanillaPrincipal.getContentPane().add(textoFecha);
        textoFecha.setBounds(200, 420, 180, 20);

        ModificarP.setText("Modificar");
        ModificarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarPMouseClicked(evt);
            }
        });
        PlanillaPrincipal.getContentPane().add(ModificarP);
        ModificarP.setBounds(420, 350, 75, 23);

        eliminarP1.setText("Eliminar");
        eliminarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarP1ActionPerformed(evt);
            }
        });
        PlanillaPrincipal.getContentPane().add(eliminarP1);
        eliminarP1.setBounds(420, 410, 69, 23);

        registroResultados.setText("Registro resultados ");
        registroResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroResultadosActionPerformed(evt);
            }
        });
        PlanillaPrincipal.getContentPane().add(registroResultados);
        registroResultados.setBounds(350, 570, 129, 23);

        verResultados.setText("Ver resultados");
        PlanillaPrincipal.getContentPane().add(verResultados);
        verResultados.setBounds(230, 470, 101, 23);

        Atras1.setText("Atras");
        Atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras1ActionPerformed(evt);
            }
        });
        PlanillaPrincipal.getContentPane().add(Atras1);
        Atras1.setBounds(40, 560, 59, 23);

        btCancelarM.setText("Cancelar");
        btCancelarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMMouseClicked(evt);
            }
        });
        PlanillaPrincipal.getContentPane().add(btCancelarM);
        btCancelarM.setBounds(30, 380, 90, 20);

        fecha.setText("Fecha :");
        PlanillaPrincipal.getContentPane().add(fecha);
        fecha.setBounds(150, 420, 36, 14);

        lugar.setText("Lugar :");
        PlanillaPrincipal.getContentPane().add(lugar);
        lugar.setBounds(150, 380, 34, 14);

        arbitro.setText("Arbitro :");
        PlanillaPrincipal.getContentPane().add(arbitro);
        arbitro.setBounds(150, 340, 40, 14);

        F12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F12);
        F12.setBounds(0, 0, 120, 332);

        F13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F13);
        F13.setBounds(120, 0, 120, 332);

        F14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F14);
        F14.setBounds(240, 0, 120, 332);

        F15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F15);
        F15.setBounds(0, 332, 120, 310);

        F16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F16);
        F16.setBounds(120, 330, 120, 310);

        F17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F17);
        F17.setBounds(360, 330, 50, 310);

        F11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F11);
        F11.setBounds(410, 330, 280, 310);

        F18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F18);
        F18.setBounds(360, 0, 332, 332);

        F19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        PlanillaPrincipal.getContentPane().add(F19);
        F19.setBounds(240, 330, 120, 310);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPlanillas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Equipo A", "Equipo B", "Lugar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaPlanillas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPlanillasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPlanillas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 370, 220));

        EtiquetaRegistro.setText("Registro de planillas de encuentros");
        getContentPane().add(EtiquetaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 80, 20));

        Ver.setText("Ver");
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });
        getContentPane().add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 90, -1));

        textoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(textoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 240, 30));

        RegistrarE.setText("Registrar planilla");
        RegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 150, -1));

        Direccion.setText("Local: Av Primero de mayo, Via la Costa");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        Atras.setText("Atras");
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        buscarEquipo.setText("Buscar");
        buscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(buscarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        titulo1.setText("DON DIEGO ");
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 170, 50));

        titulo.setText("ADMINISTRACION DE TORNEOS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 350, 50));

        F6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 60, 190));

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 270, 190));

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 330));

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 330));

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 120, 330));

        F9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 190));

        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 190));

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 330, 330));

        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaginas.jpg"))); // NOI18N
        getContentPane().add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, 190));
        getContentPane().add(idPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBuscarActionPerformed

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        if(idPlanilla.getText().length()>=1){
            Long id = Long.parseLong(idPlanilla.getText());
            Planilla plani = controlP.obtenerPlanilla(id);
            plani.setId_plani(id);
            //le damos a las etiquetas de la nueva ventana los datos 
            
            dispose();
            PlanillaPrincipal.setVisible(true);
            PlanillaPrincipal.setLocationRelativeTo(null);
            PlanillaPrincipal.setTitle("Administracion de torneos de una cancha sintetica");
            PlanillaPrincipal.setBounds(350, 50, 690, 642);
            
            textoequipo1.setText(plani.getNombreEquipo());
            textoequipo2.setText(plani.getNombreEquipo1());
            textoLugar.setText(plani.getLugar());
            textoFecha.setText(String.valueOf(plani.getFecha()));
            textoArbitro.setText(plani.getNombreArbitro());
            
            textoArbitro.setEnabled(false);
            textoLugar.setEnabled(false);
            textoFecha.setEnabled(false);
            textoequipo1.setEnabled(false);
            textoequipo2.setEnabled(false);
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "No ha seleccion nada para ver ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_VerActionPerformed

    private void buscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEquipoActionPerformed
        if (textoBuscar.getText().length() >= 1) {
            Planilla e = null;
            Long numero = Long.parseLong(textoBuscar.getText());
            e = controlP.obtenerPlanilla(numero);
            if (e != null) {
                tablaModeloP();
                cargaTablaPlanilla(e);
            } else {
                JOptionPane.showMessageDialog(null, "No tenemos registro de ese equipo", null, JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene los campos para poder buscar", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarEquipoActionPerformed

    private void registroResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroResultadosActionPerformed
        JOptionPane.showMessageDialog(null, "Si funciona", null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_registroResultadosActionPerformed

    private void tablaPlanillasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPlanillasMouseClicked
        cargarPlanilla();
        
    }//GEN-LAST:event_tablaPlanillasMouseClicked

    private void RegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEActionPerformed
        // mostramos la pantalla consiguiente
        Registro_Planilla ventanaRp = new Registro_Planilla();
        dispose();
        ventanaRp.setVisible(true);
    }//GEN-LAST:event_RegistrarEActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // acciones del boton cancelar
        textoBuscar.setText(null);
        inicioP();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void textoequipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoequipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoequipo2ActionPerformed

    private void Atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras1ActionPerformed
        // direccion del boton
        PlanillaPrincipal.dispose();
        Planillas plani = new Planillas();
        plani.setVisible(true);
    }//GEN-LAST:event_Atras1ActionPerformed

    private void ModificarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarPMouseClicked
        
        Planilla planiya = null;
        if (ModificarP.getText().equalsIgnoreCase("Modificar")) {
            // llamamos al metodo que permite modificar los datos
            nom = textoequipo1.getText();
            nom1 = textoequipo2.getText();
            lug = textoLugar.getText();
            ar = textoArbitro.getText();
            fe = textoFecha.getText();
            
            btCancelarM.setVisible(true);
            editarRegistro();
        }else if(ModificarP.getText().equalsIgnoreCase("Guardar")){
            if ((textoequipo1.getText().length() >= 1) && (textoequipo2.getText().length() >= 1)
                    && (textoLugar.getText().length() >= 1) && (textoArbitro.getText().length() >= 1)
                    && (textoFecha.getText().length() >= 1)) {
                //creamos un objeto de tipo planilla para dat los nuevos datos y modificar
                planiya = new Planilla();

                Long id = Long.parseLong(idPlanilla.getText());
                planiya = controlP.obtenerPlanilla(id);
                planiya.setNombreEquipo(textoequipo1.getText());
                planiya.setNombreEquipo1(textoequipo2.getText());
                planiya.setLugar(textoLugar.getText());
                planiya.setNombreArbitro(textoArbitro.getText());

            //FALTA METER LA FECHA 
                if (controlP.editarPlanilla(planiya)) {
                    JOptionPane.showMessageDialog(rootPane, "Se edito con exito la planilla");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos no se puedo editar la planilla");
                }
                //cambiamos el estado de los botones y cajas 
                ModificarP.setText("Modificar");
                verResultados.setEnabled(true);
                registroResultados.setEnabled(true);
                btCancelarM.setVisible(false);

                //estado de las cajas
                textoArbitro.setEnabled(false);
                textoLugar.setEnabled(false);
                textoFecha.setEnabled(false);
                textoequipo1.setEnabled(false);
                textoequipo2.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Error debe rellenar los campo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }//GEN-LAST:event_ModificarPMouseClicked

    private void btCancelarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMMouseClicked
        // accion del boton cancelar
        textoequipo1.setText(nom);
        textoequipo2.setText(nom1);
        textoLugar.setText(lug);
        textoArbitro.setText(ar);
        textoFecha.setText(fe);
        
        textoArbitro.setEnabled(false);
        textoLugar.setEnabled(false);
        textoFecha.setEnabled(false);
        textoequipo1.setEnabled(false);
        textoequipo2.setEnabled(false);
    }//GEN-LAST:event_btCancelarMMouseClicked

    private void textoequipo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoequipo1MouseClicked
        // acciones al dar click
        textoequipo1.setText(" ");
        inicio();
        panelEquipos.setVisible(true);
        tablaEquipos.setVisible(true);
        
    }//GEN-LAST:event_textoequipo1MouseClicked

    private void textoequipo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoequipo2MouseClicked
        // acciones al dar click
        textoequipo2.setText(" ");
        tablaModelo();
        cargatabla2();
        panelEquipos.setVisible(true);
        tablaEquipos.setVisible(true);
    }//GEN-LAST:event_textoequipo2MouseClicked

    private void tablaArbitrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArbitrosMouseClicked
        // acciones al dar click en la tabla
        cargarArbitro();
        panelArbitros.setVisible(false);
        tablaArbitros.setVisible(false);
    }//GEN-LAST:event_tablaArbitrosMouseClicked

    private void textoArbitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoArbitroMouseClicked
        // acciones texto de arbitro
        tablaModeloAr();
        cargatablaAr();
        panelArbitros.setVisible(true);
        tablaArbitros.setVisible(true);
    }//GEN-LAST:event_textoArbitroMouseClicked

    private void tablaEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquiposMouseClicked
        
        cargarEquipo();
        panelEquipos.setVisible(false);
        tablaEquipos.setVisible(false);
    }//GEN-LAST:event_tablaEquiposMouseClicked

    private void eliminarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarP1ActionPerformed
        // Eliminar planilla
        // cargamos los datos para la eliminacion
        Planilla plani = null;
        Long id = Long.parseLong(idPlanilla.getText());
        plani = controlP.obtenerPlanilla(id);
        plani.setId_plani(id);
        int op = JOptionPane.showConfirmDialog(rootPane, "¿Deseoa eliminar la planilla?", "Eliminacion", 0);
        //se cambia las opciones de los botones
        if (op == 0) {
            JOptionPane.showMessageDialog(rootPane, "Se ha eliminado con exito");
            
            controlP.eliminarPlanilla(id);
            PlanillaPrincipal.dispose();
            Planillas pla = new Planillas();
            pla.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Eliminacion cancelada");
            
        }
    }//GEN-LAST:event_eliminarP1ActionPerformed

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
            java.util.logging.Logger.getLogger(Planillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planillas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Atras1;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Direccion1;
    private javax.swing.JLabel EtiquetaRegistro;
    private javax.swing.JLabel EtiquetaRegistro1;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F11;
    private javax.swing.JLabel F12;
    private javax.swing.JLabel F13;
    private javax.swing.JLabel F14;
    private javax.swing.JLabel F15;
    private javax.swing.JLabel F16;
    private javax.swing.JLabel F17;
    private javax.swing.JLabel F18;
    private javax.swing.JLabel F19;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel F9;
    private javax.swing.JButton ModificarP;
    private javax.swing.JFrame PlanillaPrincipal;
    private javax.swing.JButton RegistrarE;
    private javax.swing.JButton Ver;
    private javax.swing.JLabel arbitro;
    private javax.swing.JButton btCancelarM;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton buscarEquipo;
    private javax.swing.JButton eliminarP1;
    private javax.swing.JLabel etiRegistro;
    private javax.swing.JLabel etiRegistro1;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel idPlanilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lugar;
    private javax.swing.JLabel nombreEquipo3;
    private javax.swing.JLabel nombreEquipo4;
    private javax.swing.JScrollPane panelArbitros;
    private javax.swing.JScrollPane panelEquipos;
    private javax.swing.JButton registroResultados;
    private javax.swing.JTable tablaArbitros;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTable tablaPlanillas;
    private javax.swing.JTextField textoArbitro;
    private javax.swing.JTextField textoBuscar;
    private javax.swing.JTextField textoFecha;
    private javax.swing.JTextField textoLugar;
    private javax.swing.JTextField textoequipo1;
    private javax.swing.JTextField textoequipo2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JButton verResultados;
    // End of variables declaration//GEN-END:variables
}
