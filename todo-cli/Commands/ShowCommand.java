public class ShowCommand extends Command{
    public ShowCommand(String[] args, Database database) {
        this.name = args[0]; //Command name
        this.database = database;
    
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute() {
        String[] allData = this.database.getAllData();
        
        boolean noTasks = allData.length == 0 || allData[0].isEmpty();
        
        if (noTasks) {
            System.out.println("No tasks found.");
            return;
        }

        for (String data : allData) {
            System.out.println(data);
        }
    }
}
