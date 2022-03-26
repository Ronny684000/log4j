package tasks;

import lombok.Data;

@Data
public class Task2 implements ITask {

    private double sum;
    private double diff;
    private double div;
    private double comp;
    private double x;
    private double y;

    @Override
    public void calculate() {
        double sum = x + y;
        double diff = x - y;
        double comp = x * y;
        double div = x / y;
    }

    @Override
    public void logInfo() {
        LOGGER.info("Task's 2 sum = " + sum + "; diff = " +
                diff + "; comp = " + comp + "; div = " + div);
    }

    @Override
    public void initFileParams() {
        x = DATA.xSecondTask();
        y = DATA.ySecondTask();
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
