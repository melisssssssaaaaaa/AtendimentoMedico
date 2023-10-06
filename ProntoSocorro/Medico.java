package ProntoSocorro;

public class Medico extends Pessoa {
	
	private Especialidade especialidade=new Especialidade();
	
	
	Atestado atestado=new Atestado();
	
	

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [especialidade=");
		builder.append(especialidade);
		builder.append(", getDataNascimento()=");
		builder.append(getDataNascimento());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", calcularIdade()=");
		builder.append(calcularIdade());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	

}
