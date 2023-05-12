package homework8.task_3_2;


public class ImageButton extends Button {
    public ImageButton(Size size) {
        super(size);
    }

    public void draw() {
        System.out.printf("Setting size to %s...\n", size.getSize());
        System.out.println("Drawing a image button.\n");
    }
}
