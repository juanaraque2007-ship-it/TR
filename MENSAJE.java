package ejs;

public abstract class MENSAJE {

	protected String remitente;
	protected String destinatario;

	public MENSAJE(String remitente2, String destinatario2) {
		 this.remitente = remitente;
	     this.destinatario = destinatario;
	}
	public abstract void enviar();
	
}