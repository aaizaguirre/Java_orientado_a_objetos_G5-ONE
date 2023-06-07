public class Ejemplo{                         // Para compilar el código se nesecita envolverlo con una clase. 
    public static void main(String[] arg){    // La entrada de una aplicación siempre es la función o método "public static void main(String[] args)".  
        System.out.println("Hola, mundo!"); // Comando para imprimir algo en la pantalla. Toda instrucción debe terminar con ";".
    }
}

// Se guarda el archivo con el mismo nombre que la clase creada y la extensión "java".
// javac Programa.java     --- Compila el código usando el compilador Java de Oracle, "javac". Esto nos dará el bytecode. Una vez compilado, se genera un bytecode con el mismo nombre pero con ".class" al final.   
// java Programa           --- Se llama a la JVM, ejecuta el programa ya compilado.