/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendafrutas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESFOT
 */
public class VentanaFrutas extends javax.swing.JFrame {

    ArrayList<Frutas> ListaFrutas = new ArrayList();
    ArrayList <Cliente> ListaClientes = new ArrayList();
   
    DefaultTableModel TablaFrutas;
    
    public VentanaFrutas() {
        initComponents();
        ComboFrutas.insertItemAt("Manzana",1);
        ComboFrutas.insertItemAt("Platano",2);
        ComboFrutas.insertItemAt("Pera",3);
        ComboFrutas.insertItemAt("Sandia",4);
        ComboFrutas.insertItemAt("Melón",5); 
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblTituloFruta = new javax.swing.JLabel();
        lblListaFruta = new javax.swing.JLabel();
        ComboFrutas = new javax.swing.JComboBox<>();
        lblCodigo = new javax.swing.JLabel();
        txtCodigoFruta = new javax.swing.JTextField();
        lblNombreFruta = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtNombreFruta = new javax.swing.JTextField();
        txtPrecioFruta = new javax.swing.JTextField();
        btnRegistrarFruta = new javax.swing.JButton();
        btnRegistrarPedido = new javax.swing.JButton();
        lblTituloPedido = new javax.swing.JLabel();
        lblListaCedulas = new javax.swing.JLabel();
        ComboCedulas = new javax.swing.JComboBox<>();
        btnMostrarPedido = new javax.swing.JButton();
        lblInformacion = new javax.swing.JLabel();
        lblPedido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePedido = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtInformacion = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        lblMensajeFruta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblCliente.setText("Cliente");

        lblNombre.setText("Nombre");

        lblCedula.setText("Cédula");

        lblTituloFruta.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblTituloFruta.setText("Frutas");

        lblListaFruta.setText("Lista de Frutas");

        ComboFrutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FRUTAS" }));

        lblCodigo.setText("Codigo");

        lblNombreFruta.setText("Nombre");

        lblPrecio.setText("Precio");

        btnRegistrarFruta.setText("Añadir fruta al pedido");
        btnRegistrarFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFrutaActionPerformed(evt);
            }
        });

        btnRegistrarPedido.setText("REGISTRAR PEDIDO");
        btnRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedidoActionPerformed(evt);
            }
        });

        lblTituloPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTituloPedido.setText("Pedidos Registrados");

        lblListaCedulas.setText("Lista de cédulas");

        ComboCedulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCedulasActionPerformed(evt);
            }
        });

        btnMostrarPedido.setText("Mostrar Pedido");
        btnMostrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPedidoActionPerformed(evt);
            }
        });

        lblInformacion.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblInformacion.setText("Información del cliente");

        lblPedido.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblPedido.setText("Pedidos del Cliente");

        TablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablePedido);

        lblTotal.setText("Total");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTotal)
                                        .addGap(48, 48, 48)
                                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnExit)
                                .addGap(240, 240, 240)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInformacion)
                        .addGap(166, 166, 166)
                        .addComponent(lblPedido)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTituloPedido)
                            .addComponent(lblCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTituloFruta)
                        .addGap(212, 212, 212))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblNombre)
                                                    .addComponent(lblCedula))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                                    .addComponent(txtCedula))
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblListaFruta)
                                                    .addComponent(lblCodigo)
                                                    .addComponent(lblNombreFruta)
                                                    .addComponent(lblPrecio)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnRegistrarPedido)
                                                .addGap(34, 34, 34)))
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(ComboFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCodigoFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtNombreFruta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtPrecioFruta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnRegistrarFruta))
                                .addGap(18, 18, 18)
                                .addComponent(lblMensajeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblListaCedulas)
                                .addGap(39, 39, 39)
                                .addComponent(ComboCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btnMostrarPedido)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(lblTituloFruta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListaFruta)
                    .addComponent(ComboFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreFruta)
                    .addComponent(txtNombreFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensajeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecioFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarFruta)
                .addGap(37, 37, 37)
                .addComponent(btnRegistrarPedido)
                .addGap(18, 18, 18)
                .addComponent(lblTituloPedido)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListaCedulas)
                    .addComponent(ComboCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarPedido))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInformacion)
                    .addComponent(lblPedido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTotal)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRegistrarFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFrutaActionPerformed
       
        String codigo=txtCodigoFruta.getText();
         String nombreFruta = (String)ComboFrutas.getSelectedItem();
        txtNombreFruta.setText(nombreFruta);
        String precio= txtPrecioFruta.getText(); 
        Frutas comparacionF = new Frutas(codigo,nombreFruta,precio);
        boolean existeF=false;
        for(Frutas item: ListaFrutas){
        if(item.getCodigo().equals(comparacionF.getCodigo().equals(comparacionF.getCodigo()))){
              existeF=true;
                JOptionPane.showMessageDialog(rootPane,"Este codigo ya existe");
                break;
           }
        }
        
        if(existeF==false){ 
            ListaFrutas.add(comparacionF);
        }
                                                      

        
        
        
       
        
    }//GEN-LAST:event_btnRegistrarFrutaActionPerformed

    private void btnRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPedidoActionPerformed
        if(datos()==true){
         String nombre=txtNombre.getText();
         String cedula=txtCedula.getText();
        
         Cliente comparacionC  = new Cliente(nombre,cedula);
        
        boolean existeC=false;
        
        for(Cliente item:ListaClientes){ 
            if(item.getNombre().equals(comparacionC.getNombre())&& item.getCedula().equals(comparacionC.getCedula())){ 
                existeC=true;
                JOptionPane.showMessageDialog(rootPane,"Este cliente ya existe");
                break;
            }
        
        } 
        if(existeC==false){ 
            ListaClientes.add(comparacionC);
            ComboCedulas.insertItemAt(txtCedula.getText(),1);
        }
        }else{
        JOptionPane.showMessageDialog(rootPane,"Por favor Ingrese todos los datos");
        }
    }//GEN-LAST:event_btnRegistrarPedidoActionPerformed

    private void btnMostrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPedidoActionPerformed
       
    }//GEN-LAST:event_btnMostrarPedidoActionPerformed

    private void ComboCedulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCedulasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCedulasActionPerformed
 
    public boolean datos(){ 
        boolean confirmacion=true;
        if(txtNombre.getText().equals("")|| txtCedula.getText().equals("")){
        
        confirmacion=false;
        return confirmacion;
        }else {
        return confirmacion;
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCedulas;
    private javax.swing.JComboBox<String> ComboFrutas;
    private javax.swing.JTable TablePedido;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMostrarPedido;
    private javax.swing.JButton btnRegistrarFruta;
    private javax.swing.JButton btnRegistrarPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblListaCedulas;
    private javax.swing.JLabel lblListaFruta;
    private javax.swing.JLabel lblMensajeFruta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreFruta;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTituloFruta;
    private javax.swing.JLabel lblTituloPedido;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoFruta;
    private javax.swing.JTextField txtInformacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreFruta;
    private javax.swing.JTextField txtPrecioFruta;
    // End of variables declaration//GEN-END:variables
}
