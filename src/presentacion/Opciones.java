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

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;

public class Opciones extends JFrame {

	private JPanel contentPane;

	public Opciones() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		setResizable(false);
		addWindowListener(new WindowAdapter() {
		});
		setTitle("Menu de Opciones");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 470, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOpciones = new JLabel("Menu de Opciones");
		lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpciones.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOpciones.setBounds(5, 5, 429, 64);
		contentPane.add(lblOpciones);

		JButton btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setToolTipText("Despliega las opciones de Usuarios");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Usuarios().setVisible(true);
			}
		});
		btnUsuarios.setBackground(new Color(204, 51, 255));
		btnUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnUsuarios.setBounds(15, 79, 200, 70);
		contentPane.add(btnUsuarios);

		JButton btnHoteles = new JButton("HOTELES");
		btnHoteles.setToolTipText("Menu de ingreso de Hoteles");
		btnHoteles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Hoteles().setVisible(true);
			}
		});
		btnHoteles.setBackground(new Color(102, 153, 255));
		btnHoteles.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnHoteles.setBounds(234, 79, 200, 70);
		contentPane.add(btnHoteles);

		JButton btnHabitaciones = new JButton("HABITACIONES");
		btnHabitaciones.setToolTipText("Menu de ingreso de Habitaciones");
		btnHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Habitaciones().setVisible(true);
			}
		});
		btnHabitaciones.setBackground(new Color(153, 255, 153));
		btnHabitaciones.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnHabitaciones.setBounds(15, 159, 200, 70);
		contentPane.add(btnHabitaciones);

		JButton btnReservas = new JButton("RESERVAS");
		btnReservas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Reservas().setVisible(true);
			}
		});
		btnReservas.setBackground(new Color(204, 153, 0));
		btnReservas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnReservas.setBounds(234, 159, 200, 70);
		contentPane.add(btnReservas);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setToolTipText("Volver al menu principal");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBackground(Color.RED);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSalir.setBounds(132, 262, 180, 50);
		contentPane.add(btnSalir);
	}

}
