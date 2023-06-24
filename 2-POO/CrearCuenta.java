public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(11, 12);
        
        Cliente primerCliente = new Cliente();
        Cliente segundoCliente = new Cliente();

        primeraCuenta.setSaldo(1000);
        primeraCuenta.setAgencia(13);
        primeraCuenta.setNumero(98765);
        primeraCuenta.setTitular(primerCliente);

        Cuenta segundaCuenta = new Cuenta(22, 10);
        segundaCuenta.setSaldo(1000);
        segundaCuenta.setAgencia(23);
        segundaCuenta.setNumero(12345);
        segundaCuenta.setTitular(segundoCliente);

        System.out.println(primeraCuenta.getAgencia());
        System.out.println(Cuenta.total);
    }
}
