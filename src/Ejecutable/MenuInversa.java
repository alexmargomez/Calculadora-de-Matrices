package Ejecutable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuInversa extends JFrame{

	public MenuInversa(int a[][], int b[][]) {
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
					double resul[][] = new double[a.length][a[0].length];
					resul = invert(a1);
					
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
					double resul[][] = new double[b.length][b[0].length];
					resul = invert(b1);
					
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
	        java.util.logging.Logger.getLogger( MenuInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger( MenuInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger( MenuInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger( MenuInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	}

	 public static double[][] invert(double a[][])         {

         int n = a.length;
         double x[][] = new double[n][n];
         double b[][] = new double[n][n];
         int index[] = new int[n];
         for (int i=0; i<n; ++i)
             b[i][i] = 1;

  // Transform the matrix into an upper triangle

         gaussian(a, index);

  // Update the matrix b[i][j] with the ratios stored
         for (int i=0; i<n-1; ++i)
             for (int j=i+1; j<n; ++j)
                 for (int k=0; k<n; ++k)
                     b[index[j]][k]
                     	    -= a[index[j]][i]*b[index[i]][k];

  
  // Perform backward substitutions
         for (int i=0; i<n; ++i)             {
             x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
             for (int j=n-2; j>=0; --j)                 {
                 x[j][i] = b[index[j]][i];
                 for (int k=j+1; k<n; ++k)
                 {
                     x[j][i] -= a[index[j]][k]*x[k][i];
                 }

                 x[j][i] /= a[index[j]][j];
             }
         }
         return x;
     }

 // Method to carry out the partial-pivoting Gaussian
 // elimination.  Here index[] stores pivoting order.

     public static void gaussian(double a[][], int index[])  {

         int n = index.length;
         double c[] = new double[n];

  // Initialize the index
         for (int i=0; i<n; ++i)
             index[i] = i;

  // Find the rescaling factors, one from each row
         for (int i=0; i<n; ++i) {
             double c1 = 0;
             for (int j=0; j<n; ++j) {
                 double c0 = Math.abs(a[i][j]);
                 if (c0 > c1) c1 = c0;
             }
             c[i] = c1;
         }

  // Search the pivoting element from each column
         int k = 0;
         for (int j=0; j<n-1; ++j) {
             double pi1 = 0;
             for (int i=j; i<n; ++i)  {

                 double pi0 = Math.abs(a[index[i]][j]);
                 pi0 /= c[index[i]];
                 if (pi0 > pi1) {
                     pi1 = pi0;
                     k = i;
                 }
             }

  
    // Interchange rows according to the pivoting order
             int itmp = index[j];
             index[j] = index[k];
             index[k] = itmp;
             for (int i=j+1; i<n; ++i) {
                 double pj = a[index[i]][j]/a[index[j]][j];

  // Record pivoting ratios below the diagonal
                 a[index[i]][j] = pj;

  // Modify other elements accordingly
                 for (int l=j+1; l<n; ++l)
                     a[index[i]][l] -= pj*a[index[j]][l];
             }
         }
     }

}