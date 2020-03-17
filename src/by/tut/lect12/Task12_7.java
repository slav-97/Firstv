package by.tut.lect12;

import org.apache.log4j.Logger;

public class Task12_7 {
    public final static Logger LOGGER = Logger.getLogger(Task12_7.class);
        public static void perc50Exception() {
            int number = 10;
            for (int i = 2; i <= 10; i++) {
                try {
                    LOGGER.info("Before call say method.");
                    if (i % 2 == 0) {
                        throw new ArithmeticException("50 perc cases Exception");
                    }
                } catch (ArithmeticException e) {
                    LOGGER.info("Start exception handling --------");
                    System.out.println("Catch JDK - " + e);
                    LOGGER.info("End exception handling --------");
                }
            }
        }
        public static void main(String[] args) {
        Task12_7.perc50Exception();
    }
}
