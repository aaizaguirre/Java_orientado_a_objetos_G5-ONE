public class Principal {
   
    // Forma antigua de declarar constantes: 
        // public static final String DIA_LUNES = "lunes"; 
        // public static final String DIA_LUNES = "martes";
        // public static final String DIA_LUNES = "miercoles";  
    // DONDE: "final" indica que se trabaja con una constante (DIA_LUNES) que no podrá ser modificada.    
    public static void main(String[] args) {
        for (Dia dia: Dia.values()) {
            System.out.println("El dia de la semana es: " + dia);
        }
    
        Dia domingo = Dia.DOMINGO;
        System.out.println(domingo.name());     //El método name devuelve un String
        System.out.println(domingo.ordinal());  // El método ordinal devuelve el índice.
        System.out.println(domingo.toString()); // Método que convierte a String.
    }
}