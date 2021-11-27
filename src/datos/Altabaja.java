package datos;

import java.util.ArrayList;

public class Altabaja {
	
	private ArrayList<Usuario> lista;

	public Altabaja() {
		lista = new ArrayList<Usuario>();
	}

	public void agregar(Usuario a) {
		lista.add(a);
	}

	public void eliminar(Usuario a) {
		lista.remove(a);
	}

	public void eliminar(int index) {
		lista.remove(index);
	}

	public int contar() {
		return lista.size();
	}

	public boolean estaVacia() {
		return lista.isEmpty();
	}

	public Usuario devolver(int indice) {
		return lista.get(indice);
	}	
	
	public String toString() {
		String msg = "";
		msg += "\n";

		for (Usuario a : lista) {
			msg += a.toString();
			msg += "\n";

		}

		return msg;
	}

}
