package sistema_bancario;

import java.util.ArrayList;

public class ListaDeGerentes {
	private ArrayList<Gerente> lista = new ArrayList<Gerente>();

	public void cadastrar(Gerente gerente) {
		if (gerente != null) {
			lista.add(gerente);
		}
	}

	public void remover(Gerente gerente) {
		lista.removeIf((elemento) -> elemento.getNome().equalsIgnoreCase(gerente.getNome()));
	}

}
