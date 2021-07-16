package command;

/**
 *
 * @author Weslei
 */
public class Order {
    
    private String id;
    private float value;
    private String state;

    public Order(String id, float value) {
        this.id = id;
        this.value = value;
    }

    public String getState() {
        return state;
    }

    public void approveOrder() {
        this.state = "Pedido aprovado";
    }

    public void cancelOrder() {
        this.state = "Pedido cancelado";
    }
}
