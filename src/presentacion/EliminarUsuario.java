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

public class EliminarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtapellido;
	private JTextField txtemail;
	private JTextField txtlogin;
	private JTextField txtid;

	public EliminarUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		addWindowListener(new WindowAdapter() {
		});
		setTitle("Menu de Eliminar Usuarios");
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
		btnEliminar.setToolTipText("Eliminar Usuario");
		btnEliminar.setForeground(SystemColor.control);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CONFIGURACION DEL BOTON ELIMINAR
				
				String idt = txtid.getText();
				int id= Integer.parseInt(idt);				
				Logueo.eliminarUsuario(id);
				JOptionPane.showMessageDialog(null, "Usuario Eliminado", "ATENCION",
						JOptionPane.ERROR_MESSAGE);
				txtid.setEnabled(true);
				btnEliminar.setEnabled(false);
				txtid.setText("");
				txtlogin.setText("");
				txtemail.setText("");
				txtapellido.setText("");
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
				txtid.setEnabled(true);
				btnEliminar.setEnabled(false);
				txtid.setText("");
				txtlogin.setText("");
				txtemail.setText("");
				txtapellido.setText("");
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(244, 314, 139, 44);
		contentPane.add(btnCancelar);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setToolTipText("Buscar Usuario");
		btnBuscar.setForeground(SystemColor.control);
		btnBuscar.setBackground(SystemColor.control);
		btnBuscar.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoBuscar.png"));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String idt = txtid.getText();
				
				//CONFIGURACION DEL BOTON BUSCAR OBTENIENDO METODOS DE LA VENTANA PRINCIPAL

				if (idt.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {

					int id = Integer.parseInt(idt);
					Usuario u = Logueo.obtenerUsuario(id);
					if (u == null) {
						JOptionPane.showMessageDialog(null, "Error, Usuario no encontrado", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} else {
						txtid.setEnabled(false);
						btnEliminar.setEnabled(true);
						txtlogin.setText(u.getLogin());
						txtemail.setText(u.getEmail());
						txtapellido.setText(u.getApellido());
					}
				}

			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setBounds(133, 303, 101, 55);
		contentPane.add(btnBuscar);

		txtapellido = new JTextField();
		txtapellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtapellido.setEditable(false);
		txtapellido.setEnabled(false);
		txtapellido.setColumns(10);
		txtapellido.setBounds(145, 245, 238, 35);
		contentPane.add(txtapellido);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblApellido.setBounds(20, 245, 115, 35);
		contentPane.add(lblApellido);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEmail.setBounds(20, 190, 115, 35);
		contentPane.add(lblEmail);

		txtemail = new JTextField();
		txtemail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtemail.setEditable(false);
		txtemail.setEnabled(false);
		txtemail.setColumns(10);
		txtemail.setBounds(145, 190, 238, 35);
		contentPane.add(txtemail);

		txtlogin = new JTextField();
		txtlogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtlogin.setEditable(false);
		txtlogin.setEnabled(false);
		txtlogin.setColumns(10);
		txtlogin.setBounds(145, 133, 238, 35);
		contentPane.add(txtlogin);

		txtid = new JTextField();
		txtid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtid.setColumns(10);
		txtid.setBounds(145, 81, 238, 35);
		contentPane.add(txtid);

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblId.setBounds(20, 81, 115, 35);
		contentPane.add(lblId);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblLogin.setBounds(20, 133, 115, 35);
		contentPane.add(lblLogin);

		JLabel lblEliminarUsuarios = new JLabel("Eliminar Usuarios");
		lblEliminarUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEliminarUsuarios.setBounds(10, 10, 373, 47);
		contentPane.add(lblEliminarUsuarios);
	}
}
