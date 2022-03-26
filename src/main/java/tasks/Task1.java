package tasks;

import lombok.Data;

import static java.lang.Math.*;

@Data
public class Task1 implements ITask {

    private double answer;
    private double x;
    private double y;

    @Override
    public void calculate() {
       answer = 8 * pow((1 - tan(x)), 1/tan(x)) + cos(x - y);
    }

    @Override
    public void logInfo() {
        LOGGER.info("Answer for 1st task is " + answer);
    }

    @Override
    public void initFileParams() {
        x = DATA.xFirstTask();
        y = DATA.yFirstTask();
    }

    @Override
    public void initScannerParams() {
        x = SCANNER.nextInt();
        y = SCANNER.nextInt();
    }

    @Override
    public boolean checkParams() {
        return true;
    }
}
