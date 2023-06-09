public class Condicionales {
    public static void main(String[] args) {
        int edad = 17;
        int cantidad = 2;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            if (cantidad >= 2){
                System.out.println("Usted es menor de edad, pero esta permitido su ingreso.");
            } else {
                System.out.println("No eres mayor de edad.");
            }
        }
    }
}
