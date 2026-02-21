public class RemoveCommand extends Command{
    private int id;
    
    public RemoveCommand(String[] args, Database database) {
        this.name = args[0]; //Command name
        this.id = Integer.parseInt(args[1]); //ID of the task to be removed
        this.database = database;
        
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        
    }
}
