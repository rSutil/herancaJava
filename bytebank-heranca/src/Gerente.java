
public class Gerente extends Funcionario {
	
	private int senha;
	
	public Gerente() {		
	}	

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	double getBonificacao() {
		return super.getBonificacao() + getSalario();
	}
	
	boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}	
	
}
