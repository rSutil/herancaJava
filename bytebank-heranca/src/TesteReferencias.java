
public class TesteReferencias {

	/**
	 * A Bonificação é diferente para cada tipo de funcionario
	 * Sendo assim todos os funcionarios tem bonificação, porém cada um tem sua regra exclusiva 
	 * neste caso a regra é definido em cada classe do tipo de funcionario, possibilitando subscrever o metodo com a regra
	 * através do polimorfismo 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente("Ricardo Sutil", "000.000.000-00", 2000.0, 12345);
		Funcionario funcionario = new Funcionario("Carlos", "111.111.111-11", 1000.0);
		EditorVideo editorVideo = new EditorVideo("Pedro", "222.222.222-22", 1200.0);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(gerente);
		controleBonificacao.registra(funcionario);
		controleBonificacao.registra(editorVideo);
		
		System.out.println("TOTAL Bonificação: " + controleBonificacao.getSoma());
		
		
	}

}
