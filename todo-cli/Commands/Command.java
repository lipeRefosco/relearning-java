abstract class Command {
    protected String name;
    protected Database database;

    abstract public void execute();
}
