/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.operaciones;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author pablo
 */
public class registrar_campo extends javax.swing.JFrame {

    operaciones oper = new operaciones();
    List<Tiposuelo> listaTipoSuelo;
    
    
    
    
    
    
    public registrar_campo() {
        initComponents();
        setLocationRelativeTo(null);
        llenarTipoSuelo();
        limpiarTabla();
        nombreEnUso.setVisible(false);
        loteEnUso.setVisible(false);
    }

    public void limpiarTabla(){
        while(jTable1.getRowCount()!=0){
            ((DefaultTableModel)jTable1.getModel()).removeRow(0);
        }
    }
    public void limpiar_lote(){
        // Metodo para limpiar carga de lote
        numero.setText("");
        superficieLote.setText("");
       
    }
    public void llenarTipoSuelo(){
        // Metodo para llenar el combo tipo suelo atravez de tipoSueloVer
        listaTipoSuelo = oper.tipoSueloVer();
        tipoSuelo.removeAllItems();
        // tipoSuelo.addItem("Seleccione Tematica");
        for (Tiposuelo tem : listaTipoSuelo) {
                tipoSuelo.addItem(""+ tem.getNombreTiposuelo() + "");
        }
        
        }
    public void cargar_tabla_lotes(String numero, int superficie, String tipoSuelo){
        // Metodo para agregar un lote a la tabla
                DefaultTableModel tabla = (DefaultTableModel)jTable1.getModel();
                Vector datos = new Vector();
                datos.add(numero);
                datos.add(superficie);
                datos.add(tipoSuelo);
                tabla.addRow(datos);
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
        usuario = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        superficie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        loteEnUso = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        superficieLote = new javax.swing.JTextField();
        tipoSuelo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nombreEnUso = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Superficie: ");

        jLabel3.setText("Usuario: ");

        usuario.setText("Pablo");

        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });

        superficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                superficieKeyTyped(evt);
            }
        });

        jLabel4.setText("ha.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Lotes");

        jLabel6.setText("Tenga en cuenta que debe ingresar al menos");

        jLabel7.setText("1 lote");

        jLabel8.setText("Superficie:");

        jLabel9.setText("Nro:");

        jLabel10.setText("Tipo de suelo:");

        loteEnUso.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loteEnUso.setForeground(new java.awt.Color(255, 0, 0));
        loteEnUso.setText("Este nro. de lote ya esta en uso");

        numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroKeyTyped(evt);
            }
        });

        superficieLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                superficieLoteKeyTyped(evt);
            }
        });

        tipoSuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nro", "Superficie", "Tipo de Suelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        nombreEnUso.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nombreEnUso.setForeground(new java.awt.Color(255, 0, 0));
        nombreEnUso.setText("Este nombre ya está en uso");

        jButton1.setText("Agregar Lote");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Quitar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Registrar Campo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreEnUso, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addGap(189, 189, 189))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tipoSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(numero)
                                            .addComponent(superficieLote, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                                .addComponent(loteEnUso)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(57, 57, 57))
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreEnUso))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(usuario))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(superficieLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addComponent(loteEnUso))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // metodo del boton cancelar, me saca de sistema
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        // Metodo que controla que no se repita el nombre de campo a travez de buscar_campo
        if (!nombre.getText().equals("")){
               if(oper.buscar_campo(nombre.getText())){
                    nombreEnUso.setVisible(true);
                    nombre.requestFocus();
               }
                else
                    nombreEnUso.setVisible(false);
        
    }//GEN-LAST:event_nombreFocusLost
    }
    public int sumar_superficie_lote(){
        int aux=0;
        for(int i=0; i< jTable1.getRowCount(); i++){
                 aux += Integer.parseInt(jTable1.getValueAt(i,1).toString());   
            }
        return aux;
      
    }
    public void guardar_lotes(int idCampo){
    int aux=0;
    String numero="";
    int superficie=0;
    int tiposuelo=0;
    int id_campo=idCampo;
    String observaciones="";
    for(int i=0; i< jTable1.getRowCount(); i++){
            numero= jTable1.getValueAt(i,0).toString();
            superficie=Integer.parseInt(jTable1.getValueAt(i,1).toString());
            tiposuelo=oper.obtener_id_suelo(jTable1.getValueAt(i,2).toString());
            Lote lote = new Lote(numero,superficie,tiposuelo,id_campo,observaciones);
            oper.guardar_lote(lote);
              
            }
    }
    
    
    
    
    public boolean buscar_tabla(String valorBusqueda){
        // busca en la tabla si existe algun lote con ese numero
            for(int i=0; i< jTable1.getRowCount(); i++){
                if(jTable1.getValueAt(i,0).equals(valorBusqueda)){
                   return true;
                }
            
            }
        return false;
    
    }
    
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Logica del boton guardar campo
        int sup =sumar_superficie_lote();
        if (nombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de campo","",JOptionPane.ERROR_MESSAGE);
            nombre.requestFocus();
        } 
        else if(superficie.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Debe ingresar una superficie mayor que cero","",JOptionPane.ERROR_MESSAGE);
            superficie.requestFocus();
        } 
        else if(superficie.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar una superficie","",JOptionPane.ERROR_MESSAGE);
            superficie.requestFocus();
        }
        else if(sup==0){
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos un lote","",JOptionPane.ERROR_MESSAGE);
            numero.requestFocus();
        }
        else if(sup != Integer.parseInt(superficie.getText())){
            JOptionPane.showMessageDialog(null, "La superficie del campo debe coincidir con la de los lotes","",JOptionPane.ERROR_MESSAGE);
            numero.requestFocus();
        
        
        }
        else {
                
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Confirma el registro del campo?", "Registrar Campo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (JOptionPane.OK_OPTION == confirmado){
                    Campo auxCampo = new Campo(nombre.getText(),Integer.parseInt(superficie.getText()),1);
                    int id_generado = oper.guardar_campo(auxCampo);
                    guardar_lotes(id_generado);
                    this.dispose();
                    new vista.registrar_exitoso(id_generado).setVisible(true);
                }
                    
                else
                    System.exit(0);
            
                    
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (numero.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero de lote","",JOptionPane.ERROR_MESSAGE);
            numero.requestFocus();
            
        }
        else if(superficieLote.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Debe ingresar una superficie mayor que cero","",JOptionPane.ERROR_MESSAGE);
            superficieLote.requestFocus();
              
        }
        else if(superficieLote.getText().equals("")) { 
            JOptionPane.showMessageDialog(null, "Debe ingresar la superficie del lote","",JOptionPane.ERROR_MESSAGE);
            superficieLote.requestFocus();
        }else{ 
            
            if(!buscar_tabla(numero.getText())){
            loteEnUso.setVisible(false);
            cargar_tabla_lotes(numero.getText(),Integer.parseInt(superficieLote.getText()), tipoSuelo.getSelectedItem().toString());
            limpiar_lote();
            }else{
                loteEnUso.setVisible(true);
                numero.requestFocus();
            }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Borrar una file de la tabla
        DefaultTableModel auxTabla = (DefaultTableModel)jTable1.getModel();
        if (jTable1.getSelectedRow()>= 0){
            int id = jTable1.getSelectedRow();
            auxTabla.removeRow(id);
        } else JOptionPane.showMessageDialog(null, "Debe seleccionar un lote","",JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void superficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_superficieKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
        if(((c < '0') ||
         (c > '9')) &&
         (c != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }  
        
    }//GEN-LAST:event_superficieKeyTyped

    private void numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyTyped
        // ingresar solo numeros
        char c=evt.getKeyChar(); 
        if(((c < '0') ||
         (c > '9')) &&
         (c != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }  
     
    }//GEN-LAST:event_numeroKeyTyped

    private void superficieLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_superficieLoteKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
        if(((c < '0') ||
         (c > '9')) &&
         (c != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }  
    }//GEN-LAST:event_superficieLoteKeyTyped
    
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
            java.util.logging.Logger.getLogger(registrar_campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrar_campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrar_campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrar_campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrar_campo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel loteEnUso;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreEnUso;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField superficie;
    private javax.swing.JTextField superficieLote;
    private javax.swing.JComboBox<String> tipoSuelo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
