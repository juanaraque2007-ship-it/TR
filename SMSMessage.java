package ejs;

public class SMSMessage {

	    private String remitente;
	    private String destinatario;
	    private String cuerpo;
	    
	    public SMSMessage(String remitente, String destinatario, String cuerpo) {
	        this.remitente = remitente;
	        this.destinatario = destinatario;
	        this.cuerpo = cuerpo;
	    }
	    
	    public void enviar() {
	        System.out.println("Enviando SMS de " + remitente + " a " + destinatario);
	    }
	}

