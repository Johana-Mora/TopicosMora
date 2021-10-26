package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class ValidarExpresion extends JFrame {

	private JPanel contentPane;
	private JTextField txtExpresion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarExpresion frame = new ValidarExpresion();
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
	public ValidarExpresion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VERIFICACION DE EXPRESION");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(10, 11, 414, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escriba:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(81, 98, 76, 17);
		contentPane.add(lblNewLabel_1);
		
		txtExpresion = new JTextField();
		txtExpresion.setBounds(153, 98, 159, 20);
		contentPane.add(txtExpresion);
		txtExpresion.setColumns(10);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			
			{
				//Aqui esta el codigo del boton "Validar"
				
				String miExpresion=txtExpresion.getText();
				char [] expresion=miExpresion.toCharArray();
				//Usando la coleccion Pila
				Stack<Character> mipila=new Stack<>();
				boolean error=false;
				for(int x=0; x<expresion.length;x++)
				{
					if (expresion[x]=='(')
					{
						mipila.push('(');
					}
					else if (expresion[x]==')')
					{
						if (mipila.empty())
						{
							error=true;
							break;
						}
						else
						{
							mipila.pop();
						}
					}
				}
				//Termina el ciclo de for y fuera de este se manda los mensajitos
				//usando la variable auxiliar error
				if (error)
				{
					JOptionPane.showMessageDialog(null,"Expresion:" + miExpresion +" no validad. Es incorrecta." );
				}
				else if (!mipila.empty())
				{
					JOptionPane.showMessageDialog(null, "Expresion:" + miExpresion +" no validad. Es incorrecta." );
				}
				else 
					JOptionPane.showMessageDialog(null,"Expresion:" + miExpresion +" no validad. Es incorrecta." );
				
			}
		});
		btnValidar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnValidar.setBounds(124, 145, 111, 32);
		contentPane.add(btnValidar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//Boton para salir
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSalir.setBounds(294, 187, 89, 23);
		contentPane.add(btnSalir);
	}
}
