package by.tut.lect16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
import java.util.Arrays;

public class Notebook extends Computer implements Serializable{
    private static final long serialVersionUID = 2L;
    private transient String [] touchpad;
    private String [] mouse;
    private String [] display;

    public Notebook (String [] touchpad , String [] mouse, String [] display) {
        this.touchpad = touchpad;
        this.mouse = mouse;
        this.display = display;
    }

    public String[] getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String[] touchpad) {
        this.touchpad = touchpad;
    }

    public String[] getMouse() {
        return mouse;
    }

    public void setMouse(String[] mouse) {
        this.mouse = mouse;
    }

    public String[] getDisplay() {
        return display;
    }

    public void setDisplay(String[] display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "touchpad=" + Arrays.toString(touchpad) +
                ", mouse=" + Arrays.toString(mouse) +
                ", display=" + Arrays.toString(display) +
                '}';
    }
}

class Main2 {
    public static void main(String[] args) throws IOException {
        String [] touchpad = {" Touchpad"};
        String [] mouse = {" mouse"};
        String [] display = {" display"};
        Notebook notebook = new Notebook(touchpad, mouse, display);
        FileOutputStream fileOutputStream = new FileOutputStream("save2.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(notebook);
        objectOutputStream.close();
    }
}
