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

public class Hotel {

	private int idHotel;
	private String nombreHotel;
	private String direccionHotel;
	private String ciudadHotel;
	private String paisHotel;
	private long telefonoHotel;
	private Empleado empleado;

	public Hotel(int idHotel, String nombreHotel, String direccionHotel, String ciudadHotel, String paisHotel,
			long telefonoHotel, Empleado empleado) {
		setIdHotel(idHotel);
		setNombreHotel(nombreHotel);
		setDireccionHotel(direccionHotel);
		setCiudadHotel(ciudadHotel);
		setPaisHotel(paisHotel);
		setTelefonoHotel(telefonoHotel);
		setEmpleado(empleado);
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombreHotel() {
		return nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public String getDireccionHotel() {
		return direccionHotel;
	}

	public void setDireccionHotel(String direccionHotel) {
		this.direccionHotel = direccionHotel;
	}

	public String getCiudadHotel() {
		return ciudadHotel;
	}

	public void setCiudadHotel(String ciudadHotel) {
		this.ciudadHotel = ciudadHotel;
	}

	public String getPaisHotel() {
		return paisHotel;
	}

	public void setPaisHotel(String paisHotel) {
		this.paisHotel = paisHotel;
	}

	public long getTelefonoHotel() {
		return telefonoHotel;
	}

	public void setTelefonoHotel(long telefonoHotel) {
		this.telefonoHotel = telefonoHotel;
	}

	public String toString() {
		return "\n[Hotel] \n-ID Hotel: " + idHotel + "\n-Nombre: " + nombreHotel + "\n-Direccion: " + direccionHotel
				+ "\n-Ciudad: " + ciudadHotel + "\n-Pais: " + paisHotel + "\n-Telefono: " + telefonoHotel + "\n-Administrador: " + empleado.admin();
	}
	
	public String reservaHotel() {
		return "\n-ID Hotel: " + idHotel + "\n-Nombre: " + nombreHotel;
	}
	

}
