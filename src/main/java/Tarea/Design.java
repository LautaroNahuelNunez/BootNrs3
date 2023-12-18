package Tarea;

import DAO.Main;
import Interfaces.DAOTareaImplementacion;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Design extends javax.swing.JFrame {

     public Design() {
        initComponents();
         
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_cabecera = new javax.swing.JPanel();
        lbl_cabecera = new javax.swing.JLabel();
        panel_campos = new javax.swing.JPanel();
        lbl_ID = new javax.swing.JLabel();
        lbl_tarea = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_tarea = new javax.swing.JTextField();
        panel_botones = new javax.swing.JPanel();
        btn_agregarTarea = new javax.swing.JButton();
        btn_modificarTareaSeleccionada = new javax.swing.JButton();
        btn_eliminarTareaSeleccionada = new javax.swing.JButton();
        btn_buscarTarea = new javax.swing.JButton();
        panel_lista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_cabecera.setBackground(new java.awt.Color(153, 153, 153));

        lbl_cabecera.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        lbl_cabecera.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cabecera.setText("PANEL DE TAREAS");

        javax.swing.GroupLayout panel_cabeceraLayout = new javax.swing.GroupLayout(panel_cabecera);
        panel_cabecera.setLayout(panel_cabeceraLayout);
        panel_cabeceraLayout.setHorizontalGroup(
            panel_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cabeceraLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(lbl_cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_cabeceraLayout.setVerticalGroup(
            panel_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_campos.setBackground(new java.awt.Color(255, 255, 255));

        lbl_ID.setBackground(new java.awt.Color(0, 0, 0));
        lbl_ID.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ID.setText("ID");

        lbl_tarea.setForeground(new java.awt.Color(0, 0, 0));
        lbl_tarea.setText("Tarea");

        javax.swing.GroupLayout panel_camposLayout = new javax.swing.GroupLayout(panel_campos);
        panel_campos.setLayout(panel_camposLayout);
        panel_camposLayout.setHorizontalGroup(
            panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_camposLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        panel_camposLayout.setVerticalGroup(
            panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_camposLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        panel_botones.setBackground(new java.awt.Color(204, 204, 204));

        btn_agregarTarea.setText("Agregar Tarea");
        btn_agregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarTareaActionPerformed(evt);
            }
        });

        btn_modificarTareaSeleccionada.setText("Modificar Tarea Seleccionada");
        btn_modificarTareaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarTareaSeleccionadaActionPerformed(evt);
            }
        });

        btn_eliminarTareaSeleccionada.setText("Eliminar Tarea Seleccionada");
        btn_eliminarTareaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarTareaSeleccionadaActionPerformed(evt);
            }
        });

        btn_buscarTarea.setText("Buscar Tarea por ID");
        btn_buscarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_botonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_eliminarTareaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_botonesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_agregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_botonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_modificarTareaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_botonesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_buscarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_agregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_modificarTareaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_eliminarTareaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_buscarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        panel_lista.setBackground(new java.awt.Color(102, 102, 102));

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Fecha Inicio", "Tarea"
            }
        ));
        jScrollPane1.setViewportView(tabla_datos);

        javax.swing.GroupLayout panel_listaLayout = new javax.swing.GroupLayout(panel_lista);
        panel_lista.setLayout(panel_listaLayout);
        panel_listaLayout.setHorizontalGroup(
            panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panel_listaLayout.setVerticalGroup(
            panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_listaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_campos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*-----------------INICIO FUNCION DE BOTONES-------------------*/    
    
    /*BOTON AGREGAR TAREA*/
    private void btn_agregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarTareaActionPerformed
        if(agregar()){
            mostrar();
            limpiar();
        }
    }//GEN-LAST:event_btn_agregarTareaActionPerformed

    private void btn_buscarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarTareaActionPerformed
        buscar();
    }//GEN-LAST:event_btn_buscarTareaActionPerformed

    private void btn_modificarTareaSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarTareaSeleccionadaActionPerformed
        if(modificar()){
            mostrar();
            limpiar();
        }
    }//GEN-LAST:event_btn_modificarTareaSeleccionadaActionPerformed

    private void btn_eliminarTareaSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarTareaSeleccionadaActionPerformed
        if(eliminar()){
            mostrar();
            limpiar();
        }
    }//GEN-LAST:event_btn_eliminarTareaSeleccionadaActionPerformed

    /*-----------------FIN FUNCION DE BOTONES-------------------*/
    
    
    /*-----------------INICIO LOGICA DE BOTONES-------------------*/
    /*METODO AGREGAR*/
    public boolean agregar() {
        DAOTareaImplementacion tarea_dao = new DAOTareaImplementacion();
        Tarea tarea = new Tarea();
        
        String descripcionTarea = txt_tarea.getText();
        
        if(descripcionTarea.isBlank()){
            JOptionPane.showMessageDialog(null, "El campo 'tarea' no pueden estar vacío");
        }else {              
            LocalDate hoy = LocalDate.now();

            tarea.setFechaInicio(hoy);
            tarea.setTarea(descripcionTarea);
            
            return tarea_dao.agregar(tarea);
        }
        return false;
    }
        
    /*METODO MOSTRAR*/
    public void mostrar(){
        try {
            
            Main main = new Main();
            
            //GENERAMOS LA SENTENCIA SQL
            String sql = "SELECT * FROM tareas";
            
            //ESTABLECEMOS LA CONEXION A LA BBDD
            Connection conexion = main.establecerConexion();
            
            //CREAMOS UN MODELO PARA ALMACENAR LOS REGISTROS DENTRO DE LA TABLA
        
            DefaultTableModel model = new DefaultTableModel();
            
            //CREAMOS UNA DECLARACION PARA EJECUTAR LA CONSULTA SQL
            Statement st = conexion.createStatement();
            
            //EJECUTAMOS LA QUERY
            ResultSet rs = st.executeQuery(sql);
            
            //OBTENEMOS LA INFORMACION DE LAS COLUMNAS DE LA CONSULTA
            ResultSetMetaData metaData = rs.getMetaData();
            
            int numColumnas = metaData.getColumnCount();
            
            //CREAMOS LAS COLUMNAS EN LA TABLA
            
            //for (int column = 1; column <= numColumnas-1; column++) {
                model.addColumn("ID");
                model.addColumn("Fecha Inicio");
                model.addColumn("Tarea");
            //}
            
            //AGREGAMJOS LAS FILAS AL MODELO DE LA TABLA (LOS DATOS)
            while (rs.next()) {                
                Object[] rowData = new Object[numColumnas];
                for (int i = 0; i < numColumnas; i++) {
                    rowData[i] = rs.getObject(i+1);
                }
                model.addRow(rowData);
            }            
            //ASIGNAMOS EL MODEL DE LA TABLA AL COMPONENTE TABLADATOS
            tabla_datos.setModel(model);
            
            // Establecemos el ancho de las columnas
            int[] columnWidths = {50, 100, 500}; // Ancho de cada columna en píxeles
            for (int i = 0; i < numColumnas; i++) {
                TableColumn column = tabla_datos.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }                           
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    
    /*METODO PARA MODIFICAR*/
    public boolean modificar(){
        DAOTareaImplementacion tarea_dao = new DAOTareaImplementacion();
        Tarea tarea = new Tarea();
        
        if (txt_id.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Coloque un ID numérico para modificar");
        } else {
            if(esNumeroEntero(txt_id.getText())){ //CHEQUEO QUE EL VALOR INGRESADO COMO ID SEA UN NUMERO ENTERO Y NO CARACTERES DE LETRAS
                
                int id = Integer.parseInt(txt_id.getText());
                String descripcionTarea = txt_tarea.getText();

                tarea.setId(id);
                tarea.setTarea(descripcionTarea);

                return tarea_dao.modificar(tarea);
            } else {
                JOptionPane.showMessageDialog(null, "El ID a modificar debe ser numérico");
            }
        }    
        return false;
    }
    
    /*METODO PARA BUSCAR*/
    public void buscar(){
        DAOTareaImplementacion tarea_dao = new DAOTareaImplementacion();
        Tarea tarea = new Tarea();
        
        if (txt_id.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Coloque un ID numérico para buscar");
        } else {
            if(esNumeroEntero(txt_id.getText())){
                int id = Integer.parseInt(txt_id.getText());

                tarea.setId(id);
                tarea_dao.buscar(tarea);

                txt_id.setText(String.valueOf(tarea.getId()));
                txt_tarea.setText(tarea.getTarea());
            } else {
                JOptionPane.showMessageDialog(null, "El ID a buscar debe ser numérico");
            }
        }
    }
    
    /*METODO PARA ELIMINAR*/
    
    public boolean eliminar(){
        DAOTareaImplementacion tarea_dao = new DAOTareaImplementacion();
        Tarea tarea = new Tarea();
        
        if (txt_id.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Coloque un ID numérico para eliminar");
        } else {
            if(esNumeroEntero(txt_id.getText())){
                int id = Integer.parseInt(txt_id.getText());
                
                tarea.setId(id);
                return tarea_dao.eliminar(tarea);
            } else {
                JOptionPane.showMessageDialog(null, "El ID a eliminar debe ser numérico");
            }
        }
        return false;
    }
    /*METODO PARA VALIDAR SI UN STRING PUEDE PARSEARSE A ENTERO*/
    public boolean esNumeroEntero(String txt){
        try{
            Integer.parseInt(txt);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    
    /*METODO PARA LIMPIAR LOS CAMPOS DE TEXTO*/
    private void limpiar(){
        txt_id.setText("");
        txt_tarea.setText("");
    }
    
    
    /*-----------------FIN LOGICA DE BOTONES-------------------*/
    
    
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
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Design design = new Design();
                
                design.setVisible(true);
                //design.txt_id.setEditable(false);
                //design.txt_id.setFocusable(false);
                design.mostrar();
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarTarea;
    private javax.swing.JButton btn_buscarTarea;
    private javax.swing.JButton btn_eliminarTareaSeleccionada;
    private javax.swing.JButton btn_modificarTareaSeleccionada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_cabecera;
    private javax.swing.JLabel lbl_tarea;
    private javax.swing.JPanel panel_botones;
    private javax.swing.JPanel panel_cabecera;
    private javax.swing.JPanel panel_campos;
    private javax.swing.JPanel panel_lista;
    private javax.swing.JTable tabla_datos;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_tarea;
    // End of variables declaration//GEN-END:variables
}
