package datos;

import java.util.ArrayList;

public class AltabajaHotel {
	
	private ArrayList<Hotel> listah;

	public AltabajaHotel() {
		listah = new ArrayList<Hotel>();
	}

	public void agregar(Hotel h) {
		listah.add(h);
	}

	public void eliminar(Hotel h) {
		listah.remove(h);
	}

	public void eliminar(int index) {
		listah.remove(index);
	}

	public int contar() {
		return listah.size();
	}

	public boolean estaVacia() {
		return listah.isEmpty();
	}

	public Hotel devolver(int indice) {
		return listah.get(indice);
	}
	public boolean contiene(Hotel h) {
		return listah.contains(h);
	}
	public String toString() {
		String msg = "";
		msg += "\n";

		for (Hotel h : listah) {
			msg += h.toString();
			msg += "\n";

		}

		return msg;
	}

}
