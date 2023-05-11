package homework6.task_3_1;

public class Client {
    public void execute() {
        String filename = "src/homework6/task_3_1/someFile.txt";

        TextEditor textEditor_1 = TextEditor.getInstance();
        String file_content = textEditor_1.read(filename);
        System.out.println(file_content);

        TextEditor textEditor_2 = TextEditor.getInstance();
        String content_replaced = textEditor_2.replace(
                filename, "finished", "completed");
        System.out.println(content_replaced);
    }
}
