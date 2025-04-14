package org.example.controlador;

import org.example.modelo.CalculadoraModelo;
import org.example.vista.CalculadoraVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador {
    private CalculadoraModelo modelo;
    private CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.agregarSumaListener(new SumaListener());
        this.vista.agregarRestaListener(new RestaListener());
        this.vista.agregarMultiplicacionListener(new MultiplicacionListener());
        this.vista.agregarDivisionListener(new DivisionListener());
    }

    class SumaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = vista.getNum1();
                double num2 = vista.getNum2();
                modelo.sumar(num1, num2);
                vista.setResultado(modelo.getResultado());
            } catch (NumberFormatException ex) {
                vista.mostrarError("Ingrese números válidos");
            }
        }
    }

    class RestaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = vista.getNum1();
                double num2 = vista.getNum2();
                modelo.restar(num1, num2);
                vista.setResultado(modelo.getResultado());
            } catch (NumberFormatException ex) {
                vista.mostrarError("Ingrese números válidos");
            }
        }
    }

    class MultiplicacionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = vista.getNum1();
                double num2 = vista.getNum2();
                modelo.multiplicar(num1, num2);
                vista.setResultado(modelo.getResultado());
            } catch (NumberFormatException ex) {
                vista.mostrarError("Ingrese números válidos");
            }
        }
    }

    class DivisionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = vista.getNum1();
                double num2 = vista.getNum2();
                if (num2 == 0) {
                    vista.mostrarError("No se puede dividir por cero");
                } else {
                    modelo.dividir(num1, num2);
                    vista.setResultado(modelo.getResultado());
                }
            } catch (NumberFormatException ex) {
                vista.mostrarError("Ingrese números válidos");
            }
        }
    }
}
