public class Flujo {

    // Pila de ejecucion: conjunto de cosas apiladas, una sobre otra.
    public static void main(String[] args) {
      // Al hacer doble clic en el punto del lado izquierdo, fijamos el "breakpoint". Durante el "debug" o ejecución del sistema parará en este breakpoint y nos mostrará todo lo que hay en la memoria en ese momento.
      // Para seleccionar el modo debug, clic en la pestaña superior derecha y seleccionar "debug Java"
      System.out.println("Inicio de main");
      metodo1();
      System.out.println("Fin de main");
    }

    public static void metodo1(){
      System.out.println("Inicio de metodo1");
      metodo2();
      // Creando y lanzando una excepcion
      // "throw" solo puede lanzar excepciones, no funciona con clases u otros objetos.
      // Para ver la documentación de la excepcion: ctrl + clic
      throw new MiException("Mi excepción fue lanzada");
      // La excepcion genera que el resto del codigo se vuelve inservible.
      // System.out.println("Fin de metodo1");
    }

    public static void metodo2(){
      System.out.println("Inicio de metodo2");
      for(int i = 1; i <= 5; i++){
        System.out.println(i);

        try {   // Intenta esto
          if (i == 3) {
             int num = 0;
            int resultado = 30 / num;
            System.out.println(resultado);
          }

        } catch(ArithmeticException exception){  // Atrapa el error "ArithmeticException" al que llamaremos "exception"
        // En caso queramos que nos atrape cualquier exception: catch(Exception)
          System.out.println(exception.getMessage()); // Imprime el mensaje de excepcion.
          exception.printStackTrace();          // Muestra la pila recorrida hasta la excepcion y luego sigue el flujo de la pila (se sigue ejecutando luego de mostrar el error).
        } catch(NullPointerException exceptionNull) {
          System.out.println(exceptionNull.getMessage());
          exceptionNull.printStackTrace();
        }
        // Forma de trabajar múltiples excepciones:
        //    catch(ArithmeticException | NullPointerException exception)

      }
      System.out.println("Fin de metodo2");
    }
}