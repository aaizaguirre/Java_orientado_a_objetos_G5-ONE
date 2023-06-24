// Polimorfismo: permite que las referencias de tipos de clases más genéricos referencien objetos más específicos. Por ejemplo: Funcionario funcionario = new Gerente(); obtendrá los métodos de Gerente.

public class ControlBonificacion {
    private double suma;

    public double registrarSalario(Funcionario funcionario){    // Se usa la clase más genérica, que aplica a todas las clases hijas. Esto es polimorfismo.
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }

}
