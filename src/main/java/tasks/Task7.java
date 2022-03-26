package tasks;

import lombok.Data;

import static java.lang.Math.*;

@Data
public class Task7 extends AbstractTask {

    private double answer;
    private double n;

    /**
     * Дано натуральное число N. Вычислить:
     * S = 1/sin(1) + 2/(sin(1) + sin(2)) ...
     * */
    @Override
    protected void calculate() {
        double S = 0;
        double summed = 0;
        for (int i = 1; i <= n; i++) {
            summed += sin(i);
            S += (1 / summed);
        }
        answer = S;
    }

    @Override
    protected void logInfo() {
        LOGGER.info("Answer for 7th task is " + answer);
    }

    @Override
    protected void initFileParams() {
        n = DATA.nSeventhTask();
    }

    @Override
    protected void initScannerParams() {
        n = SCANNER.nextInt();
    }

    @Override
    protected boolean checkParams() {
        return n > 0;
    }
}
