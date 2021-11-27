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
import presentacion.*;
import negocio.*;

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
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class AltaHotel extends JFrame {

	protected static final String Id = null;
	private JPanel contentPane;
	private JTextField txtdireccion;
	private JTextField txtnombre;
	private JTextField txtidhotel;
	private JTextField txttelefono;
	private JTextField txtpais;
	private JTextField txtciudad;
	private JTextField txtadministrador;

	public AltaHotel() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		setTitle("Alta de Hotel");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 901, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblIdHotel = new JLabel("ID Hotel");
		lblIdHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdHotel.setBounds(10, 74, 114, 27);
		panel.add(lblIdHotel);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(10, 115, 114, 27);
		panel.add(lblNombre);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDireccion.setBounds(10, 152, 114, 27);
		panel.add(lblDireccion);

		txtdireccion = new JTextField();
		txtdireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtdireccion.setColumns(10);
		txtdireccion.setBounds(159, 152, 219, 27);
		panel.add(txtdireccion);

		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtnombre.setColumns(10);
		txtnombre.setBounds(159, 115, 219, 27);
		panel.add(txtnombre);

		txtidhotel = new JTextField();
		txtidhotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtidhotel.setColumns(10);
		txtidhotel.setBounds(159, 74, 219, 27);
		panel.add(txtidhotel);

		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCiudad.setBounds(10, 191, 114, 27);
		panel.add(lblCiudad);

		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPais.setBounds(10, 232, 114, 27);
		panel.add(lblPais);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefono.setBounds(10, 269, 139, 27);
		panel.add(lblTelefono);

		txttelefono = new JTextField();
		txttelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txttelefono.setColumns(10);
		txttelefono.setBounds(159, 269, 219, 27);
		panel.add(txttelefono);

		txtpais = new JTextField();
		txtpais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpais.setColumns(10);
		txtpais.setBounds(159, 232, 219, 27);
		panel.add(txtpais);

		txtciudad = new JTextField();
		txtciudad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtciudad.setColumns(10);
		txtciudad.setBounds(159, 191, 219, 27);
		panel.add(txtciudad);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		JTextArea areaTexto = new JTextArea();
		areaTexto.setFont(new Font("Arial", Font.PLAIN, 16));
		areaTexto.setEditable(false);
		scrollPane.setViewportView(areaTexto);

		JLabel lblNuevoHotel = new JLabel("HOTELES INGRESADOS");
		lblNuevoHotel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNuevoHotel.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNuevoHotel);
		JLabel lblNuevoHotel_2 = new JLabel("Nuevo Hotel");
		lblNuevoHotel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoHotel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNuevoHotel_2.setBounds(10, 10, 392, 37);
		panel.add(lblNuevoHotel_2);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setToolTipText("Ingresa un nuevo Hotel");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String idhotelt = txtidhotel.getText();
				String nombre = txtnombre.getText();
				String direccion = txtdireccion.getText();
				String ciudad = txtciudad.getText();
				String pais = txtpais.getText();
				String telefonot = txttelefono.getText();
				String administrador = txtadministrador.getText();
				
				//COMPROBAMOS EN EL IF SI HAY CAMPOS VACIOS, SI HAY LANZA ALERTA, CASO CONTRARIO PASA AL ELSE
				if (idhotelt.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || ciudad.isEmpty() || pais.isEmpty()
						|| telefonot.isEmpty() || administrador.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {

					try {
						int idhotel = Integer.parseInt(idhotelt);
						long telefono = Long.parseLong(telefonot);
						int admin = Integer.parseInt(administrador);
						Usuario u = Logueo.obtenerUsuario(admin);
						if (u == null) {
							JOptionPane.showMessageDialog(null, "Error, Usuario no encontrado", "ERROR",
									JOptionPane.ERROR_MESSAGE);
						} else {

							Hotel h = new Hotel(idhotel, nombre, direccion, ciudad, pais, telefono, (Empleado) u);
							Logueo.agregarh(h);
							areaTexto.setText(Logueo.imprimirh());
							txtidhotel.setText("");
							txtnombre.setText("");
							txtdireccion.setText("");
							txtciudad.setText("");
							txtpais.setText("");
							txttelefono.setText("");
							txtadministrador.setText("");

						}

					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Error, solo se admiten numeros en telefono y Administrador", "ERROR",
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
		btnAceptar.setBounds(20, 380, 150, 46);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Limpiar los campos");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtidhotel.setText("");
				txtnombre.setText("");
				txtdireccion.setText("");
				txtciudad.setText("");
				txtpais.setText("");
				txttelefono.setText("");
				txtadministrador.setText("");
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(180, 380, 150, 46);
		panel.add(btnCancelar);

		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAdministrador.setBounds(10, 309, 139, 27);
		panel.add(lblAdministrador);

		txtadministrador = new JTextField();
		txtadministrador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtadministrador.setColumns(10);
		txtadministrador.setBounds(159, 309, 219, 27);
		panel.add(txtadministrador);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaTexto.setText(Logueo.imprimirh());
			}
		});
		btnActualizar.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoActualizar.png"));
		btnActualizar.setToolTipText("Actualizar el areaTexto");
		btnActualizar.setForeground(SystemColor.menu);
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnActualizar.setBackground(SystemColor.menu);
		btnActualizar.setBounds(340, 362, 93, 69);
		panel.add(btnActualizar);

	}

}
