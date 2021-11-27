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
import datos.Habitacion;
import datos.Hotel;
import datos.Usuario;
import negocio.Logueo;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class AltaHabitaciones extends JFrame {

	private JPanel contentPane;
	private JTextField txtcapacidad;
	private JTextField txthabitacion;
	private JTextField txthotel;
	private JTextField txtprecio;

	public AltaHabitaciones() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		setTitle("Alta de Habitaciones");
		setResizable(false);
		addWindowListener(new WindowAdapter() {

		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 890, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHotel.setBounds(10, 70, 114, 27);
		panel.add(lblHotel);

		JLabel lblNroHabitacion = new JLabel("Nro. Habitacion");
		lblNroHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNroHabitacion.setBounds(10, 111, 150, 27);
		panel.add(lblNroHabitacion);

		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCapacidad.setBounds(10, 148, 114, 27);
		panel.add(lblCapacidad);

		txtcapacidad = new JTextField();
		txtcapacidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcapacidad.setColumns(10);
		txtcapacidad.setBounds(170, 148, 215, 27);
		panel.add(txtcapacidad);

		txthabitacion = new JTextField();
		txthabitacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txthabitacion.setColumns(10);
		txthabitacion.setBounds(170, 111, 215, 27);
		panel.add(txthabitacion);

		txthotel = new JTextField();
		txthotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txthotel.setColumns(10);
		txthotel.setBounds(170, 70, 215, 27);
		panel.add(txthotel);

		JLabel lblHabitacion = new JLabel("Nueva Habitacion");
		lblHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHabitacion.setBounds(10, 10, 335, 37);
		panel.add(lblHabitacion);

		txtprecio = new JTextField();
		txtprecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtprecio.setColumns(10);
		txtprecio.setBounds(170, 185, 215, 27);
		panel.add(txtprecio);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio.setBounds(10, 185, 114, 27);
		panel.add(lblPrecio);
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		JTextArea areaTexto = new JTextArea();
		areaTexto.setFont(new Font("Arial", Font.PLAIN, 16));
		areaTexto.setEditable(false);
		scrollPane.setViewportView(areaTexto);

		JLabel lblNuevaHabitacion = new JLabel("HABITACIONES INGRESADAS");
		lblNuevaHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNuevaHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNuevaHabitacion);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setToolTipText("Ingresa una nueva habitacion");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hotelt = txthotel.getText();
				String habitaciont = txthabitacion.getText();
				String capacidadt = txtcapacidad.getText();
				String preciot = txtprecio.getText();

				if (hotelt.isEmpty() || habitaciont.isEmpty() || capacidadt.isEmpty() || preciot.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {

					try {
						int habitacion = Integer.parseInt(habitaciont);
						int capacidad = Integer.parseInt(capacidadt);
						float precio = Float.parseFloat(preciot);
						int hotel = Integer.parseInt(hotelt);
						Hotel h = Logueo.obtenerHotel(hotel);

						if (capacidad <= 0 || precio <= 0) {

							JOptionPane.showMessageDialog(null, "Error, el valor debe ser mayor de 0", "ERROR",
									JOptionPane.ERROR_MESSAGE);
						} else {

							if (h == null) {
								JOptionPane.showMessageDialog(null, "Error, Hotel no encontrado", "ERROR",
										JOptionPane.ERROR_MESSAGE);
							} else {

								Habitacion o = new Habitacion((Hotel) h, habitacion, capacidad, precio);
								Logueo.agregarb(o);
								areaTexto.setText(Logueo.imprimirb());
								txthotel.setText("");
								txthabitacion.setText("");
								txtcapacidad.setText("");
								txtprecio.setText("");

							}
						}

					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "La ID del Empleado no fue encontrada", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Error, solo los Empleados pueden ser Administradores",
								"ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.setBounds(20, 243, 140, 46);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Limpiar los campos");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txthotel.setText("");
				txthabitacion.setText("");
				txtcapacidad.setText("");
				txtprecio.setText("");
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(170, 243, 141, 46);
		panel.add(btnCancelar);

		JButton btnActualizar = new JButton("");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaTexto.setText(Logueo.imprimirb());
			}
		});
		btnActualizar.setIcon(new ImageIcon(
				"D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoActualizar.png"));
		btnActualizar.setToolTipText("Actualizar el areaTexto");
		btnActualizar.setForeground(SystemColor.menu);
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnActualizar.setBackground(SystemColor.menu);
		btnActualizar.setBounds(321, 220, 93, 69);
		panel.add(btnActualizar);

	}
}
