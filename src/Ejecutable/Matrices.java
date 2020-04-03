package Ejecutable;

public class Matrices {
	private  int fila;
	private int columna;
	
	public Matrices(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	
	public int getColumna() {
		return this.columna;	
	}
	public int getFila() {
		return this.fila;
	}
	
	//Test con numeros aleatorios
	public int[][] result() {
		int a[][] = new int[this.fila][this.columna];
		for(int i = 0; i < getFila(); i++ ) {
			for(int j = 0;j < getColumna(); j++) {
				a[i][j] = (int) (Math.random()*20+1);
			}
		}
		return a;
	}
	
	//suma y resta;
	public int[][] sumatoria(int a[][], int b[][]) {
		int resultado[][] = new int[a.length][b.length];
		for(int i = 0; i < a.length; i++ ) {
			for(int j = 0;j < b.length; j++) {
				resultado[i][j] = a[i][j] + b[i][j];
			}
		}
		return resultado;
	}
	
	public int[][] resta(int a[][], int b[][]) {
		int resultado[][] = new int[a.length][b[0].length];
		for(int i = 0; i < a.length; i++ ) {
			for(int j = 0;j < b[i].length; j++) {
				resultado[i][j] = a[i][j] - b[i][j];
			}
		}
		return resultado;
	}
	
	//multiplicacion
	
	public int[][] mulEscalar(int a, int b[][]) {
			int r[][] = new int[b.length][b[0].length];
			
			for(int i = 0; i < b.length; i++ ) {
				for(int j = 0;j < b[i].length; j++) {
					r[i][j] = a*b[i][j];
				}
			}
			
		return r;
		
	}
	
	public int[][] mulMatriz(int a[][], int b[][]) {
		
		int filaA= a.length;
		int columnaA = a[0].length;
		int filaB = b.length;
		int columnaB = b[0].length;
		
		if(columnaA != filaB) {
			throw new RuntimeException("No se pueden multiplicar las matrices");
		}
		int[][] multiplicacion = new int[filaA][columnaB];
			
		for (int i=0; i < multiplicacion.length; i++) {
			for (int j=0; j < multiplicacion[i].length; j++) {
				int cont = 0;
				for(int z= 0;z < multiplicacion.length; z++ ) {
					cont = a[z][j]*b[i][z] + cont;
					
					
				}
				multiplicacion[i][j] = cont;
			}
		}
		
		return multiplicacion;
		
	}
	
	
	
	
}
