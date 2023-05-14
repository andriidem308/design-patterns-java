package homework14.task_3_2;


public class DOCOpener extends AbstractOpener {
    @Override
    public void openFile(String filename) {
        if (filename.endsWith(".doc")) {
            System.out.printf("Opening *.doc file with filename \"%s\"\n", filename);
        } else if (nextOpener != null) {
            nextOpener.openFile(filename);
        }
    }
}
