import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomQueue {
    private List<String> queue;
    private static Random RANDOM = new Random();

    public RandomQueue() {
        queue = new ArrayList<>();
    }

    public void push(String string) {
        queue.add(string);
    }

    public String pop() {
        int index = getRandomIndex();
        String content = queue.remove(index);
        return content;
    }

    private int getRandomIndex() {
        int bound = queue.size();
        if (bound <= 1) {
            return 0;
        }
        return RANDOM.nextInt(bound);
    }
}
