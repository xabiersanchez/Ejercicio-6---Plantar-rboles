/* XABIER SANCHEZ VALERO
https://github.com/xabiersanchez/Ejercicio-6---Plantar-rboles.git */

package ej;

public class Ejercicio6 {
	
	public static void main(String args[]) {
		
		int[] aAreas = {4, 2, 6, 7};
		int[] aFactdens = {2, 8, 1, 6};
		
		int arbolplant;
		int arboltotal = 0;
		
		for(int i = 0; i < 4; i++) {
			arbolplant = aAreas[i] * aFactdens[i];
			System.out.println("El numero de arboles plantados en el area " + (i+1) + " es = " + arbolplant);
			arboltotal += arbolplant;
		}
		System.out.println("");
		System.out.println("El numero de arboles plantados totales es = " + arboltotal);
	}
}
