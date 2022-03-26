package tasks;

import lombok.Data;

@Data
public class Task3 implements ITask {

    private boolean answer;
    private int n;

    @Override
    public void calculate() {
        answer = (n / 100 + n / 10 + n % 10) % 2 == 0;
    }

    @Override
    public void logInfo() {
        LOGGER.info("Answer for 3rd task is " + answer);
    }

    @Override
    public void initFileParams() {
        n = DATA.nThirdTask();
    }

    @Override
    public void initScannerParams() {
        n = SCANNER.nextInt();
    }

    @Override
    public boolean checkParams() {
        return true;
    }
}
