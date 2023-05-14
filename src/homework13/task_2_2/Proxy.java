package homework13.task_2_2;


public class Proxy implements DisplayObject {
    private String path;
    private ImageFile imageFile;

    public Proxy(String path) {
        this.path = path;
    }


    @Override
    public void display() {
        imageFile = imageFile == null ? new ImageFile(path) : imageFile;
        imageFile.display();
    }
}
