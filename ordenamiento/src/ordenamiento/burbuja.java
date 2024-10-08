package ordenamiento;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class burbuja {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int arreglo[],nElemtos;

nElemtos= Integer.parseInt(JOptionPane.showInputDialog("cantidad de elemtos a ordenar"));
	arreglo = new int[nElemtos];
	for(int  i=0;i<(nElemtos);i++){
		System.out.println((i+1)+". Digite un numero: ");
		arreglo[i]= entrada.nextInt();
	}

	//metodo burbuja 
	for(int i=0;i<(nElemtos-1);i++){
		for(int j=0;j<(nElemtos-1);j++){
			if(arreglo[j]>arreglo[j+1]){
				int aux = arreglo[j];
				arreglo[j]=arreglo[j+1];
				arreglo[j+1]= aux;
			}
		}
	}
//mostrando el arreglo ordenado en forma creciente 
	System.out.print("\nArreglo ordenado en forma creciente: ");
	for(int i=0;i<nElemtos;i++){
		System.out.print(arreglo[i]+"-");
	}
}
}


