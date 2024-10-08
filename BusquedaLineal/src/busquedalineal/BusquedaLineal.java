package busquedalineal;

import javax.swing.JOptionPane;

public class BusquedaLineal {
   
    public static void main(String[] args) {
        
         //Declaracion del array
    int [] numeros = {23,43,1,5,2};
    int dato;
    boolean band=false;
        dato= Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO A BUSCAR: "));
    System.out.println("Arreglo");
    for(int i=0; i<numeros.length;i++){
    System.out.print(numeros[i]+" , ");
    }
    //BUSQUEDA SECUENCIAL
    int i=0;
    while(i<5 &&band ==false){
            if(numeros[i]==dato){
                band=true;
            }
            i++;
        }
    System.out.println("BUSQUEDA LINEAL");
    if(band==false){
        System.out.println("EL NUMERO NO ESTA EN EL ARREGLO");
        }
        else{
        System.out.println("EL NUMERO YA SE ENCONTRO, ESTA EN LA POSICION: " + (i-1));
        }
    }
    
}
