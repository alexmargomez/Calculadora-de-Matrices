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
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_19;
	private JTextField textField_23;
	private JTextField textField_27;
	private JTextField textField_31;
	private JTextField filaAP;
	private JTextField ColumnaAP;
	private JTextField filaBP;
	private JTextField ColumnaBP;
	int filaA = 0;
	int columnaA = 0;
	int filaB = 0;
	int columnaB = 0;
	private JButton btnReset;
	
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
		
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 414, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		//-------------------------------------------------------------------------
		filaAP = new JTextField();
		filaAP.setBounds(62, 61, 25, 25);
		contentPane.add(filaAP);
		filaAP.setColumns(10);
				
		JLabel lblX1 = new JLabel("x");
		lblX1.setBounds(100, 66, 6, 14);
		contentPane.add(lblX1);
		
		ColumnaAP = new JTextField();
		ColumnaAP.setBounds(116, 61, 25, 25);
		contentPane.add(ColumnaAP);
		ColumnaAP.setColumns(10);
		
		//B
		filaBP = new JTextField();
		filaBP.setColumns(10);
		filaBP.setBounds(255, 61, 25, 25);
		contentPane.add(filaBP);
				
		JLabel lblX2 = new JLabel("x");
		lblX2.setBounds(293, 66, 6, 14);
		contentPane.add(lblX2);
				
		ColumnaBP = new JTextField();
		ColumnaBP.setColumns(10);
		ColumnaBP.setBounds(309, 61, 25, 25);
		contentPane.add(ColumnaBP);
		
		
		//-------------------------------------------------
		
		JButton btnA = new JButton("A");
		btnA.setBounds(72, 93, 59, 23);
		contentPane.add(btnA);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(filaAP.getText().length()==0) {
					filaA = 0;

					System.out.println("no entra");
				}else {
					filaA = Integer.parseInt(filaAP.getText());
					System.out.println(filaA);
				}
				if(ColumnaAP.getText().length()==0) {
					columnaA = 0;
				}else {
					columnaA = Integer.parseInt(ColumnaAP.getText());
				}
				btnA.setVisible(false);
				filaAP.setVisible(false);
				ColumnaAP.setVisible(false);
				lblX1.setVisible(false);
				control(filaA,columnaA);
				
			}
		});
		
		JButton btnB = new JButton("B");
		btnB .setBounds(267, 93, 57, 23);
		contentPane.add(btnB);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(filaBP.getText().length()==0) {
					filaB = 0;
				}else {
					filaB = Integer.parseInt(filaBP.getText());
				}
				if(ColumnaBP.getText().length()==0) {
					columnaB = 0;
				}else {
					columnaB = Integer.parseInt(ColumnaBP.getText());
				}
				
				btnB.setVisible(false);
				filaBP.setVisible(false);
				ColumnaBP.setVisible(false);
				lblX2.setVisible(false);
				control1(filaB,columnaB);
				
			}
		});
			
		
		//matriz A
		JLabel lblMatrizA = new JLabel("Matriz A");
		lblMatrizA.setBounds(81, 0, 50, 25);
		contentPane.add(lblMatrizA);
		
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
		textField_3.setBounds(139, 30, 25, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(42, 61, 25, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(74, 61, 25, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(106, 61, 25, 25);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(139, 61, 25, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(42, 92, 25, 25);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(74, 92, 25, 25);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(106, 92, 25, 25);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(139, 92, 25, 25);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(42, 124, 25, 25);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(74, 124, 25, 25);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(106, 124, 25, 25);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(139, 124, 25, 25);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		//------------------------------------
		
		//matriz B
		JLabel lblMatrizB = new JLabel("Matriz B");
		lblMatrizB.setBounds(274, 0, 50, 25);
		contentPane.add(lblMatrizB);
		
		textField_16 = new JTextField();
		textField_16.setBounds(235, 30, 25, 25);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(267, 30, 25, 25);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(299, 30, 25, 25);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(330, 30, 25, 25);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(235, 61, 25, 25);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(267, 61, 25, 25);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(299, 61, 25, 25);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(330, 61, 25, 25);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(235, 92, 25, 25);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(267, 92, 25, 25);
		contentPane.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBounds(299, 92, 25, 25);
		contentPane.add(textField_26);
		textField_26.setColumns(10);

		textField_27 = new JTextField();
		textField_27.setBounds(330, 92, 25, 25);
		contentPane.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(235, 124, 25, 25);
		contentPane.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(267, 124, 25, 25);
		contentPane.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(299, 124, 25, 25);
		contentPane.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(330, 124, 25, 25);
		contentPane.add(textField_31);
		textField_31.setColumns(10);
		//...................
		textField.setVisible(false);
		textField_1.setVisible(false);
		textField_2.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
		textField_5.setVisible(false);
		textField_6.setVisible(false);
		textField_7.setVisible(false);
		textField_8.setVisible(false);
		textField_9.setVisible(false);
		textField_10.setVisible(false);
		textField_11.setVisible(false);
		textField_12.setVisible(false);
		textField_13.setVisible(false);
		textField_14.setVisible(false);
		textField_15.setVisible(false);
		textField_16.setVisible(false);
		textField_17.setVisible(false);
		textField_18.setVisible(false);
		textField_19.setVisible(false);
		textField_20.setVisible(false);
		textField_21.setVisible(false);
		textField_22.setVisible(false);
		textField_23.setVisible(false);
		textField_24.setVisible(false);
		textField_25.setVisible(false);
		textField_26.setVisible(false);
		textField_27.setVisible(false);
		textField_28.setVisible(false);
		textField_29.setVisible(false);
		textField_30.setVisible(false);
		textField_31.setVisible(false);
		
				
		//------------------------------------------------------------------------------------------------
		//filas columnas
		
		
				
		JButton button = new JButton("Sumar");
		button.setBounds(158, 214, 89, 23);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a[][] = valorMatrizA(filaA,columnaA);
				int b[][] = valorMatrizB(filaB,columnaB);
				
				MenuSuma suma = new MenuSuma(a, b);
				suma.setLocationRelativeTo(null);
				//setVisible(false);
				suma.setVisible(true);
				
			}
		});
		
		
		JButton btnInversa = new JButton("Inversa");
		btnInversa.setBounds(42, 214, 89, 23);
		contentPane.add(btnInversa);
		btnInversa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a[][] = valorMatrizA(filaA,columnaA);
				int b[][] = valorMatrizB(filaB,columnaB);
				
				MenuInversa inversa = new MenuInversa(a, b);
				inversa.setLocationRelativeTo(null);
				//setVisible(false);
				inversa.setVisible(true);
				
			}
		});
		
		JButton btnDeterminante = new JButton("Determinante");
		btnDeterminante.setBounds(42, 180, 89, 23);
		contentPane.add(btnDeterminante);
		btnDeterminante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a[][] = valorMatrizA(filaA,columnaA);
				int b[][] = valorMatrizB(filaB,columnaB);
				
				MenuDeterminante determinante = new MenuDeterminante(a, b);
				determinante.setLocationRelativeTo(null);
				//setVisible(false);
				determinante.setVisible(true);

			}
		});
		
		JButton btnResta = new JButton("Resta");
		btnResta.setBounds(158, 180, 89, 23);
		contentPane.add(btnResta);
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a[][] = valorMatrizA(filaA,columnaA);
				int b[][] = valorMatrizB(filaB,columnaB);
				
				MenuResta resta = new MenuResta(a, b);
				resta.setLocationRelativeTo(null);
				//setVisible(false);
				resta.setVisible(true);

			}
		});
		
		JButton btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.setBounds(266, 214, 89, 23);
		contentPane.add(btnMultiplicacion);
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a[][] = valorMatrizA(filaA,columnaA);
				int b[][] = valorMatrizB(filaB,columnaB);
				
				MenuMulti multi = new MenuMulti(a, b);
				multi.setLocationRelativeTo(null);
				//setVisible(false);
				multi.setVisible(true);
			}
		});
		
		JButton btnEscalar = new JButton("Escalar");
		btnEscalar.setBounds(266, 180, 89, 23);
		contentPane.add(btnEscalar);
		btnEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a[][] = valorMatrizA(filaA,columnaA);
				int b[][] = valorMatrizB(filaB,columnaB);
				
				MenuEscalar escalar = new MenuEscalar(a, b);
				escalar.setLocationRelativeTo(null);
				//setVisible(false);
				escalar.setVisible(true);

			}
		});
		//---reset.....
		btnReset = new JButton("Reset");
		btnReset.setBounds(158, 1, 89, 23);
		contentPane.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				textField_3.setVisible(false);
				textField_4.setVisible(false);
				textField_5.setVisible(false);
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
				textField_9.setVisible(false);
				textField_10.setVisible(false);
				textField_11.setVisible(false);
				textField_12.setVisible(false);
				textField_13.setVisible(false);
				textField_14.setVisible(false);
				textField_15.setVisible(false);
				textField_16.setVisible(false);
				textField_17.setVisible(false);
				textField_18.setVisible(false);
				textField_19.setVisible(false);
				textField_20.setVisible(false);
				textField_21.setVisible(false);
				textField_22.setVisible(false);
				textField_23.setVisible(false);
				textField_24.setVisible(false);
				textField_25.setVisible(false);
				textField_26.setVisible(false);
				textField_27.setVisible(false);
				textField_28.setVisible(false);
				textField_29.setVisible(false);
				textField_30.setVisible(false);
				textField_31.setVisible(false);
				
				btnA.setVisible(true);
				filaAP.setVisible(true);
				ColumnaAP.setVisible(true);
				lblX1.setVisible(true);
				btnB.setVisible(true);
				filaBP.setVisible(true);
				ColumnaBP.setVisible(true);
				lblX2.setVisible(true);
				
			}
		});
		
		
	}
	//-----------------------------fin metodo Constructor.-----------------------------------------------------------------
	
	//InitA
	public int[][]  valorMatrizA(int f, int c) {
		int a [][] = new int[f][c];
		//1x1
		if (f == 1 && c == 1) {
			if(textField_5.getText().length()==0) {
				a[0][0] = 0;
			}else {
				a[0][0]= Integer.parseInt(textField_5.getText());
			}
			
		}
		
		//2x2
		if (f == 2 && c == 2) {
			if(textField_5.getText().length()==0) {
				a[0][0] = 0;
			}else{
				a[0][0]= Integer.parseInt(textField_5.getText());
			}	
			
			if(textField_6.getText().length()==0) {
				a[0][1] = 0;
			}else {
				a[0][1]= Integer.parseInt(textField_6.getText());
			}
			
			if(textField_9.getText().length()==0) {
				a[1][0] = 0;
			}else {
				a[1][0]= Integer.parseInt(textField_9.getText());
			}
			
			if(textField_10.getText().length()==0) {
				a[1][1] = 0;
			}else {
				a[1][1]= Integer.parseInt(textField_10.getText());
			}
			
		}
		//1x2
		if (f == 1 && c == 2) {
			if(textField_5.getText().length()==0) {
				a[0][0] = 0;
			}else{
				a[0][0]= Integer.parseInt(textField_5.getText());
			}	
			
			if(textField_6.getText().length()==0) {
				a[0][1] = 0;
			}else {
				a[0][1]= Integer.parseInt(textField_6.getText());
			}
		}
		//2x1
		if (f == 2 && c == 1) {
			if(textField_5.getText().length()==0) {
				a[0][0] = 0;
			}else{
				a[0][0]= Integer.parseInt(textField_5.getText());
			}	
			if(textField_9.getText().length()==0) {
				a[1][0] = 0;
			}else {
				a[1][0]= Integer.parseInt(textField_9.getText());
			}
			
		}
		
		//3x3
		if (f== 3 && c == 3) {
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
			if(textField_4.getText().length()==0) {
				a[1][0] = 0;
			}else {
				a[1][0]= Integer.parseInt(textField_4.getText());
			}
			
			if(textField_5.getText().length()==0) {
				a[1][1] = 0;
			}else {
				a[1][1]= Integer.parseInt(textField_5.getText());
			}
			
			if(textField_6.getText().length()==0) {
				a[1][2] = 0;
			}else {
				a[1][2]= Integer.parseInt(textField_6.getText());
			}

			if(textField_8.getText().length()==0) {
				a[2][0] = 0;
			}else {
				a[2][0]= Integer.parseInt(textField_8.getText());
			}
			
			if(textField_9.getText().length()==0) {
				a[2][1] = 0;
			}else {
				a[2][1]= Integer.parseInt(textField_9.getText());
			}

			if(textField_10.getText().length()==0) {
				a[2][2] = 0;
			}else {
				a[2][2]= Integer.parseInt(textField_10.getText());
			}
			
			
		}
		//1x3
		if (f == 1 && c == 3) {
			if(textField.getText().length()==0) {
				a[0][0] = 0;
			}else {
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
			
		}
		//3x1
		if (f == 3 && c == 1) {
			if(textField.getText().length()==0) {
				a[0][0] = 0;
			}else{
				a[0][0]= Integer.parseInt(textField.getText());
			}
			if(textField_4.getText().length()==0) {
				a[1][0] = 0;
			}else {
				a[1][0]= Integer.parseInt(textField_4.getText());
			}
			if(textField_8.getText().length()==0) {
				a[2][0] = 0;
			}else {
				a[2][0]= Integer.parseInt(textField_8.getText());
			}
			
		}
		//2x3
		if (f == 2 && c == 3) {
			if(textField.getText().length()==0) {
				a[0][0] = 0;
			}else {
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
			if(textField_4.getText().length()==0) {
				a[1][0] = 0;
			}else {
				a[1][0]= Integer.parseInt(textField_4.getText());
			}
			
			if(textField_5.getText().length()==0) {
				a[1][1] = 0;
			}else {
				a[1][1]= Integer.parseInt(textField_5.getText());
			}
			
			if(textField_6.getText().length()==0) {
				a[1][2] = 0;
			}else {
				a[1][2]= Integer.parseInt(textField_6.getText());
			}
		}
		//3x2
		if (f == 3 && c == 2) {
			if(textField.getText().length()==0) {
				a[0][0] = 0;
			}else{
				a[0][0]= Integer.parseInt(textField.getText());
			}
			if(textField_4.getText().length()==0) {
				a[1][0] = 0;
			}else {
				a[1][0]= Integer.parseInt(textField_4.getText());
			}
			if(textField_8.getText().length()==0) {
				a[2][0] = 0;
			}else {
				a[2][0]= Integer.parseInt(textField_8.getText());
			}
			if(textField_1.getText().length()==0) {
				a[0][1] = 0;
			}else {
				a[0][1]= Integer.parseInt(textField_1.getText());
			}
			if(textField_5.getText().length()==0) {
				a[1][1] = 0;
			}else {
				a[1][1]= Integer.parseInt(textField_5.getText());
			}
			if(textField_9.getText().length()==0) {
				a[2][1] = 0;
			}else {
				a[2][1]= Integer.parseInt(textField_9.getText());
			}
		}
		
		//4x4
		if (f== 4 && c == 4) {
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
				a[0][3] = 0;
			}else {
				a[0][3]= Integer.parseInt(textField_3.getText());
			}
			
			if(textField_4.getText().length()==0) {
				a[1][0] = 0;
			}else {
				a[1][0]= Integer.parseInt(textField_4.getText());
			}
			
			if(textField_5.getText().length()==0) {
				a[1][1] = 0;
			}else {
				a[1][1]= Integer.parseInt(textField_5.getText());
			}
			
			if(textField_6.getText().length()==0) {
				a[1][2] = 0;
			}else {
				a[1][2]= Integer.parseInt(textField_6.getText());
			}
			
			if(textField_7.getText().length()==0) {
				a[1][3] = 0;
			}else {
				a[1][3]= Integer.parseInt(textField_7.getText());
			}
			
			if(textField_8.getText().length()==0) {
				a[2][0] = 0;
			}else {
				a[2][0]= Integer.parseInt(textField_8.getText());
			}
			
			if(textField_9.getText().length()==0) {
				a[2][1] = 0;
			}else {
				a[2][1]= Integer.parseInt(textField_9.getText());
			}

			if(textField_10.getText().length()==0) {
				a[2][2] = 0;
			}else {
				a[2][2]= Integer.parseInt(textField_10.getText());
			}
			
			if(textField_11.getText().length()==0) {
				a[2][3] = 0;
			}else {
				a[2][3]= Integer.parseInt(textField_11.getText());
			}
			
			if(textField_12.getText().length()==0) {
				a[3][2] = 0;
			}else {
				a[3][2]= Integer.parseInt(textField_12.getText());
			}
			
			if(textField_13.getText().length()==0) {
				a[3][3] = 0;
			}else {
				a[3][3]= Integer.parseInt(textField_13.getText());
			}
			
			if(textField_14.getText().length()==0) {
				a[3][2] = 0;
			}else {
				a[3][2]= Integer.parseInt(textField_14.getText());
			}
			
			if(textField_15.getText().length()==0) {
				a[3][3] = 0;
			}else {
				a[3][3]= Integer.parseInt(textField_15.getText());
			}
			
		}
		
		return a;
		
	}//EndA
	
	
	//InitB
	public int[][]  valorMatrizB(int f, int c) {
		int b [][] = new int[f][c];
		
		//1x1
		if (f == 1 && c == 1) {
			if(textField_21.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_21.getText());
			}
		}
		
		//2x2
		if (f == 2 && c == 2) {
			if(textField_21.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_21.getText());
			}
			if(textField_22.getText().length()==0) {
				b[0][1] = 0;
			}else {
				b[0][1]= Integer.parseInt(textField_22.getText());
			}
			if(textField_25.getText().length()==0) {
				b[1][0] = 0;
			}else {
				b[1][0]= Integer.parseInt(textField_25.getText());
			}
			if(textField_26.getText().length()==0) {
				b[1][1] = 0;
			}else {
				b[1][1]= Integer.parseInt(textField_26.getText());
			}
		}
		//1x2
		if (f==1 && c == 2) {
			if(textField_21.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_21.getText());
			}
			if(textField_22.getText().length()==0) {
				b[0][1] = 0;
			}else {
				b[0][1]= Integer.parseInt(textField_22.getText());
			}
		}
		//2x1
		if (f==2 && c == 1) {
			if(textField_21.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_21.getText());
			}
			if(textField_25.getText().length()==0) {
				b[1][0] = 0;
			}else {
				b[1][0]= Integer.parseInt(textField_25.getText());
			}
		}
		
		//3x3
		if (f== 3 && c == 3) {
			if(textField_16.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_16.getText());
			}
		
			if(textField_17.getText().length()==0) {
				b[0][1] = 0;
			}else {
				b[0][1]= Integer.parseInt(textField_17.getText());
			}
			
			if(textField_18.getText().length()==0) {
				b[0][2] = 0;
			}else {
				b[0][2]= Integer.parseInt(textField_18.getText());
			}
			
			if(textField_20.getText().length()==0) {
				b[1][0] = 0;
			}else {
				b[1][0]= Integer.parseInt(textField_20.getText());
			}
			
			if(textField_21.getText().length()== 0) {
				b[1][1] = 0;
			}else {
				b[1][1]= Integer.parseInt(textField_21.getText());
			}
			
			if(textField_22.getText().length()==0) {
				b[1][2] = 0;
			}else {
				b[1][2]= Integer.parseInt(textField_22.getText());
			}
			
			if(textField_24.getText().length()==0) {
				b[2][0] = 0;
			}else {
				b[2][0]= Integer.parseInt(textField_24.getText());
			}
			
			if(textField_25.getText().length()==0) {
				b[2][1] = 0;
			}else {
				b[2][1]= Integer.parseInt(textField_25.getText());
			}
			
			if(textField_26.getText().length()==0) {
				b[2][2] = 0;
			}else {
				b[2][2]= Integer.parseInt(textField_26.getText());
			}
			
		}
		
		//1x3
		if (f == 1 && c == 3) {
			if(textField_16.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_16.getText());
			}
		
			if(textField_17.getText().length()==0) {
				b[0][1] = 0;
			}else {
				b[0][1]= Integer.parseInt(textField_17.getText());
			}
			
			if(textField_18.getText().length()==0) {
				b[0][2] = 0;
			}else {
				b[0][2]= Integer.parseInt(textField_18.getText());
			}
		}
		//3x1
		if (f == 3 && c == 1) {
			if(textField_16.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_16.getText());
			}
			if(textField_20.getText().length()==0) {
				b[1][0] = 0;
			}else {
				b[1][0]= Integer.parseInt(textField_20.getText());
			}
			if(textField_24.getText().length()==0) {
				b[2][0] = 0;
			}else {
				b[2][0]= Integer.parseInt(textField_24.getText());
			}
			
		}
		//2x3
		if (f == 2 && c == 3) {
			if(textField_16.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_16.getText());
			}
		
			if(textField_17.getText().length()==0) {
				b[0][1] = 0;
			}else {
				b[0][1]= Integer.parseInt(textField_17.getText());
			}
			
			if(textField_18.getText().length()==0) {
				b[0][2] = 0;
			}else {
				b[0][2]= Integer.parseInt(textField_18.getText());
			}
			
			if(textField_20.getText().length()==0) {
				b[1][0] = 0;
			}else {
				b[1][0]= Integer.parseInt(textField_20.getText());
			}
			
			if(textField_21.getText().length()== 0) {
				b[1][1] = 0;
			}else {
				b[1][1]= Integer.parseInt(textField_21.getText());
			}
			
			if(textField_22.getText().length()==0) {
				b[1][2] = 0;
			}else {
				b[1][2]= Integer.parseInt(textField_22.getText());
			}
		}
		//3x2
		if (f == 3 && c == 2) {
			if(textField_16.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_16.getText());
			}
		
			if(textField_17.getText().length()==0) {
				b[0][1] = 0;
			}else {
				b[0][1]= Integer.parseInt(textField_17.getText());
			}
			if(textField_20.getText().length()==0) {
				b[1][0] = 0;
			}else {
				b[1][0]= Integer.parseInt(textField_20.getText());
			}
			
			if(textField_21.getText().length()== 0) {
				b[1][1] = 0;
			}else {
				b[1][1]= Integer.parseInt(textField_21.getText());
			}
			if(textField_24.getText().length()==0) {
				b[2][0] = 0;
			}else {
				b[2][0]= Integer.parseInt(textField_24.getText());
			}
			
			if(textField_25.getText().length()==0) {
				b[2][1] = 0;
			}else {
				b[2][1]= Integer.parseInt(textField_25.getText());
			}
			
		}		
		
		//4x4
		if (f== 4 && c == 4) {
			if(textField_16.getText().length()==0) {
				b[0][0] = 0;
			}else {
				b[0][0]= Integer.parseInt(textField_16.getText());
			}
		
			if(textField_17.getText().length()==0) {
				b[0][1] = 0;
			}else {
				b[0][1]= Integer.parseInt(textField_17.getText());
			}
			
			if(textField_18.getText().length()==0) {
				b[0][2] = 0;
			}else {
				b[0][2]= Integer.parseInt(textField_18.getText());
			}
			
			if(textField_19.getText().length()==0) {
				b[0][3] = 0;
			}else {
				b[0][3]= Integer.parseInt(textField_19.getText());
			}
			
			if(textField_20.getText().length()==0) {
				b[1][0] = 0;
			}else {
				b[1][0]= Integer.parseInt(textField_20.getText());
			}
			
			if(textField_21.getText().length()== 0) {
				b[1][1] = 0;
			}else {
				b[1][1]= Integer.parseInt(textField_21.getText());
			}
			
			if(textField_22.getText().length()==0) {
				b[1][2] = 0;
			}else {
				b[1][2]= Integer.parseInt(textField_22.getText());
			}
			
			if(textField_23.getText().length()==0) {
				b[1][3] = 0;
			}else {
				b[1][3]= Integer.parseInt(textField_23.getText());
			}
			
			if(textField_24.getText().length()==0) {
				b[2][0] = 0;
			}else {
				b[2][0]= Integer.parseInt(textField_24.getText());
			}
			
			if(textField_25.getText().length()==0) {
				b[2][1] = 0;
			}else {
				b[2][1]= Integer.parseInt(textField_25.getText());
			}
			
			if(textField_26.getText().length()==0) {
				b[2][2] = 0;
			}else {
				b[2][2]= Integer.parseInt(textField_26.getText());
			}
			
			if(textField_27.getText().length()==0) {
				b[2][3] = 0;
			}else {
				b[2][3]= Integer.parseInt(textField_27.getText());
			}
			
			if(textField_28.getText().length()==0) {
				b[3][0] = 0;
			}else {
				b[3][0]= Integer.parseInt(textField_28.getText());
			}

			if(textField_29.getText().length()==0) {
				b[3][1] = 0;
			}else {
				b[3][1]= Integer.parseInt(textField_29.getText());
			}

			if(textField_30.getText().length()==0) {
				b[3][2] = 0;
			}else {
				b[3][2]= Integer.parseInt(textField_30.getText());
			}

			if(textField_31.getText().length()==0) {
				b[3][3] = 0;
			}else {
				b[3][3]= Integer.parseInt(textField_31.getText());
			}
		}
		
		return b;
		
	}
	
	public void control(int f, int c) {
		System.out.println(f + " x " + c);
		
		if(f == 1 && c == 1) {
			
			textField_5.setVisible(true);
			
		}
		if (f ==2  && c == 2) {
			
			textField_5.setVisible(true);
			textField_6.setVisible(true);
			textField_9.setVisible(true);
			textField_10.setVisible(true);
		}
		if (f ==1  && c == 2) {
			textField_5.setVisible(true);
			textField_6.setVisible(true);
		}
		if (f ==2  && c == 1) {
			textField_5.setVisible(true);
			textField_9.setVisible(true);
		}
		if (f ==3  && c == 3) {
			textField.setVisible(true);
			textField_1.setVisible(true);
			textField_2.setVisible(true);
			textField_4.setVisible(true);	
			textField_5.setVisible(true);
			textField_6.setVisible(true);
			textField_8.setVisible(true);
			textField_9.setVisible(true);	
			textField_10.setVisible(true);
			
		}
		if (f ==1  && c == 3) {
			textField.setVisible(true);
			textField_1.setVisible(true);
			textField_2.setVisible(true);
		}
		if (f ==3  && c == 1) {
			textField.setVisible(true);
			textField_4.setVisible(true);
			textField_8.setVisible(true);
		}
		if (f ==2  && c == 3) {
			textField.setVisible(true);
			textField_1.setVisible(true);
			textField_2.setVisible(true);
			textField_4.setVisible(true);	
			textField_5.setVisible(true);
			textField_6.setVisible(true);
		}
		if (f ==3  && c == 2) {
			textField.setVisible(true);
			textField_1.setVisible(true);
			textField_4.setVisible(true);	
			textField_5.setVisible(true);
			textField_8.setVisible(true);
			textField_9.setVisible(true);
		}
	}
	
	public void control1(int f , int c) {
System.out.println(f + " x " + c);
		
		if(f == 1 && c == 1) {
			
			textField_21.setVisible(true);
			
		}
		if (f ==2  && c == 2) {
			
			textField_21.setVisible(true);
			textField_22.setVisible(true);
			textField_25.setVisible(true);
			textField_26.setVisible(true);
		}
		if (f ==1  && c == 2) {
			textField_21.setVisible(true);
			textField_22.setVisible(true);
		}
		if (f ==2  && c == 1) {
			textField_21.setVisible(true);
			textField_25.setVisible(true);
		}
		if (f ==3  && c == 3) {
			textField_16.setVisible(true);
			textField_17.setVisible(true);
			textField_18.setVisible(true);
			textField_20.setVisible(true);	
			textField_21.setVisible(true);
			textField_22.setVisible(true);
			textField_24.setVisible(true);
			textField_25.setVisible(true);	
			textField_26.setVisible(true);
			
		}
		if (f ==1  && c == 3) {
			textField_16.setVisible(true);
			textField_17.setVisible(true);
			textField_18.setVisible(true);
		}
		if (f ==3  && c == 1) {
			textField_16.setVisible(true);
			textField_20.setVisible(true);
			textField_24.setVisible(true);
		}
		if (f ==2  && c == 3) {
			textField_16.setVisible(true);
			textField_17.setVisible(true);
			textField_18.setVisible(true);
			textField_20.setVisible(true);	
			textField_21.setVisible(true);
			textField_22.setVisible(true);
		}
		if (f ==3  && c == 2) {
			textField_16.setVisible(true);
			textField_17.setVisible(true);
			textField_20.setVisible(true);	
			textField_21.setVisible(true);
			textField_24.setVisible(true);
			textField_25.setVisible(true);
		}
	
	}
}
