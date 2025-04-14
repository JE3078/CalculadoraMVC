package org.example.modelo;

public class CalculadoraModelo {
    private double resultado;

    public void sumar(double num1, double num2) {
        resultado = num1 + num2;
    }

    public void restar(double num1, double num2) {
        resultado = num1 - num2;
    }

    public void multiplicar(double num1, double num2) {
        resultado = num1 * num2;
    }


    public void dividir(double num1, double num2) {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            resultado = Double.NaN; // Not a Number
        }
    }

    public double getResultado() {
        return resultado;
    }
}
