package homework19.task_3_1;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("homework19/task_3_1/resources/input01.txt");

        LongestLineObserver longestLineObserver = new LongestLineObserver();
        LongestWordObserver longestWordObserver = new LongestWordObserver();
        WordAmountObserver wordAmountObserver = new WordAmountObserver();
        LineWithLongestWordObserver lineWithLongestWordObserver = new LineWithLongestWordObserver();

        fileReader.read();

        fileReader.addObserver(longestLineObserver);
        System.out.println("The longest line: " + longestLineObserver.getLongestLine());

        fileReader.addObserver(longestWordObserver);
        System.out.println("The longest word: " + longestWordObserver.getLongestWord());

        fileReader.addObserver(wordAmountObserver);
        System.out.println("Words amount: " + wordAmountObserver.getWordsAmount());

        fileReader.addObserver(lineWithLongestWordObserver);
        System.out.println("Line with the longest word: " + lineWithLongestWordObserver.getLineWithLongestWord());
    }

}
