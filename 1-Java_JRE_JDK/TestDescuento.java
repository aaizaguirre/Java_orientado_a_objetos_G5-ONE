public class TestDescuento {
    public static void main(String[] args) {
        double valorCompra = 250.0;
        double descuento = 0.0;

        if (valorCompra >= 100.0 && valorCompra <= 199.99){
            descuento = 0.05;
        }
        if (valorCompra >= 200.0 && valorCompra <= 299.99){
            descuento = 0.10;
        }
        if (valorCompra > 300.0){
            descuento = 0.2;
        }

        double valorFinal = (1 - descuento) * valorCompra;
        System.out.println(valorFinal);
    }
}
