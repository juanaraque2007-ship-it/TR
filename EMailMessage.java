package ejs;

public class EMailMessage {
	
    private String remitente;
    private String destinatario;
    private String asunto;
    private String cuerpo;
    
    public EMailMessage(String remitente, String destinatario, String asunto, String cuerpo) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }
    
    public void enviar() {
        System.out.println("Enviando email de " + remitente + " a " + destinatario);
    }
}

