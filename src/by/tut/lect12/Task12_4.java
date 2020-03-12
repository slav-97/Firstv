package by.tut.lect12;

import org.apache.log4j.Logger;

public class Task12_4 {
    public final static Logger LOGGER = Logger.getLogger(Task12_4.class);
    public static void main(String[] args) {
        try {
            LOGGER.info("Before call say method.");
            compute(1);
            compute(20);
        } catch (Task12_4.MyException e) {
            System.out.println("Перехваченное исключение." + e);
            LOGGER.info("Start exception handling --------");
            LOGGER.info("End exception handling --------");
        }
    }

    public static void compute(int a) throws Task12_4.MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10) {
            throw new Task12_4.MyException(a, "Some message");
        }
        System.out.println("Нормальное завершение.");
    }

    public static class MyException extends RuntimeException {
        private int detail;

        public MyException(int detail, String message) {
            super(message);
            this.detail = detail;
        }

        @Override
        public String toString() {
            return "MyException{"
                    + "detail=" + detail
                    + ", message=" + getMessage()
                    + "} ";
        }
    }
}
