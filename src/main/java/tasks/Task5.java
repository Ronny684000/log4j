package tasks;

import lombok.Data;

import java.util.List;

import static java.lang.Math.*;

@Data
public class Task5 implements ITask {

    private double element;
    private double square;
    private double r;
    private double l;
    private double d;
    private int number;

    @Override
    public void calculate() {
        square = pow(r, 2) * 3.14;
        var list = List.of(r, d, l);
        element = list.get(number - 1);
    }

    @Override
    public void logInfo() {
        LOGGER.info("Answer for 5th task is " + element + " and " + square);
    }

    @Override
    public void initFileParams() {
        r = DATA.rFifthTask();
        l = DATA.lFifthTask();
        d = DATA.dFifthTask();
        number = DATA.numberFifthTask();
    }

    @Override
    public void initScannerParams() {
        r = SCANNER.nextInt();
        l = SCANNER.nextInt();
        d = SCANNER.nextInt();
        number = SCANNER.nextInt();
    }

    @Override
    public boolean checkParams() {
        return !(r < 0) && !(l < 0) && !(d < 0) && number >= 0;
    }
}
