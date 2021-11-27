package datos;

import java.util.ArrayList;

public class AltabajaReserva {
	
	private ArrayList<Reserva> listar;

	public AltabajaReserva() {
		listar = new ArrayList<Reserva>();
	}

	public void agregar(Reserva r) {
		listar.add(r);
	}

	public void eliminar(Reserva r) {
		listar.remove(r);
	}

	public void eliminar(int index) {
		listar.remove(index);
	}

	public int contar() {
		return listar.size();
	}

	public boolean estaVacia() {
		return listar.isEmpty();
	}

	public Reserva devolver(int indice) {
		return listar.get(indice);
	}
	public boolean contiene(Reserva r) {
		return listar.contains(r);
	}

	public String toString() {
		String msg = "";
		msg += "\n";

		for (Reserva r : listar) {
			msg += r.toString();
			msg += "\n";

		}

		return msg;
	}

}
