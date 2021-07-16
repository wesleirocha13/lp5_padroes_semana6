package command;

/**
 *
 * @author Weslei
 */
public class ActionCancelOrder implements Action{
    private Order order;

    public ActionCancelOrder(Order order) {
        this.order = order;
    }

    public void execute() {
        this.order.cancelOrder();
    }

    public void cancel() {
        this.order.approveOrder();
    }
}
