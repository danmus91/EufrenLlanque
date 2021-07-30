/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eufrenllanque;

/**
 *
 * @author Sergio
 */
public class Problema03 {
    
    public double[] convertir (int a)
    {
        double segundos, minutos, horas;        
        double [] intArray = new double[3];
        segundos = a;        
        minutos = segundos / 60;
        horas = minutos / 60;
        
        intArray[0] = segundos;
        intArray[1]= minutos;
        intArray[2]= horas;
        
        return intArray;
    }
            
            
    
}
