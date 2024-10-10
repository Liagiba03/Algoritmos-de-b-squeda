package com.tesji.quicksort.model;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ordenamiento {
	private static int arregloN[];
	
	public int[] quicksort(int numeros[], int izq, int der) {
		if(izq>der) {
			return numeros;
		}
		int i= izq, d=der; //Se almacenan los números izq y der para utilizarlos después
		if(izq!=der) { //La izq es diferente a la der
			int pivote;
			int aux;
			pivote= izq; //Se pone al pivote como el primer número
			while(izq!=der) { //Mientras los indices sean diferentes
				while(numeros[der]>=numeros[pivote] && izq<der) { //Mientras no. derecha sean mayores que pivote || m m m m
					der--; //Se decrementa el indice para ir hacia pivote
				}
				while(numeros[izq]<numeros[pivote]&& izq<der) { //Mientras no. izquierda sea menor que el pivote m m m m m ||
					izq++; //Se incrementa el indice para ir hacia pivote
				}
				if(der!=izq) { //La izq es diferente a la der
					aux = numeros[der]; //Se guarda temporalmenete el no.a a derecha
					numeros[der]= numeros[izq]; //Se cambian las posiciones 
					numeros[izq]=aux; //se asigna a la posición izquierda el auxiliar
				}
				if(izq==der) {//Cuando se cruzen los indices
					quicksort(numeros, i, izq-1); //Se pasa el subarreglo de la izquierda (menores)
					quicksort(numeros, izq+1,d); //Se pasa el subarreglo de la derecha (mayores)
				}
			}
			
		}else {
			return numeros;
		}
		return numeros;
	}
	
	public void Metodos(int opcion, JTextArea txt) {
		switch(opcion) {
		case 1:  //CREAR ARR
			int tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el tamanio del arreglo"));
			arregloN= new int[tamanio];
			for(int i=0; i<arregloN.length ; i++) {
				arregloN[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la posicion "+i));
			}
			JOptionPane.showMessageDialog(null,"Arreglo creado");
			break;
			
		case 2: //ORDENAR
			quicksort(arregloN,0, arregloN.length-1);
			
			for(int i=0; i<arregloN.length;i++) {
				if(i==0) {
					txt.setText(String.valueOf(arregloN[i]));
				}else {
				txt.setText(txt.getText()+" , "+arregloN[i]);
				}
			}
			break;
			
		case 3: //AGREGAR NO.
			int arreglo[]= new int[arregloN.length+1];
			for(int i=0; i<arregloN.length;i++) {
				arreglo[i]= arregloN[i];
			}
			
			arreglo[arreglo.length-1] = Integer.parseInt
					(JOptionPane.showInputDialog(null,"Ingresa el número a agregar "));
			
			arregloN = new int[arregloN.length+1];
			arregloN =arreglo.clone();
			JOptionPane.showMessageDialog(null,"Elemento agregado");
			break;
			
		case 4: //REINICIAR ARR
			arregloN=null;
			JOptionPane.showMessageDialog(null,"Arreglo borrado. Inicia nuevamente");
			break;
		}
	}
}
