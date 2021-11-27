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

package datos;

public class Reserva {
	private int idReserva;
	private Cliente cliente;
	private Hotel hotel;
	private Habitacion habitacion;
	private String fechaInicio;
	private String fechaFin;
	private float precio;

	public Reserva(int idReserva, Cliente cliente, Hotel hotel, Habitacion habitacion, String fechaInicio, String fechaFin,
			float precio) {
		super();
		setIdReserva(idReserva);
		setCliente(cliente);
		setHotel(hotel);
		setHabitacion(habitacion);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
		setPrecio(precio);
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String toString() {
		// CLIENTE.RESERVA TRAE LAS VARIABLES NOMBRE, APELLIDO Y CEDULA DEL CLIENTE
		// HOTEL.RESERVAHOTEL VA A TRAER LA ID Y EL NOMBRE DEL HOTEL
		// HABITACION.RESERVAHABITACION TRAE LA VARIABLE DE EL NUMERO DE HABITACION

		return "\n[Reserva]\n-ID Reserva" + idReserva+ ""  + cliente.reservaCliente() + "\n-Hotel: " + hotel.reservaHotel() + "\n-Habitacion: "
				+ habitacion.reservaHabitacion() + "\n-Fecha Inicio: " + fechaInicio
				+ "\n-Fecha Fin: " + fechaFin + "\n-Precio: " + precio;
	}

}