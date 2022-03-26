package tasks;

import lombok.Data;

import static java.lang.Math.*;

@Data
public class Task1 extends AbstractTask {

    private double answer;
    private double x;
    private double y;

    /**
     * Вычислить значения выражения по формуле:
     * 8(1 - tg(x))^ctg(x) + cos(x - y)
     * */
    @Override
    protected void calculate() {
       answer = 8 * pow((1 - tan(x)), 1/tan(x)) + cos(x - y);
    }

    @Override
    protected void logInfo() {
        LOGGER.info("Answer for 1st task is " + answer);
    }

    @Override
    protected void initFileParams() {
        x = DATA.xFirstTask();
        y = DATA.yFirstTask();
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
