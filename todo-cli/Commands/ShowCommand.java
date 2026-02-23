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
        // TODO Auto-generated method stub
        
    }
}
