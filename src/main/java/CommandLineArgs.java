
// set the command and args
public class CommandLineArgs {
    public String command;
    public Command func;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Command getFunc() {
        return func;
    }

    public void setFunc(Command func) {
        this.func = func;
    }

    public interface Command {
        void execute(CommandLineArgs args);
    }

    public static class InitCommand implements Command {
        @Override
        public void execute(CommandLineArgs args) {
            System.out.println("hello ugit init");
        }
    }

    public static class PushCommand implements Command {
        @Override
        public void execute(CommandLineArgs args) {
            System.out.println("hello ugit push");
        }
    }

    public static class PullCommand implements Command {
        @Override
        public void execute(CommandLineArgs args) {
            System.out.println("hello ugit pull");
        }
    }

    public static class AddCommand implements Command {
        @Override
        public void execute(CommandLineArgs args) {
            System.out.println("hello ugit add");
        }
    }

}
