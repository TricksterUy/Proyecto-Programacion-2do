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

import datos.Cliente;
import datos.Habitacion;
import datos.Hotel;
import datos.Reserva;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class AltaReservas extends JFrame {

	private JPanel contentPane;
	private JTextField txthabitacion;
	private JTextField txthotel;
	private JTextField txtcliente;
	private JTextField txtprecio;
	private JTextField txtfin;
	private JTextField txtinicio;
	private JTextField txtidreserva;

	public AltaReservas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		setTitle("Menu de Reservas");
		setResizable(false);
		addWindowListener(new WindowAdapter() {

		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 893, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);

		txthabitacion = new JTextField();
		txthabitacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txthabitacion.setColumns(10);
		txthabitacion.setBounds(183, 150, 219, 27);
		panel.add(txthabitacion);

		txthotel = new JTextField();
		txthotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txthotel.setColumns(10);
		txthotel.setBounds(183, 187, 219, 27);
		panel.add(txthotel);

		txtcliente = new JTextField();
		txtcliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcliente.setColumns(10);
		txtcliente.setBounds(183, 113, 219, 27);
		panel.add(txtcliente);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCliente.setBounds(10, 113, 114, 27);
		panel.add(lblCliente);

		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHotel.setBounds(10, 187, 114, 27);
		panel.add(lblHotel);

		JLabel lblNroHabitacion = new JLabel("Nro Habitacion");
		lblNroHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNroHabitacion.setBounds(10, 150, 139, 27);
		panel.add(lblNroHabitacion);

		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaInicio.setBounds(10, 230, 114, 27);
		panel.add(lblFechaInicio);

		JLabel lblFechaFin = new JLabel("Fecha Fin");
		lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaFin.setBounds(10, 278, 114, 27);
		panel.add(lblFechaFin);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio.setBounds(10, 315, 139, 27);
		panel.add(lblPrecio);

		txtprecio = new JTextField();
		txtprecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtprecio.setColumns(10);
		txtprecio.setBounds(183, 315, 219, 27);
		panel.add(txtprecio);

		txtfin = new JTextField();
		txtfin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfin.setColumns(10);
		txtfin.setBounds(183, 278, 219, 27);
		panel.add(txtfin);

		txtinicio = new JTextField();
		txtinicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtinicio.setColumns(10);
		txtinicio.setBounds(183, 230, 219, 27);
		panel.add(txtinicio);

		JLabel lblNuevaReserva_2 = new JLabel("Nueva Reserva");
		lblNuevaReserva_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevaReserva_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNuevaReserva_2.setBounds(10, 10, 392, 37);
		panel.add(lblNuevaReserva_2);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		JTextArea areaTexto = new JTextArea();
		areaTexto.setFont(new Font("Arial", Font.PLAIN, 16));
		areaTexto.setEditable(false);
		scrollPane.setViewportView(areaTexto);

		JLabel lblNuevaReserva = new JLabel("LISTADO DE RESERVAS");
		lblNuevaReserva.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNuevaReserva.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNuevaReserva);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setToolTipText("Ingresa una nueva Reserva");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idr = txtidreserva.getText();
				String clientet = txtcliente.getText();
				String hotelt = txthotel.getText();
				String habitaciont = txthabitacion.getText();
				String inicio = txtinicio.getText();
				String fin = txtfin.getText();
				String preciot = txtprecio.getText();

				if (clientet.isEmpty() || hotelt.isEmpty() ||habitaciont.isEmpty() || inicio.isEmpty() || fin.isEmpty()
						|| preciot.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {

					try {
						int idreserva = Integer.parseInt(idr);
						int cliente = Integer.parseInt(clientet);
						int habitacion = Integer.parseInt(habitaciont);
						int hotel = Integer.parseInt(hotelt);
						float precio = Float.parseFloat(preciot);
						
						Usuario c = Logueo.obtenerUsuario(cliente);
						Habitacion b = Logueo.obtenerHabitacion(habitacion);
						Hotel h = Logueo.obtenerHotel(hotel);
						
						if (b == null || c==null || h==null) {
							JOptionPane.showMessageDialog(null, "Error, Habitacion, Hotel o Cliente no encontrado", "ERROR",
									JOptionPane.ERROR_MESSAGE);
						} else {
							Date date = new SimpleDateFormat("dd/MM/yy").parse(inicio);
							Date date2 = new SimpleDateFormat("dd/MM/yy").parse(fin);
							
							Reserva r = new Reserva (idreserva, (Cliente) c, (Hotel) h, (Habitacion) b, inicio, fin, precio);
							Logueo.agregarr(r);
							areaTexto.setText(Logueo.imprimirr());
							txtcliente.setText("");
							txthotel.setText("");
							txthabitacion.setText("");
							txtinicio.setText("");
							txtfin.setText("");
							txtprecio.setText("");
							txtidreserva.setText("");

						}

					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "La ID del Empleado no fue encontrada", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Error, solo los Clientes registrados pueden realizar reservas",
								"ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.setBounds(10, 368, 139, 46);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Limpiar los campos");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtcliente.setText("");
				txthotel.setText("");
				txthabitacion.setText("");
				txtinicio.setText("");
				txtfin.setText("");
				txtprecio.setText("");
				txtidreserva.setText("");

			}

		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(159, 368, 139, 46);
		panel.add(btnCancelar);
		
		JLabel lblFormatoFecha = new JLabel("Formato de Fecha: dd/mm/yy");
		lblFormatoFecha.setHorizontalAlignment(SwingConstants.LEFT);
		lblFormatoFecha.setForeground(Color.GRAY);
		lblFormatoFecha.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblFormatoFecha.setBounds(10, 256, 163, 27);
		panel.add(lblFormatoFecha);
		
		JLabel lblIdReserva = new JLabel("ID Reserva");
		lblIdReserva.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdReserva.setBounds(10, 76, 114, 27);
		panel.add(lblIdReserva);
		
		txtidreserva = new JTextField();
		txtidreserva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtidreserva.setColumns(10);
		txtidreserva.setBounds(183, 76, 219, 27);
		panel.add(txtidreserva);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaTexto.setText(Logueo.imprimirr());
			}
		});
		btnActualizar.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoActualizar.png"));
		btnActualizar.setToolTipText("Actualizar el areaTexto");
		btnActualizar.setForeground(SystemColor.menu);
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnActualizar.setBackground(SystemColor.menu);
		btnActualizar.setBounds(309, 352, 93, 69);
		panel.add(btnActualizar);

	}
}
