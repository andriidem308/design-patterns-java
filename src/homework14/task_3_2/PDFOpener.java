package homework14.task_3_2;

public class PDFOpener extends AbstractOpener {
    @Override
    public void openFile(String filename) {
        if (filename.endsWith(".pdf")) {
            System.out.printf("Opening *.pdf file with filename \"%s\"\n", filename);
        } else if (nextOpener != null) {
            nextOpener.openFile(filename);
        }
    }
}
