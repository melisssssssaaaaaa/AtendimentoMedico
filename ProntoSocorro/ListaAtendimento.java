package ProntoSocorro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAtendimento {
	
	private List<Atendimento> fila=new ArrayList<Atendimento>();
	private List<Atendimento> atendidos=new ArrayList<Atendimento>();
	
	public void addFila(Atendimento atendimento) {
		fila.add(atendimento);
		Collections.sort(fila);
	}
	
	public List<Atendimento> mostrarFila(){
		return fila;
	}
	

	
	public void addAtendidos(Atendimento atendimento) {
		atendidos.add(atendimento);
		Collections.sort(atendidos);
	}
	
	public List<Atendimento> mostrarAtendidos(){
		return atendidos;
	}

	public List<Atendimento> getFila() {
		return fila;
	}
	
	public void removerFila(int posicao) {
		fila.remove(posicao);
		Collections.sort(fila);
	}

	public void setFila(List<Atendimento> fila) {
		this.fila = fila;
	}

	public List<Atendimento> getAtendidos() {
		return atendidos;
	}

	public void setAtendidos(List<Atendimento> atendidos) {
		this.atendidos = atendidos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaAtendimento [fila=");
		builder.append(fila);
		builder.append(", atendidos=");
		builder.append(atendidos);
		builder.append("]");
		return builder.toString();
	}
	
	

}
