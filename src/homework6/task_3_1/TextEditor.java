package homework6.task_3_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextEditor {
    private static TextEditor instance;

    private TextEditor() {}

    public static TextEditor getInstance() {
        if (instance == null) {
            instance = new TextEditor();
        }
        return instance;
    }

    public String read(String filename) {
        StringBuilder result = new StringBuilder();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine());
                result.append("\n");
            }
            scanner.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found.");
            fnfe.printStackTrace();
        }
        return result.toString();
    }

    public String replace(String filename, String stringToBeReplaced, String stringToReplace) {
        String content = read(filename);
        return content.replace(stringToBeReplaced, stringToReplace);
    }
}
