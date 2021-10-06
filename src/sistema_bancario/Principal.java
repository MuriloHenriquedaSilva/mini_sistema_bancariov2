package sistema_bancario;

public class Principal {

	public static void main(String[] args) {
		ListaDeContas banco = new ListaDeContas();

		Conta conta1 = new Conta(1, 300);
		Conta conta2 = new Conta(2, 5000);

		Conta contaEditada = new Conta(1, 500);

		// Cadastrar as contas
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);

	}

}
