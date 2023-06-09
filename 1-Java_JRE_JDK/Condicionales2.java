public class Condicionales2 {
    public static void main(String[] args) {
        int edad = 17;
        int cantidadPersonas = 2;
        boolean esPareja = true;                                          // Solo puede almacenar true o false.

        if (edad >= 18 || cantidadPersonas >= 2 && esPareja == true) {    // "||" hace referencia a "or". Para el caso de "and" se usa "&&".
            System.out.println("Usted puede entrar.");
        } else {
                System.out.println("Usted no puede entrar.");
        }
    }
}