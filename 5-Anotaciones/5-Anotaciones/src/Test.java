import java.time.LocalDate;
import java.time.Month;

public class Test {
    
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Maria", "52902488033", LocalDate.of(2015, Month.JANUARY, 13));
        boolean esValido1 = Usuario.validador(usuario1);
        System.out.println("Usuario válido: " + esValido1);

        Usuario usuario2 = new Usuario("Maria", "52902488033", LocalDate.of(2000, Month.JANUARY, 13));
        boolean esValido2 = Usuario.validador(usuario2);
        System.out.println("Usuario válido: " + esValido2);

    }

}
