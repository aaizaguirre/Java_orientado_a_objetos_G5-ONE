import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
    
// "@Retention": especifica la retencion de la anotacion durante el tiempo de ejecucion. En este caso ("RUNTIME") la anotacion estará disponible durante la ejecución del programa.
@Retention(RetentionPolicy.RUNTIME)
// "@Target": especifica los elementos a los que se puede aplicar la anotacion. En este caso ("ElementType.FIELD") la anotacion EdadMIinima se puede aplicar solo a campos o variables de instancia en una clase.
@Target(ElementType.FIELD)
// "@interface" hace una referencia a auna anotacion personalizada
public @interface EdadMinima {
    int valor();
}

