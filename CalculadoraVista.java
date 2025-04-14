package org.example.vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculadoraVista extends JFrame {
    private JTextField num1Field = new JTextField(10);
    private JTextField num2Field = new JTextField(10);
    private JButton sumaButton = new JButton("+");
    private JButton restaButton = new JButton("-");
    private JButton multiplicacionButton = new JButton("*");
    private JButton divisionButton = new JButton("/");
    private JTextField resultadoField = new JTextField(10);

    public CalculadoraVista() {
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Número 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Número 2:"));
        panel.add(num2Field);
        panel.add(sumaButton);
        panel.add(restaButton);
        panel.add(multiplicacionButton);
        panel.add(divisionButton);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultadoField);

        resultadoField.setEditable(false);

        this.add(panel);
    }

    public double getNum1() {
        return Double.parseDouble(num1Field.getText());
    }

    public double getNum2() {
        return Double.parseDouble(num2Field.getText());
    }

    public void setResultado(double resultado) {
        resultadoField.setText(Double.toString(resultado));
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void agregarSumaListener(ActionListener listener) {
        sumaButton.addActionListener(listener);
    }

    public void agregarRestaListener(ActionListener listener) {
        restaButton.addActionListener(listener);
    }

    public void agregarMultiplicacionListener(ActionListener listener) {
        multiplicacionButton.addActionListener(listener);
    }

    public void agregarDivisionListener(ActionListener listener) {
        divisionButton.addActionListener(listener);
    }
}