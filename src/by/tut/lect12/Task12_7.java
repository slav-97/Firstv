package by.tut.lect12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.log4j.Logger;

public class Task12_7 {
    public final static Logger LOGGER = Logger.getLogger(Task12_7.class);
    public static void main(String[] args) {
        byte[] bytesToWrite = new byte[100];
        OutputStream os = null;
        try {
            LOGGER.info("Before call say method.");
            os = new FileOutputStream("output.file");
            os.write(bytesToWrite);
            System.out.println("end try");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot find the file.");
            LOGGER.info("Start exception handling --------");
            LOGGER.info("End exception handling --------");
        } catch (IOException ioex) {
            System.out.println("Error writing file: " + ioex.getMessage());
        } finally {
            System.out.println("finally.");
            if (os != null) {

                try {
                    os.close();
                } catch (IOException closeException) {
                    System.out.println("closeException: "
                            + closeException.getMessage());
                }
            }
        }
        System.out.println("End of program.");
    }
}
