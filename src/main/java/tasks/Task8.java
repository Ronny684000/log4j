package tasks;

import lombok.Data;

@Data
public class Task8 implements ITask {

    private double answer;
    private double s;

    @Override
    public void calculate() {
        int sum = 0;
        int counter = 0;
        int startNumber = 5;
        while (sum < s) {
            sum += startNumber;
            startNumber += 4;
            counter++;
        }
        answer = counter;
    }

    @Override
    public void logInfo() {
        LOGGER.info("Answer for 8th task is " + answer);
    }

    @Override
    public void initFileParams() {
        s = DATA.sEighthTask();
    }

    @Override
    public void initScannerParams() {
        s = SCANNER.nextInt();
    }

    @Override
    public boolean checkParams() {
        return s > 0;
    }
}
