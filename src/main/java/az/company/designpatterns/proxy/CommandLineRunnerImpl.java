package az.company.designpatterns.proxy;

public class CommandLineRunnerImpl implements CommandLineRunner {

    @Override
    public void run(String cmd) {
        System.out.printf("Executing command: %s\n", cmd);
    }
}
