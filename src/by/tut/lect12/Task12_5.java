package by.tut.lect12;

import org.apache.log4j.Logger;

public class Task12_5 {
    public final static Logger LOGGER = Logger.getLogger(Task12_5.class);
    static void method()
    {
        try {
            LOGGER.info("Before call say method.");
            throw new NullPointerException("Exception in method");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            LOGGER.info("Start exception handling --------");
            LOGGER.info("End exception handling --------");
            throw e;
        }
    }
    public static void main(String args[])
    {
        try {
            method();
        } catch(NullPointerException e) {
            System.out.println("Catch inside main : " +
                    e.getMessage());
        }
    }
}
