package az.company.designpatterns.proxy;

public class CommandLineRunnerProxy implements CommandLineRunner {

    private boolean isAdmin = false;
    private final CommandLineRunner runner;

    public CommandLineRunnerProxy(String username, String pass) {
        if (username.equals("hard") && pass.equals("pass")) isAdmin = true;

        this.runner = new CommandLineRunnerImpl();
    }

    @Override
    public void run(String cmd) {

        if (isAdmin) {
            runner.run(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new RuntimeException("PERMISSION_DENIED");
            } else runner.run(cmd);
        }
    }
}