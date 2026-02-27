package ejs;

public class SMSMessage extends MENSAJE {

private String cuerpo;
    
    public SMSMessage(String remitente, String destinatario, String cuerpo) {
        super(remitente, destinatario);
        this.cuerpo = cuerpo;
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando SMS de " + remitente + " a " + destinatario);
    }
}
