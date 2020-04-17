package Ejecutable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuDeterminante extends JFrame{

	public MenuDeterminante(int a[][], int b[][]) {
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setBounds(40, 40, 280, 125);
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			double a1[][]= new double [a.length][a[0].length];
			double b1[][]= new double [b.length][b[0].length];
			
			 for(int i=0; i<a.length; i++)
	             for(int j=0; j<a[0].length; j++)
	                 a1[i][j] = a[i][j];
			 
			 for(int i=0; i<b.length; i++)
	             for(int j=0; j<b[0].length; j++)
	                 b1[i][j] = b[i][j];
			 
			
			JButton button = new JButton("A");
			button.setBounds(74, 30, 50, 30);
			contentPane.add(button);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(a[0].length == a.length) {
						//resultado

						double resul = determinante(a1);
						
						Resultados r = new Resultados(resul);
						r.setLocationRelativeTo(null);
						setVisible(false);
						r.setVisible(true);
					}else {
						ERROR error = new ERROR();
						error.setLocationRelativeTo(null);
						error.setVisible(true);
					}
					
				}
				
			});
			
			JButton button2 = new JButton("B");
			button2.setBounds(140, 30, 50, 30);
			contentPane.add(button2);
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(b[0].length == b.length) {
						//resultado
						
						double resul = determinante(b1);
						
						Resultados r = new Resultados(resul);
						r.setLocationRelativeTo(null);
						setVisible(false);
						r.setVisible(true);
					}else {
						ERROR error = new ERROR();
						error.setLocationRelativeTo(null);
						error.setVisible(true);
					}
					
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
		        java.util.logging.Logger.getLogger( MenuDeterminante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		    } catch (InstantiationException ex) {
		        java.util.logging.Logger.getLogger( MenuDeterminante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		    } catch (IllegalAccessException ex) {
		        java.util.logging.Logger.getLogger( MenuDeterminante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		        java.util.logging.Logger.getLogger( MenuDeterminante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		    }
		}

		public static double determinante(double[][] a1){
			double det=0;
			//det2x2=((x[0][0]*x[1][1])-(x[1][0]*x[0][1]));
			
			//Método de Gauss
			det=((a1[0][0])*(a1[1][1])*(a1[2][2])+(a1[1][0])*(a1[2][1])*(a1[0][2])+(a1[2][0])*(a1[0][1])*(a1[1][2]))-((a1[2][0])*(a1[1][1])*(a1[0][2])+(a1[1][0])*(a1[0][1])*(a1[2][2])+(a1[0][0])*(a1[2][1])*(a1[1][2]));
			
			return det;
		}
}
