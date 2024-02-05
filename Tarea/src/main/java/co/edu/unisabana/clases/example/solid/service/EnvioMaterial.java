package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.*;

import java.util.List;

public class EnvioMaterial {
  IEmail email;
  public EnvioMaterial(IEmail email) {
    this.email = email;
  }

  public void enviarMaterialEstudiante(Estudiante estudiante) {

    List<String> materiales = estudiante.carrera.obtenerMateriales();
    String saludoDirector = estudiante.carrera.obtenerMensajeDirector();

    Envio envio = new Envio(materiales, saludoDirector);
    email.enviarEmail(envio);

  }
}
