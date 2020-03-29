package by.tut.lect11;

import java.util.*;

public class TestBlackBox {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        BlackBox<Integer> blackBox = new BlackBox<>(tree);
        try {
            blackBox.addBlackBox(1);
            blackBox.addBlackBox(12);
            blackBox.addBlackBox(3);
            blackBox.addBlackBox(4);
            blackBox.addBlackBox(-5);
            blackBox.addBlackBox(26);
            blackBox.addBlackBox(16);
            blackBox.addBlackBox(63);
            blackBox.addBlackBox(-7);
        } catch (NullPointerException e) {
            System.out.println("use Integer type, 'null' is out of range");
            e.printStackTrace();
        }

        // choose indexMax element from BlackBox
        int indexMax = 4;
        try {
            Integer maxKBlackBox = blackBox.maxKBlackBox(indexMax);
            System.out.println("Max for index: " + indexMax + ": " + maxKBlackBox);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("indexMax error. Out of range, exceeds BlackBox size");
            e.printStackTrace();
        }

        // choose indexMin element from BlackBox
        int indexMin = 2;
        try {
            Integer minKBlackBox = blackBox.minKBlackBox(indexMin);
            System.out.println("Min for index: " + indexMin + ": " + minKBlackBox);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("indexMin error. Out of range, exceeds BlackBox size");
            e.printStackTrace();
        }
    }
}
