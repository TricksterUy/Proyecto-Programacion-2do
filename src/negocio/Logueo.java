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

package negocio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

import datos.*;
import presentacion.*;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Logueo extends JFrame {

	private static Altabaja lista = new Altabaja();
	private static AltabajaHabitacion listab = new AltabajaHabitacion();
	private static AltabajaHotel listah = new AltabajaHotel();
	private static AltabajaReserva listar = new AltabajaReserva();

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField psdContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logueo frame = new Logueo();
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

	public Logueo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int salida = 0;
				salida = JOptionPane.showOptionDialog(null, "Realmente deseas salir del programa?",
						"Confirmación de salida", JOptionPane.YES_NO_CANCEL_OPTION, salida, null,
						new Object[] { "Si", "No", "Cancelar" }, // objeto para las opciones
						// null para YES, NO y CANCEL
						"Si");

				switch (salida) {
				case 0:
					System.exit(salida);

					break;
				case 1:

					break;
				case 2:

					break;
				case -1:
					break;
				}
			}
		});
		setResizable(false);
		setTitle("Ventana de Acceso");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 567, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIngresoUsuarios = new JLabel("Menu de Acceso al Programa");
		lblIngresoUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblIngresoUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresoUsuarios.setBounds(0, 10, 543, 53);
		contentPane.add(lblIngresoUsuarios);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblLogin.setBounds(10, 95, 115, 35);
		contentPane.add(lblLogin);

		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtLogin.setBounds(161, 95, 170, 35);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);

		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblContrasena.setBounds(10, 157, 141, 35);
		contentPane.add(lblContrasena);
		JCheckBox chkRecordarme = new JCheckBox("Recordarme");
		chkRecordarme.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (!chkRecordarme.isSelected()) {

					txtLogin.setEditable(true);
					txtLogin.setEnabled(true);
					psdContrasena.setEditable(true);
					psdContrasena.setEnabled(true);
				} else {
					txtLogin.setEditable(false);
					txtLogin.setEnabled(false);
					psdContrasena.setEditable(false);
					psdContrasena.setEnabled(false);
				}

			}
		});
		chkRecordarme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkRecordarme.setBounds(164, 214, 123, 21);
		contentPane.add(chkRecordarme);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String clave = psdContrasena.getText();

				if (txtLogin.getText().equals("admin") && clave.equals("admin")) {
					JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "Logueo Exitoso",
							JOptionPane.INFORMATION_MESSAGE);

					new Opciones().setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "Error, Usuario o Contraseña incorrectos", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					txtLogin.setText("");
					psdContrasena.setText("");
					txtLogin.requestFocus();
					chkRecordarme.setSelected(false);
				}

				if (!chkRecordarme.isSelected()) {
					txtLogin.setText("");
					psdContrasena.setText("");
				}

			}
		});
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAceptar.setBounds(26, 270, 141, 44);
		contentPane.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLogin.setText("");
				txtLogin.requestFocus();
				psdContrasena.setText("");
				chkRecordarme.setSelected(false);
			}
		});
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCancelar.setBounds(200, 270, 130, 44);
		contentPane.add(btnCancelar);

		psdContrasena = new JPasswordField();
		psdContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
		psdContrasena.setBounds(161, 157, 170, 35);
		contentPane.add(psdContrasena);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		lblNewLabel.setBounds(379, 95, 164, 140);
		contentPane.add(lblNewLabel);
		
		JLabel lblTeam = new JLabel("Perseo DevTeam");
		lblTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeam.setFont(new Font("Consolas", Font.BOLD, 20));
		lblTeam.setBounds(364, 244, 179, 27);
		contentPane.add(lblTeam);

	}

	//METODOS PARA AGREGAR USUARIOS, HOTEL, HABITACION Y RESERVA
	
	//USUARIO = LISTA
	//HOTEL = LISTAH (CON H AL FINAL)
	//RESERVA = LISTAR (CON R AL FINAL)
	//HABITACION = LISTAB (CON B AL FINAL)

	public static void agregar(Usuario a) {
		lista.agregar(a);
	}

	
	public static void agregarh(Hotel h) {
		listah.agregar(h);
	}
	
	public static void agregarb(Habitacion b) {
		listab.agregar(b);
	}
	
	public static void agregarr(Reserva r) {
		listar.agregar(r);
	}
	
	
	
	//METODOS PARA IMPRIMIR EN AREATEXTO
	
	public static String imprimir() {
		return lista.toString();
	}

	public static String imprimirb() {
		return listab.toString();
	}
	
	public static String imprimirh() {
		return listah.toString();
	}
	
	public static String imprimirr() {
		return listar.toString();
	}
	
	
	//METODO PARA ELIMINAR USUARIO
	
	public static void eliminarUsuario(int id) {
		lista.eliminar(obtenerUsuario(id));
	}
	
	public static void eliminarHotel(int id) {
		listah.eliminar(obtenerHotel(id));
	}
	public static void eliminarHabitacion(int id) {
		listab.eliminar(obtenerHabitacion(id));
	}
	public static void eliminarReserva(int id) {
		listar.eliminar(obtenerReserva(id));
	}

	//METODOS PARA OBTENER VALORES DE USUARIO, HOTEL Y HABITACION
	
	public static Usuario obtenerUsuario(int id) {
		Usuario u = null;

		for (int i = 0; i < lista.contar(); i++) {

			Usuario x = lista.devolver(i);
			if (x.getId() == id) {
				u = x;
			}

		}
		return u;
	}



	public static Hotel obtenerHotel(int id) {
		Hotel h = null;

		for (int j = 0; j < listah.contar(); j++) {

			Hotel x = listah.devolver(j);
			if (x.getIdHotel() == id) {
				h = x;
			}

		}
		return h;
	}


	public static Habitacion obtenerHabitacion(int id) {
		Habitacion b = null;

		for (int f = 0; f < listab.contar(); f++) {

			Habitacion x = listab.devolver(f);
			if (x.getNumeroHabitacion() == id) {
				b = x;
			}

		}
		return b;
	}
	
	public static Reserva obtenerReserva(int id) {
		Reserva r = null;

		for (int q = 0; q < listar.contar(); q++) {

			Reserva x = listar.devolver(q);
			if (x.getIdReserva() == id) {
				r = x;
			}

		}
		return r;
	}

}
