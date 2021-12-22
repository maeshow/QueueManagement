import java.util.ArrayList;
import java.util.List;

public class QueueWithPriority {
    private static final int DEFAULT_MAX = 0;
    private static final int DEFAULT_INDEX = 0;
    private List<Contents> queue;

    public QueueWithPriority() {
        queue = new ArrayList<>();
    }

    public void push(String string, int priority) {
        Contents content = new Contents(string, priority);
        queue.add(content);
    }

    public String pop() {
        int max = DEFAULT_MAX;
        int index = DEFAULT_INDEX;
        for (int i = 0; i < queue.size(); i++) {
            Contents content = queue.get(i);
            int priority = content.getPriority();
            if (isBigger(priority, max)) {
                index = i;
                max = priority;
            }
        }
        Contents poppedContent = queue.remove(index);
        return poppedContent.getString();
    }

    private boolean isBigger(int a, int b) {
        return b < a;
    }

}
