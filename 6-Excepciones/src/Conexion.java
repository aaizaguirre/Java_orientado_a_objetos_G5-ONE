public class Conexion implements AutoCloseable{

   public Conexion() {
       System.out.println("Abriendo conexion");
   }

   public void leerDatos() {
       System.out.println("Recibiendo datos");
       // Exception cuando la conexion no se establece
       throw new IllegalStateException();
   }

   @Override
    public void close() {
        System.out.println("Cerrando Conexion");
   }
}