package data;

import org.aeonbits.owner.Config;

@Config.Sources({"file:./src/main/resources/data.properties"})
public interface DataConfig extends Config {

    @Key("x_first_task")
    double xFirstTask();

    @Key("y_first_task")
    double yFirstTask();

    @Key("x_second_task")
    double xSecondTask();

    @Key("y_second_task")
    double ySecondTask();

    @Key("n_third_task")
    int nThirdTask();

    @Key("x_fourth_task")
    double xFourthTask();

    @Key("r_fifth_task")
    double rFifthTask();

    @Key("d_fifth_task")
    double dFifthTask();

    @Key("l_fifth_task")
    double lFifthTask();

    @Key("number_fifth_task")
    int numberFifthTask();

    @Key("n_sixth_task")
    int nSixthTask();

    @Key("k_sixth_task")
    int kSixthTask();

    @Key("m_sixth_task")
    int mSixthTask();

    @Key("n_seventh_task")
    int nSeventhTask();

    @Key("s_eighth_task")
    int sEighthTask();
}
