package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Form01 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;



	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form01 frame = new Form01();
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
	public Form01() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\ProyectosAccesoDatos\\stock-vector-home-icon-160210421.jpg"));
		setTitle("Gesti\u00F3n Inmobiliaria Casas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnActualizarPrecios = new JButton("Actualizar Precios");
		btnActualizarPrecios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Form02 f2 = new Form02();
				f2.setVisible(true);
			}
		});
		btnActualizarPrecios.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnActualizarPrecios.setBounds(30, 135, 160, 53);
		contentPane.add(btnActualizarPrecios);
		
		JButton btnAlquileres = new JButton("Alquileres");
		btnAlquileres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				vista.Form03.main(null);
				
			}
		});
		btnAlquileres.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAlquileres.setBounds(244, 135, 160, 53);
		contentPane.add(btnAlquileres);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new BtnSalirActionListener());
		btnSalir.setBounds(315, 215, 89, 23);
		contentPane.add(btnSalir);
	}
	
	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);
		}
	}

}