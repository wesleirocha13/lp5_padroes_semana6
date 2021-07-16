package command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Weslei
 */
public class Management {
    
    private List<Action> actions = new ArrayList<Action>();

    public void executeAction(Action action) {
        this.actions.add(action);
        action.execute();
    }

    public void cancelLastAction() {
        if (actions.size() != 0) {
            Action action = this.actions.get(this.actions.size() - 1);
            action.cancel();
            this.actions.remove(this.actions.size() - 1);
        }
    }
}
