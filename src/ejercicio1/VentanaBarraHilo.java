package ejercicio1;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaBarraHilo<ProgresoHilo> extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBarraHilo frame = new VentanaBarraHilo();
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
	public VentanaBarraHilo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.BLACK);
		progressBar.setForeground(Color.BLACK);
		progressBar.setBounds(79, 63, 211, 36);
		contentPane.add(progressBar);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//Boton de iniciar
				
			    Hilo objHilo1 =new Hilo ("miHilo");
			    Thread varHilo1 =new Thread (objHilo1);
			    
			    ProgresoHilo objHilo2 =new ProgresoHilo(progressBar);
			    Thread varHilo2 =new Thread(objHilo2);
			    
			    varHilo1.start();
			    varHilo2.start();
			    
			}
		});
		btnIniciar.setBounds(128, 120, 89, 23);
		contentPane.add(btnIniciar);
		
		JLabel lblNewLabel = new JLabel("Barra de progreso");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(79, 11, 323, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnSalir = new JButton("Cerrar");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//Boton para salir
				System.exit(0);
			}
		});
		btnSalir.setBounds(279, 152, 89, 23);
		contentPane.add(btnSalir);
	}
}
