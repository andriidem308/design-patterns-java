package homework19.task_3_1;

import java.util.regex.Pattern;

public class WordAmountObserver implements Observer {
    private int wordsAmount = 0;
    private final Pattern pattern = Pattern.compile("\\s+");

    @Override
    public void update(String line) {
        String[] words = pattern.split(line);
        wordsAmount += words.length;
    }

    public int getWordsAmount() {
        return wordsAmount;
    }
}
