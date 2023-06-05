package homework16.task_3_3;

import java.util.Stack;

public class DFSIterator implements Iterator {
    private final Stack<Component> stack = new Stack<>();

    public DFSIterator(Component root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Component next() {
        if (hasNext()) {
            Component component = stack.pop();
            if (component instanceof Box) {
                for (Component child : ((Box) component).getChildren()) {
                    stack.push(child);
                }
            }
            return component;
        }
        return null;
    }
}
