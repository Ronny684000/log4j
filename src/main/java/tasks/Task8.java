package tasks;

import lombok.Data;

@Data
public class Task8 extends AbstractTask {

    private double answer;
    private double s;

    /**
     * Дано натуральное число S. Дана последовательность 5, 9, 13, 17,...
     * Сколько слагаемых следует взять, чтобы получить сумму, равную либо превышающую S?
     * Результат вывести на экран.
     * */
    @Override
    protected void calculate() {
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
    protected void logInfo() {
        LOGGER.info("Answer for 8th task is " + answer);
    }

    @Override
    protected void initFileParams() {
        s = DATA.sEighthTask();
    }

    @Override
    protected void initScannerParams() {
        s = SCANNER.nextInt();
    }

    @Override
    protected boolean checkParams() {
        return s > 0;
    }
}
