package by.tut.lect11;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

//Реализовать структуру «Черный ящик» хранящую целые числа.
// Структура должна поддерживать операции добавления числа и возвращение К-го по минимальности числа
// и N-ного по максимальности элемента из ящика.
public class BlackBox<Integer> {
    TreeSet<Integer> blackBoxTreeSet;
    BlackBox(TreeSet<Integer> blackBoxTreeSet) {
        this.blackBoxTreeSet = blackBoxTreeSet;
    }

    public Integer maxKBlackBox(int indexMax) throws ArrayIndexOutOfBoundsException {
        System.out.println("BlackBox sorted numbers:");
        int counter = 0;
        Iterator<Integer> iterator = blackBoxTreeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            counter++;
        }
        Integer elementByIndexFromMax = (Integer) this.blackBoxTreeSet.toArray()[(blackBoxTreeSet.size()) - indexMax];
        return elementByIndexFromMax;
    }

    public Integer minKBlackBox(int indexMin) throws ArrayIndexOutOfBoundsException {
        System.out.println("BlackBox numbers:");
        Integer elementByIndexFromMin = (Integer) this.blackBoxTreeSet.toArray()[indexMin - 1];
        return elementByIndexFromMin;
    }

    public void addBlackBox(Integer num) throws NullPointerException {
        this.blackBoxTreeSet.add(num);
    }
}
