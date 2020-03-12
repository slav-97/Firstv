package by.tut.lect12;

import org.apache.log4j.Logger;

public class Task12_6 {
    public final static Logger LOGGER = Logger.getLogger(Task12_6.class);
    public static void main(String args[]) {

        try {
            LOGGER.info("Before call say method.");
            int c[] = {1};
            int a = args.length;
            System.out.println("a = " + String.valueOf(a));
            c[4] = 222;
            int b = 23 / a;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " +
                    e.getMessage());
            LOGGER.info("Start exception handling --------");
            LOGGER.info("End exception handling --------");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "ArrayIndexOutOfBoundsException : "
                            + e.getMessage());
        } catch (Exception e) {
            System.out.println("ArithmeticException : " +
                    e.getMessage());
        }
    }
}
