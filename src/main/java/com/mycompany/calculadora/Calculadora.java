/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author WORKING
 */
public class Calculadora {
public static void main(String[] args)
{
//Instanciar objeto
ObjetoCalculadora calculadora = new ObjetoCalculadora();
//Se asignan valores a los atributos de la clase
calculadora.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1")));
calculadora.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2")));
//Se ejecutan las operaciones
//Suma
calculadora.setResultado(calculadora.calcularSuma());
calculadora.imprimir("la suma");
//Resta
calculadora.setResultado(calculadora.calcularResta());
calculadora.imprimir("la resta");
//Multiplicacion
calculadora.setResultado(calculadora.calcularMultiplicacion());
calculadora.imprimir("la multiplicacion");
//División
calculadora.setResultado(calculadora.calcularDivision());
calculadora.imprimir("la division");
}
}

