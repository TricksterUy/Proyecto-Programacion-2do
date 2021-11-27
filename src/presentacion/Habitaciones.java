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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Habitaciones extends JFrame {

	private JPanel contentPane;

	public Habitaciones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\IconHotel.png"));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				new Opciones().setVisible(true);
			}
		});
		setTitle("Menu Principal de Habitaciones");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 350, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuarios = new JLabel("Menu de Habitaciones");
		lblUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUsuarios.setBounds(10, 10, 299, 64);
		contentPane.add(lblUsuarios);
		
		JButton btnAltas = new JButton("ALTAS");
		btnAltas.setToolTipText("Abre el menu de ingreso de usuarios");
		btnAltas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new AltaHabitaciones().setVisible(true);
			}
		});
		btnAltas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAltas.setBackground(new Color(0, 204, 102));
		btnAltas.setBounds(10, 95, 200, 70);
		contentPane.add(btnAltas);
		
		JButton btnBajas = new JButton("BAJAS");
		btnBajas.setToolTipText("Abre la opcion de eliminar usuarios");
		btnBajas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new EliminarHabitacion().setVisible(true);
			}
		});
		btnBajas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnBajas.setBackground(new Color(51, 102, 204));
		btnBajas.setBounds(10, 175, 200, 70);
		contentPane.add(btnBajas);
		
		JButton btnVolver = new JButton("");
		btnVolver.setForeground(SystemColor.control);
		btnVolver.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\Proyecto Perseo\\Iconos\\Home.png"));
		btnVolver.setToolTipText("Vuelve al Menu anterior");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Opciones().setVisible(true);
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnVolver.setBackground(SystemColor.control);
		btnVolver.setBounds(248, 138, 60, 60);
		contentPane.add(btnVolver);
	}
}
