package ejercicio1;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
//coloque una libreria
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class SerieNumeros_IG extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	
	static String strcantidad, strResultado="";
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerieNumeros_IG frame = new SerieNumeros_IG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SerieNumeros_IG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SERIE DE NUMEROS");
		lblNewLabel.setForeground(new Color(240, 255, 240));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setBounds(57, 11, 344, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de numeros:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(26, 76, 174, 32);
		contentPane.add(lblNewLabel_1);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCantidad.setBounds(210, 83, 107, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		btnSalir.setBackground(new Color(255, 69, 0));
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSalir.setBounds(323, 227, 101, 23);
		contentPane.add(btnSalir);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int Valor1=1, Valor2=2, i=1, aux=0, cantidad;
						
				
			
				strcantidad=txtCantidad.getText();
				cantidad=Integer.parseInt(strcantidad);
				strResultado+="\n"+Valor1+ ", \n"+Valor2+ ", \n";
				
				while (cantidad>=i)
				{
					 aux=Valor1+Valor2;
					 Valor1=Valor2;
					 Valor2=aux;
					 i++;
					 strResultado+=aux+", \n";
					 txtResultado.setText(strResultado);
					
				}
				
				//txtResultado.setText(Integer.toString(Valor2));
				
				//Mostrara un cuadro de dialogo, bueno, una ventana
				  //JOptionPane.showMessageDialog(rootPane, Valor2);
				
				//Mostrar los datos en un text area
				  //jtxtAreaResultado.append(Valor2);
			   
				
				//jtxtAreaResultado.setText("Numeracion: " +Valor2+ " ");
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalcular.setBounds(148, 186, 130, 40);
		contentPane.add(btnCalcular);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtResultado.setEditable(false);
		txtResultado.setBounds(133, 127, 192, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(36, 128, 107, 14);
		contentPane.add(lblNewLabel_2);
	}
}
