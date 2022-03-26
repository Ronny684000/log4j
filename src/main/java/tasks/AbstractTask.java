package tasks;

import data.DataConfig;
import data.InputType;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;

import java.util.Scanner;

public abstract class AbstractTask {

    DataConfig DATA = ConfigFactory.create(DataConfig.class);
    Logger LOGGER = Logger.getLogger(AbstractTask.class);
    Scanner SCANNER = new Scanner(System.in);

    /**
     * Contains logic of the task. Must be implemented in each Task
     * to carry out it's specific logic.
     * */
    protected abstract void calculate();

    /**
     * Main method of task. Executes task, initiates its parameters, checks them
     * and makes a log for this steps.
     * @param inputType enum value to define parameters input type
     * */
    public void execute(InputType inputType) {
        if (inputType == InputType.FILE) {
            initFileParams();
        } else {
            initScannerParams();
        }
        if(checkParams()) {
            calculate();
            logInfo();
        } else {
            LOGGER.error("Parameters are not valid, could not calculate the answer");
        }
    }

    /**
     * Method that must be overridden for each specific task.
     * It is be used to log answer.
     * */
    protected abstract void logInfo();

    protected abstract void initFileParams();

    protected abstract void initScannerParams();

    /**
     * Used for checking are the parameters correct.
     * Must be overridden for specific task.
     * Must contain conditions for params if it's required
     * @return boolean value which points are the parameters correct
     * */
    protected abstract boolean checkParams();
}
