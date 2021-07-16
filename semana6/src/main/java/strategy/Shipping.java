package strategy;

/**
 *
 * @author Weslei
 */
public class Shipping {
    private float value;

    public Shipping(float value) {
        this.value = value;
    }

    public float calculate(ShippingAmount operation) {
        return operation.calculate(value);
    }
}
