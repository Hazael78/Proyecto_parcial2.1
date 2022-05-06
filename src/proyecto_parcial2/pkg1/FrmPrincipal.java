/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parcial2.pkg1;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author hazae
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo = new DefaultTableModel();
    List<Informacion> Datos = new ArrayList<>();
    
    int posicion = 0;
    

    /**
     * Creates new form Principal
     */
    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        Titulos();
        Cargar();
        
        
        //jScrollPane2.setVisible(false);
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
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprofesion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        btngrabar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");

        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombres ingresados");

        txttelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttelefono.setForeground(new java.awt.Color(102, 0, 102));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Teléfono");

        txtcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(102, 0, 102));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Profesión");

        txtprofesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprofesion.setForeground(new java.awt.Color(102, 0, 102));

        jScrollPane1.setForeground(new java.awt.Color(0, 255, 0));

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla1);

        jScrollPane2.setForeground(new java.awt.Color(51, 0, 255));

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla2);

        btngrabar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btngrabar.setForeground(new java.awt.Color(102, 102, 102));
        btngrabar.setText("Grabar datos");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Agenda");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Datos ingresados");

        btnactualizar.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(102, 102, 102));
        btnactualizar.setText("Actualizar datos");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttelefono)
                                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btngrabar)
                                    .addComponent(btnactualizar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngrabar))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        // TODO add your handling code here:
        Archivos conexion = new Archivos();
        Informacion dato = new Informacion();
        
        dato.setProfesion(txtprofesion.getText().toString());
        dato.setCorreo(txtcorreo.getText().toString());
        dato.setNombre(txtnombre.getText().toString());
        dato.setTelefono(Integer.valueOf(txttelefono.getText()));
        
        
        conexion.Agregar(dato);
        Datos = conexion.getDatos();
        
        if(conexion.Grabar(Datos, 0)){
            
            JOptionPane.showMessageDialog(this, 
                    "Se registro con éxito", 
                    "Éxito",JOptionPane.INFORMATION_MESSAGE);
            CargarRegistro();
            
        }else{
            JOptionPane.showMessageDialog(this, 
                   "Error al grabar el archivo", 
                   "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btngrabarActionPerformed
    
    
   
    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        // TODO add your handling code here:
        int nfilas = Tabla1.getSelectedRowCount();
        int fila = 0;
        
        if(nfilas == 1){
            fila = Tabla1.getSelectedRow();
            new FrmBaseD().setVisible(true);
            
            posicion = fila;
            
            //Muestra mostrar = new FrmBaseD();
            
            String nom = Tabla1.getValueAt(fila, 0).toString();
            FrmBaseD.Nombre.setText(nom);
            
            String tele = Tabla2.getValueAt(fila, 2).toString();
            FrmBaseD.telefono.setText(tele);
            
            String corre = Tabla2.getValueAt(fila, 0).toString();
            FrmBaseD.correo.setText(corre);
            
            String prof = Tabla2.getValueAt(fila, 1).toString();
            FrmBaseD.profesion.setText(prof);
        }
        
    }//GEN-LAST:event_Tabla1MouseClicked

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        Archivos conexion = new Archivos();
        Informacion dato = new Informacion();
        
        dato.setProfesion(txtprofesion.getText().toString());
        dato.setCorreo(txtcorreo.getText().toString());
        dato.setNombre(txtnombre.getText().toString());
        dato.setTelefono(Integer.valueOf(txttelefono.getText()));
        
        Datos.set(posicion, dato);
        
        if(conexion.Grabar(Datos, 1)){
            
            JOptionPane.showMessageDialog(this, 
                    "Se actualizó con éxito", 
                    "Éxito",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            CargarRegistro();
            
        }else{
            JOptionPane.showMessageDialog(this, 
                   "No se pudo actualizar el archivo", 
                   "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    
    private void Cargar(){
        Archivos conexion = new Archivos();
        if(conexion.Verificar()){
            if(conexion.Leer()){
                Datos = conexion.getDatos();
                CargarRegistro();
            }else{
                JOptionPane.showMessageDialog(this, 
                    "No se puede leer la informacion", 
                    "Error",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, 
                    "No existe el archivo", 
                    "ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void Titulos(){
        modelo2.addColumn("Correo");
        modelo2.addColumn("Profesion");
        modelo2.addColumn("Telefono");
        
        Tabla2.setModel(modelo2);
        
        modelo.addColumn("Nombre");
        Tabla1.setModel(modelo);
    }
    
    private void CargarRegistro(){
        
        //TABLA DATOS
        Object[] filatabla = new Object [3];
        for(Informacion dato : Datos){
            
            filatabla[0] = dato.getCorreo();
            filatabla[1] = dato.getProfesion();
            filatabla[2] = dato.getTelefono();
            
            modelo2.addRow(filatabla);
        }
        
        Tabla2.setModel(modelo2);
        
        //TABLA NOMBRE
        Object[] fila = new Object[1];
        for(Informacion dato : Datos){
            fila[0] = dato.getNombre();
            
            modelo.addRow(fila);
        }
        
        Tabla1.setModel(modelo);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprofesion;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
