package homework4.task_3_2;

public class CustomStringBuilder {
    private final CustomString content;

    public CustomStringBuilder() {
        this.content = new CustomString();
    }

    public void append(String content) {
        this.content.append(content);
    }

    public void append(CustomString content) {
        append(content.getContent());
    }

    public void insert(String content, int index) {
        this.content.insert(content, index);
    }

    public void insert(CustomString content, int index) {
        insert(content.getContent(), index);
    }

    public void replace(String content, int startIndex, int length) {
        this.content.replace(content, startIndex, length);
    }

    public void replace(CustomString content, int start, int length) {
        replace(content.getContent(), start, length);
    }

    public void deleteSubstring(int startIndex, int length) {
        this.content.deleteSubString(startIndex, length);
    }

    public CustomString build() {
        return this.content;
    }
}
