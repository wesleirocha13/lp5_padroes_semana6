package strategy;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderTest {
    
    @Test
    public void mustReturnCommonDeliveryValue() {
        Order order = new Order();
        order.commonDelivery(10);
        assertEquals(30.0, order.getValue(),0.1);
    }

    @Test
    public void mustReturnFastDeliveryValue() {
        Order order = new Order();
        order.fastDelivery(10);
        assertEquals(60.0, order.getValue(),0.1);
    }

    @Test
    public void mustReturnExpressDeliveryValue() {
        Order order = new Order();
        order.expressDelivery(10);
        assertEquals(90.0, order.getValue(),0.1);
    }
    
}
