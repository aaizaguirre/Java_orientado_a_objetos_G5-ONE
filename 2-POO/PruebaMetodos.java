public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(02, 15);
        miCuenta.setSaldo(300); 

        miCuenta.depositar(200);
        System.out.println(miCuenta.getSaldo());

        miCuenta.retirar(2000);
        System.out.println(miCuenta.getSaldo());

        Cuenta cuentaJimena = new Cuenta(-33, 10);

        cuentaJimena.depositar(1000);
        cuentaJimena.transferir(400, miCuenta);
        
        System.out.println(miCuenta.getSaldo());
        System.out.println(cuentaJimena.getSaldo());
    }   
}
