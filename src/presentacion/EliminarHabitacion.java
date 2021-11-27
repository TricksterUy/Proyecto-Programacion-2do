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

public class EliminarHabitacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtprecio;
	private JTextField txtcapacidad;
	private JTextField txtidhabitacion;

	public EliminarHabitacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		addWindowListener(new WindowAdapter() {
		});
		setTitle("Menu de Eliminar Habitacion");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 417, 393);
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
				
				String idt = txtidhabitacion.getText();
				int id= Integer.parseInt(idt);				
				Logueo.eliminarHabitacion(id);
				JOptionPane.showMessageDialog(null, "Usuario Eliminado", "ATENCION",
						JOptionPane.ERROR_MESSAGE);
				txtidhabitacion.setEnabled(true);
				btnEliminar.setEnabled(false);
				txtidhabitacion.setText("");
				txtcapacidad.setText("");
				txtprecio.setText("");
				
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEliminar.setBackground(new Color(240, 240, 240));
		btnEliminar.setBounds(34, 258, 89, 55);
		contentPane.add(btnEliminar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Limpiar los campos");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtidhabitacion.setEnabled(true);
				btnEliminar.setEnabled(false);
				txtidhabitacion.setText("");
				txtcapacidad.setText("");
				txtprecio.setText("");
				
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(244, 269, 139, 44);
		contentPane.add(btnCancelar);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setToolTipText("Buscar Usuario");
		btnBuscar.setForeground(SystemColor.control);
		btnBuscar.setBackground(SystemColor.control);
		btnBuscar.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoBuscar.png"));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String idt = txtidhabitacion.getText();
				
				//CONFIGURACION DEL BOTON BUSCAR OBTENIENDO METODOS DE LA VENTANA PRINCIPAL

				if (idt.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {
					
					int id = Integer.parseInt(idt);
					Habitacion b = Logueo.obtenerHabitacion(id);
					if (b == null) {
						JOptionPane.showMessageDialog(null, "Error, Habitacion no encontrada", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} else {
						txtidhabitacion.setEnabled(false);
						btnEliminar.setEnabled(true);
						
						//PROBAR SI FUNCIONA ESTE CASTEO 
						txtcapacidad.setText(String.valueOf(b.getCapacidad()));
						txtprecio.setText(String.valueOf(b.getPrecio()));
						
					}
				}

			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setBounds(133, 258, 101, 55);
		contentPane.add(btnBuscar);

		JLabel lblEmail = new JLabel("Precio");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEmail.setBounds(20, 190, 115, 35);
		contentPane.add(lblEmail);

		txtprecio = new JTextField();
		txtprecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtprecio.setEditable(false);
		txtprecio.setEnabled(false);
		txtprecio.setColumns(10);
		txtprecio.setBounds(177, 190, 206, 35);
		contentPane.add(txtprecio);

		txtcapacidad = new JTextField();
		txtcapacidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcapacidad.setEditable(false);
		txtcapacidad.setEnabled(false);
		txtcapacidad.setColumns(10);
		txtcapacidad.setBounds(177, 133, 206, 35);
		contentPane.add(txtcapacidad);

		txtidhabitacion = new JTextField();
		txtidhabitacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtidhabitacion.setColumns(10);
		txtidhabitacion.setBounds(177, 81, 206, 35);
		contentPane.add(txtidhabitacion);

		JLabel lblId = new JLabel("Nro Habitacion");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblId.setBounds(20, 81, 147, 35);
		contentPane.add(lblId);

		JLabel lblLogin_1 = new JLabel("Capacidad");
		lblLogin_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblLogin_1.setBounds(20, 133, 115, 35);
		contentPane.add(lblLogin_1);

		JLabel lblEliminarHabitacion = new JLabel("Eliminar Habitacion");
		lblEliminarHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEliminarHabitacion.setBounds(10, 10, 373, 47);
		contentPane.add(lblEliminarHabitacion);
	}
}
