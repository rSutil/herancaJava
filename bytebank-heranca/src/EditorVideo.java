
public class EditorVideo extends Funcionario{
	
	public EditorVideo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EditorVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	double getBonificacao() {
		return super.getBonificacao() + 100.0; //Editor de vídeo recebe salário mais 100,00
	}

}
