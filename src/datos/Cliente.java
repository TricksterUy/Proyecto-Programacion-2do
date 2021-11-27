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


public class Cliente extends Usuario {

	private long cedula;
	private String direccion;
	private String telefono;

	public Cliente(String nombre, String apellido, String email, String fechaAlta, int id, String login,
			String password, String acceso, long cedula, String direccion, String telefono) {

		super(nombre, apellido, email, fechaAlta, id, login, password, acceso);

		setCedula(cedula);
		setDireccion(direccion);
		setTelefono(telefono);
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {

		this.cedula = cedula;

	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;

	}

	public String toString() {
		return "\n[Cliente]" + super.toString() + "\n-Cedula: " + cedula + "\n-Direccion: " + direccion + "\n-Telefono: "
				+ telefono;
	}
	public String reservaCliente() {
		//EL TOADMIN VA A DEVOLVER LOS VALORES DE NOMBRE Y APELLIDO
		return  super.toAdmin()+ "\n-Cedula: " +cedula;
	}

}
