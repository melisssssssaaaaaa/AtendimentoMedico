package ProntoSocorro;

import java.util.Date;

public class Atendimento extends Operacao implements Comparable<Atendimento> {
	
	private int prioridade=0;
	private int estado=0;
	private Medico medico=new Medico();
	private Paciente paciente=new Paciente();
	
	public Atendimento(String nome,Date dataNasc) {
		this.paciente.setNome(nome);
		this.paciente.setDataNascimento(dataNasc);
	}
	
	
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public int compareTo(Atendimento outro) {
		if(this.prioridade>outro.prioridade) {
			return -1;
		}else {
			if(this.prioridade<outro.prioridade) {
				return 1;
			}
		}
		return 0;
	}
	
	public void calculaPrioridade(boolean[] respostas) {
		int prioridade=0;
		for (int i = 0; i < respostas.length; i++) {
			if(respostas[i]==true) {
				prioridade++;
			}
		}
		
		setPrioridade(prioridade);
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", getInicio()=");
		builder.append(getInicio());
		builder.append(", getFim()=");
		builder.append(getFim());
		builder.append(", tempoTotal()=");
		builder.append(tempoTotal());
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
