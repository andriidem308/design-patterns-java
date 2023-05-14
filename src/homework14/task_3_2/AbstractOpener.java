package homework14.task_3_2;


public abstract class AbstractOpener {
    protected AbstractOpener nextOpener;

    public void setNextOpener(AbstractOpener nextOpener) {
        this.nextOpener = nextOpener;
    }

    public abstract void openFile(String filename);
}
