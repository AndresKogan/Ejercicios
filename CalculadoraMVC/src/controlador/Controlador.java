/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VistaCalculadora;
import Modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener {

    VistaCalculadora vista;
    Modelo modelo;

    public Controlador(VistaCalculadora vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        vista.setVisible(true);
        vista.setTitle("Calculadora");
        vista.setLocationRelativeTo(null);

        vista.jButton0.addActionListener(this);
        vista.jButton1.addActionListener(this);
        vista.jButton2.addActionListener(this);
        vista.jButton3.addActionListener(this);
        vista.jButton4.addActionListener(this);
        vista.jButton5.addActionListener(this);
        vista.jButton6.addActionListener(this);
        vista.jButton7.addActionListener(this);
        vista.jButton8.addActionListener(this);
        vista.jButton9.addActionListener(this);
        vista.botonDivi.addActionListener(this);
        vista.botonMulti.addActionListener(this);
        vista.botonSuma.addActionListener(this);
        vista.botonResta.addActionListener(this);
        vista.botonIgual.addActionListener(this);
        vista.botonComa.addActionListener(this);
        vista.botonBorrar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vista.jButton0)) {

            this.vista.resultado.setText(this.vista.resultado.getText() + "0");

        } else if (e.getSource().equals(vista.jButton1)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "1");

        } else if (e.getSource().equals(vista.jButton2)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "2");

        } else if (e.getSource().equals(vista.jButton3)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "3");

        } else if (e.getSource().equals(vista.jButton4)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "4");

        } else if (e.getSource().equals(vista.jButton5)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "5");

        } else if (e.getSource().equals(vista.jButton6)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "6");

        } else if (e.getSource().equals(vista.jButton7)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "7");

        } else if (e.getSource().equals(vista.jButton8)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "8");

        } else if (e.getSource().equals(vista.jButton9)) {
            this.vista.resultado.setText(this.vista.resultado.getText() + "9");

        } else if (e.getSource().equals(vista.botonComa)) {
            if (this.vista.resultado.getText().contains(".")) {
            } else {

                this.vista.resultado.setText(this.vista.resultado.getText() + ".");

            }
        } else if (e.getSource().equals(vista.botonDivi)) {
            this.vista.muestroNumero1.setText(this.vista.resultado.getText());
            this.vista.resultado.setText("");
            this.vista.muestroOperacion.setText("/");

        } else if (e.getSource().equals(vista.botonSuma)) {
            this.vista.muestroNumero1.setText(this.vista.resultado.getText());
            this.vista.resultado.setText("");
            this.vista.muestroOperacion.setText("+");

        } else if (e.getSource().equals(vista.botonMulti)) {
            this.vista.muestroNumero1.setText(this.vista.resultado.getText());
            this.vista.resultado.setText("");
            this.vista.muestroOperacion.setText("*");

        } else if (e.getSource().equals(vista.botonResta)) {
            this.vista.muestroNumero1.setText(this.vista.resultado.getText());
            this.vista.resultado.setText("");
            this.vista.muestroOperacion.setText("-");

        } else if (e.getSource().equals(vista.botonDivi)) {
            this.vista.muestroNumero1.setText(this.vista.resultado.getText());
            this.vista.resultado.setText("");
            this.vista.muestroOperacion.setText("/");

        } else if (e.getSource().equals(vista.botonIgual)) {
            if (this.vista.resultado.getText().equals("")) {
                this.vista.resultado.setText(this.modelo.operaciones(this.vista.muestroNumero1.getText(), this.vista.muestroNumero2.getText(), this.vista.muestroOperacion.getText()));
            } else {
                this.vista.muestroNumero2.setText(this.vista.resultado.getText());
                this.vista.resultado.setText(this.modelo.operaciones(this.vista.muestroNumero1.getText(), this.vista.muestroNumero2.getText(), this.vista.muestroOperacion.getText()));

            }
        } else if (e.getSource().equals(vista.botonBorrar)) {
            this.vista.resultado.setText("");
            this.vista.muestroNumero1.setText("");
            this.vista.muestroNumero2.setText("");
            this.vista.muestroOperacion.setText("");
        }
    }
}
