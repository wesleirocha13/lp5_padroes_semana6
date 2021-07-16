package command;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class ManagementTest {
    
    Management management;
    Order order;

    @Before
    public void setUp() {
        management = new Management();
        order = new Order ("111", 20);
    }

    @Test
    public void mustApproveOrder() {
        Action approvedOrder = new ActionApproveOrder(order);
        management.executeAction(approvedOrder);

        assertEquals("Pedido aprovado", order.getState());
    }

    @Test
    public void mustCancelOrder() {
        Action canceledOrder = new ActionCancelOrder(order);
        management.executeAction(canceledOrder);

        assertEquals("Pedido cancelado", order.getState());
    }

    @Test
    public void deveCancelarFechamentoOrder() {
        Action approvedOrder = new ActionApproveOrder(order);
        Action canceledOrder = new ActionCancelOrder(order);
        management.executeAction(approvedOrder);
        management.executeAction(canceledOrder);
        management.cancelLastAction();

        assertEquals("Pedido aprovado", order.getState());
    }
    
}
