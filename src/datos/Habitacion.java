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

public class Habitacion {
	
	private Hotel hotel;
	private int numeroHabitacion;
	private int capacidad;
	private float precio;

	
	public Habitacion(Hotel hotel, int numeroHabitacion, int capacidad, float precio) {
		super();
		setHotel(hotel);
		setNumeroHabitacion(numeroHabitacion);
		setCapacidad(capacidad);
		setPrecio(precio);
	}

	
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}


	
	public String toString() {
		//EL RESERVAHOTEL VA A DEVOLVER LOS VALORES DE ID Y NOMBRE DEL HOTEL
		return "\n[Habitacion]" + hotel.reservaHotel() + "\n-Numero de Habitacion: " + numeroHabitacion + "\n-Capacidad: " + capacidad
				+ "\n-Precio: " + precio;
	}
	
	public String reservaHabitacion() {
		return "\n-Numero de Habitacion: " + numeroHabitacion ;
	}

	
}
