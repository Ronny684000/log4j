package tasks;

import lombok.Data;

import static java.lang.Math.*;

@Data
public class Task7 implements ITask {

    private double answer;
    private double n;

    @Override
    public void calculate() {
        double S = 0;
        double summed = 0;
        for (int i = 1; i <= n; i++) {
            summed += sin(i);
            S += (1 / summed);
        }
        answer = S;
    }

    @Override
    public void logInfo() {
        LOGGER.info("Answer for 7th task is " + answer);
    }

    @Override
    public void initFileParams() {
        n = DATA.nSeventhTask();
    }

    @Override
    public void initScannerParams() {
        n = SCANNER.nextInt();
    }

    @Override
    public boolean checkParams() {
        return n > 0;
    }
}
