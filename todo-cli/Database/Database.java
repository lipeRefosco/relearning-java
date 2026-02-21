abstract class Database {
    protected static Database instance;

    abstract public void Save(Command command);
    abstract public Database getInstance();
}