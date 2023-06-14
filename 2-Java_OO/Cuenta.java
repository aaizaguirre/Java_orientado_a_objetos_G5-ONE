/* Entidad (clase) Cuenta:
 *      saldo
 *      agencia
 *      numero
 *      titular
*/
class Cuenta{
    double saldo;   // Se crean valores por defecto, 0; 0.0; null. Tambien es posible asignarles valores por defecto, por ejemplo: int agencia = 01. 
    int agencia;
    int numero;
    String titular;

    public void depositar(double cantidad){  // Método para depositar dinero a cuenta, donde cantidad es la cantidad de dinero. Void hace referencia a un metodo que no retorna ningun valor.
        // saldo += cantidad;
        this.saldo = this.saldo + cantidad;  // This hace referencia al saldo de la cuenta con la que se llama el metodo.
    } 

    public boolean retirar(double cantidad){  // Devuelve un booleano.
        if(this.saldo >= cantidad){
            this.saldo = this.saldo - cantidad;
            return true;                      // Si la condición es verdadera se ejecuta este fragmento de codigo.
        } else {
            return false;
        }
    }

    public boolean transferir(double cantidad, Cuenta cuenta){
        if(this.saldo >= cantidad){
            this.saldo = this.saldo - cantidad;
            cuenta.depositar(cantidad);
            return true;                   
        } 
        return false;
    }

}
