import java.util.ArrayList;
import java.util.List;

public class Queue {
    private static final int FIRST_INDEX = 0;
    private List<String> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void push(String string) {
        queue.add(string);
    }

    public String pop() {
        String content = queue.remove(FIRST_INDEX);
        return content;
    }
}
