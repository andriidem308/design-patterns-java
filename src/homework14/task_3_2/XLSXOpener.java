package homework14.task_3_2;

public class XLSXOpener extends AbstractOpener {

    @Override
    public void openFile(String filename) {
        if (filename.endsWith(".xlsx")) {
            System.out.printf("Opening *.xlsx file with filename \"%s\"\n", filename);
        } else if (nextOpener != null) {
            nextOpener.openFile(filename);
        }
    }
}
