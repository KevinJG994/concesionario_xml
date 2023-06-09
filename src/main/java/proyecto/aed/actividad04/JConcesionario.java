package proyecto.aed.actividad04;

import java.util.ArrayList;

public class JConcesionario extends javax.swing.JFrame {

    Coche coche;
    Concesionario concesionario;
    String cadena = "";
    ArrayList<Coche> coches;

    public JConcesionario() {
        initComponents();
        coche = new Coche();
        concesionario = new Concesionario();
        coches = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        btnBorrarConce = new javax.swing.JButton();
        jp2 = new javax.swing.JPanel();
        lblModelo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        btnMas = new javax.swing.JButton();
        btnBorrarVehi = new javax.swing.JButton();
        jp3 = new javax.swing.JPanel();
        btnLeer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtMostrar = new javax.swing.JButton();
        txtBorrarArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Concesionario JAX Binding");
        setResizable(false);

        jp1.setBorder(javax.swing.BorderFactory.createTitledBorder("Concesionario"));

        lblNombre.setText("Nombre");

        lblDireccion.setText("Dirección");

        txtNombre.setToolTipText("Nombre Concesionario.");

        txtUbicacion.setToolTipText("Dirección Concesionario.");

        btnBorrarConce.setText("Borrar");
        btnBorrarConce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarConceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnBorrarConce)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDireccion)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnBorrarConce)
                .addContainerGap())
        );

        jp2.setBorder(javax.swing.BorderFactory.createTitledBorder("Vehículos"));

        lblModelo.setText("Marca");

        lblMarca.setText("Modelo");

        lblColor.setText("Color");

        lblMatricula.setText("Matrícula");

        txtMarca.setToolTipText("Marca Vehículo.");

        txtModelo.setToolTipText("Modelo Vehículo.");

        txtColor.setToolTipText("Color de Vehículo.");

        txtMatricula.setToolTipText("Matrícula de Vehículo.");

        btnMas.setText("Mas+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnBorrarVehi.setText("Borrar");
        btnBorrarVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarVehiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo)
                            .addComponent(lblMarca)
                            .addComponent(lblColor)
                            .addComponent(lblMatricula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addComponent(btnMas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btnBorrarVehi)))
                .addContainerGap())
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblModelo)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMarca)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMas)
                    .addComponent(btnBorrarVehi))
                .addContainerGap())
        );

        jp3.setBorder(javax.swing.BorderFactory.createTitledBorder("XML"));

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        txtMostrar.setText("Mostrar Archivo");
        txtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarActionPerformed(evt);
            }
        });

        txtBorrarArchivo.setText("Borrar Archivo");
        txtBorrarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBorrarArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp3Layout.createSequentialGroup()
                        .addComponent(txtMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBorrarArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLeer))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeer)
                    .addComponent(txtMostrar)
                    .addComponent(txtBorrarArchivo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarConceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarConceActionPerformed
        txtNombre.setText("");
        txtUbicacion.setText("");
    }//GEN-LAST:event_btnBorrarConceActionPerformed

    private void btnBorrarVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarVehiActionPerformed
        txtMarca.setText("");
        txtModelo.setText((""));
        txtColor.setText("");
        txtMatricula.setText("");
    }//GEN-LAST:event_btnBorrarVehiActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        String nombre = txtNombre.getText();
        String ubicacion = txtUbicacion.getText();

        String marca = txtModelo.getText();
        String modelo = txtMarca.getText();
        String color = txtColor.getText();
        String matricula = txtMatricula.getText();

        coche = new Coche(marca, modelo, color, matricula);
        coches.add(coche);

        EscribirXML escribir = new EscribirXML();
        escribir.escribirDatos(coches, nombre, ubicacion);

        txtModelo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtMatricula.setText("");
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        LecturaXML leer = new LecturaXML();
        cadena = leer.leerXML();
        txtArea.setText(cadena);
    }//GEN-LAST:event_btnLeerActionPerformed

    private void txtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarActionPerformed
        JXml newFrame = new JXml();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_txtMostrarActionPerformed

    private void txtBorrarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBorrarArchivoActionPerformed
        LecturaXML leer = new LecturaXML();
        leer.BorrarArchivo();
    }//GEN-LAST:event_txtBorrarArchivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarConce;
    private javax.swing.JButton btnBorrarVehi;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnMas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JButton txtBorrarArchivo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JButton txtMostrar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
