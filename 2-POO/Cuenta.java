/* Entidad (clase) Cuenta:
 *      saldo
 *      agencia
 *      numero
 *      titular
*/
public class Cuenta{
    private double saldo;   // Se crean valores por defecto, 0; 0.0; null. Tambien es posible asignarles valores por defecto, por ejemplo: int agencia = 01. 
    private int agencia;
    private int numero; // El "private" vuelve inaccesible al numero. Está encapsulado.
    private Cliente titular;    // Se genera una referencia hacia cliente (conecta ambas clases)
    public static int total = 0; // 

    public Cuenta(int agencia){        // Este es un constructor, define la manera en que se inicializará una nueva instancia
        if (this.agencia < 0){
            System.out.println("No se permiten valores menores a 0");
            this.agencia = 01; // En caso se cree una agencia que no cumpla el requisito, se coloca este valor por defecto
        } else {
            this.agencia = agencia;
        }
        total ++;
    }
    
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

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(int nuevoSaldo){     
        if (nuevoSaldo >= 0){
            this.saldo = nuevoSaldo;
        } else { 
        System.out.println("No están permitidos valores negativos");
        }
    }

    public double getNumero(){  // "getter" sirve para obtener informacion de un objeto private.
        return this.numero;
    }

    public void setNumero(int nuevoNumero){     // "setter" nos permite modificar un objeto private.
        if (nuevoNumero >= 0){
            this.numero = nuevoNumero;
        } else { 
        System.out.println("No están permitidos valores negativos");
        }
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }
}
