package tasks;

import lombok.Data;

@Data
public class Task6 extends AbstractTask {

    private boolean answer;
    private double k;
    private double n;
    private double m;

    /**
     * Даны натуральные числа n, k. Проверить, есть ли в записи числа nk цифра m.
     * */
    @Override
    protected void calculate() {
        answer = String.valueOf(n * k).contains(String.valueOf(m));
    }

    @Override
    protected void logInfo() {
        LOGGER.info("Answer for 6th task is " + answer);
    }

    @Override
    protected void initFileParams() {
        k = DATA.kSixthTask();
        n = DATA.nSixthTask();
        m = DATA.mSixthTask();
    }

    @Override
    protected void initScannerParams() {
        k = SCANNER.nextInt();
        n = SCANNER.nextInt();
        m = SCANNER.nextInt();
    }

    @Override
    protected boolean checkParams() {
        return m >= 0;
    }
}
