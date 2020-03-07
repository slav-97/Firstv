package by.tut.lect7;

public class TrainingGround {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Hero hero = new Hero("Hero") {
            @Override
            public void display() {
                System.out.println(super.getName("Hero"));
            }
        };
    }
}
