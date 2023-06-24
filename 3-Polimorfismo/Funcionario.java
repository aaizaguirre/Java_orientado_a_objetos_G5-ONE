// class "abstract": clase padre, muy general. Las clases hijas definen los detalles. Debe poseer por lo menos 1 método abstracto o vacío del cual las clases hijas heredan y sobreescriben. Deben tener una clase hija no abstracta. 
public abstract class Funcionario {
    private String nombre;
    private String documento;
    private double salario;

    public String getNombre(){
        return nombre;
    } 

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento; 
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public abstract double getBonificacion();  // Método abstracto 

}
