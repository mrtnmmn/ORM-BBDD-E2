package vista;

import controlador.Cont;
import modeloVo.ListaInmuebles;
import modeloVo.Zonas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import modeloVo.ListaInmuebles;

import javax.swing.JComboBox;
import javax.swing.JList;



public class Form03 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public ArrayList<Zonas> arrZonas;
	public ArrayList<ListaInmuebles> arrLista;
	
	private JTable tableInmuebles;
	JScrollPane scrollPane;
	private JTextField textFieldContrato;
	private JTextField textFieldFecContrato;
	private JTextField textFieldFecVencimiento;
	private JTextField textFieldPrecio;

	private JTextField textFieldTamanho;
	private JCheckBox chckbxPiscina;
	private JCheckBox chckbxGaraje;
	private JCheckBox chckbxJardin;
	private JButton btnBuscar;
	private JComboBox comboBoxZona;
	private JTable tableListado;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Form03 dialog = new Form03();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Form03() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\ProyectosAccesoDatos\\stock-vector-home-icon-160210421.jpg"));
		setTitle("Gesti\u00F3n Inmobiliaria Casas");
		setBounds(100, 100, 951, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 42, 887, 36);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblZona = new JLabel("Zona:");
		lblZona.setBounds(10, 11, 46, 14);
		panel.add(lblZona);
		
		
		
		JLabel lblTamao = new JLabel("Tama\u00F1o:");
		lblTamao.setBounds(233, 10, 56, 16);
		panel.add(lblTamao);
		
		textFieldTamanho = new JTextField();
		textFieldTamanho.setBounds(303, 7, 116, 22);
		panel.add(textFieldTamanho);
		textFieldTamanho.setColumns(10);
		
		chckbxPiscina = new JCheckBox("Piscina");
		chckbxPiscina.setBounds(427, 6, 75, 25);
		panel.add(chckbxPiscina);
		
		chckbxGaraje = new JCheckBox("Garaje");
		chckbxGaraje.setBounds(506, 6, 75, 25);
		panel.add(chckbxGaraje);
		
		chckbxJardin = new JCheckBox("Jard\u00EDn");
		chckbxJardin.setBounds(585, 6, 113, 25);
		panel.add(chckbxJardin);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new BtnBuscarActionListener());
		btnBuscar.setBounds(681, 6, 97, 25);
		panel.add(btnBuscar);
		
		comboBoxZona = new JComboBox();
		comboBoxZona.setBounds(60, 6, 155, 24);
		arrZonas = Cont.getComboZonas();
		comboBoxZona.setModel(new DefaultComboBoxModel(arrZonas.toArray()));
		panel.add(comboBoxZona);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 91, 901, 122);
		contentPanel.add(scrollPane);
		
		tableListado = new JTable();
		scrollPane.setViewportView(tableListado);
		
		
		
		JLabel lblListadoInmueblesDisponibles = new JLabel("LISTADO INMUEBLES DISPONIBLES EN LA ZONA");
		lblListadoInmueblesDisponibles.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoInmueblesDisponibles.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblListadoInmueblesDisponibles.setBounds(64, 13, 539, 16);
		contentPanel.add(lblListadoInmueblesDisponibles);
		
		JPanel panelNuevoContrato = new JPanel();
		panelNuevoContrato.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Nuevo Contrato", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panelNuevoContrato.setBounds(20, 222, 901, 135);
		contentPanel.add(panelNuevoContrato);
		panelNuevoContrato.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00BA Contrato:");
		lblNewLabel.setBounds(12, 26, 74, 16);
		panelNuevoContrato.add(lblNewLabel);
		
		textFieldContrato = new JTextField();
		textFieldContrato.setEditable(false);
		textFieldContrato.setBounds(108, 23, 116, 22);
		panelNuevoContrato.add(textFieldContrato);
		textFieldContrato.setColumns(10);
		
		JLabel lblInquilino = new JLabel("Inquilino:");
		lblInquilino.setBounds(236, 26, 56, 16);
		panelNuevoContrato.add(lblInquilino);
		
	
		
		JLabel lblFechaContrato = new JLabel("Fecha Contrato:");
		lblFechaContrato.setBounds(12, 65, 116, 16);
		panelNuevoContrato.add(lblFechaContrato);
		
		textFieldFecContrato = new JTextField();
		textFieldFecContrato.setEditable(false);
		textFieldFecContrato.setBounds(108, 62, 116, 22);
		panelNuevoContrato.add(textFieldFecContrato);
		textFieldFecContrato.setColumns(10);
		
		JLabel lblFechaVencimiento = new JLabel("Fecha Vencimiento:");
		lblFechaVencimiento.setBounds(348, 65, 116, 16);
		panelNuevoContrato.add(lblFechaVencimiento);
		
		textFieldFecVencimiento = new JTextField();
		textFieldFecVencimiento.setEditable(false);
		textFieldFecVencimiento.setBounds(479, 62, 116, 22);
		panelNuevoContrato.add(textFieldFecVencimiento);
		textFieldFecVencimiento.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(12, 94, 56, 16);
		panelNuevoContrato.add(lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(108, 100, 116, 22);
		panelNuevoContrato.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		JLabel lblDdmmaaaa = new JLabel("dd/mm/aaaa");
		lblDdmmaaaa.setBounds(236, 65, 100, 16);
		panelNuevoContrato.add(lblDdmmaaaa);
		
		JComboBox comboBoxInquilinos = new JComboBox();
		comboBoxInquilinos.setBounds(348, 12, 279, 24);
		panelNuevoContrato.add(comboBoxInquilinos);
			
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




	private class OkButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			

		}

		private void cargarTabla() {
			
			
		}

		private void deshabilitarCuadrosText() {
			textFieldContrato.setEditable(false);
			textFieldFecContrato.setEditable(false);
			textFieldFecVencimiento.setEditable(false);
			textFieldPrecio.setEditable(false);
			
		}
		
		private void limpiarCuadrosText() {
			textFieldContrato.setText("");
			textFieldFecContrato.setText("");
			textFieldFecVencimiento.setText("");
			textFieldPrecio.setText("");
			
		}
	}
	
	private class CancelButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		}
	}
	
	private class BtnBuscarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			fillTable();
			
		}
	}
	
	public void getArr() {
		arrLista = Cont.getListaInmuebles(arrZonas.get(comboBoxZona.getSelectedIndex()).getCodigo());		

		if (textFieldTamanho.getText() != null && textFieldTamanho.getText() != "") {
			for (ListaInmuebles l: arrLista) {
				if (l.getTama??o() <= Integer.parseInt(textFieldTamanho.getText())) {
					arrLista.remove(l);
				}
			}
		}
		
		if (chckbxPiscina.isSelected()) {
			for (ListaInmuebles l: arrLista) {
				if (l.isPiscina() == false) {
					arrLista.remove(l);
				}
			}
		}
		if (chckbxGaraje.isSelected()) {
			for (ListaInmuebles l: arrLista) {
				if (l.isGaraje() == false) { 
					arrLista.remove(l);
				}
			}
		}
		if (chckbxJardin.isSelected()) {
			for (ListaInmuebles l: arrLista) {
				if (l.isJardin() == false) {
					arrLista.remove(l);
				}
			}
		}
	}
	
	public void fillTable() {
		
		getArr();
		
		String[] columnNames = {"Inmueble", "Direccion", "Precio", "Estado", "FechaVencimiento", "Propietario", "Telefono"};
		DefaultTableModel modelTable = new DefaultTableModel(columnNames, 0);
		
		
		for (ListaInmuebles l: arrLista) {	
			Object[] data = {l.getCodInmueble(), l.getDireccion(), l.getPrecio(), l.isEstado(), l.getFechaVencimiento(), l.getPropietario(), l.getTelefono()};
			modelTable.addRow(data);
		}
		
		tableListado.setModel(modelTable);
	}
	
	private void cargarTabla() {
		
		
	}
}