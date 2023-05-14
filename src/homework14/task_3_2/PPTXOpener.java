package homework14.task_3_2;

public class PPTXOpener extends AbstractOpener {
    @Override
    public void openFile(String filename) {
        if (filename.endsWith(".pptx")) {
            System.out.printf("Opening *.pptx file with filename \"%s\"\n", filename);
        } else if (nextOpener != null) {
            nextOpener.openFile(filename);
        }
    }
}
