public class Contador extends Funcionario {
    
    @Override
    public double getBonificacion() {
        return 200;                     // Método más especifico, ya no llama al de la la clase padre.
    }
}
