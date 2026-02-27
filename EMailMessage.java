package ejs;
/**
 * La clase email junto con el extends de la clase MENSAJE
 */
public class EMailMessage extends MENSAJE {
/**
 * Refactorizar la clase Email, extraemos la superclase de los atributos repetidos
 * en la clase SMS 
 */
	 	private String asunto;
	    private String cuerpo;
	    
	    public EMailMessage(String remitente, String destinatario, String asunto, String cuerpo) {
	        super(remitente, destinatario);
	        this.asunto = asunto;
	        this.cuerpo = cuerpo;
	    }
	    
	    /**
	     * Metodo para mostrar el mensaje
	     */
	    @Override
	    public void enviar() {
	        System.out.println("Enviando email de " + remitente + " a " + destinatario);
	    }
	}

