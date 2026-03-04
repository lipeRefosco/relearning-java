abstract class Database {
    protected static String url;
    protected static Database instance;

    abstract public void Save(String data);
    abstract public Database getInstance();
    abstract public String[] getAllData();
    
}