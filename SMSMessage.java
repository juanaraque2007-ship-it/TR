package ejs;
/**
 * la clase SMS junto con el extends de la clase MENSAJE
 */
public class SMSMessage extends MENSAJE {

private String cuerpo;
    
    public SMSMessage(String remitente, String destinatario, String cuerpo) {
        super(remitente, destinatario);
        this.cuerpo = cuerpo;
    }
    
    /**
     * Metodo para enviar el mensaje correspondiente
     */
    @Override
    public void enviar() {
        System.out.println("Enviando SMS de " + remitente + " a " + destinatario);
    }
}
