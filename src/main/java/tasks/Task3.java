package tasks;

import lombok.Data;

@Data
public class Task3 extends AbstractTask {

    private boolean answer;
    private int n;

    /**
     * Дано трехзначное число N. Проверить, будет ли сумма его цифр четным числом.
     * */
    @Override
    protected void calculate() {
        answer = (n / 100 + n / 10 + n % 10) % 2 == 0;
    }

    @Override
    protected void logInfo() {
        LOGGER.info("Answer for 3rd task is " + answer);
    }

    @Override
    protected void initFileParams() {
        n = DATA.nThirdTask();
    }

    @Override
    protected void initScannerParams() {
        n = SCANNER.nextInt();
    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
