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

public class Empleado extends Usuario {

	private float sueldo;
	private float comision;
	
	public Empleado(String nombre, String apellido, String email, String fechaAlta, int id, String login, String password,
			String acceso, float sueldo, float comision) {

		super(nombre, apellido, email, fechaAlta, id, login, password, acceso);

		setSueldo(sueldo);
		setComision(comision);
	}


	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float getComision() {
		return comision;
	}

	public void setComision(float comision) {
		this.comision = comision;
	}


	public String toString() {
		return "\n[Empleado]" + super.toString() + "\n-Sueldo: " + sueldo
				+ "\n-Comision: " + comision;
	}
	
	public String admin() {
		//EL TOADMIN VA A DEVOLVER LOS VALORES DE NOMBRE Y APELLIDO
		return  super.toAdmin();
	}

}