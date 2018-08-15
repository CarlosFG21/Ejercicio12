
package ejercicio12video17;

import java.util.*;
import javax.swing.JOptionPane;

public class figuras {
    
    public void medir(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ELIGE UNA OPCION: \n1: CUADRADO \n2: RECTANGULO \n3: TRIANGULO \n4: CIRCULO ");
        
        int figura = entrada.nextInt();
        
        switch(figura){
        
            case 1: 
                
            int lado =Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL LADO"));
            
            System.out.println("EL AREA DEL CUADRADO ES: " + Math.pow(lado,2));
            
            break;
            
            case 2:
                
            int base = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA BASE"));
                
            int altura = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA ALTURA"));
            
            System.out.println("EL AREA DEL RECTANGULO ES: " + base*altura);
                
            break;
            
            case 3:
            
            base = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA BASE"));
            
            altura = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA ALTURA"));
            
            System.out.println("EL AREA DEL TRIANGULO ES: " + (base*altura)/2);
            
            break;
            
            case 4: 
            
            int radio = Integer.parseInt(JOptionPane.showInputDialog("INTODUCE LA BASE"));
            
            System.out.print("EL AREA DEL CIRCULO ES: ");
            
            System.out.printf("%1.2", Math.PI*(Math.pow(radio,2)));
            
            break;
            
            default:
                
            System.out.println("LA OPCION NO ES LA CORRECTA");
                
        }
        
    }
}
