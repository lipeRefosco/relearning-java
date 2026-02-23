abstract class Command {
    protected String name;
    protected Database database;    

    abstract public String getName();

    abstract public void execute();

}
