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

    @Override
    public String[] getAllData() {
        try {
            java.io.File file = new java.io.File(url);
            if (!file.exists()) {
                return new String[0]; // Return empty array if file doesn't exist
            }
            java.util.List<String> lines = new java.util.ArrayList<>();
            java.util.Scanner scanner = new java.util.Scanner(file);
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
            return lines.toArray(new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return new String[0]; // Return empty array on error
        }
    }
}