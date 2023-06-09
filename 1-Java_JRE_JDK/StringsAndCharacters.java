public class StringsAndCharacters {
    public static void main(String[] args) {        // Escribiendo main y lueco ctl + espacio se autocompleta.
        char character = 'a';                       // No soporta caracteres vacios ni mas de 1 caracter a la vez. Se declara con comillas simples.
        
        char character1 = 20;                       // Tambien ouede referirse a numeros, de acuerdo a la tabla ASCII.

        String palabra = "Aaron Izaguirre";         // No es una palabra reservada de Java, es un objeto. Se declara con comillas dobles.

        System.out.println(character);
        System.out.println(character1);
        System.out.println(palabra);
        System.out.println(palabra + " Olortegui");
    }
}
