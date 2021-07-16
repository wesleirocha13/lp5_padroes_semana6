package command;

/**
 *
 * @author Weslei
 */
public class ActionApproveOrder implements Action{
    private Order order;

    public ActionApproveOrder(Order order) {
        this.order = order;
    }

    public void execute() {
        this.order.approveOrder();
    }

    public void cancel() {
        this.order.cancelOrder();
    }
}
