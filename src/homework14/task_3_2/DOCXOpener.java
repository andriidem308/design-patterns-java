package homework14.task_3_2;

public class DOCXOpener extends AbstractOpener {
    @Override
    public void openFile(String filename) {
        if (filename.endsWith(".docx")) {
            System.out.printf("Opening *.docx file with filename \"%s\"\n", filename);
        } else if (nextOpener != null) {
            nextOpener.openFile(filename);
        }
    }
}
