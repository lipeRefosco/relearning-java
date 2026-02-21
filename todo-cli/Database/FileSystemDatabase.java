import java.io.File;

public class FileSystemDatabase extends Database {
    
    @Override
    public void Save(Command command) {
        File file = new File("database.txt");
        try {
            java.nio.file.Files.write(file.toPath(), command.toString().getBytes());
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
