package com.mycompany.peluqueriacanina.igu;

import javax.swing.*;


public class CargaDatos extends javax.swing.JFrame {

    private JTextField txtNombre;
    private JTextArea textArea1;
    private JComboBox cmbAlergico;
    private JComboBox cmbAtEsp;
    private JButton btnLimpiar;
    private JTextField txtRaza;
    private JTextField txtColor;
    private JTextField txtNomDueño;
    private JPanel Jpanel;
    private JLabel txtObservaciones;
    private JButton btnGuardar;
    private JTextField txtCelDueño;


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt){
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        txtObservaciones.setText("");
        txtNomDueño.setText("");
        txtCelDueño.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtEsp.setSelectedIndex(0);
    }

}
