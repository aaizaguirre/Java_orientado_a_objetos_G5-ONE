public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;
        primeraCuenta.agencia = 01;
        primeraCuenta.numero = 98765;
        primeraCuenta.titular = "Diego";

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 1000;
        segundaCuenta.agencia = 02;
        segundaCuenta.numero = 12345;
        segundaCuenta.titular = "Alura";
    }
}
