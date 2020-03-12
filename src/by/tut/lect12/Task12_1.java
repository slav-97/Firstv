package by.tut.lect12;

import org.apache.log4j.Logger;

public class Task12_1 {
    public final static Logger LOGGER = Logger.getLogger(Task12_1.class);
    public static void main(String[] args) {

        try {
            LOGGER.info("Before call say method.");
            System.out.println(" До генерации исключения");
            int i = Integer.parseInt(null); // создание ошибки
            System.out.println("Значение : " + i);
        } catch (IllegalArgumentException exc) { //перехват исключения
            System.out.println("Вывод null в консоль");
            LOGGER.info("Start exception handling --------");
            LOGGER.info("End exception handling --------");
        }
        System.out.println(" После оператора catch");
    }
}
