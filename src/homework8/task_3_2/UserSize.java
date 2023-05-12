package homework8.task_3_2;


public class UserSize implements Size {
    private final int width;
    private final int height;

    public UserSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getSize() {
        return String.format("%dx%d", width, height);
    }
}
