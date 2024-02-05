package co.edu.unisabana.clases.example.solid.modelo;

import java.util.Arrays;
import java.util.List;

public class Informatica implements ICarrera{

    @Override
    public List<String> obtenerMateriales() {
        return Arrays.asList("Computador", "Mouse");
    }

    @Override
    public String obtenerMensajeDirector() {
        return "Jenny envia saludos";
    }

    @Override
    public String obtenerMaterias() {
        return "Programacion, Arquitectura, Base de Datos I";
    }
}
