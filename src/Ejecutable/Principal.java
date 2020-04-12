package Ejecutable;

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

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	
	
	
	public static void main(String[] args) {
		
		try {
	        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	            if ("Nimbus".equals(info.getName())) {
	                javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                break;
	            }
	        }
	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    //</editor-fold>

	    /* Create and display the form */
	    java.awt.EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            new Principal().setVisible(true);
	            
	        }
	    });
			
	}

	public Principal() {
		int filaA= 3;
		int columnaA = 3;
		int filaB = 3;
		int columnaB = 3;
		int a[][] = new int[filaA][columnaA];
		int b[][] = new int[filaB][columnaB];
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		textField = new JTextField();
		textField.setBounds(42, 30, 25, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 30, 25, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 30, 25, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(42, 61, 25, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(74, 61, 25, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(106, 61, 25, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(42, 92, 25, 25);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(74, 92, 25, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(106, 92, 25, 25);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblMatrizA = new JLabel("Matriz A");
		lblMatrizA.setBounds(67, 11, 50, 25);
		contentPane.add(lblMatrizA);
		
		textField_9 = new JTextField();
		textField_9.setBounds(235, 30, 25, 25);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(267, 30, 25, 25);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(299, 30, 25, 25);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblMatrizB = new JLabel("Matriz B");
		lblMatrizB.setBounds(255, 11, 50, 25);
		contentPane.add(lblMatrizB);
		
		textField_12 = new JTextField();
		textField_12.setBounds(235, 61, 25, 25);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(235, 92, 25, 25);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(267, 61, 25, 25);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(299, 61, 25, 25);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(267, 92, 25, 25);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(299, 92, 25, 25);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		
		JButton button = new JButton("Sumar");
		button.setBounds(235, 201, 89, 23);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//matriz a
				if(textField.getText().length()==0) {
					a[0][0] = 0;
					
				}else{
					a[0][0]= Integer.parseInt(textField.getText());
				}	
				
				if(textField_1.getText().length()==0) {
					a[0][1] = 0;
				}else {
					a[0][1]= Integer.parseInt(textField_1.getText());
				}
				
				if(textField_2.getText().length()==0) {
					a[0][2] = 0;
				}else {
					a[0][2]= Integer.parseInt(textField_2.getText());
				}
				
				if(textField_3.getText().length()==0) {
					a[1][0] = 0;
				}else {
					a[1][0]= Integer.parseInt(textField_3.getText());
				}
				
				if(textField_4.getText().length()==0) {
					a[1][1] = 0;
				}else {
					a[1][1]= Integer.parseInt(textField_4.getText());
				}
				
				if(textField_5.getText().length()==0) {
					a[1][2] = 0;
				}else {
					a[1][2]= Integer.parseInt(textField_5.getText());
				}
				
				if(textField_6.getText().length()==0) {
					a[2][0] = 0;
				}else {
					a[2][0]= Integer.parseInt(textField_6.getText());
				}
				
				if(textField_7.getText().length()==0) {
					a[2][1] = 0;
				}else {
					a[2][1]= Integer.parseInt(textField_7.getText());
				}
				
				if(textField_8.getText().length()==0) {
					a[2][2] = 0;
				}else {
					a[2][2]= Integer.parseInt(textField_8.getText());
				}
				
				//matriz b---------------------------------------------------------------
				if(textField_9.getText().length()==0) {
					b[0][0] = 0;
				}else {
					b[0][0]= Integer.parseInt(textField_9.getText());
				}

				if(textField_10.getText().length()==0) {
					b[0][1] = 0;
				}else {
					b[0][1]= Integer.parseInt(textField_10.getText());
				}
				
				if(textField_11.getText().length()==0) {
					b[0][2] = 0;
				}else {
					b[0][2]= Integer.parseInt(textField_11.getText());
				}
				
				if(textField_12.getText().length()==0) {
					b[1][0] = 0;
				}else {
					b[1][0]= Integer.parseInt(textField_12.getText());
				}
				
				if(textField_13.getText().length()==0) {
					b[1][1] = 0;
				}else {
					b[1][1]= Integer.parseInt(textField_13.getText());
				}
				
				if(textField_14.getText().length()== 0) {
					b[1][2] = 0;
				}else {
					b[1][2]= Integer.parseInt(textField_14.getText());
				}
				
				if(textField_15.getText().length()==0) {
					b[2][0] = 0;
				}else {
					b[2][0]= Integer.parseInt(textField_15.getText());
				}
				
				if(textField_16.getText().length()==0) {
					b[2][1] = 0;
				}else {
					b[2][1]= Integer.parseInt(textField_16.getText());
				}
				
				if(textField_17.getText().length()==0) {
					b[2][2] = 0;
				}else {
					b[2][2]= Integer.parseInt(textField_17.getText());
				}
				
				
				MenuSuma suma = new MenuSuma(a, b);
				suma.setLocationRelativeTo(null);
				//setVisible(false);
				suma.setVisible(true);
				
			}
		});
		
		
		JButton btnInversa = new JButton("Inversa");
		btnInversa.setBounds(235, 133, 89, 23);
		contentPane.add(btnInversa);
		btnInversa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//matriz a
				if(textField.getText().length()==0) {
					a[0][0] = 0;
					
				}else{
					a[0][0]= Integer.parseInt(textField.getText());
				}	
				
				if(textField_1.getText().length()==0) {
					a[0][1] = 0;
				}else {
					a[0][1]= Integer.parseInt(textField_1.getText());
				}
				
				if(textField_2.getText().length()==0) {
					a[0][2] = 0;
				}else {
					a[0][2]= Integer.parseInt(textField_2.getText());
				}
				
				if(textField_3.getText().length()==0) {
					a[1][0] = 0;
				}else {
					a[1][0]= Integer.parseInt(textField_3.getText());
				}
				
				if(textField_4.getText().length()==0) {
					a[1][1] = 0;
				}else {
					a[1][1]= Integer.parseInt(textField_4.getText());
				}
				
				if(textField_5.getText().length()==0) {
					a[1][2] = 0;
				}else {
					a[1][2]= Integer.parseInt(textField_5.getText());
				}
				
				if(textField_6.getText().length()==0) {
					a[2][0] = 0;
				}else {
					a[2][0]= Integer.parseInt(textField_6.getText());
				}
				
				if(textField_7.getText().length()==0) {
					a[2][1] = 0;
				}else {
					a[2][1]= Integer.parseInt(textField_7.getText());
				}
				
				if(textField_8.getText().length()==0) {
					a[2][2] = 0;
				}else {
					a[2][2]= Integer.parseInt(textField_8.getText());
				}
				
				//matriz b---------------------------------------------------------------
				if(textField_9.getText().length()==0) {
					b[0][0] = 0;
				}else {
					b[0][0]= Integer.parseInt(textField_9.getText());
				}

				if(textField_10.getText().length()==0) {
					b[0][1] = 0;
				}else {
					b[0][1]= Integer.parseInt(textField_10.getText());
				}
				
				if(textField_11.getText().length()==0) {
					b[0][2] = 0;
				}else {
					b[0][2]= Integer.parseInt(textField_11.getText());
				}
				
				if(textField_12.getText().length()==0) {
					b[1][0] = 0;
				}else {
					b[1][0]= Integer.parseInt(textField_12.getText());
				}
				
				if(textField_13.getText().length()==0) {
					b[1][1] = 0;
				}else {
					b[1][1]= Integer.parseInt(textField_13.getText());
				}
				
				if(textField_14.getText().length()== 0) {
					b[1][2] = 0;
				}else {
					b[1][2]= Integer.parseInt(textField_14.getText());
				}
				
				if(textField_15.getText().length()==0) {
					b[2][0] = 0;
				}else {
					b[2][0]= Integer.parseInt(textField_15.getText());
				}
				
				if(textField_16.getText().length()==0) {
					b[2][1] = 0;
				}else {
					b[2][1]= Integer.parseInt(textField_16.getText());
				}
				
				if(textField_17.getText().length()==0) {
					b[2][2] = 0;
				}else {
					b[2][2]= Integer.parseInt(textField_17.getText());
				}
				
				
				MenuInversa inversa = new MenuInversa(a, b);
				inversa.setLocationRelativeTo(null);
				//setVisible(false);
				inversa.setVisible(true);
				
			}
		});
		
		JButton btnDeterminante = new JButton("Determinante");
		btnDeterminante.setBounds(42, 133, 89, 23);
		contentPane.add(btnDeterminante);
		btnDeterminante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//matriz a
				if(textField.getText().length()==0) {
					a[0][0] = 0;
					
				}else{
					a[0][0]= Integer.parseInt(textField.getText());
				}	
				
				if(textField_1.getText().length()==0) {
					a[0][1] = 0;
				}else {
					a[0][1]= Integer.parseInt(textField_1.getText());
				}
				
				if(textField_2.getText().length()==0) {
					a[0][2] = 0;
				}else {
					a[0][2]= Integer.parseInt(textField_2.getText());
				}
				
				if(textField_3.getText().length()==0) {
					a[1][0] = 0;
				}else {
					a[1][0]= Integer.parseInt(textField_3.getText());
				}
				
				if(textField_4.getText().length()==0) {
					a[1][1] = 0;
				}else {
					a[1][1]= Integer.parseInt(textField_4.getText());
				}
				
				if(textField_5.getText().length()==0) {
					a[1][2] = 0;
				}else {
					a[1][2]= Integer.parseInt(textField_5.getText());
				}
				
				if(textField_6.getText().length()==0) {
					a[2][0] = 0;
				}else {
					a[2][0]= Integer.parseInt(textField_6.getText());
				}
				
				if(textField_7.getText().length()==0) {
					a[2][1] = 0;
				}else {
					a[2][1]= Integer.parseInt(textField_7.getText());
				}
				
				if(textField_8.getText().length()==0) {
					a[2][2] = 0;
				}else {
					a[2][2]= Integer.parseInt(textField_8.getText());
				}
				
				//matriz b---------------------------------------------------------------
				if(textField_9.getText().length()==0) {
					b[0][0] = 0;
				}else {
					b[0][0]= Integer.parseInt(textField_9.getText());
				}

				if(textField_10.getText().length()==0) {
					b[0][1] = 0;
				}else {
					b[0][1]= Integer.parseInt(textField_10.getText());
				}
				
				if(textField_11.getText().length()==0) {
					b[0][2] = 0;
				}else {
					b[0][2]= Integer.parseInt(textField_11.getText());
				}
				
				if(textField_12.getText().length()==0) {
					b[1][0] = 0;
				}else {
					b[1][0]= Integer.parseInt(textField_12.getText());
				}
				
				if(textField_13.getText().length()==0) {
					b[1][1] = 0;
				}else {
					b[1][1]= Integer.parseInt(textField_13.getText());
				}
				
				if(textField_14.getText().length()== 0) {
					b[1][2] = 0;
				}else {
					b[1][2]= Integer.parseInt(textField_14.getText());
				}
				
				if(textField_15.getText().length()==0) {
					b[2][0] = 0;
				}else {
					b[2][0]= Integer.parseInt(textField_15.getText());
				}
				
				if(textField_16.getText().length()==0) {
					b[2][1] = 0;
				}else {
					b[2][1]= Integer.parseInt(textField_16.getText());
				}
				
				if(textField_17.getText().length()==0) {
					b[2][2] = 0;
				}else {
					b[2][2]= Integer.parseInt(textField_17.getText());
				}
				
				
				MenuDeterminante determinante = new MenuDeterminante(a, b);
				determinante.setLocationRelativeTo(null);
				//setVisible(false);
				determinante.setVisible(true);

			}
		});
		
		JButton btnResta = new JButton("Resta");
		btnResta.setBounds(235, 167, 89, 23);
		contentPane.add(btnResta);
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//matriz a
				if(textField.getText().length()==0) {
					a[0][0] = 0;
					
				}else{
					a[0][0]= Integer.parseInt(textField.getText());
				}	
				
				if(textField_1.getText().length()==0) {
					a[0][1] = 0;
				}else {
					a[0][1]= Integer.parseInt(textField_1.getText());
				}
				
				if(textField_2.getText().length()==0) {
					a[0][2] = 0;
				}else {
					a[0][2]= Integer.parseInt(textField_2.getText());
				}
				
				if(textField_3.getText().length()==0) {
					a[1][0] = 0;
				}else {
					a[1][0]= Integer.parseInt(textField_3.getText());
				}
				
				if(textField_4.getText().length()==0) {
					a[1][1] = 0;
				}else {
					a[1][1]= Integer.parseInt(textField_4.getText());
				}
				
				if(textField_5.getText().length()==0) {
					a[1][2] = 0;
				}else {
					a[1][2]= Integer.parseInt(textField_5.getText());
				}
				
				if(textField_6.getText().length()==0) {
					a[2][0] = 0;
				}else {
					a[2][0]= Integer.parseInt(textField_6.getText());
				}
				
				if(textField_7.getText().length()==0) {
					a[2][1] = 0;
				}else {
					a[2][1]= Integer.parseInt(textField_7.getText());
				}
				
				if(textField_8.getText().length()==0) {
					a[2][2] = 0;
				}else {
					a[2][2]= Integer.parseInt(textField_8.getText());
				}
				
				//matriz b---------------------------------------------------------------
				if(textField_9.getText().length()==0) {
					b[0][0] = 0;
				}else {
					b[0][0]= Integer.parseInt(textField_9.getText());
				}

				if(textField_10.getText().length()==0) {
					b[0][1] = 0;
				}else {
					b[0][1]= Integer.parseInt(textField_10.getText());
				}
				
				if(textField_11.getText().length()==0) {
					b[0][2] = 0;
				}else {
					b[0][2]= Integer.parseInt(textField_11.getText());
				}
				
				if(textField_12.getText().length()==0) {
					b[1][0] = 0;
				}else {
					b[1][0]= Integer.parseInt(textField_12.getText());
				}
				
				if(textField_13.getText().length()==0) {
					b[1][1] = 0;
				}else {
					b[1][1]= Integer.parseInt(textField_13.getText());
				}
				
				if(textField_14.getText().length()== 0) {
					b[1][2] = 0;
				}else {
					b[1][2]= Integer.parseInt(textField_14.getText());
				}
				
				if(textField_15.getText().length()==0) {
					b[2][0] = 0;
				}else {
					b[2][0]= Integer.parseInt(textField_15.getText());
				}
				
				if(textField_16.getText().length()==0) {
					b[2][1] = 0;
				}else {
					b[2][1]= Integer.parseInt(textField_16.getText());
				}
				
				if(textField_17.getText().length()==0) {
					b[2][2] = 0;
				}else {
					b[2][2]= Integer.parseInt(textField_17.getText());
				}
				
				MenuResta resta = new MenuResta(a, b);
				resta.setLocationRelativeTo(null);
				//setVisible(false);
				resta.setVisible(true);

			}
		});
		
		JButton btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.setBounds(42, 167, 89, 23);
		contentPane.add(btnMultiplicacion);
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//matriz a
				if(textField.getText().length()==0) {
					a[0][0] = 0;
					
				}else{
					a[0][0]= Integer.parseInt(textField.getText());
				}	
				
				if(textField_1.getText().length()==0) {
					a[0][1] = 0;
				}else {
					a[0][1]= Integer.parseInt(textField_1.getText());
				}
				
				if(textField_2.getText().length()==0) {
					a[0][2] = 0;
				}else {
					a[0][2]= Integer.parseInt(textField_2.getText());
				}
				
				if(textField_3.getText().length()==0) {
					a[1][0] = 0;
				}else {
					a[1][0]= Integer.parseInt(textField_3.getText());
				}
				
				if(textField_4.getText().length()==0) {
					a[1][1] = 0;
				}else {
					a[1][1]= Integer.parseInt(textField_4.getText());
				}
				
				if(textField_5.getText().length()==0) {
					a[1][2] = 0;
				}else {
					a[1][2]= Integer.parseInt(textField_5.getText());
				}
				
				if(textField_6.getText().length()==0) {
					a[2][0] = 0;
				}else {
					a[2][0]= Integer.parseInt(textField_6.getText());
				}
				
				if(textField_7.getText().length()==0) {
					a[2][1] = 0;
				}else {
					a[2][1]= Integer.parseInt(textField_7.getText());
				}
				
				if(textField_8.getText().length()==0) {
					a[2][2] = 0;
				}else {
					a[2][2]= Integer.parseInt(textField_8.getText());
				}
				
				//matriz b---------------------------------------------------------------
				if(textField_9.getText().length()==0) {
					b[0][0] = 0;
				}else {
					b[0][0]= Integer.parseInt(textField_9.getText());
				}

				if(textField_10.getText().length()==0) {
					b[0][1] = 0;
				}else {
					b[0][1]= Integer.parseInt(textField_10.getText());
				}
				
				if(textField_11.getText().length()==0) {
					b[0][2] = 0;
				}else {
					b[0][2]= Integer.parseInt(textField_11.getText());
				}
				
				if(textField_12.getText().length()==0) {
					b[1][0] = 0;
				}else {
					b[1][0]= Integer.parseInt(textField_12.getText());
				}
				
				if(textField_13.getText().length()==0) {
					b[1][1] = 0;
				}else {
					b[1][1]= Integer.parseInt(textField_13.getText());
				}
				
				if(textField_14.getText().length()== 0) {
					b[1][2] = 0;
				}else {
					b[1][2]= Integer.parseInt(textField_14.getText());
				}
				
				if(textField_15.getText().length()==0) {
					b[2][0] = 0;
				}else {
					b[2][0]= Integer.parseInt(textField_15.getText());
				}
				
				if(textField_16.getText().length()==0) {
					b[2][1] = 0;
				}else {
					b[2][1]= Integer.parseInt(textField_16.getText());
				}
				
				if(textField_17.getText().length()==0) {
					b[2][2] = 0;
				}else {
					b[2][2]= Integer.parseInt(textField_17.getText());
				}
				
				MenuMulti multi = new MenuMulti(a, b);
				multi.setLocationRelativeTo(null);
				//setVisible(false);
				multi.setVisible(true);
			}
		});
		
		JButton btnEscalar = new JButton("Escalar");
		btnEscalar.setBounds(42, 201, 89, 23);
		contentPane.add(btnEscalar);
		btnEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//matriz a
				if(textField.getText().length()==0) {
					a[0][0] = 0;
					
				}else{
					a[0][0]= Integer.parseInt(textField.getText());
				}	
				
				if(textField_1.getText().length()==0) {
					a[0][1] = 0;
				}else {
					a[0][1]= Integer.parseInt(textField_1.getText());
				}
				
				if(textField_2.getText().length()==0) {
					a[0][2] = 0;
				}else {
					a[0][2]= Integer.parseInt(textField_2.getText());
				}
				
				if(textField_3.getText().length()==0) {
					a[1][0] = 0;
				}else {
					a[1][0]= Integer.parseInt(textField_3.getText());
				}
				
				if(textField_4.getText().length()==0) {
					a[1][1] = 0;
				}else {
					a[1][1]= Integer.parseInt(textField_4.getText());
				}
				
				if(textField_5.getText().length()==0) {
					a[1][2] = 0;
				}else {
					a[1][2]= Integer.parseInt(textField_5.getText());
				}
				
				if(textField_6.getText().length()==0) {
					a[2][0] = 0;
				}else {
					a[2][0]= Integer.parseInt(textField_6.getText());
				}
				
				if(textField_7.getText().length()==0) {
					a[2][1] = 0;
				}else {
					a[2][1]= Integer.parseInt(textField_7.getText());
				}
				
				if(textField_8.getText().length()==0) {
					a[2][2] = 0;
				}else {
					a[2][2]= Integer.parseInt(textField_8.getText());
				}
				
				//matriz b---------------------------------------------------------------
				if(textField_9.getText().length()==0) {
					b[0][0] = 0;
				}else {
					b[0][0]= Integer.parseInt(textField_9.getText());
				}

				if(textField_10.getText().length()==0) {
					b[0][1] = 0;
				}else {
					b[0][1]= Integer.parseInt(textField_10.getText());
				}
				
				if(textField_11.getText().length()==0) {
					b[0][2] = 0;
				}else {
					b[0][2]= Integer.parseInt(textField_11.getText());
				}
				
				if(textField_12.getText().length()==0) {
					b[1][0] = 0;
				}else {
					b[1][0]= Integer.parseInt(textField_12.getText());
				}
				
				if(textField_13.getText().length()==0) {
					b[1][1] = 0;
				}else {
					b[1][1]= Integer.parseInt(textField_13.getText());
				}
				
				if(textField_14.getText().length()== 0) {
					b[1][2] = 0;
				}else {
					b[1][2]= Integer.parseInt(textField_14.getText());
				}
				
				if(textField_15.getText().length()==0) {
					b[2][0] = 0;
				}else {
					b[2][0]= Integer.parseInt(textField_15.getText());
				}
				
				if(textField_16.getText().length()==0) {
					b[2][1] = 0;
				}else {
					b[2][1]= Integer.parseInt(textField_16.getText());
				}
				
				if(textField_17.getText().length()==0) {
					b[2][2] = 0;
				}else {
					b[2][2]= Integer.parseInt(textField_17.getText());
				}
				
				
				MenuEscalar escalar = new MenuEscalar(a, b);
				escalar.setLocationRelativeTo(null);
				//setVisible(false);
				escalar.setVisible(true);

			}
		});
	
	}
}
