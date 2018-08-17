/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video53;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gleez
 */
public class Video53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        int arreglo[], nElementos, pos, aux; 
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de lementos: ")); 
       arreglo = new int[nElementos];
       
       System.out.println("Digite el arreglo: ");
       for(int i=0; i<nElementos; i++){
           System.out.println((i+1)+" Digite un numero: ");
           arreglo[i] = entrada.nextInt(); 
        
       }
        
       //ordenamiento por inserccion 
       for(int i = 0; i<nElementos; i++){
           pos = 1; 
           aux = arreglo[i]; 
           
           while((pos>0)&& (arreglo[pos-1]>aux)){
               arreglo [pos] = arreglo[pos-1]; 
               pos--; 
           }
           arreglo[pos] = aux;
       }
       System.out.print("\nOrden ascendente: " ); 
       for (int i =0; i<nElementos; i++){
           System.out.print(arreglo[i]+" - ");
       }
    }
    
}
