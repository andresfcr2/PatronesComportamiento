/**
 * BonoFijo
 */
public class BonoFijo implements EstrategiaDescuento {

    @Override
    public double aplicar(double subtotal){
        if (subtotal>= 1700000){
            return subtotal- 20000;
        }
        return subtotal ;
    }
}