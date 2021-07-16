package strategy;

/**
 *
 * @author Weslei
 */
public class CalcFastDelivery implements ShippingAmount{
    float deliveryValue = 50;
    public float calculate(float value) {
        return value + deliveryValue;
    }
}
