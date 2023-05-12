package homework8.task_3_2;


public class Canvas {
  public static void main(String[] args) {

    CheckboxButton checkboxButton = new CheckboxButton(new SizeSmall());
    checkboxButton.draw();

    RadioButton radioButton = new RadioButton(new SizeMedium());
    radioButton.draw();

    DropdownButton dropdownButton = new DropdownButton(new SizeLarge());
    dropdownButton.draw();

    ImageButton imageButton = new ImageButton(new UserSize(1920, 1080));
    imageButton.draw();
  }
}
