package strategy;

/**
 *
 * @author Weslei
 */
public class CalcExpressDelivery implements ShippingAmount{
    float deliveryValue = 80;
    public float calculate(float value) {
        return value + deliveryValue;
    }
}
