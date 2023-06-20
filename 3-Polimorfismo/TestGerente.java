public class TestGerente {  
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setContraseña(12345);
        gerente1.setSalario(2000);
        
        System.out.println(gerente1.autenticar(gerente1.getContraseña()));
        System.out.println(gerente1.getBonificacion());
        
    }
}
