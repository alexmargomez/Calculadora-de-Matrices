package Ejecutable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Operaciones extends JFrame{
	
	private JPanel contentPane;
	
	
	
	public Operaciones(int a[][], int b[][]) {
	
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(40, 40, 225, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int resul[][] = new int[3][3];
		
		for(int i = 0; i < a.length; i++ ) {
			for(int j = 0;j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("-----------------------------------");
		for(int i = 0; i < b.length; i++ ) {
			for(int j = 0;j < b[0].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("------resultado suma----------------");
		resul = sumatoria(a,b);
		
		for(int i = 0; i < resul.length; i++ ) {
			for(int j = 0;j < resul[0].length; j++) {
				System.out.print(resul[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("##########################################################3");
		JLabel lblMatrizA = new JLabel("f");
		lblMatrizA.setBounds(67, 11, 39, 14);
		contentPane.add(lblMatrizA);
		
		JButton button = new JButton("A+B");
		button.setBounds(74, 30, 80, 30);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal regreso = new Principal();
				//setVisible(false);
				regreso.setVisible(true);
			}
			
		});
	}
	
	
public static void main(String[] args) {
		
		try {
	        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	            if ("Nimbus".equals(info.getName())) {
	                javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                break;
	            }
	        }
	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    //</editor-fold>

	    /* Create and display the form */
		
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
		int[][] multiplicacion = new int[filaA][columnaB];
		
		if(columnaA != filaB) {
			throw new RuntimeException("No se pueden multiplicar las matrices");
		}else {
			for (int i=0; i < filaA; i++) {
				for (int j=0; j < columnaB; j++) {
					int cont = 0;
					for(int z= 0;z < filaB; z++ ) {
						cont = a[i][z]*b[z][j] + cont;
						
						
					}
					multiplicacion[i][j] = cont;
				}
			}
			return multiplicacion;
		}
		
		
	}
	
	
	
	
}
