package tasks;

import lombok.Data;

import java.util.List;

import static java.lang.Math.*;

@Data
public class Task4 extends AbstractTask {

    private String answer = "";
    private double x;

    /**
     * Дано число x. Напечатать в порядке возрастания числа: sin x, cos x, ln x.
     * Если при каком-либо x некоторые из выражений не имеют смысла,
     * вывести сообщение об этом и сравнивать значения только тех, которые имеют смысл.
     * */
    @Override
    protected void calculate() {
        double cosX = cos(x);
        double sinX = sin(x);
        double lnX = Math.log(x);
        List.of(cosX, sinX, lnX).stream().sorted().forEach(element -> answer.concat(String.valueOf(element)));
    }

    @Override
    protected void logInfo() {
        LOGGER.info("Answer for 3rd task is " + answer);
    }

    @Override
    protected void initFileParams() {
        x = DATA.xFourthTask();
    }

    @Override
    protected void initScannerParams() {
        x = SCANNER.nextInt();
    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
