import data.InputType;
import org.apache.log4j.BasicConfigurator;
import tasks.*;

public class Main {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        new Task1().execute(InputType.FILE);
        new Task2().execute(InputType.FILE);
        new Task3().execute(InputType.FILE);
        new Task4().execute(InputType.FILE);
        new Task5().execute(InputType.FILE);
        new Task6().execute(InputType.FILE);
        new Task7().execute(InputType.FILE);
        new Task8().execute(InputType.FILE);
    }
}
