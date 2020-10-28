package com.techreturners.exercise001;

import java.util.Arrays;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr){
        // Add your code here!
    	int sum = 0;
		int[] arrayOriginal = arr;
		Arrays.sort(arrayOriginal);

		
		int[] arNumElementos = new int[arrayOriginal.length];
		int contador = 0;
		int aux = arrayOriginal[0];
		int iterador = 0;
		for (int i = 0; i < arrayOriginal.length; i++) {
			if (aux == arrayOriginal[i]) {
				contador = contador + aux;
				if(i>=1) {
					contador=0;
					aux=0;
				}
			} else {
				arNumElementos[iterador] = contador;
				contador = 0;
				aux = arrayOriginal[i];
				contador = contador + aux;
				iterador++;
			}
		}
		arNumElementos[iterador] = contador;

		for (int z = 0; z < arNumElementos.length; z++) {
			if (arNumElementos[z] != 0) {
				sum += arNumElementos[z];	
			}

		}
        return sum;
    }
}
