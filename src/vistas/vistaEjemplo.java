/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import clasesData.Conexion;
import clasesData.Datas;
import clasesEntidad.Usuario;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernan14
 */
public class vistaEjemplo extends javax.swing.JInternalFrame {

    private Conexion con;
    private Datas data;
    private Usuario usuario;
    /** Creates new form vistaEjemplo */
    public vistaEjemplo() {
        initComponents();
        con=new Conexion();
        data = new Datas(con);
        usuario = new Usuario();
        jTApellido.setEnabled(false);
        jTMail.setEnabled(false);
        jTNombre.setEnabled(false);
        jTPassword.setEnabled(false);
        JdcFechaDeEntrada.setEnabled(false);
        jBPdf.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlBuscarUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTPassword = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTMail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JdcFechaDeEntrada = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBPdf = new javax.swing.JButton();

        JlBuscarUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JlBuscarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlBuscarUsuario.setText("BUSCAR USUARIO");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DNI:");

        jTDni.setText("41136");

        jLabel3.setText("APELLIDO");

        jTApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("PASSWORD");

        jTPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPasswordActionPerformed(evt);
            }
        });

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("NOMBRE");

        jTMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMailActionPerformed(evt);
            }
        });

        jLabel6.setText("MAIL");

        JdcFechaDeEntrada.setBackground(new java.awt.Color(0, 153, 204));
        JdcFechaDeEntrada.setFocusable(false);

        jLabel7.setText("FECHA DE ENTRADA");

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBPdf.setText("CONVERTIR A PDF ");
        jBPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(JlBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTPassword)
                                    .addComponent(JdcFechaDeEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTMail)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel5)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTApellido)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTDni))))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JlBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(JdcFechaDeEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jBPdf))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoActionPerformed

    private void jTPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPasswordActionPerformed

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jTMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMailActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        if(jTDni.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "el Campo dni esta vacio");
            jTDni.requestFocus();
        }else{
            String dni = jTDni.getText();
            usuario = data.buscarUsuario(dni);
            jTApellido.setText(usuario.getApellido());
            jTMail.setText(usuario.getMail());
            jTPassword.setText(usuario.getPassword());
            jTNombre.setText(usuario.getNombre());
            Date fechae = Date.from(usuario.getFechaEntrada().atStartOfDay(ZoneId.systemDefault()).toInstant());
            JdcFechaDeEntrada.setDate(fechae);
            jTNombre.setText(usuario.getNombre());
            jTApellido.setEnabled(true);
            jTMail.setEnabled(true);
            jTNombre.setEnabled(true);
            jTPassword.setEnabled(true);
            jBPdf.setEnabled(true);
         }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPdfActionPerformed
        Document documento = new Document(PageSize.A3,50, 25, 25, 25);
        String dniu = jTDni.getText();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/desktop/ProyectoTrabajo/"+dniu+".pdf"));
            documento.open();
            //imagen
            Image imagen = null;
            imagen = Image.getInstance("\\Users\\Hernan14\\Documents\\NetBeansProjects\\PrototipoPrograma\\src\\vistas\\imagen.jpg");
            imagen.scaleAbsolute(100f, 200f);
            imagen.setAbsolutePosition(0,120);
            //imagen a celda
            PdfPTable tabla = new PdfPTable(6);
            PdfPCell celda = new PdfPCell(imagen);
            celda.setBorderWidth(2);
            celda.setColspan(3);
            celda.setPadding(20);
            tabla.addCell(celda);
            tabla.addCell("DNI");
            tabla.addCell("NOMBRE");
            tabla.addCell("APELLIDO");
            tabla.addCell("MAIL");
            tabla.addCell("PASSWORD");
            tabla.addCell("FECHA DE ENTRADA");
            tabla.addCell(jTDni.getText());
            tabla.addCell(jTNombre.getText());
            tabla.addCell(jTApellido.getText());
            tabla.addCell(jTMail.getText());
            tabla.addCell(jTPassword.getText());
            tabla.addCell(JdcFechaDeEntrada.getDate().toString());
            //documento.add(imagen);
            documento.add(tabla);
            documento.close();
        } 
        catch (DocumentException | FileNotFoundException ex ) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException  ex) {
            Logger.getLogger(vistaEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JdcFechaDeEntrada;
    private javax.swing.JLabel JlBuscarUsuario;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBPdf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTMail;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPassword;
    // End of variables declaration//GEN-END:variables

}