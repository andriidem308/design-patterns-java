package homework8.task_3_2;


public class CheckboxButton extends Button {
  public CheckboxButton(Size size) {
    super(size);
  }

  public void draw() {
    System.out.printf("Setting size to %s...\n", size.getSize());
    System.out.println("Drawing a checkbox button.\n");
  }
}
