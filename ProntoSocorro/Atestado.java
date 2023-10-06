package ProntoSocorro;

import java.util.Date;

public class Atestado extends Operacao {
	
	private int cid=1;
	



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String emitirAtestado(Atendimento atendimento) {
		atestado30dias();
		return super.toString()+atendimento.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [cid=");
		builder.append(cid);
		builder.append(", tempoTotal()=");
		builder.append(tempoTotal());
		builder.append(", toString()=");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
