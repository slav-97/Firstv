package by.tut.lect12;

import org.apache.log4j.Logger;

public class Task12_2 {
    public final static Logger LOGGER = Logger.getLogger(Task12_2.class);
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            LOGGER.info("Before call say method.");
            System.out.println(" До генерации исключения");
            nums[7] = 10; // Выход за границы масива
            System.out.println("Эта строка не отобразится");
        } catch (ArrayIndexOutOfBoundsException exc) { //перехват исключения выхода за границы масива
            System.out.println("Выход за границы масива");
            LOGGER.info("Start exception handling --------");
            LOGGER.info("End exception handling --------");
        }
        System.out.println(" После оператора catch");
    }
}
