public class Gerente extends Funcionario {      // Herencia, "Gerente" es hijo de "Funcionario"
    
    private int contraseña;

    public int getContraseña(){
        return contraseña;
    }
    
    public void setContraseña(int contraseña){
        this.contraseña = contraseña;
    }

    public boolean autenticar(int contraseña){
        if (this.contraseña == contraseña){
            return true;
        }
        else{
            return false;
        }
    }

    public double getBonificacion(){
        return super.getSalario()*0.5;      // "super" nos permite obtener informacion de la clase padre.
    }
}
