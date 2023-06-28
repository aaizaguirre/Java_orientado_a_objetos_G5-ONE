import java.time.LocalDate;
import java.time.Period;
import java.lang.reflect.Field;

public class Usuario {

    private String nombre;
    private String identidad;
    // "@" indica una anotacion. Las anotaciones son "metadatos", se usan para agregar infrormacion o instrucciones especificas al codigo fuente.
    // La siguiente linea es una anotacion con parametro "valor" con valor predeterminado de 18.
    @EdadMinima(valor=18)
    // "LocalDate" almacena feha (dia, mes, año)
    private LocalDate fechaNacimiento;


    // Construtctor
    public Usuario(String nombre, String identidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // getters
    public String getNombre() {
        return this.nombre;
    }

    public String getIdentidad() {
        return this.identidad;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // "<T>": Acepta argumentos de cualquier tipo, retornando un boolean.
    public static <T> boolean validador(T objeto) {
        Class<?> clase = objeto.getClass();
        for (Field field : clase.getDeclaredFields()) {
            if (field.isAnnotationPresent(EdadMinima.class)) {
                EdadMinima edadMinima = field.getAnnotation(EdadMinima.class);
                try{
                    field.setAccessible(true);
                    LocalDate fechaNacimiento = (LocalDate) field.get(objeto);
                    return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= edadMinima.valor();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

}
