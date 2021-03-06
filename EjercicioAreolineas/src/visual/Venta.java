package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Venta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Venta dialog = new Venta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Venta() {
		setBounds(100, 100, 800, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 776, 83);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 30, 165, 24);
		panel.add(comboBox);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setBounds(195, 35, 55, 15);
		panel.add(lblOrigen);
		
		textField_5 = new JTextField();
		textField_5.setBounds(254, 33, 104, 19);
		textField_5.setEditable(false);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Destino:");
		lblNewLabel.setBounds(376, 35, 55, 15);
		panel.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(445, 33, 104, 19);
		textField_6.setEditable(false);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(567, 35, 55, 15);
		panel.add(lblFecha);
		
		textField_7 = new JTextField();
		textField_7.setBounds(623, 33, 104, 19);
		textField_7.setEditable(false);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 107, 776, 83);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(12, 29, 164, 24);
		panel_1.add(comboBox_1);
		
		JLabel lblAsiento = new JLabel("Asiento:");
		lblAsiento.setBounds(223, 34, 87, 15);
		panel_1.add(lblAsiento);
		
		textField_3 = new JTextField();
		textField_3.setBounds(341, 32, 104, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(508, 34, 55, 15);
		panel_1.add(lblPrecio);
		
		textField_4 = new JTextField();
		textField_4.setBounds(581, 32, 104, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 202, 776, 83);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(12, 33, 55, 15);
		panel_2.add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(88, 31, 104, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(271, 33, 55, 15);
		panel_2.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(381, 31, 104, 19);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(518, 33, 97, 15);
		panel_2.add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(618, 31, 104, 19);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
