package ejs;
/**
 * Se extrae la superclase MENSAJE con los atributos de cada clase anterior
 * Tiene que ser abstracta
 */
public abstract class MENSAJE {

	protected String remitente;
	protected String destinatario;

	public MENSAJE(String remitente2, String destinatario2) {
		 this.remitente = remitente;
	     this.destinatario = destinatario;
	}
	/**
	 * Metodo para enviar los mensajes correspondientes
	 */
	public abstract void enviar();
	
}