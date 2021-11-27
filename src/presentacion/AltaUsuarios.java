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

import datos.*;
import negocio.*;

import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class AltaUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtlogin;
	private JTextField txtfecha;
	private JTextField txtmail;
	private JTextField txtcomision;
	private JTextField txtsueldo;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JTextField txtcedula;
	private JPasswordField txtcontrasena;

	public AltaUsuarios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		addWindowListener(new WindowAdapter() {
		});
		setTitle("Alta de Usuarios");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 951, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblAltaUsuarios = new JLabel("Alta de Usuarios");
		lblAltaUsuarios.setBounds(10, 5, 443, 37);
		lblAltaUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblAltaUsuarios);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(10, 106, 114, 27);
		panel.add(lblNombre);

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblId.setBounds(10, 65, 114, 27);
		panel.add(lblId);

		txtid = new JTextField();
		txtid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtid.setColumns(10);
		txtid.setBounds(183, 65, 250, 27);
		panel.add(txtid);

		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtnombre.setColumns(10);
		txtnombre.setBounds(183, 106, 250, 27);
		panel.add(txtnombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApellido.setBounds(10, 143, 114, 27);
		panel.add(lblApellido);

		txtapellido = new JTextField();
		txtapellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtapellido.setColumns(10);
		txtapellido.setBounds(183, 143, 250, 27);
		panel.add(txtapellido);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLogin.setBounds(10, 180, 114, 27);
		panel.add(lblLogin);

		txtlogin = new JTextField();
		txtlogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtlogin.setColumns(10);
		txtlogin.setBounds(183, 180, 250, 27);
		panel.add(txtlogin);

		JLabel lblCorreo = new JLabel("Correo Electronico");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCorreo.setBounds(10, 254, 163, 27);
		panel.add(lblCorreo);

		JLabel lblFecha = new JLabel("Fecha Alta");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFecha.setBounds(10, 291, 114, 23);
		panel.add(lblFecha);

		txtfecha = new JTextField();
		txtfecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfecha.setColumns(10);
		txtfecha.setBounds(183, 291, 250, 27);
		panel.add(txtfecha);

		txtmail = new JTextField();
		txtmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtmail.setColumns(10);
		txtmail.setBounds(183, 254, 250, 27);
		panel.add(txtmail);

		JLabel lblContrase = new JLabel("Contrase\u00F1a");
		lblContrase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrase.setBounds(10, 217, 114, 27);
		panel.add(lblContrase);

		txtcomision = new JTextField();
		txtcomision.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcomision.setColumns(10);
		txtcomision.setBounds(183, 544, 250, 27);
		panel.add(txtcomision);

		txtsueldo = new JTextField();
		txtsueldo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtsueldo.setColumns(10);
		txtsueldo.setBounds(183, 507, 250, 27);
		panel.add(txtsueldo);

		txttelefono = new JTextField();
		txttelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txttelefono.setColumns(10);
		txttelefono.setBounds(183, 456, 250, 27);
		panel.add(txttelefono);

		txtdireccion = new JTextField();
		txtdireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtdireccion.setColumns(10);
		txtdireccion.setBounds(183, 419, 250, 27);
		panel.add(txtdireccion);

		txtcedula = new JTextField();
		txtcedula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcedula.setColumns(10);
		txtcedula.setBounds(183, 367, 250, 27);
		panel.add(txtcedula);

		txtcontrasena = new JPasswordField();
		txtcontrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcontrasena.setBounds(183, 217, 250, 27);
		panel.add(txtcontrasena);

		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCedula.setBounds(10, 367, 68, 27);
		panel.add(lblCedula);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDireccion.setBounds(10, 419, 114, 27);
		panel.add(lblDireccion);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefono.setBounds(10, 456, 114, 27);
		panel.add(lblTelefono);

		JLabel lblSueldo = new JLabel("Sueldo Base");
		lblSueldo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSueldo.setBounds(10, 507, 163, 27);
		panel.add(lblSueldo);

		JLabel lblComision = new JLabel("Comision");
		lblComision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComision.setBounds(10, 544, 114, 23);
		panel.add(lblComision);

		JRadioButton rdCliente = new JRadioButton("Cliente");
		rdCliente.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (rdCliente.isSelected()) {
					txtsueldo.setEnabled(false);
					txtsueldo.setEditable(false);
					txtcomision.setEnabled(false);
					txtcomision.setEditable(false);

					txtcedula.setEnabled(true);
					txtcedula.setEditable(true);
					txtdireccion.setEnabled(true);
					txtdireccion.setEditable(true);
					txttelefono.setEnabled(true);
					txttelefono.setEditable(true);

				} else {
					txtsueldo.setEnabled(true);
					txtsueldo.setEditable(true);
					txtcomision.setEnabled(true);
					txtcomision.setEditable(true);

					txtcedula.setEnabled(false);
					txtcedula.setEditable(false);
					txtdireccion.setEnabled(false);
					txtdireccion.setEditable(false);
					txttelefono.setEnabled(false);
					txttelefono.setEditable(false);

				}

			}
		});
		rdCliente.setSelected(true);
		rdCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdCliente.setBounds(183, 324, 103, 37);
		panel.add(rdCliente);

		JRadioButton rdEmpleado = new JRadioButton("Empleado");
		rdEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdEmpleado.setBounds(292, 324, 141, 37);
		panel.add(rdEmpleado);

		ButtonGroup user = new ButtonGroup();
		user.add(rdEmpleado);
		user.add(rdCliente);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		JLabel lblListaUsuarios = new JLabel("USUARIOS INGRESADOS");
		lblListaUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 30));
		scrollPane.setColumnHeaderView(lblListaUsuarios);

		JTextArea areaTexto = new JTextArea();
		areaTexto.setFont(new Font("Arial", Font.PLAIN, 16));
		areaTexto.setEditable(false);
		scrollPane.setViewportView(areaTexto);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setToolTipText("Ingresa un nuevo Usuario");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String idt = txtid.getText(); // int
				String Nombre = txtnombre.getText();
				String Apellido = txtapellido.getText();
				String Login = txtlogin.getText();
				String Contrasena = txtcontrasena.getText();
				String Mail = txtmail.getText();
				String Fecha = txtfecha.getText();
				String cedulat = txtcedula.getText(); // long
				String Direccion = txtdireccion.getText();
				String Telefono = txttelefono.getText();
				String sueldot = txtsueldo.getText(); // float
				String comisiont = txtcomision.getText(); // float

				DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy -- HH:mm:ss");
				String hora = formateador.format(LocalDateTime.now());

				if (rdCliente.isSelected()) {
					if (idt.isEmpty() || Nombre.isEmpty() || Apellido.isEmpty() || Login.isEmpty()
							|| Contrasena.isEmpty() || Mail.isEmpty() || Fecha.isEmpty() || cedulat.isEmpty()
							|| Direccion.isEmpty() || Telefono.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} else {
						try {
							long Cedula = Long.parseLong(cedulat);
							if (Cedula >= 10000000 && Cedula <= 99999999) {

								int id = Integer.parseInt(idt);

								Date date = new SimpleDateFormat("dd/MM/yy").parse(Fecha);

								Cliente c = new Cliente(Nombre, Apellido, Mail, Fecha, id, Login, Contrasena, hora,
										Cedula, Direccion, Telefono);
								Logueo.agregar(c);
								areaTexto.setText(Logueo.imprimir());

								txtid.setText("");
								txtnombre.setText("");
								txtapellido.setText("");
								txtlogin.setText("");
								txtcontrasena.setText("");
								txtmail.setText("");
								txtfecha.setText("");
								txtcedula.setText("");
								txtdireccion.setText("");
								txttelefono.setText("");
								txtsueldo.setText("");
								txtcomision.setText("");
								rdCliente.setSelected(true);
								txtid.requestFocus();
							} else {
								JOptionPane.showMessageDialog(null,
										"Error, la cedula debe ingresarse sin puntos ni guiones y no mas de 8 numeros",
										"ERROR", JOptionPane.ERROR_MESSAGE);
							}

						} catch (NumberFormatException ex) {
							JOptionPane.showMessageDialog(null, "Los campos de ID y Cedula solo pueden ser numeros",
									"ERROR", JOptionPane.ERROR_MESSAGE);
						} catch (Exception ex) {
							JOptionPane.showMessageDialog(null,
									"Error, el formato de fecha debe coincidir con Dia/Mes/Año", "ERROR",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				} else {

					if (idt.isEmpty() || Nombre.isEmpty() || Apellido.isEmpty() || Login.isEmpty()
							|| Contrasena.isEmpty() || Mail.isEmpty() || Fecha.isEmpty() || sueldot.isEmpty()
							|| comisiont.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
								JOptionPane.ERROR_MESSAGE);

					} else {
						try {
							int id = Integer.parseInt(idt);
							float Sueldo = Float.parseFloat(sueldot);
							float Comision = Float.parseFloat(comisiont);
							Date date = new SimpleDateFormat("dd/MM/yy").parse(Fecha);

							Empleado em = new Empleado(Nombre, Apellido, Mail, Fecha, id, Login, Contrasena, hora,
									Sueldo, Comision);
							Logueo.agregar(em);
							areaTexto.setText(Logueo.imprimir());

							txtid.setText("");
							txtnombre.setText("");
							txtapellido.setText("");
							txtlogin.setText("");
							txtcontrasena.setText("");
							txtmail.setText("");
							txtfecha.setText("");
							txtcedula.setText("");
							txtdireccion.setText("");
							txttelefono.setText("");
							txtsueldo.setText("");
							txtcomision.setText("");
							rdCliente.setSelected(true);
							txtid.requestFocus();

						} catch (NumberFormatException ex) {
							JOptionPane.showMessageDialog(null,
									"Los campos de ID, Sueldo y Comision solo pueden ser numeros", "ERROR",
									JOptionPane.ERROR_MESSAGE);
						} catch (Exception ex) {
							JOptionPane.showMessageDialog(null,
									"Error, el formato de fecha debe coincidir con Dia/Mes/Año", "ERROR",
									JOptionPane.ERROR_MESSAGE);
						}

					}

				}

			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.setBounds(21, 598, 150, 46);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Limpiar los campos");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtid.setText("");
				txtnombre.setText("");
				txtapellido.setText("");
				txtlogin.setText("");
				txtcontrasena.setText("");
				txtmail.setText("");
				txtfecha.setText("");
				txtcedula.setText("");
				txtdireccion.setText("");
				txttelefono.setText("");
				txtsueldo.setText("");
				txtcomision.setText("");
				rdCliente.setSelected(true);

			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(199, 598, 150, 46);
		panel.add(btnCancelar);

		JLabel lblFormatoFecha = new JLabel("Formato de Fecha: dd/mm/yy");
		lblFormatoFecha.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblFormatoFecha.setForeground(Color.GRAY);
		lblFormatoFecha.setHorizontalAlignment(SwingConstants.LEFT);
		lblFormatoFecha.setBounds(10, 314, 163, 27);
		panel.add(lblFormatoFecha);

		JLabel lblNewLabel = new JLabel("Digito verificador includido, sin puntos ni guiones");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel.setBounds(10, 393, 203, 27);
		panel.add(lblNewLabel);

		JButton btnActualizar = new JButton("");
		btnActualizar.setForeground(SystemColor.control);
		btnActualizar.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoActualizar.png"));
		btnActualizar.setToolTipText("Actualizar el areaTexto");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				areaTexto.setText(Logueo.imprimir());
			}
		});
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnActualizar.setBackground(SystemColor.control);
		btnActualizar.setBounds(359, 583, 93, 69);
		panel.add(btnActualizar);
		


	}
}
