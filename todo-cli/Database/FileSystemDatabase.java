public class FileSystemDatabase extends Database {
    
    String url = "database.txt";

    @Override
    public void Save(String task) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter(url, true); // Append mode
            fw.write(task + System.lineSeparator());
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Database getInstance() {
        if(instance == null) {
            instance = new FileSystemDatabase();
        }

        return instance;
    }
    
}
