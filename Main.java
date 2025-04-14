package org.example;

import org.example.controlador.CalculadoraControlador;
import org.example.modelo.CalculadoraModelo;
import org.example.vista.CalculadoraVista;

public class Main {
    public static void main(String[] args) {
        // Crear modelo, vista y controlador
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);

        // Mostrar la vista
        vista.setVisible(true);
    }
}
