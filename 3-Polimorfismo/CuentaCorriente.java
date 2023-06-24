public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override           // Sobreescribe sobre la clase padre. 
    public boolean retirar(double cantidad) {
        double comision = 0.2;
        return super.retirar(cantidad + comision);
    }    
}
