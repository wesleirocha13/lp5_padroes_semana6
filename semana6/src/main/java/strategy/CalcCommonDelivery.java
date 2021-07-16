package strategy;

/**
 *
 * @author Weslei
 */
public class CalcCommonDelivery implements ShippingAmount{
    float deliveryValue = 20;
    public float calculate(float value) {
        return value + deliveryValue;
    }
}
