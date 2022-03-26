package tasks;

import lombok.Data;

import java.util.List;

import static java.lang.Math.*;

@Data
public class Task4 implements ITask {

    private String answer = "";
    private double x;

    @Override
    public void calculate() {
        double cosX = cos(x);
        double sinX = sin(x);
        double lnX = Math.log(x);
        List.of(cosX, sinX, lnX).stream().sorted().forEach(element -> answer.concat(String.valueOf(element)));
    }

    @Override
    public void logInfo() {
        LOGGER.info("Answer for 3rd task is " + answer);
    }

    @Override
    public void initFileParams() {
        x = DATA.xFourthTask();
    }

    @Override
    public void initScannerParams() {
        x = SCANNER.nextInt();
    }

    @Override
    public boolean checkParams() {
        return true;
    }
}
