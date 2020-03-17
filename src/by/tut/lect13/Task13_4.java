package by.tut.lect13;

public class Task13_4 {
    public static void personFIOreturn(String string) {
        String[] str = string.split(" ");
        for (String tmp : str) {
            System.out.println(tmp);
        }
    }
    public static void main(String[] args) {
        String personNameSurname = "Lebedko Vyacheslav Igorevich ";
        String personFIO = "LVI";
        Task13_4.personFIOreturn(personNameSurname);
        System.out.println("First name, Second name, Father's name ( " +
                personNameSurname + " )" + " initials: " + personFIO);
    }
}
