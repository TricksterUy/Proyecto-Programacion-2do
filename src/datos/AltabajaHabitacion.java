package datos;

import java.util.ArrayList;

public class AltabajaHabitacion {
	
	private ArrayList<Habitacion> listab;

	public AltabajaHabitacion() {
		listab = new ArrayList<Habitacion>();
	}

	public void agregar(Habitacion b) {
		listab.add(b);
	}

	public void eliminar(Habitacion b) {
		listab.remove(b);
	}

	public void eliminar(int index) {
		listab.remove(index);
	}

	public int contar() {
		return listab.size();
	}

	public boolean estaVacia() {
		return listab.isEmpty();
	}

	public Habitacion devolver(int indice) {
		return listab.get(indice);
	}

	public String toString() {
		String msg = "";
		msg += "\n";

		for (Habitacion b : listab) {
			msg += b.toString();
			msg += "\n";

		}

		return msg;
	}

}
