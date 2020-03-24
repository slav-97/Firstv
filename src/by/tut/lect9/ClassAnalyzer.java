package by.tut.lect9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassAnalyzer {
    public static void analizeClass(Object obj) {
        Class clazz = obj.getClass();
        System.out.println("Class info:");
        System.out.println("Class: " + clazz.getName());
        System.out.println("Class modifier: " + clazz.getModifiers());
        System.out.println("Super Class: " + clazz.getSuperclass());
        System.out.println("Super modifier: " + clazz.getModifiers());
        System.out.println("");
        Method[] methods = clazz.getDeclaredMethods();
        int counter01 = 0;
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("Method #" + counter01 + " " + method.getName() + " Return: " + method.getReturnType());
            counter01++;
        }
        System.out.println("");
        Field[] fields = clazz.getDeclaredFields();
        int counter02 = 0;
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println("Field #" + counter02 + " " + field.getName());
            counter02++;
        }
        System.out.println("");
        System.out.println("Annotations:");
        int counter03 = 0;
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("Annotation #" + counter03 + " " + annotation.toString());
            }
            counter03++;
        }
        System.out.println("");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        int counter04 = 0;
        System.out.println("Constructors:");
        for (Constructor constructor : constructors) {
            System.out.println("Constructor #" + counter04 + " " + constructors[counter04].getName());
            counter04++;
        }
        System.out.println("");
    }

    public static void analizeClass(Class clazz) {
        System.out.println("Class info:");
        System.out.println("Class: " + clazz.getName());
        System.out.println("Class modifier: " + clazz.getModifiers());
        System.out.println("Super Class: " + clazz.getSuperclass());
        System.out.println("Super modifier: " + clazz.getModifiers());
        System.out.println("");
        Method[] methods = clazz.getDeclaredMethods();
        int counter01 = 0;
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("Method #" + counter01 + " " + method.getName() + " Return: " + method.getReturnType());
            counter01++;
        }
        System.out.println("");
        Field[] fields = clazz.getDeclaredFields();
        int counter02 = 0;
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println("Field #" + counter02 + " " + field.getName());
            counter02++;
        }
        System.out.println("");
        System.out.println("Annotations:");
        int counter03 = 0;
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();

            for (Annotation annotation : annotations) {
                System.out.println("Annotation #" + counter03 + " " + annotation.toString());
            }
            counter03++;
        }
        System.out.println("");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        int counter04 = 0;
        System.out.println("Constructors:");
        for (Constructor constructor : constructors) {
            System.out.println("Constructor #" + counter04 + " " + constructors[counter04].getName());
            counter04++;
        }
        System.out.println("");
    }

    public static void transactionSuccessVerification(Object obj) {
        Class clazz = obj.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (true) {
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Transaction) {
                        System.out.println("Transaction is started");
                        try {
                            method.invoke(new Object());
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Transaction is ended");
                    }
                }
            }
        }
    }
}
