/*****************************************************************************************
* 									PERSEO DEV TEAM										 *
* 																						 *
* 																						 *
*							Perseo Software Developers Company 							 *
* 																						 *
* 																						 *
*				Sandra Barrera, Bruno Bordagorry, Emilio Colina, Victor Dutra			 *
* 																						 *
******************************************************************************************/

package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Empleado;
import datos.Hotel;
import datos.Usuario;
import negocio.Logueo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class EliminarHotel extends JFrame {

	private JPanel contentPane;
	private JTextField txtciudad;
	private JTextField txtdireccion;
	private JTextField txtnombre;
	private JTextField txtidhotel;

	public EliminarHotel() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		addWindowListener(new WindowAdapter() {
		});
		setTitle("Menu de Eliminar Hoteles");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 417, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);



		JButton btnEliminar = new JButton("");
		btnEliminar.setEnabled(false);
		btnEliminar.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoEliminar.png"));
		btnEliminar.setToolTipText("Eliminar Hotel");
		btnEliminar.setForeground(SystemColor.control);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CONFIGURACION DEL BOTON ELIMINAR
				
				String idt = txtidhotel.getText();
				int id= Integer.parseInt(idt);				
				Logueo.eliminarHotel(id);
				JOptionPane.showMessageDialog(null, "Usuario Eliminado", "ATENCION",
						JOptionPane.ERROR_MESSAGE);
				txtidhotel.setEnabled(true);
				btnEliminar.setEnabled(false);
				txtidhotel.setText("");
				txtnombre.setText("");
				txtdireccion.setText("");
				txtciudad.setText("");
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEliminar.setBackground(new Color(240, 240, 240));
		btnEliminar.setBounds(34, 303, 89, 55);
		contentPane.add(btnEliminar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Limpiar los campos");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtidhotel.setEnabled(true);
				btnEliminar.setEnabled(false);
				txtidhotel.setText("");
				txtnombre.setText("");
				txtdireccion.setText("");
				txtciudad.setText("");
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(244, 314, 139, 44);
		contentPane.add(btnCancelar);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setToolTipText("Buscar Hotel");
		btnBuscar.setForeground(SystemColor.control);
		btnBuscar.setBackground(SystemColor.control);
		btnBuscar.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoBuscar.png"));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String idt = txtidhotel.getText();
				
				//CONFIGURACION DEL BOTON BUSCAR OBTENIENDO METODOS DE LA VENTANA PRINCIPAL

				if (idt.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {

					int id = Integer.parseInt(idt);
					Hotel h = Logueo.obtenerHotel(id);
					if (h == null) {
						JOptionPane.showMessageDialog(null, "Error, Hotel no encontrado", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} else {
						txtidhotel.setEnabled(false);
						btnEliminar.setEnabled(true);
						txtnombre.setText(h.getNombreHotel());
						txtdireccion.setText(h.getDireccionHotel());
						txtciudad.setText(h.getCiudadHotel());
					}
				}

			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setBounds(133, 303, 101, 55);
		contentPane.add(btnBuscar);

		txtciudad = new JTextField();
		txtciudad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtciudad.setEditable(false);
		txtciudad.setEnabled(false);
		txtciudad.setColumns(10);
		txtciudad.setBounds(145, 245, 238, 35);
		contentPane.add(txtciudad);

		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCiudad.setBounds(20, 245, 115, 35);
		contentPane.add(lblCiudad);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDireccion.setBounds(20, 190, 115, 35);
		contentPane.add(lblDireccion);

		txtdireccion = new JTextField();
		txtdireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtdireccion.setEditable(false);
		txtdireccion.setEnabled(false);
		txtdireccion.setColumns(10);
		txtdireccion.setBounds(145, 190, 238, 35);
		contentPane.add(txtdireccion);

		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtnombre.setEditable(false);
		txtnombre.setEnabled(false);
		txtnombre.setColumns(10);
		txtnombre.setBounds(145, 133, 238, 35);
		contentPane.add(txtnombre);

		txtidhotel = new JTextField();
		txtidhotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtidhotel.setColumns(10);
		txtidhotel.setBounds(145, 81, 238, 35);
		contentPane.add(txtidhotel);

		JLabel lblId = new JLabel("ID Hotel");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblId.setBounds(20, 81, 115, 35);
		contentPane.add(lblId);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNombre.setBounds(20, 133, 115, 35);
		contentPane.add(lblNombre);

		JLabel lblEliminarHotel = new JLabel("Eliminar Hotel");
		lblEliminarHotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarHotel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEliminarHotel.setBounds(10, 10, 373, 47);
		contentPane.add(lblEliminarHotel);
	}
}
