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

public class Usuario {

	private int id;
	private String login;
	private String password;
	private String email;
	private String fechaAlta;
	private String nombre;
	private String apellido;
	private String acceso;

	public Usuario(String nombre, String apellido, String email, String fechaAlta, int id, String login,
			String password, String acceso) {

		setId(id);
		setLogin(login);
		setPassword(password);
		setEmail(email);
		setFechaAlta(fechaAlta);
		setNombre(nombre);
		setApellido(apellido);
		setAcceso(acceso);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaAlta() {

		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getAcceso() {
		return acceso;
	}

	public void setAcceso(String acceso) {

		this.acceso = acceso;
	}

	public String toAdmin() {
		return "\n-ID: " + id + "\n-Nombre: " + nombre + "\n-Apellido: " + apellido;
	}

	public String toReserva() {
		return "\n-Nombre: " + nombre + "\n-Apellido: " + apellido;
	}

	public String toString() {
		return "\n-ID: " + id + "\n-Nombre: " + nombre + "\n-Apellido: " + apellido + "\n-Email: " + email
				+ "\n-Fecha Alta: " + fechaAlta + "\n-Ultimo Acceso: " + acceso;
	}

}
