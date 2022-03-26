package tasks;

import lombok.Data;

@Data
public class Task2 extends AbstractTask {

    private double sum;
    private double diff;
    private double div;
    private double comp;
    private double x;
    private double y;

    /**
     * Даны два действительных числа x и у.
     * Вычислить их сумму, разность, произведение и частное.
     * */
    @Override
    protected void calculate() {
        double sum = x + y;
        double diff = x - y;
        double comp = x * y;
        double div = x / y;
    }

    @Override
    protected void logInfo() {
        LOGGER.info("Task's 2 sum = " + sum + "; diff = " +
                diff + "; comp = " + comp + "; div = " + div);
    }

    @Override
    protected void initFileParams() {
        x = DATA.xSecondTask();
        y = DATA.ySecondTask();
    }

    @Override
    protected void initScannerParams() {
        x = SCANNER.nextInt();
        y = SCANNER.nextInt();
    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
