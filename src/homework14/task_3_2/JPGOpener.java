package homework14.task_3_2;

public class JPGOpener extends AbstractOpener {
    @Override
    public void openFile(String filename) {
        if (filename.endsWith(".jpg")) {
            System.out.printf("Opening *.jpg file with filename \"%s\"\n", filename);
        } else if (nextOpener != null) {
            nextOpener.openFile(filename);
        }
    }
}
