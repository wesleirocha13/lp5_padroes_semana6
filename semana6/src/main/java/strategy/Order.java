/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Weslei
 */
public class Order {
    private float valueOrder;

    public float getValue() {
        return valueOrder;
    }

    public void commonDelivery(float value) {
        Shipping shipping = new Shipping(value);
        this.valueOrder = shipping.calculate(new CalcCommonDelivery());
    }

    public void fastDelivery(float value) {
        Shipping shipping = new Shipping(value);
        this.valueOrder = shipping.calculate(new CalcFastDelivery());
    }

    public void expressDelivery(float value) {
        Shipping shipping = new Shipping(value);
        this.valueOrder = shipping.calculate(new CalcExpressDelivery());
    }
}
