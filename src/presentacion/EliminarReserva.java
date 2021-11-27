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
import datos.Empleado;
import datos.Reserva;
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

public class EliminarReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtfin;
	private JTextField txtinicio;
	private JTextField txtidreserva;

	public EliminarReserva() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		addWindowListener(new WindowAdapter() {
		});
		setTitle("Menu de Eliminar Reservas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 417, 376);
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
				
				String idt = txtidreserva.getText();
				int id= Integer.parseInt(idt);				
				Logueo.eliminarReserva(id);
				JOptionPane.showMessageDialog(null, "Usuario Eliminado", "ATENCION",
						JOptionPane.ERROR_MESSAGE);
				txtidreserva.setEnabled(true);
				btnEliminar.setEnabled(false);
				txtidreserva.setText("");
				txtinicio.setText("");
				txtfin.setText("");
			
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEliminar.setBackground(new Color(240, 240, 240));
		btnEliminar.setBounds(34, 254, 89, 55);
		contentPane.add(btnEliminar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Limpiar los campos");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtidreserva.setEnabled(true);
				btnEliminar.setEnabled(false);
				txtidreserva.setText("");
				txtinicio.setText("");
				txtfin.setText("");
				
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(244, 265, 139, 44);
		contentPane.add(btnCancelar);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setToolTipText("Buscar Usuario");
		btnBuscar.setForeground(SystemColor.control);
		btnBuscar.setBackground(SystemColor.control);
		btnBuscar.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconoBuscar.png"));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String idt = txtidreserva.getText();
				
				//CONFIGURACION DEL BOTON BUSCAR OBTENIENDO METODOS DE LA VENTANA PRINCIPAL

				if (idt.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, los campos no pueden estar vacios", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {

					int id = Integer.parseInt(idt);
					Reserva r = Logueo.obtenerReserva(id);
					if (r == null) {
						JOptionPane.showMessageDialog(null, "Error, Reserva no encontrada", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} else {
						txtidreserva.setEnabled(false);
						btnEliminar.setEnabled(true);
						txtinicio.setText(String.valueOf(r.getFechaInicio()));
						txtfin.setText(String.valueOf(r.getFechaFin()));
						
					}
				}

			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setBounds(133, 254, 101, 55);
		contentPane.add(btnBuscar);

		JLabel lblHotel = new JLabel("Fecha Fin");
		lblHotel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHotel.setBounds(20, 190, 115, 35);
		contentPane.add(lblHotel);

		txtfin = new JTextField();
		txtfin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfin.setEditable(false);
		txtfin.setEnabled(false);
		txtfin.setColumns(10);
		txtfin.setBounds(167, 190, 216, 35);
		contentPane.add(txtfin);

		txtinicio = new JTextField();
		txtinicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtinicio.setEditable(false);
		txtinicio.setEnabled(false);
		txtinicio.setColumns(10);
		txtinicio.setBounds(167, 133, 216, 35);
		contentPane.add(txtinicio);

		txtidreserva = new JTextField();
		txtidreserva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtidreserva.setColumns(10);
		txtidreserva.setBounds(167, 81, 216, 35);
		contentPane.add(txtidreserva);

		JLabel lblIdReserva = new JLabel("ID Reserva");
		lblIdReserva.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIdReserva.setBounds(20, 81, 115, 35);
		contentPane.add(lblIdReserva);

		JLabel lblCliente = new JLabel("Fecha Inicio");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCliente.setBounds(20, 133, 137, 35);
		contentPane.add(lblCliente);

		JLabel lblEliminarReserva = new JLabel("Eliminar Reservas");
		lblEliminarReserva.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarReserva.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEliminarReserva.setBounds(10, 10, 373, 47);
		contentPane.add(lblEliminarReserva);
	}
}
