public class main {
    public static void main(String[] args) {
        if(args.length == 0) {
            throw new ExceptionInInitializerError("Need at least a command!");
        }

        Database database = new FileSystemDatabase();
        Command command = CommandFactory.fabricate(args, database);

        command.execute();

        return;
    }
}