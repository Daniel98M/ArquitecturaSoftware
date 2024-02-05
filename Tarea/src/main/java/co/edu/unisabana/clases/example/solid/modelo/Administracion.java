package co.edu.unisabana.clases.example.solid.modelo;

import java.util.Arrays;
import java.util.List;

public class Administracion implements ICarrera{
    @Override
    public List<String> obtenerMateriales() {
        return Arrays.asList("Computador", "Mouse", "Graficadora");
    }

    @Override
    public String obtenerMensajeDirector() {
        return "Valentina envia saludos";
    }

    @Override
    public String obtenerMaterias() {
        return "Negocios, Administracion I, Historia de la Administracion";
    }
}
