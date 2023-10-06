package ProntoSocorro;

public class Paciente extends Pessoa {

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [getDataNascimento()=");
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
