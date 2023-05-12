package homework8.task_3_2;


public class RadioButton extends Button {
  public RadioButton(Size size) {
    super(size);
  }

  public void draw() {
    System.out.printf("Setting size to %s...\n", size.getSize());
    System.out.println("Drawing a radio button.\n");
  }
}
