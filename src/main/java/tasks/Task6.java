package tasks;

import lombok.Data;

@Data
public class Task6 implements ITask {

    private boolean answer;
    private double k;
    private double n;
    private double m;

    @Override
    public void calculate() {
        answer = String.valueOf(n * k).contains(String.valueOf(m));
    }

    @Override
    public void logInfo() {
        LOGGER.info("Answer for 6th task is " + answer);
    }

    @Override
    public void initFileParams() {
        k = DATA.kSixthTask();
        n = DATA.nSixthTask();
        m = DATA.mSixthTask();
    }

    @Override
    public void initScannerParams() {
        k = SCANNER.nextInt();
        n = SCANNER.nextInt();
        m = SCANNER.nextInt();
    }

    @Override
    public boolean checkParams() {
        return m >= 0;
    }
}
