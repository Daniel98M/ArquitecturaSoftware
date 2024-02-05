package co.edu.unisabana.clases.example.solid.modelo;

public class Estudiante {

    public String nombre;
    public ICarrera carrera;

    public Estudiante(String nombre, ICarrera carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    //La clase Estudiante no se debe encargar de guardarse a si misma en la Base
    //de Datos, toca crear clase de BD que implemente una interfaz con esta funcion
    /*void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }*/

}
