public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
<<<<<<< HEAD
		System.out.println("Chamado o metodo de bonificacao do GERENTE");
	    return super.getSalario();
	}
=======
	    return super.getSalario() * 0.1;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

>>>>>>> 44a7e2687e794a0a23c28df252d81b1b33fe72b3
}