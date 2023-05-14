package homework14.task_3_2;

public class XLSOpener extends AbstractOpener {
    @Override
    public void openFile(String filename) {
        if (filename.endsWith(".xls")) {
            System.out.printf("Opening *.xls file with filename \"%s\"\n", filename);
        } else if (nextOpener != null) {
            nextOpener.openFile(filename);
        }
    }
}
