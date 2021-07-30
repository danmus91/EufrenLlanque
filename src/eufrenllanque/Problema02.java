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
public class Problema02 {
    
    int[] intArray = new int[3];
    int b,c,d;
    
    public int[] calculo (int a)
    {
        b= a+10;
        c= 2*b+a;
        d= a+b+c+5;
        
       intArray [0] = b;
       intArray [1] = c;
       intArray [2] = d;       
        
       return  intArray;
    }
    
    
}
