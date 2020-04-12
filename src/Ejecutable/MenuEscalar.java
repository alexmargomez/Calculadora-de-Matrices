package Ejecutable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MenuEscalar extends JFrame{

	public MenuEscalar(int a[][], int b[][]) {
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(40, 40, 280, 150);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setBounds(110, 20, 35, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JButton buttonA = new JButton("A");
		buttonA.setBounds(74, 60, 40, 30);
		contentPane.add(buttonA);
		buttonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = 0;
				if(textField.getText().length()==0) {
					num = 0;
				}else {
					num= Integer.parseInt(textField.getText());
				}
				//resultado
				int resul[][] = new int[a.length][a[0].length];
				resul = mulEscalar(num,a);
				
				Resultados r = new Resultados(resul);
				r.setLocationRelativeTo(null);
				setVisible(false);
				r.setVisible(true);
			}
			
		});
		
		JButton buttonB = new JButton("B");
		buttonB.setBounds(140, 60, 40, 30);
		contentPane.add(buttonB);
		buttonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = 0;
				if(textField.getText().length()==0) {
					num = 0;
				}else {
					num= Integer.parseInt(textField.getText());
				}
				//resultado
				int resul[][] = new int[a.length][a[0].length];
				resul = mulEscalar(num,b);
				
				Resultados r = new Resultados(resul);
				r.setLocationRelativeTo(null);
				setVisible(false);
				r.setVisible(true);
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
	        java.util.logging.Logger.getLogger( MenuEscalar .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger( MenuEscalar .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger( MenuEscalar .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger( MenuEscalar .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	}
	
	
	public int[][] mulEscalar(int a, int b[][]) {
		int r[][] = new int[b.length][b[0].length];
		
		for(int i = 0; i < b.length; i++ ) {
			for(int j = 0;j < b[i].length; j++) {
				r[i][j] = a*(b[i][j]);
				
			}
		}
		
	return r;
	
	}

}
