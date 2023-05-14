package homework14.task_3_2;

public class PNGOpener extends AbstractOpener {

    @Override
    public void openFile(String filename) {
        if (filename.endsWith(".png")) {
            System.out.printf("Opening *.png file with filename \"%s\"\n", filename);
        } else if (nextOpener != null) {
            nextOpener.openFile(filename);
        }
    }
}
