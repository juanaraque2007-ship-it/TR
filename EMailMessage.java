package ejs;

public class EMailMessage extends MENSAJE {

	 	private String asunto;
	    private String cuerpo;
	    
	    public EMailMessage(String remitente, String destinatario, String asunto, String cuerpo) {
	        super(remitente, destinatario);
	        this.asunto = asunto;
	        this.cuerpo = cuerpo;
	    }
	    
	    @Override
	    public void enviar() {
	        System.out.println("Enviando email de " + remitente + " a " + destinatario);
	    }
	}

