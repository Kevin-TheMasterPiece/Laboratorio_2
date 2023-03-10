/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author WORKING
 */
public class ObjetoCalculadora {
   //declarar las propiedadas y su visibilidad (encapsulamiento)
private int numero1;
private int numero2;
private int resultado;
boolean var = true;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        if (numero1 > 0){
            this.numero1 = numero1;
            
        }else {
            JOptionPane.showMessageDialog(null, "DIGITE UN VALOR MAYOR A 0");
            
        }
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        if (numero2 > 0){
        this.numero2 = numero2;
        }else JOptionPane.showMessageDialog(null, "DIGITE UN VALOR MAYOR A 0");
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
//constructor
public ObjetoCalculadora() {
super();
}
 
//metodos con la logica del programa 
public int calcularSuma ()
{
return numero1 + numero2;
}
public int calcularResta ()
{
return numero1 - numero2;
}
public int calcularMultiplicacion ()
{

return numero1 * numero2;
}
public int calcularDivision ()
{
if (numero2 != 0)
{
return numero1 / numero2;
}else return 0;
} 
public void imprimir (String msj){
    JOptionPane.showMessageDialog(null, "El resultado de "+msj+" es: "+resultado);
}
}
