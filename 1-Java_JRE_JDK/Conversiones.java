public class Conversiones {
    public static void main(String[] args){
        double variable1 = 230.89;
        int variable1Entero = (int)variable1;    // "Cast": Cambio de variable de double a entero.
 
        // int prueba = 122222222;               // Numero muy grande, esta fuera del rango que acepta este tipo de variable.
        
        long prueba = 122222222L;                // Variable tipo long acepta numeros muy grandes, se especifica con la "L" al final.
 
        short numeroPequeño = 13555;             // Acepta numeros muy pequeños.

        byte numeroAunMasPequeño = 13;           // Acepta numeros aun mas pequeños.

        float numeroDecimalPequeño = 2.5F;       // Para decimales muy pequeños.   

        System.out.println(variable1Entero);
        System.out.println(prueba);
        System.out.println(numeroPequeño);
        System.out.println(numeroAunMasPequeño);
        System.out.println(numeroDecimalPequeño);
    }
}
