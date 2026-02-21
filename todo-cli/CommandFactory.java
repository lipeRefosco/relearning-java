public class CommandFactory {

    public static Command fabricate(String[] args, Database database) {
        if (args[0].equalsIgnoreCase(CommandsEnum.ADD.toString())) {
            if(args.length < 2 || args[1].isEmpty())
                throw new IllegalArgumentException("Task description is required for add command!");
            
            return new AddCommand(args, database);
        }

        if (args[0].equalsIgnoreCase(CommandsEnum.SHOW.toString())) {
            return new ShowCommand(args, database);
        }

        if (args[0].equalsIgnoreCase(CommandsEnum.REMOVE.toString())) {
            if (args.length < 2 || args[1].isEmpty())
                throw new IllegalArgumentException("ID is required for remove command!");

            return new RemoveCommand(args, database);
        }

        throw new ExceptionInInitializerError("Invalid command!");
    }
}
