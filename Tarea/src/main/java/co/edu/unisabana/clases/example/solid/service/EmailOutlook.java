package co.edu.unisabana.clases.example.solid.service;


import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.IEmail;

public class EmailOutlook implements IEmail {

  public void enviarEmail(Envio envio) {
    System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
    System.out.println("EMAIL ENVIADO y correspondencia " + envio);
  }
}
