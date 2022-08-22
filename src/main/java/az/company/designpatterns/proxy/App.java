package az.company.designpatterns.proxy;

public class App {

    public static void main(String[] args) {

        CommandLineRunner runner = new CommandLineRunnerProxy("hard", "pass");
        runner.run("rm --ls");
        runner.run("--ls");

        runner = new CommandLineRunnerProxy("bad", "pass");
        runner.run("--ls");
        runner.run("rm --ls");
    }
}
