package Ejecutable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Resultados  extends JFrame{

	public Resultados(int a[][]){
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(40, 40, 180, 180);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lbl1 = new JLabel("" + a[0][0]);
		lbl1.setBounds(42, 30, 25, 25);
		contentPane.add(lbl1);
		JLabel lbl2 = new JLabel("" + a[0][1]);
		lbl2.setBounds(74, 30, 25, 25);
		contentPane.add(lbl2);
		JLabel lbl3 = new JLabel("" + a[0][2]);
		lbl3.setBounds(106, 30, 25, 25);
		contentPane.add(lbl3);
		JLabel lbl4 = new JLabel("" + a[1][0]);
		lbl4.setBounds(42, 61, 25, 25);
		contentPane.add(lbl4);
		JLabel lbl5 = new JLabel("" + a[1][1]);
		lbl5.setBounds(74, 61, 25, 25);
		contentPane.add(lbl5);
		JLabel lbl6 = new JLabel("" + a[1][2]);
		lbl6.setBounds(106, 61, 25, 25);
		contentPane.add(lbl6);
		JLabel lbl7 = new JLabel("" + a[2][0]);
		lbl7.setBounds(42, 92, 25, 25);
		contentPane.add(lbl7);
		JLabel lbl8 = new JLabel("" + a[2][1]);
		lbl8.setBounds(74, 92, 25, 25);
		contentPane.add(lbl8);
		JLabel lbl9 = new JLabel("" + a[2][2]);
		lbl9.setBounds(106, 92, 25, 25);
		contentPane.add(lbl9);
		
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
	        java.util.logging.Logger.getLogger( Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger( Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger( Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger( Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	}

}
