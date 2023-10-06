package ProntoSocorro;

import java.util.Calendar;
import java.util.Date;


public class Operacao {
	
	Calendar cal=Calendar.getInstance();
	
	private Date inicio=cal.getTime();
	private Date fim=cal.getTime();
	
	public void atestado30dias() {
		fim.setDate(inicio.getDate()+30);
	}
	
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	
	public int tempoTotal() {
		int dias;
		for (dias=0; fim.after(inicio); dias++) {
			fim.setDate(fim.getDate()-1);
		}
		
		return dias;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append("]");
		return builder.toString();
	}
	
	

}
