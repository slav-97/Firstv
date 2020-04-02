package by.tut.lect17;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

// Дан класс Person с полями firstName, lastName, age.
//Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.

public class Task17_5 {
    private enum Sex {
        MAN,
        WOMEN
    }

    private static class People {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public People(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof People)) return false;
            People people = (People) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }

    public static void main(String[] args) {
        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );

        String fullName = peoples.stream()
                .filter(person -> (person.getName() + person.getSex()).length() < 15)
                .sorted(Comparator.comparing(People::getAge).reversed())
                .map(person -> person.getName() + " " + person.getSex())
                .findFirst().get();
        System.out.println(fullName);
    }
}
