package Ejecutable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuSuma extends JFrame {

	public MenuSuma(int a[][], int b[][]){
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(40, 40, 250, 150);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("A+B");
		button.setBounds(74, 30, 80, 30);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a.length == b.length || a[0].length == b[0].length) {
					//resultado
					int resul[][] = new int[a.length][a[0].length];
					resul = sumatoria(a,b);
					
					Resultados r = new Resultados(resul);
					r.setLocationRelativeTo(null);
					setVisible(false);
					r.setVisible(true);
				}else {
					ERROR error = new ERROR();
					error.setLocationRelativeTo(null);
					setVisible(false);
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
	        java.util.logging.Logger.getLogger( MenuSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger( MenuSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger( MenuSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger( MenuSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
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
}
