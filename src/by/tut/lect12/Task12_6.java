package by.tut.lect12;

import org.apache.log4j.Logger;

import java.util.Random;

public class Task12_6 {
    public final static Logger LOGGER = Logger.getLogger(Task12_6.class);

    public static void randomThrowsException() throws ArithmeticException,
            ArrayIndexOutOfBoundsException, NullPointerException {
        Random rnd = new Random();
        int rndEcxeption = rnd.nextInt(3);

        switch (rndEcxeption) {
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new ArrayIndexOutOfBoundsException();
            case 2:
                throw new NullPointerException();
        }
    }

    public static void main(String args[]) {
        try {
            LOGGER.info("Before call say method.");
            Task12_6.randomThrowsException();
        } catch (ArithmeticException e) {
            System.out.println("Catch  JDK Random - " + e);
            LOGGER.info("Start exception handling --------");
            LOGGER.info("End exception handling --------");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch JDK Random - " + e);
        } catch (NullPointerException e) {
            System.out.println("Catch MY_OWN UNCHECKED Random - " + e);
        }
    }
}
