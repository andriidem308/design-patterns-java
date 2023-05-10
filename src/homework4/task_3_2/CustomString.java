package homework4.task_3_2;

public class CustomString {
    private String content;

    public CustomString(String content) {
        this.content = content;
    }

    public CustomString() {
        this.content = "";
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return this.content;
    }

    public void append(String content) {
        this.content += content;
    }

    public void append(CustomString content) {
        append(content.getContent());
    }

    public void insert(String content, int index) {
        if (index < 0 || index > this.content.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.content = this.content.substring(0, index) + content + this.content.substring(index);
    }

    public void insert(CustomString str, int index) {
        insert(str.getContent(), index);
    }

    public void replace(String content, int start, int length) {
        if (start < 0 ||
                start > this.content.length() ||
                length < 0 ||
                (start + length) > this.content.length()
        ) {
            throw new IndexOutOfBoundsException();
        }
        this.content = this.content.substring(0, start) + content + this.content.substring(start + length);
    }

    public void replace(CustomString content, int start, int length) {
        replace(content.getContent(), start, length);
    }

    public void deleteSubString(int startIndex, int length) {
        if (startIndex < 0 ||
                startIndex > this.content.length() ||
                length < 0 ||
                (startIndex + length) > this.content.length()
        ) {
            throw new IndexOutOfBoundsException();
        }
        this.content = this.content.substring(0, startIndex) + this.content.substring(startIndex + length);
    }
}
