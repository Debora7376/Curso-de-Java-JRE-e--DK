public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Chamado o metodo de bonificacao do GERENTE");
	    return super.getSalario();
	}
}