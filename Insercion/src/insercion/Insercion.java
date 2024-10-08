
package insercion;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Insercion {

    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
        
        
        int arreglo[], nElementos, pos, aux;
        
         nElementos = Integer.parseInt(JOptionPane.showInputDialog("Dijite el numero de elementos del arreglo "));
        
        arreglo = new int[nElementos];
        
        System.out.println("Dijite los elementos del arreglo:");
        
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+ ". Dijite un número: ");
            arreglo[i]= entrada.nextInt();
        }
        //ordenamiento por insercion
        for(int i=0; i<nElementos;i++){
            pos = i;
            aux = arreglo[i];
            
            while((pos>0)  && (arreglo[pos-1]> aux)){
                //numero actual 
                arreglo[pos]= arreglo[pos-1];
                pos--;
            }
            
            // refrescar el numero actual
            arreglo [pos]= aux;
            
        }
        
        System.out.print("\nOrden ascendente: ");
        for (int i=0; i<nElementos; i++){
            System.out.print(arreglo[i]+ " - ");
        
    }
        System.out.println("");
        
        
        System.out.print("Orden Descendente: ");
        for (int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i] + " - ");
    }
        System.out.println("");
    }
    
}
