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

    void depositar(double cantidad){  // Método para depositar dinero a cuenta, donde cantidad es la cantidad de dinero. Void hace referencia a un metodo que no retorna ningun valor.
        saldo += cantidad;
    } 
}
