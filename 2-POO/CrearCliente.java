public class CrearCliente {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("45444332");
        diego.setTelefono("999922222");

        Cuenta cuentaDiego = new Cuenta(01, 5);
        cuentaDiego.setAgencia(01);
        cuentaDiego.setTitular(diego);      // La Cuenta CuentaDiego hace referencia a la clase Cliente "diego", ahora que están conectados comparten atributos. 

        System.out.println(cuentaDiego.getTitular().getDocumento());
    }
}
