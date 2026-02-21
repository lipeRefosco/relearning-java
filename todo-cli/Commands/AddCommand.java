public class AddCommand extends Command {
    private String task;


    public AddCommand(String[] args, Database database) {
        this.name = args[0]; //Command name
        this.task = args[1]; //Task
        this.database = database;
    }

    @Override
    public void execute() {
        database.Save(this);
    }
}
