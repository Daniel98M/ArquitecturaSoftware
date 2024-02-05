package co.edu.unisabana.clases.example.solid.modelo;

import java.util.List;

public class Envio {

  List<String> material;
  String saludoDirector;

  public Envio(List<String> material, String saludoDirector) {
    this.material = material;
    this.saludoDirector = saludoDirector;
  }

  public String toString() {
    return "Envio{" +
        "material=" + material +
        ", saludoDirector='" + saludoDirector + '\'' +
        '}';
  }
}
