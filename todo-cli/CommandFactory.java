public class CommandFactory {

    public static Command fabricate(String[] args, Database database) {
        if (args == null || args.length == 0)
            throw new IllegalArgumentException("No command provided!");
        
        for (CommandsEnum commandEnum : CommandsEnum.values()) {
            if (commandEnum.toString().equalsIgnoreCase(args[0]) == false) 
                continue;
            
            switch (commandEnum) {
                case ADD:
                    if(args.length < 2 || args[1].isEmpty())
                        throw new IllegalArgumentException("Task description is required for add command!");

                    return new AddCommand(args, database);
                    
                case SHOW:
                    return new ShowCommand(args, database);

                case REMOVE:
                    if (args.length < 2 || args[1].isEmpty())
                        throw new IllegalArgumentException("ID is required for remove command!");

                    return new RemoveCommand(args, database);
            }
        }
        throw new IllegalArgumentException("Unknown command: " + args[0]);
    }
}
