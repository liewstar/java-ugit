import java.util.*;

public class cli {
    public static void main(String[] args) {
        CommandLineArgs commandLineArgs = parseArgs(args);
        commandLineArgs.getFunc().execute(commandLineArgs);
    }

    public static CommandLineArgs parseArgs(String[] args) {
        CommandLineArgs commandLineArgs = new CommandLineArgs();
        List<String> arguments = Arrays.asList(args);
        if (arguments.isEmpty()) {
            System.out.println("No Command provided.");
            return commandLineArgs;
        }

        String command = arguments.get(0);
        commandLineArgs.setCommand(command);
        if (command.equals("init")) {
            commandLineArgs.setFunc(new CommandLineArgs.InitCommand());
        }else if (command.equals("push")) {
            commandLineArgs.setFunc(new CommandLineArgs.PushCommand());
        }else if (command.equals("pull")) {
            commandLineArgs.setFunc(new CommandLineArgs.PullCommand());
        }else if (command.equals("add")) {
            commandLineArgs.setFunc(new CommandLineArgs.AddCommand());
        }else {
            System.out.println("Invalid command "+command);
        }

        return commandLineArgs;
    }
}
