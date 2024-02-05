package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Administracion;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.modelo.ICarrera;
import co.edu.unisabana.clases.example.solid.modelo.IEmail;
import co.edu.unisabana.clases.example.solid.modelo.Industrial;
import co.edu.unisabana.clases.example.solid.modelo.Informatica;
import co.edu.unisabana.clases.example.solid.service.EmailOutlook;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterial;

public class Main {

    static ICarrera informatica = new Informatica();
    static ICarrera administracion = new Administracion();
    static ICarrera industrial = new Industrial();
    static IEmail emailOutlook = new EmailOutlook();

    public static void main(String[] args) {

        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", informatica),
                new Estudiante("Monica", administracion),
                new Estudiante("Liliana", industrial)
        };

        verMateriasEstudiantes(listadoEstudiantes);

        EnvioMaterial material = new EnvioMaterial(emailOutlook);
        material.enviarMaterialEstudiante(new Estudiante("Daniel", informatica));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.carrera.obtenerMaterias());
        }
    }
}

/*
 * Integrantes:
 * - Juan Carlos Hernandez Cod:219630
 * - Carlos Daniel Martinez Zarate Cod:197620
 * - Kevin Alejandro Rodriguez Grijalba Cod:262455
 *
 * No se cumple la Responsabilidad Unica debido a que EnvioMaterial manejaba el envío de materiales
 * y la lógica para decidir que enviar, la responsabilidad se separa al crear las clases de las
 * carreras y la interfaz ICarrera. De igual forma este problema se presentaba con la clase Estudiante
 * la cual se encargaba de almacenarse a si misma dentro de la base de datos, para este caso se removio
 * la funcionalidad en espera de una implementacion de una Base de Datos.
 *
 * Tampoco se cumplía el principio de Abierto/Cerrado debido a que si se quería agregar una nueva carrera
 * se tenía que modificar la lógica en la clase de EnvioMaterial, la solución se da con la interfaz ICarrera
 * y que ahora se pueden agregar o eliminar carreras con las implementaciones de ICarrera sin cambiar la
 * lógica del programa. Ademas, se creo la interfaz IEmail para el caso de que se deseen emplear otro tipo
 * de servicios de mensajeria como Gmail.
 *
 * Se modicica el atributo de estudiante "carrera" para que pase de String a ICarrera, debido a la interfaz
 * ICarrera y las carreras como sus implementaciones, esto para evitar definir la lógica por carrera en
 * diferentes partes del programa, se obtiene de forma consistente los datos de la carrera sin importar cual
 * sea la del estudiante, cumpliendo con el principio de sustiución de Liskov.
 *
 * Se crea la interfaz ICarrera y las carreras como sus implementaciones para que EnvioMaterial siendo
 * categorizado como de bajo nivel, sea quien dependa de las carreras realizando así el principio de inversión
 * de dependencias.
 *
 * Por ultimo, se simplifico el codigo y se removieron varias clausulas if, con el fin de tener un codigo mas
 * limpio y facil de entender.
 */