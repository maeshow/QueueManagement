import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(String string) {
        stack.add(string);
    }

    public String pop() {
        String content = stack.remove(stack.size() - 1);
        return content;
    }

}
