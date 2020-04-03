package Ejecutable;

import Interface.Principal;

public class main {
	
	public static void main(String[] args) {
		/* No toquen eso please
		Principal prin = new Principal();
		prin.run();
		//comiencen a trabajar aqui :)*/
		int fila = 0;
		int columna = 0;
		Matrices ls = new Matrices(2,3);
		Matrices B = new Matrices(0,0);
		Matrices C = new Matrices(3,2);
		int matrizA[][] = new int[ls.getFila()][ls.getColumna()];
		int matrizB[][] = new int[B.getFila()][B.getColumna()];
		int matrizC[][] = new int[C.getFila()][C.getColumna()];
		int resl[][] = new int[C.getFila()][C.getColumna()];
		
		matrizA = ls.result();
		matrizC = C.result();
		resl = B.mulMatriz(matrizA,matrizC);
		
		for(int i = 0; i < ls.getFila(); i++ ) {
			for(int j = 0;j < ls.getColumna(); j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for(int i = 0; i < C.getFila(); i++ ) {
			for(int j = 0;j < C.getColumna(); j++) {
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		for(int i = 0; i < ls.getFila(); i++ ) {
			for(int j = 0;j < ls.getColumna(); j++) {
				System.out.print(resl[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
