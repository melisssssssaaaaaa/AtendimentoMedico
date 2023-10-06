package ProntoSocorro;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
	
	private Date dataNascimento;
	private String nome="";
	
	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}

	public int calcularIdade() {
		Calendar cal=GregorianCalendar.getInstance();
		int anoAtual=cal.get(Calendar.YEAR);
		int anoNasc=dataNascimento.getYear();
		return anoAtual-anoNasc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	

}
