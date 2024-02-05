package co.edu.unisabana.clases.example.solid.modelo;

import java.util.Arrays;
import java.util.List;

public class Industrial implements ICarrera{
    @Override
    public List<String> obtenerMateriales() {
        return Arrays.asList("Computador", "Mouse", "Calculadora");
    }

    @Override
    public String obtenerMensajeDirector() {
        return "Raul envia saludos";
    }

    @Override
    public String obtenerMaterias() {
        return "Procesos, Analitica de Datos, Gestion de Calidad";
    }
}
