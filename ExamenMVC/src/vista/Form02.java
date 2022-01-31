package vista;

import controlador.Cont;
import modeloVo.Zonas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Form02 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textIncrementoPrecio;

	public ArrayList<Zonas> arrZonas;
	
	public JComboBox comboBoxZona;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Form02 dialog = new Form02();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Form02() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\ProyectosAccesoDatos\\stock-vector-home-icon-160210421.jpg"));
		setTitle("Gestion Inmobilaria Casas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Zona");
		lblNewLabel.setBounds(56, 26, 46, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblIncrementoPrecio = new JLabel("% Incremento Precio");
		lblIncrementoPrecio.setBounds(56, 99, 120, 14);
		contentPanel.add(lblIncrementoPrecio);
		
		textIncrementoPrecio = new JTextField();
		textIncrementoPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actualizar();
			}
		});
		textIncrementoPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		textIncrementoPrecio.setBounds(54, 120, 136, 20);
		contentPanel.add(textIncrementoPrecio);
		textIncrementoPrecio.setColumns(10);
		
		comboBoxZona = new JComboBox();
		arrZonas = Cont.getComboZonas();
		comboBoxZona.setModel(new DefaultComboBoxModel(arrZonas.toArray()));
		comboBoxZona.setBounds(137, 21, 211, 24);
		contentPanel.add(comboBoxZona);
		
	
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new OkButtonActionListener());
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new CancelButtonActionListener());
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}



	}
	private class CancelButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			//coordinador.mostrarFormInicio();
		}
	}
	private class OkButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
			dispose();
			
		}
	}

	public void actualizar() {
		Cont.actualizarContratosController(arrZonas.get(comboBoxZona.getSelectedIndex()).getCodigo(), Integer.parseInt(textIncrementoPrecio.getText()));
	}


	public JPanel getContentPanel() {
		return contentPanel;
	}
}
